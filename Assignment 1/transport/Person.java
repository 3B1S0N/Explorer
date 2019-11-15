package transport;

/*
 * File: Person.java
 * Project: transport
 * File Created: Thursday, 5th September 2019 10:13:52 AM
 * Author: Jojoe Ainoo>
 * Email: jojoeainoo@gmail.com
 * Version: 1.0
 * Brief: 
 * -----
 * Last Modified: Thursday, 5th September 2019 11:16:02 AM
 * Modified By: Jojoe Ainoo>
 * -----
 * Copyright ©2019 Jojoe Ainoo>
 */
import java.util.Random;

// This is Person Class with three Instance Variables (Name, Age, Gender)
public class Person {

    // Static method to create enum type Gender for genders of Persosn
    public static enum Gender { // Gender data type takes either: MALE or FEMALE
        MALE, FEMALE
    };

    private String name; // name instance variable of person
    private int age; // age instance variable of person
    private Gender gender; // gender instance variable of person

    /*
     * @brief Default Constructor Method to Initialize Class
     * 
     * @body Use of "this" keyword to Invoke Second constructor of Class with
     * default Name and Age Assigning instance variables to default values and
     * Gender to random gender
     *
     * @return void
     */
    public Person() {
        // this("No name Yet", 0, GENDER.FEMALE); // Invoking second constructor of the
        // class with default Name and Age
        Gender rand = randomGender(); // Call to randomGender method to generate random Genders
        this.name = "No name yet"; // Default name
        this.age = 0; // Default age
        this.gender = rand; // Random gender
    }

    /*
     * @brief Second Constructor that allows Name, Age & Gender of Person to be set
     *
     * @param name String // Name of Person
     * 
     * @param age int // Age of Person
     * 
     * @param gender Gender // Enum gender data type (MALE /FEMALE)
     *
     * @return void
     */
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /*
     * @brief Accessor Method to get Name of Person
     *
     * @return name String // Returns name of Person
     */
    public String getName() {
        return name;
    }

    /*
     * @brief Accessor Method to get Age of the Person
     *
     * @return age int // Returns age of Person
     */
    public int getAge() {
        return age;
    }

    /*
     * @brief Accessor Method to get Gender of the Person
     * 
     * @return gender Gender // Returns gender of Person
     */
    public Gender getGender() {
        return this.gender;
    }

    /*
     * @brief Mutator Method to set the Name of the Person given Full name
     *
     * @param name String // Full name of Person
     * 
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * @brief Mutator Method to set the Name of the Person
     *
     * @param first String // last name of person
     * 
     * @param last String // Last name of person
     * 
     * @body concatenating first and last name as name of person
     * 
     * @return void
     */
    public void setName(String first, String last) {
        this.name = first + " " + last;
    }

    /*
     * @brief Mutator Method to increment the age by 1
     * 
     * @body age++ to increment age by 1
     * 
     * @return void
     */
    public void incrementAge() {
        this.age++;
    }

    /*
     * @brief Simple Display Method to Print Details of Person Class
     * 
     * @body print statement of instance variables
     * 
     * @return void
     */

    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    /*
     * @brief Method to generate random genders based on random numbers
     * 
     * @body generates a random number between 0 to 11 and assigns either MAlE or
     * FEMALE to particular range.
     * 
     * @return Gender
     */
    public Gender randomGender() {

        Random rand = new Random(); // Initialize random object
        int randInt = rand.nextInt(10); // Get random integer from 0 to 9

        if (randInt >= 5) {
            return Gender.MALE; // All Males fall within Random Numbers equal or above 5
        } else {
            return Gender.FEMALE; // All females fall within Random Numbers belowe 5
        }

    }

    /*
     * @brief equals method that checks if two person's are equal
     * 
     * @param Person anotherPerson // Person object
     * 
     * @body checks if a person object's details matches another Person's details
     * passed as a parameter to the function. Returns true if match is equal
     * 
     * @return boolean
     */

    public boolean equals(Person anotherPerson) {

        if (this.name.equals(anotherPerson.name) && this.age == anotherPerson.age
                && this.gender.equals(anotherPerson.gender)) {
            return true;
        } else {
            return false;
        }

    }

}
