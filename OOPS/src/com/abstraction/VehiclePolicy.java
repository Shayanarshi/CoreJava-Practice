package com.abstraction;

public class VehiclePolicy extends Policy{
    private  String fuelType;
    private int mfgYear;

    public  VehiclePolicy(long policyId,String policyHolder,double basePremium,String fuelType, int mfgYear){
        super(policyId,basePremium,policyHolder);
        this.fuelType = fuelType;
        this.mfgYear= mfgYear;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getMfgYear() {
        return mfgYear;
    }

    public void setMfgYear(int mfgYear) {
        this.mfgYear = mfgYear;
    }

    @Override
    public  double riskFactor(){
        if(fuelType.equalsIgnoreCase("diesel" ) && mfgYear <= 2022){
            return getBasePremium()*0.20;
        } else if (fuelType.equalsIgnoreCase("petrol") && mfgYear <=2023) {
            return  getBasePremium()* 0.15;
        }
        else {
            return getBasePremium() * 0.05;
        }
    }
}
