package transport;

/*
 * File: Motorcycle.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to inherit from a generic vehicle class with Motrocycle  specifics
 * -----
 * Last Modified: Saturday 28th December 2019
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */

// 	A Motorcyle has two wheels, no doors, and has the capacity for only 1 passenger.
//  These initialised variables are final because it is inappropriate for the user to change these values as they are standard.

public class Motorcycle extends Vehicle {

    // Instance Variables
    private static final int   WHEELS = 2;
    private static final int   DOORS = 0;
    private static final int   CAPACITY = 1;
    private boolean BOOT = false;


    // Constructor
    /**
     * This is the main constructor of thr bus class which has all the necessary parameters.
     * @param license Shows the unique license of the bus
     * @param make Shows the unique make of the bus
     * @param model Shows the unique model of the bus
     * @param m_year Shows the unique manufacturing year of the bus
     * @param BOOT Shows whether the vehicle (Motorcycle) has a boot or not.
     */
    public Motorcycle(String license, String make, String model, String m_year,boolean BOOT) {


        // 1: 'super' is a direct call to the constructor of the super or parent class (class being inherited from)
        // 2: The super constructor is ALWAYS the first thing called in a subclass' constructor
        // 3: The subclass constructor only needs parameters for relevant data. This can be fewer or more things than the super constructor needs.
        //      However, the super constructor still requires the data necessary to create an object of the parent class (a vehicle still needs data for a vehicle)
        //      As such, no matter your implementation, you still need to pass into the super constructor this necessary data.


        super(license, make, model, m_year, DOORS, WHEELS, CAPACITY);
    }


}
