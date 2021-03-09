package ru.job4j.array;

public class EndWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length - 1; i++) {
            if (word[word.length - 1] != post[post.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] array1 = {'H', 'e', 'l', 'l', 'o'};
        char[] array2 = {'l', 'o'};
        System.out.println(endWith(array1, array2));
    }
}
