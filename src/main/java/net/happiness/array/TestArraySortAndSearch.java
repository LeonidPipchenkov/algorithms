package net.happiness.array;

import java.util.Arrays;

public class TestArraySortAndSearch {

    public static void main(String[] args) {
        System.out.println("Linear search:");
        ArrayStructure newArray = new ArrayStructure();
        newArray.generateRandomNumbers();
        newArray.printArrayHorizontally();
        System.out.println("Search value was found at " + newArray.linearSearchForValue(17));
        System.out.println();

        System.out.println("Binary search:");
        ArrayStructure newArray2 = new ArrayStructure();
        newArray2.generateRandomNumbers();
        newArray2.printArrayHorizontally();
        Arrays.sort(newArray2.getArray());
        newArray2.printArrayHorizontally();
        System.out.println("Search value was found at " + newArray2.binarySearchForValue(17));
        System.out.println();

        System.out.println("Bubble sort:");
        ArrayStructure newArray3 = new ArrayStructure();
        newArray3.generateRandomNumbers();
        newArray3.printArrayHorizontally();
        newArray3.bubbleSort();
        newArray3.printArrayHorizontally();
        System.out.println();

        System.out.println("Selection sort:");
        ArrayStructure newArray4 = new ArrayStructure();
        newArray4.generateRandomNumbers();
        newArray4.printArrayHorizontally();
        newArray4.selectionSort();
        newArray4.printArrayHorizontally();
        System.out.println();

        System.out.println("Insertion sort:");
        ArrayStructure newArray5 = new ArrayStructure();
        newArray5.generateRandomNumbers();
        newArray5.printArrayHorizontally();
        newArray5.insertionSort();
        newArray5.printArrayHorizontally();
    }

}
