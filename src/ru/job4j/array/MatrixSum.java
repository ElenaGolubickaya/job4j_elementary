package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl = rsl + array[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[][] result = {{0, 2, 3}, {7, 2, 5}, {3, 5, 1}};
        System.out.println(sum(result));

    }
}
