package transport;

public class MotorcycleTest {
    public static void main(String[] args) {
        Person driver1 = new Person(Person.Gender.FEMALE, "Twinnette", 20);
        Person driver2 = new Person(Person.Gender.FEMALE, "Driver Name", 19);

        Person passenger1 = new Person(Person.Gender.FEMALE, "passenger 1", 10);
        Person passenger2 = new Person(Person.Gender.FEMALE, "passenger 2", 14);

        Motorcycle motorcycle = new Motorcycle("GV 112", "Honda", "209v", "2019", false);

        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());

        motorcycle.addPassenger(passenger1);
//        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());

        motorcycle.setDriver(driver1);
//        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());

        motorcycle.setDriver(driver2);
//        System.out.println(motorcycle.toString());
        System.out.println(motorcycle.listRiders());



    }
}
