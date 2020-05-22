package com.company;

import java.util.Scanner;

public class Input {

    static void Q1(){
        Scanner scanner= new Scanner(System.in); //scanner consoledan veri girişi için bir kütüphane
        System.out.print("enter firstname: ");
        String firstName = scanner.next(); //next parametresiyle consoledan yazacağımız ifadeleri alabiliyoruz.
        System.out.print("enter lastname: ");
        String lastName = scanner.next();
        System.out.println(firstName + " " + lastName);
    }

    static void Q2() {
        System.out.println("************************");
        Scanner scanner= new Scanner(System.in); //scanner consoledan veri girişi için bir kütüphane
        System.out.print("enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("enter second number: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        double div = number1 / (double)number2;
        System.out.println("sum:" + sum);
        System.out.println("sub:" + sub);
        System.out.println("mul:" + mul);
        System.out.println("div:" + div);
    }

    static void Q3() {
        System.out.println("************************");
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter weight: ");
        int weight = scanner.nextInt();
        System.out.print("enter height: ");
        int height = scanner.nextInt();
        int area = weight * height;
        int env = 2 * (weight + height);
        System.out.println("area:" + area);
        System.out.println("env:" + env);
    }

    static  void Q4() {
        final double pi = 3.14;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter radius :");
        double radius = scanner.nextDouble();
        double area = pi * radius * radius;
        double env = 2 * pi + radius;
        System.out.println("area:" + area);
        System.out.println("env:" + env);


    }

    public static void main(String[] args) {
        System.out.println("input samples");

       // Q1();
       // Q2();
       // Q3();
        Q4();
    }
}
