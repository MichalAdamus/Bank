package com.example.basics.data.types;

public class J01_variable_declaration {

    public static void main(String args[]) {
    int number = 24;
    number = 101;
        System.out.println();
        System.out.println("Wartość zmiennej number = " + number);

        int data = -123;
        System.out.println("data = " + data);

        number = data * 3;
        System.out.println("Wartość zmiennej number po mnożeniu = " + number);
    }
}
