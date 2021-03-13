package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i < finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] rsl = {5, 3, 2, 15, -1, 6};
        System.out.println(findMin(rsl, 1, 3));

    }
}
