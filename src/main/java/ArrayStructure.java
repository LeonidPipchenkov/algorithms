import java.util.ArrayList;
import java.util.List;

public class ArrayStructure {

    private final int[] array = new int[10];
    private final int arraySize = array.length;

    public int[] getArray() {
        return array;
    }

    public void generateRandomNumbers() {
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
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

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return array[index];
        }
        return 0;
    }

    public void insertValue(int value, int index) {
        if (index < arraySize) {
            array[index] = value;
        }
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                array[i] = array[i + 1];
            }
            array[arraySize - 1] = 0;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("| " + i + " | " + array[i] + " |");
            System.out.println("----------");
        }
    }

    public void printArrayHorizontally() {
        for (int n = 0; n < 51; n++) {
            System.out.print("-");
        }
        System.out.println();

        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + n + "  ");
        }
        System.out.println("|");

        for (int n = 0; n < 51; n++) {
            System.out.print("-");
        }
        System.out.println();

        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + array[n] + " ");
        }
        System.out.println("|");

        for (int n = 0; n < 51; n++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public List<Integer> linearSearchForValue(int value) {
        List<Integer> resIndexes = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == value) {
                resIndexes.add(i);
            }
        }
        return resIndexes;
    }

    public int binarySearchForValue(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (array[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if (array[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

    public void bubbleSort() {
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapValues(j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;
            for (int j = i; j < arraySize; j++) {
                if (array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            swapValues(i, minimum);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = array[i];
            while ((j > 0) && (array[j - 1] > toInsert)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = toInsert;
        }
    }

    private void swapValues(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

}
