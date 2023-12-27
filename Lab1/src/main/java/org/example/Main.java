package org.example;

public class Main {

    public static void main(String[] args) {
        Calculate calculator = new Calculate();
        int result = calculator.calculateResult(1, 1, 10, 10, 1);
        System.out.println("Результат обчислень: " + result);
    }
}