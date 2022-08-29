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
        while (alive) {
            System.out.print("Введите первое число: ");
            num1 = scan.nextInt();
            scan.nextLine();
            System.out.print("Введите знак математической операции: ");
            mathSign = scan.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            num2 = scan.nextInt();
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
            System.out.println("Хотите продолжить вычисления?(yes/no)");
            scan.nextLine();
            nextCountOrNot = scan.nextLine();
            if (!nextCountOrNot.equals("yes") && !nextCountOrNot.equals("no")) {
                while (!nextCountOrNot.equals("yes") && !nextCountOrNot.equals("no")) {
                    System.out.println("Хотите продолжить вычисления?(yes/no)");
                    nextCountOrNot = scan.nextLine();
                }
            } if (nextCountOrNot.equals("no")) {
                alive = false;
                break;
            } else if (nextCountOrNot.equals("yes"));
        }
    }
}

