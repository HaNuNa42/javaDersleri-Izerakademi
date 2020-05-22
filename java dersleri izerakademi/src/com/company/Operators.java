package com.company;

public class Operators {

    public static void main(String[] args) {
        System.out.println("operators - operatörler");

        //arithmetic operators

        double result = (((20*7)/3 - 18) +10)%3;
        System.out.println("result : " + result);

        int number = 10;
        number = number + 1;
        System.out.println("number: " + number);
        number++;
        System.out.println("number: " + number);
        number = number - 1;
        System.out.println("number: " + number);
        number--;

        int x = 5;
        x += 5;
        System.out.println("x :" + x);
        x -= 6;
        System.out.println("x :" + x);
        x *= 3;
        System.out.println("x :" + x);
        x /= 3;
        System.out.println("x :" + x);
        System.out.println("****************************");

        int num1 = 5;
        int num2 = 10;
        boolean are_these_number_equal = num1 == num2;
        System.out.println(are_these_number_equal);
        boolean arent_these_numbers_equal = num1 != num2;
        System.out.println(arent_these_numbers_equal);
        boolean is_numl_greater_than_num2 = num1 > num2;
        System.out.println(is_numl_greater_than_num2);
        boolean is_numl_greater_than_num1 = num1 > num2;
        System.out.println(is_numl_greater_than_num1);
        boolean is_num1_less_than_num2 = num1 < num2;
        System.out.println(is_num1_less_than_num2);
        boolean is_num1_less_than_num1 = num2 < num1;
        System.out.println(is_num1_less_than_num2);

        // logical operators - mantıksal opertatörler
        /*
            && and
            || or
        */
        System.out.println("*****************************");

        int a = 5;
        int b = 10;
        int c = 9;

        boolean is_c_greater_than_a = c>a;
        boolean is_c_greater_than_b = c>b;
        boolean is_c_greater_than_a_and_b = (is_c_greater_than_a) && (is_c_greater_than_b);
        System.out.println(is_c_greater_than_a_and_b);

        boolean is_c_greater_han_a_or_b = (is_c_greater_than_a) || (is_c_greater_than_b);
        System.out.println(is_c_greater_han_a_or_b);











    }
}
