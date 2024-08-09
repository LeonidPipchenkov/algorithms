package stack;

import java.util.Arrays;

public class StackStructure {

    private final String[] stackArray = new String[10];
    private final int stackSize = stackArray.length;
    private int topElement = -1;

    public String[] getStackArray() {
        return stackArray;
    }

    public void push(String input) {
        if (topElement + 1 < stackSize) {
            topElement++;
            stackArray[topElement] = input;
        } else {
            System.out.println("The Stack is Full");
        }
    }

    public String pop() {
        if (topElement >= 0) {
            String value = stackArray[topElement];
            stackArray[topElement] = null;
            topElement--;
            return value;
        } else {
            System.out.println("The Stack is Empty");
        }
        return null;
    }

    public String peek() {
        if (topElement >= 0) {
            return stackArray[topElement];
        } else {
            System.out.println("The Stack is Empty");
        }
        return null;
    }

    public void pushMany(String... strings) {
        Arrays.stream(strings)
                .forEach(this::push);
    }

    public void popAll() {
        while (topElement >= 0) {
            pop();
        }
    }

    public void popDisplayAll() {
        StringBuilder sb = new StringBuilder();
        while (topElement >= 0) {
            sb.append(pop()).append(" ");
        }
        System.out.println("Stack output: " + sb);
    }

}
