package net.happiness.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Objects;

public final class Util {

    public static void print(int[] array) {
        String[] strArray = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        print(strArray);
    }

    public static void print(String[] array) {
        if (Objects.nonNull(array) && array.length > 0) {
            int lineSize = array.length * 7 + 1;

            for (int n = 0; n < lineSize; n++) {
                System.out.print("-");
            }
            System.out.println();

            for (int n = 0; n < array.length; n++) {
                String pattern = String.format("%2d", n);
                System.out.print("|" + StringUtils.center(pattern, 6));
            }
            System.out.println("|");

            for (int n = 0; n < lineSize; n++) {
                System.out.print("-");
            }
            System.out.println();

            for (int n = 0; n < array.length; n++) {
                String pattern = String.format("%2s", array[n]);
                System.out.print("|" + StringUtils.center(pattern, 6));
            }
            System.out.println("|");

            for (int n = 0; n < lineSize; n++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    private Util() {}

}
