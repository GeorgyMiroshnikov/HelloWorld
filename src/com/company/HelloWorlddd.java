package com.company;

import java.util.Scanner;

public class HelloWorlddd {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int value1 = 2;
        int value2 = 5;
        int sum = value1 + value2;
        System.out.println("Сумма = " +sum);
        int multiply = value1 * value2;
        System.out.println("Произведени = " + multiply);
        int difference = value2 - value1;
        System.out.println("Разность = " + difference);

        Scanner scanner = new Scanner(System.in);
        //String userInput= scanner.next();
        String userInput = new Scanner(System.in).next();
        System.out.println();
    }
}
