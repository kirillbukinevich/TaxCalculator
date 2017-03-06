package com.example.web.rest.vm;

import com.example.domain.PersonInfo;
import com.example.domain.enums.Period;
import com.example.service.dto.PersonInfoDTO;

public class ManagedPersonInfoVM extends PersonInfoDTO {
    public ManagedPersonInfoVM() {
    }

    public ManagedPersonInfoVM(PersonInfo personInfo) {
        super(personInfo);
    }

    public ManagedPersonInfoVM(long id, Period period, int profitFromGoods, int profitOther,
                               boolean isWorking, boolean benefits, boolean familyBenefits,
                               int numberOfMinors, int disabledChildren, int dependents,
                               int insuranceCost, int educationalCost, int housingCost,
                               int businessCost) {
        super(id, period, profitFromGoods, profitOther, isWorking, benefits,
                familyBenefits, numberOfMinors, disabledChildren, dependents,
                insuranceCost, educationalCost, housingCost, businessCost);
    }
}
