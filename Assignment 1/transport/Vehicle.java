package transport;
/*
 * File: Vehicle.java
 * Project: transport
 * File Created: Thursday, 5th September 2019 1:06:12 PM
 * Author: Jojoe Ainoo>
 * Email: jojoeainoo@gmail.com
 * Version: 1.0
 * Brief: 
 * -----
 * Last Modified: Friday, 6th September 2019 9:11:12 AM
 * Modified By: Jojoe Ainoo>
 * -----
 * Copyright ©2019 Jojoe Ainoo>
 */

public class Vehicle {
    public static final int DEFAULT_DRIVING_AGE = 18;

    private String licensePlate;
    private String make;
    private String model;
    private int year;
    private int doors;
    private int wheels;
    private Person driver;
    private Person[] passengers;
    private int numPassengers;

    public Vehicle(String licensePlate, String make, String model, int year, int doors, int wheels, int numPass) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.doors = doors;
        driver = null;
        passengers = new Person[numPass];
        numPassengers = 0;
    }

    public String getLicense() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getDriver() {
        return driver.getName();
    }

    public boolean setDriver(Person person) {
        if (person.getAge() > DEFAULT_DRIVING_AGE) {
            this.driver = person;
            return true;
        } else {
            return false;
        }

    }

    public boolean hasDriver() {
        return (driver != null);
    }

    public boolean hasPassengers() {
        if (numPassengers >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (this.hasDriver() == false && this.hasPassengers() == false) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        // System.out.println(passengers.length);
        if (this.hasDriver() == true && numPassengers >= passengers.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addPassenger(Person newPassenger) {
        if (isFull() == false) {
            passengers[numPassengers] = newPassenger;
            numPassengers++;
            return true;
        } else
            return false;
    }

    public boolean removePassenger(String passengerName) {
        boolean foundPassenger = false;
        for (int i = 0; i < numPassengers; i++) {
            if (passengerName.equals(passengers[i].getName())) {
                passengers[i] = passengers[numPassengers - 1];
                numPassengers--;
                foundPassenger = true;
                break;
            }
        }
        return foundPassenger;

    }

    public int getNumPassengers() {

        return numPassengers;

    }

    public int getNumOccupants() {
        int passengersCount = 0;

        if (this.hasDriver() == true) {
            passengersCount = numPassengers + 1;
        }
        return passengersCount++;
    }

    public void listRiders() {
        for (int i = 0; i < numPassengers; i++) {
            passengers[i].displayPersonInfo();
        }
    }

    @Override
    public String toString() {
        String vehicleDetails = " ";
        // name and age of driver
        // number of passengers
        vehicleDetails = "\n The vehicle's details are " + "\n Model : " + model + "\n Year: " + year
                + "\n Driver's Name: " + this.driver.getName() + "\n Driver's Age: " + this.driver.getAge()
                + "\n Number of Passengers: " + numPassengers;
        return vehicleDetails;
    }

}