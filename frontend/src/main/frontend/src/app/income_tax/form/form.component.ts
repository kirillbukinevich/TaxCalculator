import {Component, OnInit, ViewChild, EventEmitter, Output} from "@angular/core";
import {Popup} from "ng2-opd-popup";
import {Options} from "ts-node/dist";
import {IncomeTax} from "../../interface/income-tax.interface";

@Component({
  selector: 'app-multiplepopup',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class IncomeTaxFormComponent implements OnInit {

  public incomeTax: IncomeTax;
  form: any;
  incomeTaxTotal: number = 0;
  currentPeriodValue;


  @ViewChild('popup5') popup5: Popup;

  public periods = [
    {value: 'QUARTER', display: 'QUARTER'},
    {value: 'HALF_YEAR', display: 'HALF_YEAR'},
    {value: 'NINE_MONTH', display: 'NINE_MONTH'},
    {value: 'YEAR', display: 'YEAR'}
  ];

  ngOnInit() {
    this.incomeTax = <IncomeTax>{
      period: this.periods[0].display,
      profitFromGoods: 0,
      profitOther: 0,
      isWorking: false,
      hasBenefits: false,
      hasFamilyBenefits: false,
      numberOfMinors: 0,
      disabledChildren: 0,
      dependents: 0,
      insuranceCost: 0,
      educationalCost: 0,
      housingCost: 0,
      businessCost: 0
    };
  }

  initForm():void {
    this.form = document.forms["incomeTaxForm"];
  }

  // initIncomeTax(inputs) {
  //
  //   // this.incomeTax = <IncomeTax>{
  //   //   period: inputs.periods.selectedOptions[0].textContent,
  //   //   periodNumber: inputs.periods.selectedOptions[0].value,
  //   //   profitFromGoods: inputs.profitFromGoods.valueAsNumber,
  //   //   profitOther: inputs.profitOther.valueAsNumber,
  //   //   isWorking: inputs.isWorking.checked,
  //   //   hasBenefits: inputs.hasBenefits.checked,
  //   //   hasFamilyBenefits: inputs.hasFamilyBenefits.checked,
  //   //   numberOfMinors: inputs.numberOfMinors.valueAsNumber,
  //   //   disabledChildren: inputs.disabledChildren.valueAsNumber,
  //   //   dependents: inputs.dependents.valueAsNumber,
  //   //   insuranceCost: inputs.insuranceCost.valueAsNumber,
  //   //   educationalCost: inputs.educationalCost.valueAsNumber,
  //   //   housingCost: inputs.housingCost.valueAsNumber,
  //   //   businessCost: inputs.businessCost.valueAsNumber
  //   // };
  // }


  changeFormState(target): void {
    console.log("DEFINE");
    console.log(this.incomeTax.period);
    this.initForm();
    if (target.name == "isWorking") {
      this.changeWorkingStatus();
    }

    if (this.incomeTax.businessCost >
      (this.incomeTax.profitFromGoods + this.incomeTax.profitOther)) {
      //error
      alert("BEDA");
    }

    this.defineValuePeriod();

    if (this.incomeTax.isWorking) {
      this.incomeTaxTotal = this.calculateWorkingPerson();
    } else {
      this.incomeTaxTotal = this.calculateUnemployedPerson();
    }
    console.log("incomeTaxTotal: " + this.incomeTaxTotal);

  }


  changeWorkingStatus(): void {

    let inputs = this.form.elements;

    inputs.hasBenefits["disabled"] = !inputs.hasBenefits["disabled"];
    inputs.hasFamilyBenefits["disabled"] = !inputs.hasFamilyBenefits["disabled"];
    inputs.numberOfMinors["disabled"] = !inputs.numberOfMinors["disabled"];
    inputs.disabledChildren["disabled"] = !inputs.disabledChildren["disabled"];
    inputs.dependents["disabled"] = !inputs.dependents["disabled"];
    inputs.insuranceCost["disabled"] = !inputs.insuranceCost["disabled"];
    inputs.educationalCost["disabled"] = !inputs.educationalCost["disabled"];
    inputs.housingCost["disabled"] = !inputs.housingCost["disabled"];

  }


  calculateWorkingPerson(): number {
    let result: number = (this.incomeTax.profitFromGoods + this.incomeTax.profitOther -
      this.incomeTax.businessCost) * 0.16;
    console.log("TOTAL: " + result);
    return result;
  }

  calculateUnemployedPerson(): number {
    let result: number;

    result = this.firstStep();
    console.log("1!" + result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.secondStep(result);
    console.log("2!" + result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.thirdStep(result);
    console.log("3!" + result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.fourthStep(result);
    console.log("4!" + result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.fifthStep(result);
    console.log(result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.sixthStep(result);
    console.log(result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.seventhStep(result);
    console.log(result);
    if (this.isNegativeResult(result)) {
      return 0;
    }
    result = this.seventhStep(result);
    console.log(result);

    console.log("TOTAL: " + result);

    return result;
  }

  firstStep(): number {
    return this.incomeTax.profitFromGoods + this.incomeTax.profitOther;
  }

  secondStep(step1): number {
    let step2: number;
    if (step1 - this.incomeTax.businessCost <= 15020000) {
     step2 = step1 - (830000 * this.currentPeriodValue)
    } else {
      step2 = step1;
    }

    return step2;
  }

  thirdStep(step2): number {
    let step3: number;
    if (this.incomeTax.hasBenefits) {
     step3 = step2 - (1170000 * this.currentPeriodValue);
    } else {
      step3 = step2;
    }

    return step3;
  }

  fourthStep(step3): number {
    let step4: number;
    if (this.incomeTax.hasFamilyBenefits &&
      this.incomeTax.numberOfMinors > 0 &&
      this.incomeTax.dependents > 0 &&
      this.incomeTax.disabledChildren <=
      this.incomeTax.numberOfMinors) {
      step4 = step3 - this.currentPeriodValue * 460000 *
        (this.incomeTax.numberOfMinors + this.incomeTax.dependents);
    } else if (!this.incomeTax.hasFamilyBenefits &&
      this.incomeTax.numberOfMinors == 1 &&
      this.incomeTax.disabledChildren == 0 &&
      this.incomeTax.dependents > 0
    ) {
      step4 = step3 - this.currentPeriodValue * 240000 *
        (this.incomeTax.numberOfMinors + this.incomeTax.dependents);
    } else if (!this.incomeTax.hasFamilyBenefits &&
      this.incomeTax.numberOfMinors == 1 &&
      this.incomeTax.disabledChildren == 1 &&
      this.incomeTax.dependents > 0
    ) {
      step4 = step3 - this.currentPeriodValue *
        (this.incomeTax.numberOfMinors * 460000 +
        this.incomeTax.dependents * 240000);

    } else if (!this.incomeTax.hasFamilyBenefits &&
      this.incomeTax.numberOfMinors > 1 &&
      this.incomeTax.disabledChildren < this.incomeTax.numberOfMinors &&
      this.incomeTax.dependents > 0
    ) {
      step4 = step3 - this.currentPeriodValue * 460000 *
        (this.incomeTax.numberOfMinors + this.incomeTax.dependents);
    }

    return step4;
  }

  fifthStep(step4): number {
    let step5: number;
    if (this.incomeTax.insuranceCost <= 16000000) {
      step5 = step4 - this.incomeTax.insuranceCost;
    } else {
      step5 = step4 - 16000000;
    }

    return step5;
  }

  sixthStep(step5): number {
    let step6: number = step5 - (this.incomeTax.insuranceCost +
      this.incomeTax.housingCost + this.incomeTax.educationalCost);

    return step6;
  }

  seventhStep(step6): number {
    return step6 * 0.16;
  }

  isNegativeResult(result): boolean {
    return result < 0 ? true : false;
  }

  defineValuePeriod():void{
    switch (this.incomeTax.period){
      case 'QUARTER': this.currentPeriodValue = 3; break;
      case 'HALF_YEAR': this.currentPeriodValue = 6; break;
      case 'NINE_MONTH': this.currentPeriodValue = 9; break;
      case 'YEAR': this.currentPeriodValue = 12; break;
    }
  }

  showPopup5() {
    this.popup5.options = <Options>{
      cancleBtnClass: "btn btn-default",
      confirmBtnClass: "btn btn-mbe-attack",
      color: "#A0DE4F",
      header: "Calculator",
      widthProsentage: 60,
      animation: "bounceInDown",
      confirmBtnContent: "Save",
      cancleBtnContent: "Close"
    };
    this.popup5.show(this.popup5.options);

    setTimeout(this.initForm, 500);

  }


  @Output() notify: EventEmitter<IncomeTax> = new EventEmitter<IncomeTax>();


  login() {
    let self = this;
    setTimeout(function () {
      self.notify.emit(self.incomeTax);
    },1000);

    this.popup5.hide();
  }

}
