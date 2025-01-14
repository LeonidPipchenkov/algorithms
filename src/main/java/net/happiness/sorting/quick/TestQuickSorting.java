package net.happiness.sorting.quick;

import net.happiness.util.Util;

public class TestQuickSorting {

    public static void main(String[] args) {
        int[] array = {10, 80, 30, 90, 5, 40, 50, 70};

        System.out.println("Array before sorting:");
        Util.print(array);

        System.out.println();

        QuickSorting.sort(array);

        System.out.println("Array after sorting:");
        Util.print(array);
    }

}
