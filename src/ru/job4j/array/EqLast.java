package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        int temp1 = left[left.length - 1];
        int temp2 = right[right.length - 1];
        if (temp1 == temp2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 5};
        int[] right = {1, 6, 3, 5, 6, 9};
        System.out.println(check(left, right));

    }
}
