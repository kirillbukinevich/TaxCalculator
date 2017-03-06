export interface IncomeTax {
  period: string;
  profitFromGoods; number;
  profitOther: number;
  isWorking: boolean;
  hasBenefits: boolean;
  hasFamilyBenefits: boolean;
  numberOfMinors: number;
  disabledChildren: number;
  dependents: number;
  insuranceCost: number;
  educationalCost: number;
  housingCost: number;
  businessCost: number;
}
