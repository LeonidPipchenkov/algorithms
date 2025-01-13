package net.happiness.partitioning;

import net.happiness.util.Util;

public class TestPartitioning {

    public static void main(String[] args) {
        int[] array = {10, 80, 30, 90, 40, 50, 70};

        System.out.println("Array before partitioning:");
        Util.print(array);

        System.out.println();

        Partitioning.partition(array, 70);

        System.out.println("Array after partitioning:");
        Util.print(array);
    }

}
