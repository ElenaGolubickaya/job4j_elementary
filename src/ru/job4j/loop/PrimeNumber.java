package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 1;
        for (int number = 2; number < finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(calc(5));
        System.out.println(calc(11));
        System.out.println(calc(2));
    }
}
