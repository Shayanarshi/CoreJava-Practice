package com.abstraction;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long healthId = random.nextLong(9999999L);
        HealthPolicy healthPolicy = new HealthPolicy(healthId,"Alexa",37928,42,true);


        System.out.println("Health policy details for policy number:" +healthPolicy.getPolicyId());
        System.out.println("Policy Holder:" + healthPolicy.getPolicyHolder());
        System.out.println("Base Premium:" + healthPolicy.getBasePremium());
        System.out.println("Age:" + healthPolicy.getAge());
        System.out.println("isSmoker:"+ healthPolicy.isSmoker());
        System.out.println("Final Premium:"+healthPolicy.calculateFinalPremium());
        System.out.println("=**=".repeat(10));

        long vehiclePolicyId = random.nextLong(999999L);
        VehiclePolicy vehiclePolicy = new VehiclePolicy(vehiclePolicyId,"Rohan",38000,"diesel",2019);
        System.out.println("Vehicle Policy details for policy number:"+ vehiclePolicy.getPolicyId());
        System.out.println("Policy Holder:" + vehiclePolicy.getPolicyHolder());
        System.out.println("Base Premium: "+ vehiclePolicy.getBasePremium());
        System.out.println("Fuel type:"+ vehiclePolicy.getFuelType());
        System.out.println("Mfg Year:"+ vehiclePolicy.getMfgYear());
        System.out.println("Final Premium:" + vehiclePolicy.calculateFinalPremium());

    }
}
