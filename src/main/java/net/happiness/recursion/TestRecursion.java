package net.happiness.recursion;

public class TestRecursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println("Triangular number 6:");
        System.out.println("By default approach - " + recursion.getTriangularNumberDefault(6));
        System.out.println("By recursion approach - " + recursion.getTriangularNumberRecursion(6));

        System.out.println();

        System.out.println("Factorial 6:");
        System.out.println("By default approach - " + recursion.getFactorialDefault(6));
        System.out.println("By recursion approach - " + recursion.getFactorialRecursion(6));
    }

}
