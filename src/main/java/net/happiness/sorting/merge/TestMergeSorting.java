package net.happiness.sorting.merge;

import net.happiness.util.Util;

public class TestMergeSorting {

    public static void main(String[] args) {
        int[] array = {10, 8, 4, 80, 13, 1, 3, 11};

        System.out.println("Array before sorting:");
        Util.print(array);

        System.out.println();

        MergeSorting.sort(array);

        System.out.println("Array after sorting:");
        Util.print(array);
    }

}
