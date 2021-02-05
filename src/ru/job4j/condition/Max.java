package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return (left > right) ? left : right;

    }

    public static void main(String[] args) {
        int rsl1 = Max.max(5, 2);
        int rsl2 = Max.max(1, 7);
        int rsl3 = Max.max(15, 15);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
    }
}
