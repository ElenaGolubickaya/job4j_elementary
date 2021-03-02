package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i] != data[i + 1])) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] array1 = new boolean[]{true, false, true};
        boolean[] array2 = new boolean[]{true, true, true};
        boolean[] array3 = new boolean[]{false, false, false};
        System.out.println(mono(array1));
        System.out.println(mono(array2));
        System.out.println(mono(array3));

    }
}
