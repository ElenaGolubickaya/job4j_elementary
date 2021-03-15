package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (i + 1) * (j + 1);
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(multiple(4));
    }
}



