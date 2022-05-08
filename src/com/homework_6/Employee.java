package com.homework_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
    final int employeeId;
    final String firstName;
    final String lastName;
    private int annualSalary;

    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }


    public int getAnnualSalary(int salaryPerMonth) {
        annualSalary = salaryPerMonth * 12;
        return annualSalary;
    }

    public int raiseSalary(){
        Scanner raise = new Scanner(System.in);
        System.out.println("Enter employee's salary raise in %: ");

        if (raise.hasNextInt()) {
            int salaryRaise = raise.nextInt();
            if (salaryRaise <= 0) {
                System.out.println("Employee's salary is not increased.");
            } else {
                this.annualSalary = this.annualSalary + (this.annualSalary * salaryRaise / 100);
            }
            return this.annualSalary;
        }
        else
            throw new InputMismatchException("This field accepts only digits.");

    }

    @Override
    public String toString() {
        return "Employee ID is " + employeeId + '\n' + "Employee's name is " + getName() + '\n' + "Employee's annual salary is: " + getAnnualSalary(1000) + '\n' + "Employee's salary after the increase is: " + raiseSalary();
    }

    /*public int raiseSalary(){
        Scanner raise = new Scanner(System.in);
        System.out.println("Enter employee's salary raise in %: ");
        int salaryRaise = raise.nextInt();
        if (salaryRaise <= 0) {
            System.out.println("Employee's salary is not increased.");
        }
        else {
            this.annualSalary = this.annualSalary + (this.annualSalary * salaryRaise / 100);
        }
        return this.annualSalary;
    }

    @Override
    public String toString() {
            return "Employee ID is " + employeeId + '\n' + "Employee's name is " + getName() + '\n' + "Employee's annual salary is: " + getAnnualSalary(100) + '\n' + "Employee's salary after the increase is: " + raiseSalary();
    }*/

    public static void main(String[] args) {

        Employee myEmployee = new Employee(5, "Todor", "Ivanov");

//      System.out.println("Employee's name is " + myEmployee.getName());
//      System.out.println("Employee's annual salary is: " + myEmployee.getAnnualSalary(1000));
//      System.out.println("Employee's increased salary is: " + myEmployee.raiseSalary());
        System.out.println(myEmployee);
    }
}







