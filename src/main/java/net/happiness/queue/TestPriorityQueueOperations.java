package net.happiness.queue;

import net.happiness.util.Util;

public class TestPriorityQueueOperations {

    public static void main(String[] args) {
        PriorityQueueStructure priorityQueue = new PriorityQueueStructure();
        String[] storage = priorityQueue.getQueueArray();

        priorityQueue.add("16");
        priorityQueue.add("25");
        priorityQueue.add("10");
        Util.print(storage);

        System.out.println(priorityQueue.remove());
        Util.print(storage);

        System.out.println(priorityQueue.peek());
        Util.print(storage);

        System.out.println(priorityQueue.remove());
        Util.print(storage);
    }

}
