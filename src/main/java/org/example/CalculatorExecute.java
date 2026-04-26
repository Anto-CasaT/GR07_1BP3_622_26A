package org.example;

public class CalculatorExecute {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("== Calculator Execute ==");

        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7) = " + addition);

        int subtraction = c.subtraction(7, 1);
        System.out.println("c.subtraction(7,1) = " + subtraction);

        int multiplication = c.multiplication(3, 4);
        System.out.println("c.multiplication(3,4) = " + multiplication);

        double division = c.division(10, 2);
        System.out.println("c.division(10,2) = " + division);

        // Operaciones extra
        System.out.println("\n== Operaciones Extra ==");
        System.out.println("c.addition(10, 20) = " + c.addition(10, 20));
        System.out.println("c.multiplication(5, 5) = " + c.multiplication(5, 5));
        System.out.println("c.division(9, 4) = " + c.division(9, 3));
    }


}