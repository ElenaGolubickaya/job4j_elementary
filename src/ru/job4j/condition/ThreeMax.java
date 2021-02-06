package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {

        if (first > second && first > third) {
            return first;
        } else if (second > third) {
            return second;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 2, 100));
        System.out.println(max(25, 55, 36));
        System.out.println(max(10, 10, 1));

    }
}
