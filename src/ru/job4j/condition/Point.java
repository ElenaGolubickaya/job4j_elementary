package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int x2, int y1, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double a = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(a);

    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 5, 2, 8);
        double result2 = Point.distance(2, 10, 2, 15);
        double result3 = Point.distance(1, 4, 2, 7);
        System.out.println("result (0, 5) to (2, 8) " + result1);
        System.out.println("result (2, 10) to (2, 15) " + result2);
        System.out.println("result (1, 4) to (2, 7) " + result3);

    }
}
