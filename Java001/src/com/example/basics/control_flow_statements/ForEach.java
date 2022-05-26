package com.example.basics.control_flow_statements;

public class ForEach {
    public static void main(String[] args) {

        String[] strArr = {"Agusia ", "Adam", "Olek", "Michał"};

        for(String str : strArr) {
            if(str.equalsIgnoreCase("Olek")) continue;
            System.out.println("Imię: " + str);
        }
    }
}
