package com.homework_6;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    final String name;
    final String sex;
    final String religion;
    final String languageSpoken;
    final String nationality;
    final String egn;
    final String doB;
    final int age;
    String job;
    String countryOfResidence;
    boolean isAdult;

    public Person(String name, String sex, String religion, String languageSpoken, String nationality, String job, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.nationality = nationality;
        this.egn = addEGN();
        this.doB = setDoB();
        this.age = calculateAge();
        this.job = job;
        this.countryOfResidence = countryOfResidence;
        this.isAdult = isAdult();
    }

    public String addEGN() {
        Scanner myEgn = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN:");
        String egn = myEgn.nextLine();
        if (egn.replace(" ", "").length() != 10) {
            throw new InputMismatchException("EGN must be 10 digits! You've entered: " + egn);
        }
        return egn;
    }

    public String setDoB() {
        if (egn.startsWith("0")) {
            return "20" + egn.substring(0, 2) + "-" + "0" + egn.substring(3, 4) + "-" + egn.substring(4, 6);
        } else {
            return "19" + egn.substring(0, 2) + "-" + egn.substring(2, 4) + "-" + egn.substring(4, 6);
        }
    }

    public String getSex() throws CustomException {
        String sex = this.sex;
        if (sex != "Femail" && sex != "Male") {
            throw new CustomException("Please, choose Male or Femail.");
        } else {
            return sex;
        }
    }

    public int calculateAge() {
        LocalDate curDate = LocalDate.now();
        if ((LocalDate.parse(doB) != null) && (curDate != null)) {
            return Period.between(LocalDate.parse(doB), curDate).getYears();
        } else {
            return 0;
        }
    }

    public String sayHello() {
        String welcome;
        switch (languageSpoken) {
            case "Bulgarian":
                welcome = "Здравейте";
                break;
            case "Italian":
                welcome = "Ciao";
                break;
            default:
                welcome = "Hello";
        }
        return welcome;
    }

    public String celebrateEaster() {
        if (religion != "Orthodox" && religion != "Catholic") {
            return "This person don't celebrate Easter.";
        } else {
            return "This person celebrates Easter.";
        }
    }

    public boolean isAdult() {
//boolean isAdult;
        if (countryOfResidence == "Bulgaria" && age >= 18) {
            return isAdult = true;
            //"The person is adult based on Bulgarian law.";
        } else if (countryOfResidence == "Italy" && age >= 18) {
            return isAdult = true;
            //"The person is adult based on Italian law.";
        } else if (countryOfResidence == "USA" && age >= 21) {
            return isAdult = true;
            //"The person is adult based on USA law.";
        } else {
            return isAdult = false;
            //"This person is not adult.";
        }

    }

    public String canTakeLoan() {
        if (this.job == "QA" && this.isAdult == true) {
            return "This person can take loan";
        } else {
            return "This person can't take loan";
        }

    }

    public static void main(String[] args) throws CustomException {
        Person firstPerson = new Person("Tom", "Test", "Catholic", "Bulgarian", "Bulgarian", "QA", "USA");
        System.out.println(firstPerson.getSex());
        //Person secondPerson = new Bulgarian("Nick", "Male", "Catholic", "Bulgarian", "Bulgarian", "Dev", "Bulgaria");
        //System.out.println(secondPerson.sayHello() + secondPerson.celebrateEaster());
        //Person thirdPerson = new Italian("Luca", "Male", "Catholic", "Bulgarian", "Bulgarian", "QA", "Italia");
        //System.out.println(thirdPerson.sayHello() + thirdPerson.celebrateEaster());
    }
}

