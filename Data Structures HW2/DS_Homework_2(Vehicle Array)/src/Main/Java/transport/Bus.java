package transport;
/*
 * File: Bus.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to inherit from a generic vehicle class with bus specifics
 * -----
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */

public class Bus extends Vehicle {
        private boolean BOOT;
//        The wheels are set to final because this is not a factor that the user should be able to change
        private static final int WHEELS = 4;


    /**
     * This is the main constructor of thr bus class which has all the necessary parameters.
     * @param license Shows the unique license of the bus
     * @param make Shows the unique make of the bus
     * @param model Shows the unique model of the bus
     * @param m_year Shows the unique manufacturing year of the bus
     * @param n_doors Shows the unique number of doors of the bus
     * @param capacity Shows the unique seat capacity of the bus
     */
        public Bus(String license, String make, String model, String m_year, int n_doors, int capacity) {
            super(license, make, model, m_year, checkMin(n_doors, 2), WHEELS, capacity);

        }

// The bus class appears to have no methods because it has inherited all necessary from the vehicle class.


}


