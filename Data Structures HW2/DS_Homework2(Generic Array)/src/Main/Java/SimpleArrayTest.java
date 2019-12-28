/*
 * File: SimpleArrayTest.java
 * Project: Generic Array
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to test the generic array methods
 * -----
 * Last Modified: Saturday 28th December 2019, 10:56 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */


public class SimpleArrayTest {


    public static void main(String[] args) {
        SimpleArray sa = new SimpleArray();


//      ADDING ITEMS TO THE GENERIC ARRAY
        sa.add("Cat");
        sa.add("Dog");
        sa.add("Mouse");
        sa.add("Lion");
        sa.add("Platypus");
        sa.add("Cat");
        sa.add("Cat");

//      TESTING THE FIND METHODS
        sa.find("Platypus");
       System.out.println(sa.findLast("Cat"));
       int[] indecesList = sa.findAll("Cat");
        System.out.print("[");
        for (int i = 0; i < indecesList.length ; i++) {
            System.out.print(indecesList[i] + ", ");
        }
        System.out.println("]");
        sa.printAll();



//       TESTING THE INSERT METHODS
        sa.insert("Panther", 2);
        String[] moreItems = {"Lynx", "Tiger"};
        sa.insertAll(3, moreItems);


//        TESTING THE SIZE METHODS
        sa.size();
        sa.printAll();


//        TESTING THE INDEX METHODS
        sa.setIndex(4, "Cat");
        System.out.println(sa.getindex("Platypus"));
        System.out.println(sa.getindex("Cat"));
        sa.printAll();

//        TESTING THE SET OCCURRENCES METHOD
        System.out.println(sa.setOccurrences("Cat"));



//        TESTING THE REMOVE METHODS
        sa.remove("Lynx");
        sa.removeAll("Cat");
        sa.printAll();


    }
}


