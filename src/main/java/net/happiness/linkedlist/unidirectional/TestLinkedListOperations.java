package net.happiness.linkedlist.unidirectional;

import net.happiness.util.Util;

public class TestLinkedListOperations {

    public static void main(String[] args) {
        LinkedListStructure linkedList = new LinkedListStructure();

        linkedList.add("10");
        linkedList.add("15");
        linkedList.add("20");
        linkedList.add("25");
        linkedList.add("30");

        Util.print(linkedList.toArray());

        System.out.println(linkedList.get(3));

        System.out.println(linkedList.remove("20"));
        Util.print(linkedList.toArray());

        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.isNotEmpty());

        System.out.println(linkedList);
    }

}
