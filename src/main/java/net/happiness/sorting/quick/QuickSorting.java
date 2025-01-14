package net.happiness.sorting.quick;

import java.util.Objects;

public final class QuickSorting {

    public static void sort(int[] array) {
        if (Objects.nonNull(array) && array.length > 0) {
            sort(array, 0, array.length - 1);
        }
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            sort(array, left, pivotIndex - 1);
            sort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int slow = left - 1;
        int fast = left;
        while (fast <= right) {
            if (array[fast] <= pivot) {
                slow++;
                int temp = array[slow];
                array[slow] = array[fast];
                array[fast] = temp;
            }
            fast++;
        }
        return slow;
    }

    private QuickSorting() {}

}
