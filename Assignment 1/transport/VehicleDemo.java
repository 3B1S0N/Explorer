package transport;
/*
 * File: VechicleDemo.java Project: transport File Created: Friday, 6th
 * September 2019 9:09:48 AM Author: Jojoe Ainoo> Email: jojoeainoo@gmail.com
 * Version: 1.0 Brief: ----- Last Modified: Friday, 6th September 2019 9:11:03
 * AM Modified By: Jojoe Ainoo> ----- Copyright ©2019 Jojoe Ainoo>
 */

public class VehicleDemo {

    public static void main(String[] args) {
        System.out.println(" ");

        // Creating Passengers

        System.out.println("--- Creating Person (Passenger) Instances ---");
        Person passenger1 = new Person("Emmanuel Ainoo", 40, Person.Gender.MALE);
        Person passenger2 = new Person("Jojoe Guy", 21, Person.Gender.MALE);
        Person passenger3 = new Person("Ayorkor Korsah", 12, Person.Gender.FEMALE);
        Person passenger4 = new Person("Mary Gate", 11, Person.Gender.FEMALE);
        System.out.println(" ");

        // Creating Drivers
        System.out.println("--- Creating Person (Driver) Instances ---");
        Person driver1 = new Person("John Snow", 41, Person.Gender.MALE);
        Person driver2 = new Person("Agatha Maison", 11, Person.Gender.FEMALE);
        System.out.println(" ");

        System.out.println(" --- Testing the Vehicle Constructor ---");
        Vehicle vehicle1 = new Vehicle("GN 1280", "Benz", "C class", 2019, 4, 4, 4);
        Vehicle vehicle2 = new Vehicle("GW 3w80", "Toyota", "Corolla", 2019, 4, 4, 10);
        Vehicle vehicle3 = new Vehicle("WE 2w50", "Hyundai", "Tucson", 2019, 4, 4, 2);
        System.out.println(" ");

        System.out.println("--- Testing the Accessor Methods for Instance variables ---");
        System.out.println("Vehicle 1's license is: " + vehicle1.getLicense());
        System.out.println("Vehicle 1's make is: " + vehicle1.getMake());
        System.out.println("Vehicle 1's model is: " + vehicle1.getModel());
        System.out.println("Vehicle 1's year is: " + vehicle1.getYear());
        System.out.println("Vehicle 1's doors are: " + vehicle1.getDoors());
        System.out.println("1 Vehicle 1's wheels are: " + vehicle1.getWheels());
        System.out.println(" ");

        System.out.println(" --- Testing the Mutator setDriver Method --- ");
        vehicle1.setDriver(driver1);
        System.out.println("Vehicle 1's Driver has been set to: " + vehicle1.getDriver());
        System.out.println(" ");

        System.out.println("Testing the hasDriver Method");
        System.out.println("Does Vehicle 1 have a driver: " + vehicle1.hasDriver());
        System.out.println("Does Vehicle 2 have a driver: " + vehicle2.hasDriver());
        System.out.println(" ");

        System.out.println("--- Testing the addPassenger Method ---");
        // vehicle1.addPPassenger(passenger1);
        // vehicle1.addPPassenger(passenger1);
        System.out.println("Lets Add Passenger 1: " + vehicle1.addPassenger(passenger1));
        System.out.println("Is the Vehicle 1 Full?: " + vehicle1.isFull());
        System.out.println("Who are the current Riders in Vehicle 1: ");
        vehicle1.listRiders();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Lets add Passengers 2 - 4");
        vehicle1.addPassenger(passenger2);
        vehicle1.addPassenger(passenger3);
        vehicle1.addPassenger(passenger4);
        System.out.println(" ");

        System.out.println("--- Testing the isFull Method ---");
        System.out.println("Is the Vehicle 1 Full Now?: " + vehicle1.isFull());
        System.out.println("Who are the current Riders in Vehicle 1: ");
        vehicle1.listRiders();

        System.out.println(" ");
        System.out.println("--- Testing the hasPassengers Method ---");
        System.out.println("Lets Check does Vehicle 2 have Passengers: " + vehicle2.hasPassengers());

        System.out.println(" ");
        System.out.println("--- Testing the hasDriverMethod ---");
        System.out.println("Does Vehicle 2 have a driver: " + vehicle2.hasDriver());

        System.out.println(" ");
        System.out.println("--- Testing the isEmpty Method ---");
        System.out.println("So is Vehicle 2 Empty? : " + vehicle2.isEmpty());
        System.out.println(" ");

        System.out.println("Lets Add Passenger 4 to Vehicle 2");
        vehicle2.addPassenger(passenger4);
        System.out.println("Lets Check does Vehicle 2 have Passengers: " + vehicle2.hasPassengers());
        System.out.println(" ");

        System.out.println("--- Testing the removePassengers Method ---");
        System.out.println("Lets Remove Passenger 4 from Vehicle 2");
        vehicle2.removePassenger("Mary Gate");
        System.out.println("Lets Check does Vehicle 2 have Passengers: " + vehicle2.hasPassengers());
        System.out.println(" ");

        System.out.println("--- Testing the getNumPassengers Method ---");
        System.out.println("What are the Passenger Counts (without the driver) in our Vehicles");
        System.out.println("Vehicle 1 Passenger Count: " + vehicle1.getNumPassengers());
        System.out.println("Vehicle 2 Passenger Count: " + vehicle2.getNumPassengers());

        System.out.println(" ");
        System.out.println("--- Testing the getOccuepants Method ---");
        System.out.println("What are the People Counts (with the driver) in our Vehicles");
        System.out.println("Vehicle 1 Passenger Count: " + vehicle1.getNumOccupants());
        System.out.println("Vehicle 2 Passenger Count: " + vehicle2.getNumOccupants());
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("--- Testing the toString Method ---");
        System.out.println(vehicle1.toString());
        System.out.println(" ");

    }
}