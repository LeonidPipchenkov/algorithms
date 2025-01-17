package net.happiness.hash;

import net.happiness.util.Util;

public class TestHashArray {

    public static void main(String[] args) {
        testHashArray();
    }

    private static void testSimpleHashArray() {
        SimpleHashArray array = new SimpleHashArray(30);
        String[] values = {"1", "5", "17", "21", "26"};

        array.addAll(values);

        Util.print(array.getStorage());
    }

    private static void testHashArray() {
        HashArray array = new HashArray(30);
        String[] values = {
                "100", "510", "170", "214", "268", "398", "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321", "400", "415", "450", "50", "660", "624"
        };
        array.addAll(values);

        Util.print(array.getStorage());

        System.out.println(array.findByKey("660"));
    }

}
