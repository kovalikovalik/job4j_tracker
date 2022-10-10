package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("Сумма равна " + result);
        result = minus(5);
        System.out.println("Разность равна " + result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println("Произведение равно " + rsl);
        rsl = calculator.divide(5);
        System.out.println("Частное равно " + rsl);
        rsl = calculator.sumAllOperation(5);
        System.out.println("Сумма всех действий равна " + rsl);
            }
}