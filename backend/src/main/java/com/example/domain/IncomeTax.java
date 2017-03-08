package com.example.domain;


import com.example.domain.enums.Period;
import com.example.service.builder.IncomeTaxBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "person_info_for_income_tax")
public class IncomeTax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
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

    public IncomeTax(){}

    public IncomeTax(IncomeTaxBuilder builder){
        this.period = builder.getPeriod();
        this.profitFromGoods = builder.getProfitFromGoods();
        this.profitOther = builder.getProfitOther();
        this.hasWork = builder.isHasWork();
        this.hasBenefits = builder.isHasBenefits();
        this.hasFamilyBenefits = builder.isHasFamilyBenefits();
        this.numberOfMinors = builder.getNumberOfMinors();
        this.disabledChildren = builder.getDisabledChildren();
        this.dependents = builder.getDependents();
        this.insuranceCost = builder.getInsuranceCost();
        this.educationalCost = builder.getEducationalCost();
        this.housingCost = builder.getHousingCost();
        this.businessCost = builder.getBusinessCost();
        this.total = builder.getTotal();
    }

    public long getId() {
        return id;
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
