package ru.job4j.array;

import java.util.Arrays;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, -3},
                {3, -2, 1},
                {-2, 3, 1}
        };
        int[][] result = skip(array);
        System.out.println(result);
    }
}

