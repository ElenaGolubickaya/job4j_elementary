package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl1 = swapBorder(nums);
        int[] rsl2 = swap(nums, 3, 2);
        for (int index = 0; index < rsl1.length; index++) {
            System.out.println(rsl1[index]);
        }
        System.out.println();
        for (int index = 0; index < rsl2.length; index++) {
            System.out.println(rsl2[index]);

        }
    }
}
