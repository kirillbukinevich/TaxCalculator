package com.iba.bukinevi.domain;


import com.iba.bukinevi.domain.enums.Period;
import com.iba.bukinevi.service.builder.IncomeTaxBuilder;

import javax.persistence.*;

@Entity
@Table(name = "income_tax")
public class IncomeTax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
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

    public IncomeTax(){}

    public IncomeTax(IncomeTaxBuilder builder){
        this.period = builder.getPeriod();
        this.profitFromGoods = builder.getProfitFromGoods();
        this.profitOther = builder.getProfitOther();
        this.hasWork = builder.hasWork();
        this.hasBenefits = builder.hasBenefits();
        this.hasFamilyBenefits = builder.hasFamilyBenefits();
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
}
