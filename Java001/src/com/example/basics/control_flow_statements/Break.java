package com.example.basics.control_flow_statements;

public class Break {
    public static void main(String args[]) {

        for (int a = 0; a < 20; a++) {
            System.out.println("a:" + a);

            if (a >= 3) break;
        }
        System.out.println("dalsza część programu");

        int a = 10;
        while (a >0) {
            System.out.println(a);
            a--;

            if (a == 2) break;
        }
        System.out.println("Pętla while zakończona");
    }
}
