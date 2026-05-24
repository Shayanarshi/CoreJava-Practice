package com.example;
class ResumeValidator {
    public static boolean hasRequiredSkills(String[] requiredSkills, String[] candidateSkills) {
        for (String requiredSkill : requiredSkills) {
            boolean flag = false;
            for (String candidateSkill : candidateSkills) {
                if (requiredSkill.equalsIgnoreCase(candidateSkill)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
    public static void missingSkills(String[] requiredSkills, String[] candidateSkills) {
        for (String requiredSkill : requiredSkills) {
            boolean flag = false;
            for (String candidateSkill : candidateSkills) {
                if (requiredSkill.equalsIgnoreCase(candidateSkill)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(requiredSkill);
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        String[] requiredSkills = { "Java", "Spring Boot", "Microservices", "React", "Docker", "Kubernetes" };
        String[] candidateSkills = { "Java", "MySQL", "Spring Boot", "Microservices", "React", "Docker" };

        boolean eligible = ResumeValidator.hasRequiredSkills(requiredSkills, candidateSkills);
        if (eligible) {
            System.out.println("The candidate is shortlisted for an interview!");
        }
        else {
            System.out.println("The candidate is not shortlisted for an interview!");
            System.out.println("The missing skills are:" );
            ResumeValidator.missingSkills(requiredSkills, candidateSkills);
        }

    }
}
