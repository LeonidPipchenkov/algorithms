package queue;

public class QueueStructure extends AbstractQueueStructure {

    @Override
    public void add(String input) {
        if (lastElement + 1 < queueSize) {
            lastElement++;
            queueArray[lastElement] = input;
        } else {
            System.out.println("The Queue is Full");
        }
    }

}
