package com.example.service.builder;

import com.example.domain.IncomeTax;
import com.example.domain.enums.Period;

public class IncomeTaxBuilder {
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

    public IncomeTaxBuilder hasBenefits(boolean hasBenefits) {
        this.hasBenefits = hasBenefits;
        return this;
    }

    public IncomeTaxBuilder hasFamilyBenefits(boolean hasFamilyBenefits) {
        this.hasFamilyBenefits = hasFamilyBenefits;
        return this;
    }

    public IncomeTaxBuilder numberOfMinors(int numberOfMinors) {
        this.numberOfMinors = numberOfMinors;
        return this;
    }

    public IncomeTaxBuilder disabledChildren(int disabledChildren) {
        this.disabledChildren = disabledChildren;
        return this;
    }

    public IncomeTaxBuilder dependents(int dependents) {
        this.dependents = dependents;
        return this;
    }

    public IncomeTaxBuilder insuranceCost(int insuranceCost) {
        this.insuranceCost = insuranceCost;
        return this;
    }

    public IncomeTaxBuilder educationalCost(int educationalCost) {
        this.educationalCost = educationalCost;
        return this;
    }

    public IncomeTaxBuilder housingCost(int housingCost) {
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

    public boolean isHasWork() {
        return hasWork;
    }

    public boolean isHasBenefits() {
        return hasBenefits;
    }

    public boolean isHasFamilyBenefits() {
        return hasFamilyBenefits;
    }

    public int getNumberOfMinors() {
        return numberOfMinors;
    }

    public int getDisabledChildren() {
        return disabledChildren;
    }

    public int getDependents() {
        return dependents;
    }

    public int getInsuranceCost() {
        return insuranceCost;
    }

    public int getEducationalCost() {
        return educationalCost;
    }

    public int getHousingCost() {
        return housingCost;
    }

    public int getBusinessCost() {
        return businessCost;
    }

    public int getTotal() {
        return total;
    }
}
