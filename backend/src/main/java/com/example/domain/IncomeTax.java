package com.example.domain;


import com.example.domain.enums.Period;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "income_tax")
public class IncomeTax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Period period;

    private int profitFromGoods;

    private int profitOther;

    @NotNull
    private boolean working;

    @NotNull
    private boolean benefits;

    @NotNull
    private boolean familyBenefits;

    private int numberOfMinors;

    private int disabledChildren;

    private int dependents;

    private int insuranceCost;

    private int educationalCost;

    private int housingCost;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean isBenefits() {
        return benefits;
    }

    public void setBenefits(boolean benefits) {
        this.benefits = benefits;
    }

    public boolean isFamilyBenefits() {
        return familyBenefits;
    }

    public void setFamilyBenefits(boolean familyBenefits) {
        this.familyBenefits = familyBenefits;
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
}
