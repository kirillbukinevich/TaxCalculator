package com.example.service.dto;

import com.example.domain.IncomeTax;
import com.example.domain.enums.Period;

public class IncomeTaxDTO {

    private Period period;

    private int profitFromGoods;

    private int profitOther;

    private boolean hasWork;

    private boolean hasBenefits;

    private boolean hasFamilyBenefits;

    private int numberOfMinors;

    private int disabledChildren;

    private int dependents;

    private int insuranceCost;

    private int educationalCost;

    private int housingCost;

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

    public IncomeTaxDTO(Period period, int profitFromGoods, int profitOther, boolean hasWork, boolean hasBenefits, boolean hasFamilyBenefits, int numberOfMinors, int disabledChildren, int dependents, int insuranceCost, int educationalCost, int housingCost, int businessCost,int total) {
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

    public void setPeriod(Period period) {
        this.period = period;
    }

    public int getProfitFromGoods() {
        return profitFromGoods;
    }

    public void setProfitFromGoods(int profitFromGoods) {
        this.profitFromGoods = profitFromGoods;
    }

    public int getProfitOther() {
        return profitOther;
    }

    public void setProfitOther(int profitOther) {
        this.profitOther = profitOther;
    }

    public boolean isHasWork() {
        return hasWork;
    }

    public void setHasWork(boolean isWorking) {
        this.hasWork = isWorking;
    }

    public boolean isHasBenefits() {
        return hasBenefits;
    }

    public void setHasBenefits(boolean hasBenefits) {
        this.hasBenefits = hasBenefits;
    }

    public boolean isHasFamilyBenefits() {
        return hasFamilyBenefits;
    }

    public void setHasFamilyBenefits(boolean hasFamilyBenefits) {
        this.hasFamilyBenefits = hasFamilyBenefits;
    }

    public int getNumberOfMinors() {
        return numberOfMinors;
    }

    public void setNumberOfMinors(int numberOfMinors) {
        this.numberOfMinors = numberOfMinors;
    }

    public int getDisabledChildren() {
        return disabledChildren;
    }

    public void setDisabledChildren(int disabledChildren) {
        this.disabledChildren = disabledChildren;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    public int getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(int insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public int getEducationalCost() {
        return educationalCost;
    }

    public void setEducationalCost(int educationalCost) {
        this.educationalCost = educationalCost;
    }

    public int getHousingCost() {
        return housingCost;
    }

    public void setHousingCost(int housingCost) {
        this.housingCost = housingCost;
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

    public int getBusinessCost() {
        return businessCost;
    }

    public void setBusinessCost(int businessCost) {
        this.businessCost = businessCost;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}

