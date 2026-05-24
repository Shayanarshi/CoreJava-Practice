package com.abstraction;
public class HealthPolicy extends Policy {
   private int age;
   private boolean isSmoker;

   public HealthPolicy(long policyId, String policyHolder,double basePremium,int age,boolean isSmoker){
       super(policyId,basePremium,policyHolder);
       this.age= age;
       this.isSmoker=isSmoker;
   }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setSmoker(boolean smoker) {
        isSmoker = smoker;
    }

    @Override
    public double riskFactor(){
       if(age>60 && isSmoker){
           return getBasePremium()*0.15;
       }
       else if(isSmoker){
           return getBasePremium()* 0.10;
       }
       else{
           return getBasePremium()*0.05;
       }
    }

}
