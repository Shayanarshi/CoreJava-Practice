//create a class Policy
//define the fields policyNo, basePremium, sumlnsured.
//define a method calculateFinalPremium() with the below
//conditions and return the result.
//        1. if sumlnsured > 5L then final premium is basePremium +
//        5% of sumlnsured
//2. if sumlnsured > 10L then final premium is basePremium+
//        10% of sumlnsured.
//        3. Otherwise, the final premium is basePremium only
//
//Define another method to display the policy details.
package com.example;

class Policy{
    int policyNumber;
    double basePremium;
    double sumInsured;

    double calculateFinalPremium(){
        double finalPremium;
        if(sumInsured>1000000){
             finalPremium = basePremium+0.1*sumInsured;
        } else if (sumInsured>500000) {
             finalPremium= basePremium+ .05*sumInsured;
        }else{
           finalPremium = basePremium;
        }
        return finalPremium;
    }
    void displayDetails(){
        System.out.println("Policy Number is " +policyNumber);
        System.out.println("Base Premium is "+ basePremium);
        System.out.println("Sum insured is "+ sumInsured);

    }

}

public class findPremium {
    public static void main(String[] args) {

        Policy p1 = new Policy();
        Policy p2 = new Policy();

        p1.policyNumber=100;
        p2.policyNumber=101;

        p1.basePremium=10000;
        p2.basePremium=10000;

        p1.sumInsured= 500001;
        p2.sumInsured= 1000001;

        p1.displayDetails();
        System.out.println("The final premium of p1 is "+ p1.calculateFinalPremium());
        p2.displayDetails();
        System.out.println("The final premium of p2 is " + p2.calculateFinalPremium());

    }
}
