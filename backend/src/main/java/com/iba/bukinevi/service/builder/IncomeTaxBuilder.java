package com.iba.bukinevi.service.builder;

import com.iba.bukinevi.domain.IncomeTax;
import com.iba.bukinevi.domain.enums.Period;

public class IncomeTaxBuilder {
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

    public IncomeTaxBuilder period(Period period) {
        this.period = period;
        return this;
    }

    public IncomeTaxBuilder profitFromGoods(int profitFromGoods) {
        this.profitFromGoods = profitFromGoods;
        return this;
    }

    public IncomeTaxBuilder profitOther(int profitOther) {
        this.profitOther = profitOther;
        return this;
    }

    public IncomeTaxBuilder hasWork(boolean hasWork) {
        this.hasWork = hasWork;
        return this;
    }

    public IncomeTaxBuilder hasBenefits(Boolean hasBenefits) {
        this.hasBenefits = hasBenefits;
        return this;
    }

    public IncomeTaxBuilder hasFamilyBenefits(Boolean hasFamilyBenefits) {
        this.hasFamilyBenefits = hasFamilyBenefits;
        return this;
    }

    public IncomeTaxBuilder numberOfMinors(Integer numberOfMinors) {
        this.numberOfMinors = numberOfMinors;
        return this;
    }

    public IncomeTaxBuilder disabledChildren(Integer disabledChildren) {
        this.disabledChildren = disabledChildren;
        return this;
    }

    public IncomeTaxBuilder dependents(Integer dependents) {
        this.dependents = dependents;
        return this;
    }

    public IncomeTaxBuilder insuranceCost(Integer insuranceCost) {
        this.insuranceCost = insuranceCost;
        return this;
    }

    public IncomeTaxBuilder educationalCost(Integer educationalCost) {
        this.educationalCost = educationalCost;
        return this;
    }

    public IncomeTaxBuilder housingCost(Integer housingCost) {
        this.housingCost = housingCost;
        return this;
    }

    public IncomeTaxBuilder businessCost(int businessCost) {
        this.businessCost = businessCost;
        return this;
    }

    public IncomeTaxBuilder total(int total) {
        this.total = total;
        return this;
    }

    public IncomeTax build(){
        return new IncomeTax(this);
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

    public boolean hasWork() {
        return hasWork;
    }

    public Boolean hasBenefits() {
        return hasBenefits;
    }

    public Boolean hasFamilyBenefits() {
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
}
