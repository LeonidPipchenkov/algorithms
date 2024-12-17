package net.happiness.queue;

import org.apache.commons.lang3.StringUtils;

public class PriorityQueueStructure extends AbstractQueueStructure {

    @Override
    public void add(String input) {
        if (lastElement + 1 < queueSize) {
            for (int i = 0; i < queueSize; i++) {
                if (StringUtils.compare(input, queueArray[i], false) < 0) {
                    System.arraycopy(queueArray, i, queueArray, i + 1, queueSize - 1 - i);
                    queueArray[i] = input;
                    lastElement++;
                    break;
                }
            }
        } else {
            System.out.println("The Queue is Full");
        }
    }

}
