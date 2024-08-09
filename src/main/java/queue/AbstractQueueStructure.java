package queue;

public abstract class AbstractQueueStructure {

    protected final String[] queueArray = new String[10];
    protected final int queueSize = queueArray.length;
    protected int lastElement = -1;

    public String[] getQueueArray() {
        return queueArray;
    }

    public abstract void add(String input);

    public String remove() {
        if (lastElement >= 0) {
            String value = queueArray[0];
            System.arraycopy(queueArray, 1, queueArray, 0, queueSize - 1);
            queueArray[lastElement] = null;
            lastElement--;
            return value;
        } else {
            System.out.println("The Queue is Empty");
        }
        return null;
    }

    public String peek() {
        if (lastElement >= 0) {
            return queueArray[0];
        } else {
            System.out.println("The Queue is Empty");
        }
        return null;
    }

}
