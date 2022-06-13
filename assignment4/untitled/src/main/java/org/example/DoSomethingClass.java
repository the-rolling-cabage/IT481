package org.example;

public class DoSomethingClass {
    // return the smallest number in the array
    public static Integer example1(Integer[] arraysOfInts, int n) {
        int currmin = 100;
        for (int i=0; i<n; i++) {
            if (arraysOfInts[i] < currmin) {
                currmin = arraysOfInts[i];
            }
        }
        return currmin;
    }

    public static void example2(Integer[] arrayOfInts) {
        for (int i = 0; i < 100; i++) {
            System.out.println("" + arrayOfInts[i]);
        }
    }

    public static void example3(Integer[] arrayOfInts) {
        int a = 10;
        int b = 5;
        boolean found = false;

        for (int arrayOfInt : arrayOfInts) {
            if (a == arrayOfInt) {
                System.out.println("The value of a was found in the int array.");
                found = true;
            } else if (b == arrayOfInt) {
                System.out.println("The value of a was found in the int array.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("None of the search values were found.");
        }
    }
}
