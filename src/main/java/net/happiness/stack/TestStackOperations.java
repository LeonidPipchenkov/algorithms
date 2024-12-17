package net.happiness.stack;

import net.happiness.util.Util;

public class TestStackOperations {

    public static void main(String[] args) {
        StackStructure stack = new StackStructure();
        String[] storage = stack.getStackArray();

        stack.push("10");
        stack.push("15");
        stack.push("13");
        Util.print(storage);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        Util.print(storage);

        stack.pushMany("H", "A", "P", "P", "I", "N", "E", "S", "S");
        Util.print(storage);

        stack.popDisplayAll();
        Util.print(storage);
    }

}
