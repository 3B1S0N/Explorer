package transport;

public class SedanTest {
    private static final boolean BOOT = true;

    public static void main(String[] args) {
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

    }
}
