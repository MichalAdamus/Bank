package com.example.basics.data.types.string_class;

public class StrringBasicExample {

    public static void main(String[] args) {

        String s1 = "Hello Franiu";
        String s2 = new String("Hello Franiu - jak się czuujesz mając Roczek ");

        String s3 = "Franiuś".repeat(10);
        System.out.println(s3);

        String s4 = String.join(".", "1", "2", "3", "4", "5");
        System.out.println(s4);

        char arr[] = {'P','O','L','A','N','D'};
        String s5 = new String(arr);
        System.out.println(s5);
    }
}
