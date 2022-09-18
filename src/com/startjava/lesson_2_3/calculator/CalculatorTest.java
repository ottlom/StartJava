package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String option = "yes";

        while (option.equals("yes")) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            scan.nextLine();
            calculator.setMathSign(scan.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(scan.nextInt());
            calculator.calculate();
            scan.nextLine();
            do {
                System.out.println("Хотите продолжить вычисления?(yes/no)");
                option = scan.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }
}
