package com.startjava.lesson_1.final1;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        char mathSign = '^';
        boolean isEnd = false;
        while (isEnd != true) {
            if (mathSign == '+') {
                result = num1 + num2;
            } else if (mathSign == '-') {
                result = num1 - num2;
            } else if (mathSign == '*') {
                result = num1 * num2;
            } else if (mathSign == '/') {
                result = num1 / num2;
            } else if (mathSign == '^') {
                int counter = num2;
                result = num1;
                while (counter > 1) {
                    result *= num1;
                    counter--;
                }
            } else if (mathSign == '%') {
                result = num1 % num2;
            }
            System.out.println(num1 + " " + mathSign + " " + num2 + " = " + result);
            isEnd = true;
        }
    }
}
