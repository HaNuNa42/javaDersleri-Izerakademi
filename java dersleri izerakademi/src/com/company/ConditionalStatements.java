package com.company;

import java.util.Scanner;

public class ConditionalStatements {


    static void Q1() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("please enter number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    static void Q2(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("enter number2 : ");
        int number2 = scanner.nextInt();
        System.out.print("enter operator : ");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+': System.out.println("Sum : " + (number1 + number2)); break;
            case '-': System.out.println("Sub : " + (number1 - number2)); break;
            case '*': System.out.println("Mul : " + (number1 * number2)); break;
            case '/': System.out.println("Div : " + (number1 / (double)number2)); break;
            default:
                System.out.println("invalid operator");

        }
    }




    public static void main(String[] args) {
        System.out.println("input samples");

        // Q1();
        Q2();

       /* int number1 = 5;
        int number2 = 6;

        if (number1 > number2) {
            System.out.println("number1 is bigger than number2");
        }
        if (number2 > number1) {
            System.out.println("number2 is bigger than number1");
        }

        if (number1 == 0) {
            System.out.println("number1 is equal to number2");
        }

        //if- else

        if (number1 > number2) {
            System.out.println("number1 is bigger than number2");
        } else if (number2 > number1) {
            System.out.println("number2 is bigger than number1");
        } else {
            System.out.println("number1 is equal to number2");
        }

        //switch

        int day = 5;
        switch (day) {
            case 1: System.out.println("pazartesi"); break;
            case 2: System.out.println("salı"); break;
            case 3: System.out.println("çarşamba"); break;
            case 4: System.out.println("perşembe"); break;
            case 5: System.out.println("cuma"); break;
            case 6: System.out.println("cumartesi"); break;
            case 7: System.out.println("pazar"); break;
            default:
                System.out.println("lütfen geçerli bir sayı giriniz...");
        }



        */
    }
}
