package net.happiness.queue;

import net.happiness.util.Util;

public class TestQueueOperations {

    public static void main(String[] args) {
        QueueStructure queue = new QueueStructure();
        String[] storage = queue.getQueueArray();

        queue.add("10");
        queue.add("15");
        queue.add("25");
        queue.add("35");
        queue.add("45");
        Util.print(storage);

        System.out.println(queue.remove());
        Util.print(storage);
        System.out.println(queue.remove());
        Util.print(storage);

        System.out.println(queue.peek());
        Util.print(storage);
    }

}
