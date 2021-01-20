package ru.job4j.convert;

public class ConverterTest {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 180;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected == out;
        System.out.println("180 rubles are 3. Test result : " + passed1);
    }
}

