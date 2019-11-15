package transport;
/*
 * File: PersonDemo.java
 * Project: transport
 * File Created: Thursday, 5th September 2019 10:45:45 AM
 * Author: Jojoe Ainoo>
 * Email: jojoeainoo@gmail.com
 * Version: 1.0
 * Brief: 
 * -----
 * Last Modified: Thursday, 5th September 2019 12:07:17 PM
 * Modified By: Jojoe Ainoo>
 * -----
 * Copyright ©2019 Jojoe Ainoo>
 */

public class PersonDemo {

        public static void main(String[] args) {
                System.out.println(" ");

                // Testing the Person class Second Constructor
                System.out.println("--- Testing the Person class Second Constructor ---");
                Person person1 = new Person("Emmanuel Ainoo", 21, Person.Gender.MALE);
                System.out.println(" ");

                // Testing the Person class Default Constructor
                System.out.println("--- Testing the Person class Default Constructor ---");
                Person person2 = new Person();
                System.out.println(" ");

                // Creating Person 3 - 5
                System.out.println("--- Creating Person 3 - 5 ---");
                Person person3 = new Person();
                Person person4 = new Person();
                Person person5 = new Person();
                System.out.println(" ");

                // Testing the Accessor Methods for Name and Age
                System.out.println("--- Testing the Accessor Methods for Name and Age ---");
                System.out.println("Person 1's name is :" + person1.getName() + " | Age is: " + person1.getAge()
                                + " | Gender is: " + person1.getGender());
                System.out.println("Person 2's name is :" + person2.getName() + " | Age is: " + person2.getAge()
                                + " | Gender is: " + person2.getGender());
                System.out.println(" ");

                // Testing Mutator Methods (First setName(name) Method )
                System.out.println("--- Testing Mutator Methods ---");
                person3.setName("Jane Doe");
                System.out.println("Person 3's name has been set to: " + person3.getName());
                System.out.println(" ");

                // Testing Mutator Methods (First setName(first,last) Method )
                person4.setName("Mary", "Owusu");
                System.out.println("Person 4's name has been set to: " + person4.getName());
                System.out.println(" ");

                // Testing Incrementing Age Method )
                System.out.println("--- Testing Incrementing Age Method ---");
                person5.incrementAge();
                System.out.println("Person 5's age has been incremented to: " + person5.getAge());
                person5.incrementAge();
                System.out.println("Person 5's age has been incremented to: " + person5.getAge());
                System.out.println(" ");

                // Testing if Person 6 and 7 are equal
                System.out.println("--- Testing if Person 3 and 4 are equal ---");
                Person person6 = new Person("Jeshrun Larbi", 22, Person.Gender.MALE);
                Person person7 = new Person("Jeshrun Larbi", 22, Person.Gender.MALE);
                System.out.println(" ");

                // Printing Details of Person 6 and 7
                System.out.println("Person 6's name is :" + person6.getName() + " | Age is: " + person6.getAge()
                                + " | Gender is: " + person6.getGender());
                System.out.println("Person 7's name is :" + person7.getName() + " | Age is: " + person7.getAge()
                                + " | Gender is: " + person7.getGender());
                System.out.println(" ");

                // Are they Equal ?
                System.out.println("--- Is Person 6 equal to Person 7 ? ---");
                System.out.println(person6.equals(person7));
                System.out.println(" ");

                // Changing Person 6's name
                System.out.println("--- Changing Person 6's name ---");
                person6.setName("Agatha Maison");
                System.out.println(" ");

                // Printing Details of Person 6 and 7
                System.out.println("Person 6's name is :" + person6.getName() + " | Age is: " + person6.getAge()
                                + " | Gender is: " + person7.getGender());
                System.out.println("Person 7's name is :" + person7.getName() + " | Age is: " + person7.getAge()
                                + " | Gender is: " + person7.getGender());
                System.out.println(" ");

                // Are they Equal ?
                System.out.println(" --- Is Person 6 equal to Person 7 ? ---");
                System.out.println(person6.equals(person7));
                System.out.println(" ");

        }

}