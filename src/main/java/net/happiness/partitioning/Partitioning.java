package net.happiness.partitioning;

import java.util.Objects;

public final class Partitioning {

    public static void partition(int[] array, int pivot) {
        if (Objects.nonNull(array) && array.length > 0) {
            int slow = -1;
            int fast = 0;
            while (fast <= array.length - 1) {
                if (array[fast] <= pivot) {
                    slow++;
                    int temp = array[slow];
                    array[slow] = array[fast];
                    array[fast] = temp;
                }
                fast++;
            }
        }
    }

    private Partitioning() {}

}
