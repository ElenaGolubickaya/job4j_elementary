package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = left.length; i > 0; i--) {
            for (int j = right.length; j > 0; j--) {
                if (left[left.length - 1] == right[right.length - 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5};
        int[] array2 = {1, 6, 3, 5};
        System.out.println(check(array1, array2));

    }
}
