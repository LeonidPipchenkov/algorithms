package net.happiness.sorting.merge;

import java.util.Arrays;
import java.util.Objects;

public final class MergeSorting {

    public static void sort(int[] array) {
        if (Objects.nonNull(array) && array.length > 1) {
            int middle = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, middle);
            int[] right = Arrays.copyOfRange(array, middle, array.length);

            sort(left);
            sort(right);

            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int a = 0;
        int l = 0;
        int r = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                array[a++] = left[l++];
            } else {
                array[a++] = right[r++];
            }
        }
        while (l < left.length) {
            array[a++] = left[l++];
        }
        while (r < right.length) {
            array[a++] = right[r++];
        }
    }

    private MergeSorting() {}

}
