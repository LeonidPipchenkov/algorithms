public class ArrayStructure {

    private final int[] array = new int[20];
    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return array[index];
        }
        return 0;
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("| " + i + " | " + array[i] + " |");
            System.out.println("----------");
        }
    }

    public boolean doesArrayContainValue(int searchValue) {
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == searchValue) {
                return true;
            }
        }
        return false;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                array[i] = array[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if (arraySize < array.length) {
            array[arraySize] = value;
            arraySize++;
        }
    }

    // Linear Search: Every index must be looked
    public String linearSearchForValue(int value) {
        String indexesWithValue = "";
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                indexesWithValue += i + " ";
            }
        }
        if (indexesWithValue.isEmpty()) {
            indexesWithValue = "None";
        }
        return "The Value was Found in the Following Indexes: " + indexesWithValue;
    }

    public static void main(String[] args) {
        ArrayStructure newArray = new ArrayStructure();

        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(3));
        System.out.println(newArray.doesArrayContainValue(18));

        newArray.deleteIndex(4);
        newArray.printArray();

        newArray.insertValue(55);
        newArray.printArray();

        System.out.println(newArray.linearSearchForValue(17));
    }

}
