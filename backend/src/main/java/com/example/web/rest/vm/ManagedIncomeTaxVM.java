package com.example.web.rest.vm;

import com.example.domain.IncomeTax;
import com.example.domain.enums.Period;
import com.example.service.dto.IncomeTaxDTO;

public class ManagedIncomeTaxVM extends IncomeTaxDTO{
    public ManagedIncomeTaxVM() {
    }

    public ManagedIncomeTaxVM(IncomeTax incomeTax) {
        super(incomeTax);
    }

    public ManagedIncomeTaxVM(long id, Period period, int profitFromGoods, int profitOther, boolean working, boolean benefits, boolean familyBenefits, int numberOfMinors, int disabledChildren, int dependents, int insuranceCost, int educationalCost, int housingCost) {
        super(id, period, profitFromGoods, profitOther, working, benefits, familyBenefits, numberOfMinors, disabledChildren, dependents, insuranceCost, educationalCost, housingCost);
    }
}
