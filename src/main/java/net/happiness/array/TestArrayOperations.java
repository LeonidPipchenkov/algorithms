package net.happiness.array;

public class TestArrayOperations {

    public static void main(String[] args) {
        ArrayStructure newArray = new ArrayStructure();

        newArray.generateRandomNumbers();
        newArray.printArray();
        System.out.println(newArray.doesArrayContainValue(18));
        System.out.println(newArray.getValueAtIndex(3));

        newArray.deleteIndex(4);
        newArray.printArray();

        newArray.insertValue(55, 9);
        newArray.printArray();
    }

}
