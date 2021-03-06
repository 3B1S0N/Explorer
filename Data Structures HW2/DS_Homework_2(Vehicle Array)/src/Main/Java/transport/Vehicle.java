package transport;
/*
 * File: Vehicle.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to mimic the features of a generic Vehicle from whichh vehicle type classes will inherit from
 * -----
 * Last Modified: Saturday 28th December 2019, 10:36 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */


public class Vehicle{

    public static final int DEFAULT_SEAT_NUMBER = 4;

    // Instance variables
    private String license;
    private String make;
    private String model;
    private String m_year;
    private int n_doors;
    private int n_wheels;
    private Person driver = null;
    Person[] passengers;
    int numberOfPassengers = 0 ;
    int capacity;
    private int driverAge = 18;

    // Constructors

    public Vehicle(String license, String make, String model, String m_year, int n_doors, int n_wheels, int capacity) {
        this.license = license;
        this.make = make;
        this.model = model;
        this.m_year = m_year;
        this.n_doors = n_doors;
        this.n_wheels = n_wheels;
        this.capacity = checkMin(capacity,0);
        passengers = new Person[capacity];
    }


    // Accessor and mutator methods

    public Person getDriver() {
        return driver;
    }


    // Unique methods

    public boolean setDriver(Person newdriver) {
        if (newdriver.getAge() > 18){
            this.driver = newdriver;
            return true;
        }
        return false;
    }
    
// Checks if the given vehicle type contains at a driver with a boolean funtion
    public boolean hasDriver() {
        if (this.driver != null){
            return true;
        }
        else{
            return false;
        }

    }
    
// Checks if the given vehicle type contains at least one passenger with a boolean funtion
    public boolean hasPassengers() {
        if (numberOfPassengers > 0){
            return true;
        }
        return false;
    }
    
// Checks if the given vehicle type is empty with a boolean funtion
    public boolean isEmpty() {
        if (numberOfPassengers >0 || this.driver != null){
            return false;
        }
        else{
            return true;
        }


    }

 // Checks if the given vehicle type is full with a boolean funtion
    public boolean isFull() {
        if (numberOfPassengers == 4 && this.driver != null){
            return true;
        }
        return false;

    }
    
// Adds passengers from the beginning (i.e Fills front seating before back seats)
// Does not exceed the total capacity of the given vehicle type
    
    public boolean addPassenger(Person newPassenger) {
        if (numberOfPassengers != capacity ) {
            for (int i = 0; i < capacity; i++) {
                if (passengers[i] == null){
                    passengers[i] = newPassenger;
                    numberOfPassengers += 1;
                    return true;
                }
            }
        }
        return false;
    }

// Uses a for loop to find and remove passengers from the designated vehicle
// Has a base case for if the first passenger is not null (i.e if at least one person is in the designated vehicle)
    public void removePassenger(String passengername) {
        for (int i = 0; i < capacity ; i++) {
            if(passengers[1] != null){
                if(passengername.equals(passengers[i].getName())){
                    passengers[i] = null;
                    numberOfPassengers -= 1;
                }
            }
        }
    }


    public int getNumPassengers() {
        return numberOfPassengers;

    }

    public int getNumOccupants() {
        if(this.driver != null){
            return numberOfPassengers + 1;
        }
        else{
            return numberOfPassengers;
        }
    }


    // Utility methods

    public String toString() {
        if (driver != null)
            return String.format("" +
                "Driver: %s, age: %d\n" +
                "Number of passengers: %d\n" +
                "License Number plate: %s\n" +
                "Number of Wheels: %d\n" +
                "Model: %s\n" +
                "Manufacturing Year: %s\n" +
                "Number of Doors: %d\n",driver.getName(), driver.getAge(),numberOfPassengers,license,n_wheels,model,m_year,n_doors);
        else
            return String.format("" +
                    "Driver: %s, age: %s\n" +
                    "Number of passengers: %d\n" +
                    "License Number plate: %s\n" +
                    "Number of Wheels: %d\n" +
                    "Model: %s\n" +
                    "Manufacturing Year: %s\n" +
                    "Number of Doors: %d\n","N/A", "N/A",numberOfPassengers,license,n_wheels,model,m_year,n_doors);
    }

    public String listRiders() {
        String res = "";
        if (driver != null)
            res = res.concat(String.format("Driver: %s, age: %d\n", driver.getName(), driver.getAge()));
        else
            res = res.concat(String.format("Driver: %s, age: %s\n", "N/A", "N/A"));

        for (int i = 0; i < capacity; i++) {
            if (passengers[i] != null){
                res = res.concat(String.format("Name: %s, Age: %d, Gender: %s\n", passengers[i].getName(), passengers[i].getAge(), passengers[i].getGender()));
            }
        }

        return res;

    }

    // Private methods

    /** This function is checking whether the value entered buy the user is greater than the minimum value.
     * @param value This is the value entered by the user
     * @param min This is the minimum value that is set for the specific value they are trying to enter.
     * @return The value that had been reassigned to the minimum value
     */
        static int checkMin(int value, int min){
        if(value < min){
            value = min;

        }
        return value;

    }

}
