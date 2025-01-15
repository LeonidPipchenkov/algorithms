package net.happiness.bigo;

import java.util.Objects;

public final class BigONotation {

    // O(1)
    public static void insertAt(int number, int[] array, int position) {
        if (Objects.nonNull(array) && position < array.length) {
            array[position] = number;
        }
    }

    // O(N)
    public static int linearSearch(int value, int[] array) {
        if (Objects.nonNull(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                }
            }
        }
        return -1;
    }

    // O(N^2)
    public static void bubbleSort(int[] array) {
        if (Objects.nonNull(array)) {
            for (int i = array.length - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        swapValues(array, j, j + 1);
                    }
                }
            }
        }
    }

    // O(log N)
    public static int binarySearch(int target, int[] array) {
        if (Objects.nonNull(array)) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                int middleValue = array[middle];
                if (middleValue < target) {
                    left = middle + 1;
                } else if (middleValue > target) {
                    right = middle - 1;
                } else {
                    return middle;
                }
            }
        }
        return -1;
    }

    // O(N log N)
    public static void quickSort(int[] array) {
        if (Objects.nonNull(array)) {
            quickSort(array, 0, array.length - 1);
        }
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int slow = left - 1;
        int fast = left;
        while (fast <= right) {
            if (array[fast] <= pivot) {
                slow++;
                swapValues(array, slow, fast);
            }
            fast++;
        }
        return slow;
    }

    private static void swapValues(int[] array, int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    private BigONotation() {}

}
