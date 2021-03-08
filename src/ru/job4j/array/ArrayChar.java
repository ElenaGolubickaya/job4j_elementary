package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] array1 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] array2 = new char[]{'H', 'e'};
        System.out.println(startWith(array1, array2));

    }
}
