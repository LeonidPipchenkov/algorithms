package net.happiness.sorting.shell;

public final class ShellSorting {

    public static void sort(int[] array) {
        int size = array.length;
        for (int interval = size / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < size; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }

    private ShellSorting() {}

}
