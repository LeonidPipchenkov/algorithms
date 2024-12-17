package net.happiness.linkedlist;

import java.util.Objects;

public class LinkedListStructure {

    private Node first;
    private Node last;

    private int size;

    public String get(int index) {
        if (isNotEmpty()) {
            if (0 <= index && index < size) {
                Node temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp.item;
            } else {
                System.out.println("Index " + index + " is out of bounds");
                return null;
            }
        } else {
            System.out.println("The LinkedList is Empty");
            return null;
        }
    }

    public String add(String item) {
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

    public String remove(String item) {
        if (Objects.nonNull(item)) {
            if (isNotEmpty()) {
                Node temp = first;
                while (Objects.nonNull(temp)) {
                    if (temp.item.equals(item)) {
                        Node removedNode = remove(temp);
                        return removedNode.item;
                    }
                    temp = temp.next;
                }
                System.out.println("There is no Such Item " + item);
            } else {
                System.out.println("The LinkedList is Empty");
            }
        }
        return null;
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
        for (int i = 0; i < array.length; i++) {
            array[i] = temp.item;
            temp = temp.next;
        }
        return array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = first;
        while (Objects.nonNull(temp)) {
            sb.append(" ").append(temp.item).append(",");
            temp = temp.next;
        }
        if (!sb.isEmpty()) {
            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.insert(0, "[");
        sb.append("]");
        return sb.toString();
    }

    private Node remove(Node node) {
        if (Objects.equals(node, first)) {
            first = node.next;
            first.prev = null;
        } else if (Objects.equals(node, last)) {
            last = node.prev;
            last.next = null;
        } else {
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
        }
        size--;
        return node;
    }

    private static class Node {
        String item;
        Node prev;
        Node next;

        Node(String item, Node prev, Node next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

}
