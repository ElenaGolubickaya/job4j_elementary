package ru.job4j.condition;

public class AlertDevByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(-2);
    }

    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("Это отрицательные числа");
        }
    }
}
