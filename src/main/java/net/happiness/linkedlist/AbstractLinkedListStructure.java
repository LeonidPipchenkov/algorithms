package net.happiness.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class AbstractLinkedListStructure {

    protected Node first;
    protected Node last;

    protected int size;

    @Override
    public String toString() {
        List<String> items = new ArrayList<>();
        Node temp = first;
        while (Objects.nonNull(temp)) {
            items.add(temp.item);
            temp = temp.next;
        }
        return items.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return Objects.isNull(first);
    }

    public boolean isNotEmpty() {
        return Objects.nonNull(first);
    }

    public String[] toArray() {
        String[] array = new String[size];
        Node temp = first;
        for (int i = 0; i < size; i++) {
            array[i] = temp.item;
            temp = temp.next;
        }
        return array;
    }

    public Iterator<String> iterator() {
        return new LinkedListIterator(this);
    }

    protected String addLast(String item) {
        if (Objects.nonNull(item)) {
            if (isNotEmpty()) {
                Node newNode = new Node(item, last, null);
                last.next = newNode;
                last = newNode;
            } else {
                Node newNode = new Node(item, null, null);
                first = newNode;
                last = newNode;
            }
            size++;
            return last.item;
        }
        return null;
    }

    protected static class Node {
        public String item;
        public Node prev;
        public Node next;

        public Node(String item, Node prev, Node next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    private static class LinkedListIterator implements Iterator<String> {
        private final AbstractLinkedListStructure abstractLinkedList;
        private Node following;
        private Node given;

        LinkedListIterator(AbstractLinkedListStructure abstractLinkedList) {
            this.abstractLinkedList = abstractLinkedList;
            following = abstractLinkedList.first;
        }

        @Override
        public boolean hasNext() {
            return Objects.nonNull(following);
        }

        @Override
        public String next() {
            if (hasNext()) {
                given = following;
                following = following.next;
                return given.item;
            }
            return null;
        }

        @Override
        public void remove() {
            if (Objects.nonNull(given.prev)) {
                given.prev.next = given.next;
            } else {
                abstractLinkedList.first = given.next;
            }
            if (Objects.nonNull(given.next)) {
                given.next.prev = given.prev;
            } else {
                abstractLinkedList.last = given.prev;
            }
            abstractLinkedList.size--;
            given = null;
        }
    }

}
