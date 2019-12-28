/*
 * File: SimpleArray.java
 * Project: Generic Array
 * Author: Tobias Woode>
 * Email: toby2.0@outlook.com
 * Version: 1.0
 * Brief: A class created to define methods of a generic array
 * -----
 * Last Modified: Saturday 28th December 2019, 10:55 am
 * Modified By: Tobias Woode>
 * -----
 * Copyright ©2019 Tobias Woode>
 */


public class SimpleArray<T> {
    private int numitems;

    private T[] items;
    public static final int DEFAULT_SIZE = 20;


    public SimpleArray() {
        numitems = 0;
        items = (T[]) new Object[DEFAULT_SIZE];

    }

    public void add(T newItem) {
        if (numitems < items.length) {
            items[numitems] = newItem;
            numitems++;
        }
    }

    public void remove(T olditem) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == olditem) {
                // shifting elements
                for (int j = i; j < items.length - 1; j++) {
                    items[j] = items[j + 1];
                }
                break;

            }

        }
    }

    public int find(T anItem) {
        for (int i = 0; i < numitems; i++) {
            if (items[i] == anItem) {
                System.out.println("I have found " + items[i]);
                return i;
            }
        }
        return -1;
    }

    public void insert(T theItem, int index) {
        T temp;
        for (int i = numitems - 1; i > -1; i--) {
            temp = items[i + 1];
            items[i + 1] = items[i];
            items[i] = temp;
            if (i == index) {
                items[index] = theItem;
                numitems++;
                break;
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < numitems; i++) {
            System.out.print(items[i]);
            if (i < numitems - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();

    }
// This function uses an incremental  variable initialised to 0 and increases as the loop recognises items in the list.
//  It returns the incrementer at its final value

    public int size() {
        int count = 0;
        for (int i = 0; i < numitems; i++) {
            count += 1;


        }
        System.out.println(count);
        return count;

    }

//    This function, loops through the list. If the parameter the user entered is equal to the value whose index is i at the time
//    Then it returns that value of i in that instance.
    public int getindex(T value) {
        int index = 0;
        for (int i = 0; i < numitems; i++) {
            if (value == items[i]) {
                index = i;
            }
        }
        return index;

    }

//    This function sets or replaces the item in an existing index with the value entered as a parameter.
//    This function returns nothing
    public void setIndex(int index, T newItem) {
        items[index] = newItem;
    }

//    The function loops through the list after accepting a variable "Value" whic is intended to be an item in the generic list
//    The function then checks if "value" is equal to items at index i. if so, it increments the incrementer variabale.
//    It returns the final value of the incrementer variable

    public int setOccurrences(T item) {
        int counter = 0;
        for (int i = 0; i < numitems; i++) {
            if (item == items[i]) {
                counter++;
            }
        }
        return counter;
    }

    public void addAll(T[] newItem) {
        int newNumitems = newItem.length;
        for (int i = 0; i < newNumitems; i++) {
            add(newItem[i]);
        }
    }

//    This loops through the generic list of additional items and calls the insert functions on each item in that list, to the original list.
    public void insertAll(int index, T[] moreItems) {
        int newNumItems = moreItems.length;
        for (int i = 0; i < newNumItems; i++) {
            insert(moreItems[i], index);
            index++;
        }
    }
    //    This loops through the generic list of items and calls the remove function on all occurrences of the item passed as a parameter.
    public void removeAll(T uselessItem) {
        for (int i = 0; i < numitems; i++) {
            if (uselessItem == items[i]) {
                remove(items[i]);
            }
        }
    }

//    This function loops through the list to find all occurrences of the variable passed as a parameter but it returns the index of the last occurrence in the list.
    public int findLast(T occurringItem) {
        int indexHolder = 0;
        for (int i = 0; i < numitems; i++) {
            if (occurringItem.equals(items[i])) {
                indexHolder = getindex(items[i]);
            }
        }
        return indexHolder;
    }

//    This function finds and returns an array of all occurrences of the variable passed as a parameter in the list
    public int[] findAll(T occurningIndeces) {
        int[] tempItems = new int[setOccurrences(occurningIndeces)];
        int count = 0;
        for (int i = 0; i < numitems; i++) {
            if (occurningIndeces == items[i]) {
                tempItems[count] = i;
                count ++;
            }
        }
        return tempItems;
    }

}






