package transport;
/*
 * File: VehicleTest.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to test the generic features of the initial Vehicle class
 * -----
 * Last Modified: Saturday 28th December 2019, 10:52 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */


public class VehicleTest{
    public static void main(String[] args) {
        Person driver1 = new Person(Person.Gender.FEMALE, "Driver Name", 20);
        Person driver2 = new Person(Person.Gender.FEMALE, "Driver Name", 12);

        Person passenger1 = new Person(Person.Gender.FEMALE, "passenger 1", 10);
        Person passenger2 = new Person(Person.Gender.FEMALE, "passenger 2", 14);
        Person passenger3 = new Person(Person.Gender.FEMALE, "passenger 3", 23);
        Person passenger4 = new Person(Person.Gender.FEMALE, "passenger 4", 67);

        Vehicle vehicle1 = new Vehicle("GV 112", "Honda", "209v", "2019", 4, 4, 4);

        vehicle1.addPassenger(passenger1);
        vehicle1.addPassenger(passenger2);
        vehicle1.addPassenger(passenger3);
        vehicle1.addPassenger(passenger4);

        vehicle1.setDriver(driver1);

        vehicle1.setDriver(driver2);

        System.out.println(vehicle1.toString());
        System.out.println(vehicle1.listRiders());
    }
}
