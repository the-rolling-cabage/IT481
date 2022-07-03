package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] set1 = grabNumbers(100);
        int[] set2 = grabNumbers(1000);
        int[] set3 = grabNumbers(10000);
        List<int[]> sets = List.of(set1, set2,set3);
        sets.forEach(x -> {
            quicksort_and_print(x);
            bubblesort_and_print(x);
        });
    }

    static void quicksort_and_print(int[] array) {
        long starttime = System.currentTimeMillis();
        QuickSort.sort(array, 0, array.length-1);
        long runtime = System.currentTimeMillis() - starttime;
        System.out.println("runtime for quicksort: " +array.length + ": " + runtime + "ms");
    }

    static void bubblesort_and_print(int[] array) {
        long starttime = System.currentTimeMillis();
        QuickSort.sort(array, 0, array.length-1);
        long runtime = System.currentTimeMillis() - starttime;
        System.out.println("runtime for bubblesort: " +array.length + ": " + runtime + "ms");
    }

    public static int[] grabNumbers(int size) {
        int[] numbers = new int[size];
        int x = 0;
        NumberGeneratorIterator numberGeneratorIterator = new NumberGeneratorIterator(size);
        while (numberGeneratorIterator.hasNext()) {
            numbers[x] = numberGeneratorIterator.next();
            x++;
        }
        return numbers;
    }
}
