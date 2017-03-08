export interface IncomeTax {
  period: string;
  profitFromGoods: number;
  profitOther: number;
  hasWork: boolean;
  hasBenefits: boolean;
  hasFamilyBenefits: boolean;
  numberOfMinors: number;
  disabledChildren: number;
  dependents: number;
  insuranceCost: number;
  educationalCost: number;
  housingCost: number;
  businessCost: number;
  total: number;
}
