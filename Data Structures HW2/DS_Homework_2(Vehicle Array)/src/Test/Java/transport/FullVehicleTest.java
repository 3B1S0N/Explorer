package transport;
/*
 * File: FullVehicleTest.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to test all vehicle types created, in addition to their unique features and methods
 * -----
 * Last Modified: Saturday 28th December 2019, 10:45 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */

import java.util.Random;

public class FullVehicleTest {

    public static void main(String[] args) {
        System.out.println(" ");
        Random randAge = new Random();
        Motorcycle racer = new Motorcycle("GH 200ZK", "Honda", "Takashi 290v","2008", false);
        Sedan lowRider = new Sedan("GV 112", "Audi", "R8", "2019", Sedan.Doors.FOUR, true);
        Bus trotro = new Bus("GZ 100X","Mercedes","Sprinter", "2003", 4, 10);
        Motorcycle ducatti = new Motorcycle("GH 200ZK", "Honda", "Buzzard","2008", false);
        Vehicle[] vehicleArray = new Vehicle[]{racer, lowRider, trotro, ducatti};

        for (int i = 0; i < vehicleArray.length ; i++) {
            for (int j = 0; j < vehicleArray[j].capacity; j++) {
                Person person = new Person(Person.Gender.FEMALE," ", randAge.nextInt(50));
                System.out.println((vehicleArray[i].capacity));
                System.out.println(vehicleArray[i].addPassenger(person));

            }


        }


        Person driver1 = new Person(Person.Gender.FEMALE, "Driver Name", 20);

        Person passenger1 = new Person(Person.Gender.FEMALE, "passenger 1", 9);
        Person passenger2 = new Person(Person.Gender.FEMALE, "passenger 2", 14);
        Person passenger3 = new Person(Person.Gender.FEMALE, "passenger 3", 23);
        Person passenger4 = new Person(Person.Gender.FEMALE, "passenger 4", 67);

        Sedan sedan1 = new Sedan("GV 3243 P", "Nissan", " Racer", "2018", Sedan.Doors.FOUR, true);

        sedan1.addPassenger(passenger1);

        sedan1.addPassenger(passenger2);
        sedan1.addPassenger(passenger3);
        sedan1.addPassenger(passenger4);
        sedan1.addToFront(passenger1);
        System.out.println(sedan1.checkFront());


        sedan1.setDriver(driver1);


        System.out.println(sedan1.listRiders());
        System.out.println(sedan1.toString());


        Person driver2 = new Person(Person.Gender.FEMALE, "Driver Name", 12);

        Person buspassenger1 = new Person(Person.Gender.FEMALE, "passenger 1", 10);
        Person buspassenger2 = new Person(Person.Gender.FEMALE, "passenger 2", 14);
        Person buspassenger3 = new Person(Person.Gender.FEMALE, "passenger 3", 23);
        Person buspassenger4 = new Person(Person.Gender.FEMALE, "passenger 4", 67);

        Bus trotro1 = new Bus("GZ 100X","Mercedes","Sprinter", "2003", 4, 10);

        trotro1.addPassenger(buspassenger1);
        trotro1.addPassenger(buspassenger2);
        trotro1.addPassenger(buspassenger3);
        trotro1.addPassenger(buspassenger4);



        System.out.println(trotro1.toString());
        System.out.println(trotro1.listRiders());

        Person motorDriver1 = new Person(Person.Gender.FEMALE, "Twinnette", 20);

        Person motorpassenger1 = new Person(Person.Gender.FEMALE, "passenger 1", 10);


        Motorcycle motorcycle = new Motorcycle("GV 112", "Honda", "209v", "2019", false);

        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());

        motorcycle.addPassenger(motorpassenger1);
//        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());

        motorcycle.setDriver(motorDriver1);
//        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());


    }

}
