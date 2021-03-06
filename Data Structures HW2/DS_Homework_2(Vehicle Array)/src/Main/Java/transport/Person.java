package transport;
/*
 * File: Person.java
 * Project: transport
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A generic human class that mimics the traits of a typical passenger in a vehicle
 * -----
 * Last Modified: Saturday 28th December 2019; 10:30 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */

import java.util.Random;



public class Person{

    public static enum Gender{MALE, FEMALE}

    private String name;
    private int age;
    private Gender gender;
    private String first;
    private String last;

    public Person () {
        this.name = "No name yet";
//      this.age = randomAge(60);
        this.gender = randomGender();
    }


    public Person (Gender gender, String name, int age){
        this.name = name;
        this.age =  age;
        this.gender = gender;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setName(String first, String last){
        this.first = first;
        this.last = last;

    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender(){
        return gender;

    }

    public String getName(){
        return this.name;
    }

    public void incrementAge(){
        this.age += 1;
    }

    private Gender randomGender(){
        Random rand = new Random();
        int randInt = rand.nextInt(10);

        if(randInt >= 5){
            return Gender.MALE;

        }
        else{
            return Gender.FEMALE;
        }
    }


    // randomAge(int limit):-> takes a max limit;
    // creates a new Random() object;
    // return the next int of that object as the age.



}

