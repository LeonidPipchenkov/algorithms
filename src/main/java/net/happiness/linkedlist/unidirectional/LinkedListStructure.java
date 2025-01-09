package net.happiness.linkedlist.unidirectional;

import net.happiness.linkedlist.AbstractLinkedListStructure;

import java.util.Objects;

public class LinkedListStructure extends AbstractLinkedListStructure {

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
        return addLast(item);
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

}
