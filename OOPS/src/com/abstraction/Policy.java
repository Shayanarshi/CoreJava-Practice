package com.abstraction;

public abstract class Policy {
    private long policyId;
    private String policyHolder;
    private double basePremium;

    public Policy(long policyId,double basePremium,String policyHolder){
    this.policyId = policyId;
    this.policyHolder =policyHolder;
    this.basePremium = basePremium;
    }
    public long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(long policyId) {
        this.policyId = policyId;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(double basePremium) {
        this.basePremium = basePremium;
    }
    public abstract double riskFactor();
    public double calculateFinalPremium(){
        return riskFactor()+ basePremium;
    }
}


