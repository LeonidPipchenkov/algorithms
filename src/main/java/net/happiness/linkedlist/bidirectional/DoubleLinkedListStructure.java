package net.happiness.linkedlist.bidirectional;

import net.happiness.linkedlist.AbstractLinkedListStructure;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class DoubleLinkedListStructure extends AbstractLinkedListStructure {

    public String insertFirst(String item) {
        if (Objects.nonNull(item)) {
            if (isNotEmpty()) {
                Node newNode = new Node(item, null, first);
                first.prev = newNode;
                first = newNode;
            } else {
                Node newNode = new Node(item, null, null);
                first = newNode;
                last = newNode;
            }
            size++;
            return first.item;
        }
        return null;
    }

    public String insertLast(String item) {
        return addLast(item);
    }

    public String insertAt(String item, int index) {
        String res = null;
        if (Objects.nonNull(item)) {
            if (index < size) {
                if (isNotEmpty() && index > 0) {
                    int i = 0;
                    Node temp = first;
                    while (i < index) {
                        temp = temp.next;
                        i++;
                    }
                    Node newNode = new Node(item, temp.prev, temp);
                    temp.prev.next = newNode;
                    temp.prev = newNode;
                    size++;
                    res = newNode.item;
                } else {
                    res = insertFirst(item);
                }
            } else {
                res = insertLast(item);
            }
        }
        return res;
    }

    public String insertInOrder(String item) {
        String res = null;
        if (Objects.nonNull(item)) {
            if (isNotEmpty()) {
                int i = 0;
                Node temp = first;
                while (i < size) {
                    if (isLessOrEqual(item, temp.item) && isLessOrEqual(item, temp.next.item)) {
                        res = insertFirst(item);
                        break;
                    } else if (i == size - 1 && isMoreOrEqual(item, temp.item)) {
                        res = insertLast(item);
                        break;
                    } else if (isMoreOrEqual(item, temp.item) && isLessOrEqual(item, temp.next.item)) {
                        Node newNode = new Node(item, temp, temp.next);
                        temp.next.prev = newNode;
                        temp.next = newNode;
                        size++;
                        res = newNode.item;
                        break;
                    } else {
                        temp = temp.next;
                        i++;
                    }
                }
            } else {
                res = insertFirst(item);
            }
        }
        return res;
    }

    public String insertInOrder(String... items) {
        for (String item : items) {
            insertInOrder(item);
        }
        return this.toString();
    }

    private boolean isMoreOrEqual(String item1, String item2) {
        return StringUtils.compare(item1, item2) > -1;
    }

    private boolean isLessOrEqual(String item1, String item2) {
        return StringUtils.compare(item1, item2) < 1;
    }

}
