package scenariobased;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees : ");
        int n = sc.nextInt();
        int[] salary = new int[n];

        System.out.println("Enter the Salaries of the Employees");

        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        int highest = findHighestSalary(salary);
        double average = findAverageSalary(salary);
        int count = countEmployeesAboveAverage(salary,average);
        int secondHighest = findSecondHighestSalary(salary);

        System.out.println("Highest Salary        : " + highest);
        System.out.println("Average Salary        : " + average);
        System.out.println("Employees Above Salary : " + count);
        System.out.println("Second Highest Salary : " + secondHighest);
        sc.close();
    }

    private static  int findHighestSalary(int[] salary){
        int max = salary[0];
        for (int i =0;i<salary.length; i++){
            if (salary[i]>max){
                max= salary[i];
            }
        }
        return  max;
    }

    private static  double findAverageSalary(int[] salary){
        int sum = 0;
        for (int i =0;i<salary.length; i++){
            sum+= salary[i];
            }
        return  (double)sum/salary.length;
        }


    private static  int  countEmployeesAboveAverage(int[] salary, double average){
        int count = 0;
        for (int i =0;i<salary.length; i++){
            if (salary[i]>average){
                count++;
            }
        }
        return  count;
    }



    private static  int  findSecondHighestSalary(int[] salary){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i =0;i<salary.length; i++){
            if (salary[i]>highest){
                secondHighest = highest;
                highest = salary[i];
            } else if (salary[i]> secondHighest && salary[i]!= highest) {
                secondHighest = salary[i];
            }
        }
        return  secondHighest;
    }
    }
