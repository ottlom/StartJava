package Lesson_2;

import java.util.Scanner;

public class Calculator {
    int num1;
    int num2;
    char mathSign;
    int result;
    Scanner scan;
    boolean alive = true;
    String nextCountOrNot;

    public void calculate() {
        switch (mathSign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = num1;
                for (int i = num2; i > 1; i--) {
                    result *= num1;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
        }
        System.out.println(result);
    }
}


