package net.happiness.recursion;

public class Recursion {

    public int getTriangularNumberDefault(int number) {
        int triangularNumber = 0;
        while (number > 0) {
            triangularNumber += number;
            number--;
        }
        return triangularNumber;
    }

    public int getTriangularNumberRecursion(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + getTriangularNumberRecursion(--number);
        }
    }

    public int getFactorialDefault(int number) {
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        return factorial;
    }

    public int getFactorialRecursion(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * getFactorialRecursion(--number);
        }
    }

}
