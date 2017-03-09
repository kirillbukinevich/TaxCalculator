package com.iba.bukinevi.service.dto;

import com.iba.bukinevi.domain.IncomeTax;
import com.iba.bukinevi.domain.enums.Period;

public class IncomeTaxDTO {

    private Period period;

    private int profitFromGoods;

    private int profitOther;

    private boolean hasWork;

    private Boolean hasBenefits;

    private Boolean hasFamilyBenefits;

    private Integer numberOfMinors;

    private Integer disabledChildren;

    private Integer dependents;

    private Integer insuranceCost;

    private Integer educationalCost;

    private Integer housingCost;

    private int businessCost;

    private int total;

    public IncomeTaxDTO(){}

    public IncomeTaxDTO(IncomeTax incomeTax){
        this(incomeTax.getPeriod(), incomeTax.getProfitFromGoods(),
                incomeTax.getProfitOther(), incomeTax.isHasWork(), incomeTax.isHasBenefits(),
                incomeTax.isHasFamilyBenefits(), incomeTax.getNumberOfMinors(), incomeTax.getDisabledChildren(),
                incomeTax.getDependents(), incomeTax.getInsuranceCost(), incomeTax.getEducationalCost(),
                incomeTax.getHousingCost(), incomeTax.getBusinessCost(), incomeTax.getTotal());
    }

    public IncomeTaxDTO(Period period, int profitFromGoods, int profitOther, boolean hasWork, Boolean hasBenefits,
                        Boolean hasFamilyBenefits, Integer numberOfMinors, Integer disabledChildren, Integer dependents,
                        Integer insuranceCost, Integer educationalCost, Integer housingCost, int businessCost,int total) {
        this.period = period;
        this.profitFromGoods = profitFromGoods;
        this.profitOther = profitOther;
        this.hasWork = hasWork;
        this.hasBenefits = hasBenefits;
        this.hasFamilyBenefits = hasFamilyBenefits;
        this.numberOfMinors = numberOfMinors;
        this.disabledChildren = disabledChildren;
        this.dependents = dependents;
        this.insuranceCost = insuranceCost;
        this.educationalCost = educationalCost;
        this.housingCost = housingCost;
        this.businessCost = businessCost;
        this.total = total;
    }

    public Period getPeriod() {
        return period;
    }

    public int getProfitFromGoods() {
        return profitFromGoods;
    }

    public int getProfitOther() {
        return profitOther;
    }

    public boolean isHasWork() {
        return hasWork;
    }

    public Boolean isHasBenefits() {
        return hasBenefits;
    }

    public Boolean isHasFamilyBenefits() {
        return hasFamilyBenefits;
    }

    public Integer getNumberOfMinors() {
        return numberOfMinors;
    }

    public Integer getDisabledChildren() {
        return disabledChildren;
    }

    public Integer getDependents() {
        return dependents;
    }

    public Integer getInsuranceCost() {
        return insuranceCost;
    }

    public Integer getEducationalCost() {
        return educationalCost;
    }

    public Integer getHousingCost() {
        return housingCost;
    }

    public int getBusinessCost() {
        return businessCost;
    }

    public int getTotal() {
        return total;
    }


    @Override
    public String toString() {
        return "IncomeTaxDTO{" +
                ", period=" + period +
                ", profitFromGoods=" + profitFromGoods +
                ", profitOther=" + profitOther +
                ", hasWork=" + hasWork +
                ", hasBenefits=" + hasBenefits +
                ", hasFamilyBenefits=" + hasFamilyBenefits +
                ", numberOfMinors=" + numberOfMinors +
                ", disabledChildren=" + disabledChildren +
                ", dependents=" + dependents +
                ", insuranceCost=" + insuranceCost +
                ", educationalCost=" + educationalCost +
                ", housingCost=" + housingCost +
                '}';
    }
}

