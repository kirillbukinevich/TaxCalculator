import {Directive, Input, HostBinding, ElementRef} from '@angular/core'
@Directive({selector: '[collapse]'})
export class Collapse {

  @HostBinding('class.collapsing')
  private isCollapsing:boolean = true;

  private h:number;

  // style
  @HostBinding('style.height')
  private height:string;


  @Input()
  private set collapse(value:boolean) {
    if(value!==undefined){
      if(value){
        this.hide();
      }else {
        this.show();
      }
    }
    //
  }
  constructor(public el: ElementRef) {

    this.measureHeight();
  }
  measureHeight() {
    let elem = this.el.nativeElement;
    elem.className = elem.className.replace('collapse', '');
    this.h = 150;

  }
  hide(){
    this.height = this.h +'px';
    setTimeout(() => {
      this.height = '0px';
      this.isCollapsing = true;//apply 'collapsing' class
    },1);
  }
  show() {
    this.height = '0px';
    setTimeout(() => {
      this.height = this.h + 'px';
      this.isCollapsing = true;//apply 'collapsing' class
    },1);
  }

}
