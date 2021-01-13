package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value){
        int rsl=value/70;
        return rsl;
    }
    public static  int rubleToDollars(int value){
        int rsl=value/60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro=Converter.rubleToEuro(350);
        int dollars=Converter.rubleToDollars(480);
        System.out.println("350 rubles are " + euro + " euro.");
        System.out.println("480 rubles are " + dollars + " dollars.");
    }
}
