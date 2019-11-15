package transport;

public class Sedan extends Vehicle {

    /**
     * The block below opens unconventional use of an enum. The enum is technically a class and so can be used as such.
     * I initialised two variables because an enum does not hold ints.
     * I then declared an int variable and passed it to the Doors constructors.
     */
    enum Doors {


        TWO(2),
        FOUR(4);

        private final int num;


        Doors(int num) {
            this.num = num;
        }

        public int getNum(){
            return num;
        }
    };

    private static final int WHEELS = 4;
    private static final int CAPACITY = 4;
    private  boolean boot = true;
    private Person[] front = new Person[1];
    private int frontPassenger = 0;


    // Constructor
    public Sedan(String license, String make, String model, String m_year, Doors n_doors, boolean boot) {
        super(license, make, model, m_year, n_doors.getNum(), WHEELS, CAPACITY);
        this.boot = boot;

    }

    //UNIQUE METHODS
    public boolean addPassenger(Person newPassenger) {

        if (addToFront(newPassenger))
            return true;
        else return addToBack(newPassenger);
    }

    public boolean frontCheck(){
        return  front.length==1;
    }

    /**
     * This method adds to the front seat if the space is available and the passnger is older than 10.
     * @param frontPerson This parameter is the passenger who wishes to be added into the front seat
     * @return true if it succeeded or false if it failed wither of the conditions.
     */
    boolean addToFront(Person frontPerson) {
        Person frontPassenger = passengers[0];
        if (frontPassenger == null) {
            if (frontPerson.getAge() > 10) {
                passengers[0] = frontPerson;
                return true;

                }
            }
        return false;
        }

    /**
     * This function adds a pasenger to the back of the car if they fail the age requirement to be in the front seat.
     * @param newBackPassenger this is the variable of type Person that is added to the back of the sedan car.
     * @return It is return a boolean value as to whether they were successfully added to the back or not
     */
    private boolean addToBack( Person newBackPassenger){
        if (numberOfPassengers != capacity) {
            for (int i = 1; i < capacity; i++) {
                if (this.passengers[i] == null) {
                    passengers[i] = newBackPassenger;
                    numberOfPassengers += 1;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * This function checks to see if there is any passenger seated in the fron tof the car already.
     * The front is set to the 1st index of the passenger array.
     * @return it returns a boolean value. Showing True if front seat (index 0) is not equal to null.
     */
    public boolean checkFront(){
        if(passengers[0] != null){
            return true;
        }

        return false;
    }

//    checks to see if there is a boot or not
    public boolean cargoCheck(){
        return boot;
    }

    }

