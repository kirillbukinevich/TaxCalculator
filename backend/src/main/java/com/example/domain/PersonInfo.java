package com.example.domain;


import com.example.domain.enums.Period;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "person_info_for_income_tax")
public class PersonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Period period;

    private int profitFromGoods;

    private int profitOther;

    @NotNull
    private boolean isWorking;

    @NotNull
    private boolean hasBenefits;

    @NotNull
    private boolean hasFamilyBenefits;

    private int numberOfMinors;

    private int disabledChildren;

    private int dependents;

    private int insuranceCost;

    private int educationalCost;

    private int housingCost;

    private int businessCost;

    public long getId() {
        return id;
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

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        this.isWorking = working;
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

    public int getBusinessCost() {
        return businessCost;
    }

    public void setBusinessCost(int businessCost) {
        this.businessCost = businessCost;
    }
}
