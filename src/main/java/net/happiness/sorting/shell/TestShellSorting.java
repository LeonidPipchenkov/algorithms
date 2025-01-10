package net.happiness.sorting.shell;

import net.happiness.util.Util;

public class TestShellSorting {

    public static void main(String[] args) {
        int[] array = {10, 8, 4, 80, 13, 1, 3, 11};

        System.out.println("Array before sorting:");
        Util.print(array);

        System.out.println();

        ShellSorting.sort(array);

        System.out.println("Array after sorting:");
        Util.print(array);
    }

}
