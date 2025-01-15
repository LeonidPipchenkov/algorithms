package net.happiness.bigo;

import net.happiness.util.Util;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestBigONotation {

    private static long startTime;
    private static long endTime;

    public static void main(String[] args) {
        nLogarithmic();
    }

    private static void constant() {
        int[] array = new int[10];
        BigONotation.insertAt(10, array, 0);
        Util.print(array);
    }

    private static void linear() {
        int[] array1 = generateArray(100000);
        int[] array2 = generateArray(1000000);

        startTime = System.currentTimeMillis();

        int index1 = BigONotation.linearSearch(99999, array1);

        endTime = System.currentTimeMillis();
        System.out.printf("Linear search time of first array: %d ms%n", (endTime - startTime));

        startTime = System.currentTimeMillis();

        int index2 = BigONotation.linearSearch(999999, array2);

        endTime = System.currentTimeMillis();
        System.out.printf("Linear search time of second array: %d ms%n", (endTime - startTime));
    }

    private static void squared() {
        int[] array1 = generateRandomArray(10000);
        int[] array2 = generateRandomArray(20000);

        startTime = System.currentTimeMillis();

        BigONotation.bubbleSort(array1);

        endTime = System.currentTimeMillis();
        System.out.printf("Bubble sort time of first array: %d ms%n", (endTime - startTime));

        startTime = System.currentTimeMillis();

        BigONotation.bubbleSort(array2);

        endTime = System.currentTimeMillis();
        System.out.printf("Bubble sort time of second array: %d ms%n", (endTime - startTime));
    }

    private static void logarithmic() {
        int[] array1 = generateArray(100000);
        int[] array2 = generateArray(1000000);

        startTime = System.currentTimeMillis();

        int index1 = BigONotation.binarySearch(20, array1);

        endTime = System.currentTimeMillis();
        System.out.printf("Binary search time of first array: %d ms%n", (endTime - startTime));

        startTime = System.currentTimeMillis();

        int index2 = BigONotation.binarySearch(20, array2);

        endTime = System.currentTimeMillis();
        System.out.printf("Binary search time of second array: %d ms%n", (endTime - startTime));
    }

    private static void nLogarithmic() {
        int[] array1 = generateRandomArray(10000);
        int[] array2 = generateRandomArray(100000);

        startTime = System.currentTimeMillis();

        BigONotation.quickSort(array1);

        endTime = System.currentTimeMillis();
        System.out.printf("Quick sort time of first array: %d ms%n", (endTime - startTime));

        startTime = System.currentTimeMillis();

        BigONotation.quickSort(array2);

        endTime = System.currentTimeMillis();
        System.out.printf("Quick sort time of second array: %d ms%n", (endTime - startTime));
    }

    private static int[] generateArray(int end) {
        return IntStream.rangeClosed(0, end)
                .toArray();
    }

    private static int[] generateRandomArray(int size) {
        return Arrays.stream(new int[size])
                .map(num -> (int) (Math.random() * 1000))
                .toArray();
    }

}
