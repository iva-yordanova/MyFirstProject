package com.homework_5;

public class CarTask {
    String carName;
    String carColor;
    int carReleaseYear;
    int carHorsePower;
    boolean secondHand;

    public CarTask(String carName, String carColor, int carReleaseYear, int carHorsePower, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.carReleaseYear = carReleaseYear;
        this.carHorsePower = carHorsePower;
        this.secondHand = secondHand;
    }

    public CarTask(String carName, String carColor, boolean secondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.secondHand = secondHand;
        carReleaseYear = -1;
        carHorsePower = -1;
    }

    public CarTask(String carName, String carColor, int carReleaseYear, int carHorsePower) {
        this.carName = carName;
        this.carColor = carColor;
        this.carReleaseYear = carReleaseYear;
        this.carHorsePower = carHorsePower;
        secondHand = true;
    }

    public CarTask(String carName, int carReleaseYear, int carHorsePower, boolean secondHand) {
        this.carName = carName;
        this.carReleaseYear = carReleaseYear;
        this.carHorsePower = carHorsePower;
        this.secondHand = secondHand;
        carColor = "N/A";
    }

    public CarTask() {
        carName = "N/A";
        carColor = "N/A";
        carReleaseYear = -1;
        carHorsePower = -1;
        secondHand = true;
    }

    public static void main(String[] args) {
        CarTask myFirstCar = new CarTask("Ford", "Red", 2001, 150, true);
        System.out.println(myFirstCar.carHorsePower);
        System.out.println(myFirstCar.carColor);

        CarTask mySecondCar = new CarTask("BMW", "Blue", false);
        System.out.println(mySecondCar.carReleaseYear);
        System.out.println(mySecondCar.carName);

        CarTask myThirdCar = new CarTask("Opel", "Black",2010, 210);
        System.out.println(myThirdCar.secondHand);
        System.out.println(myThirdCar.carReleaseYear);

        CarTask myForthCar = new CarTask("Toyota",2012, 120, true);
        System.out.println(myForthCar.carColor);
        System.out.println(myForthCar.secondHand);

        CarTask myFifthCar = new CarTask();
        System.out.println(myFifthCar.carHorsePower);
        System.out.println(myFifthCar.carName);

    }
}
