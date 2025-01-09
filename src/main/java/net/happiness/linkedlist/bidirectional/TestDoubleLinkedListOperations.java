package net.happiness.linkedlist.bidirectional;

import net.happiness.linkedlist.AbstractLinkedListStructure;
import net.happiness.util.Util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDoubleLinkedListOperations {

    public static void main(String[] args) {
        DoubleLinkedListStructure doubleLinkedList = new DoubleLinkedListStructure();

        doubleLinkedList.insertInOrder("7");
        doubleLinkedList.insertInOrder("9");
        doubleLinkedList.insertInOrder("6");
        doubleLinkedList.insertInOrder("4");

        doubleLinkedList.insertAt("10", 4);

        Util.print(doubleLinkedList.toArray());

        System.out.println();

        Iterator<String> iterator = doubleLinkedList.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        iterator.remove();
        System.out.println();

        printByIterator(doubleLinkedList);
        }

    private static void printByIterator(AbstractLinkedListStructure doubleLinkedList) {
        List<String> out = new ArrayList<>();
        Iterator<String> iterator = doubleLinkedList.iterator();
        while (iterator.hasNext()) {
            out.add(iterator.next());
        }
        System.out.println(out);
    }

}
