package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > third) {
            return second;
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 2, 0));
        System.out.println(max(2, 55, 36));
        System.out.println(max(2, 59, 96));
        System.out.println(max(58, 58, 58));

    }
}
