package com.example.service.dto;

import com.example.domain.PersonInfo;
import com.example.domain.enums.Period;

public class PersonInfoDTO {

    private long id;

    private Period period;

    private int profitFromGoods;

    private int profitOther;

    private boolean working;

    private boolean benefits;

    private boolean familyBenefits;

    private int numberOfMinors;

    private int disabledChildren;

    private int dependents;

    private int insuranceCost;

    private int educationalCost;

    private int housingCost;

    private int businessCost;

    public PersonInfoDTO(){}

    public PersonInfoDTO(PersonInfo personInfo){
        this(personInfo.getId(), personInfo.getPeriod(), personInfo.getProfitFromGoods(),
                personInfo.getProfitOther(), personInfo.isWorking(), personInfo.isHasBenefits(),
                personInfo.isHasFamilyBenefits(), personInfo.getNumberOfMinors(), personInfo.getDisabledChildren(),
                personInfo.getDependents(), personInfo.getInsuranceCost(), personInfo.getEducationalCost(),
                personInfo.getHousingCost(), personInfo.getBusinessCost());
    }

    public PersonInfoDTO(long id, Period period, int profitFromGoods, int profitOther, boolean working, boolean benefits, boolean familyBenefits, int numberOfMinors, int disabledChildren, int dependents, int insuranceCost, int educationalCost, int housingCost, int businessCost) {
        this.id = id;
        this.period = period;
        this.profitFromGoods = profitFromGoods;
        this.profitOther = profitOther;
        this.working = working;
        this.benefits = benefits;
        this.familyBenefits = familyBenefits;
        this.numberOfMinors = numberOfMinors;
        this.disabledChildren = disabledChildren;
        this.dependents = dependents;
        this.insuranceCost = insuranceCost;
        this.educationalCost = educationalCost;
        this.housingCost = housingCost;
        this.businessCost = businessCost;
    }

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

    @Override
    public String toString() {
        return "PersonInfoDTO{" +
                "id=" + id +
                ", period=" + period +
                ", profitFromGoods=" + profitFromGoods +
                ", profitOther=" + profitOther +
                ", working=" + working +
                ", benefits=" + benefits +
                ", familyBenefits=" + familyBenefits +
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
}

