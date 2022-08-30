package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.scan = new Scanner(System.in);
        while (calculator.alive) {
            System.out.print("Введите первое число: ");
            calculator.num1 = calculator.scan.nextInt();
            calculator.scan.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.mathSign = calculator.scan.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            calculator.num2 = calculator.scan.nextInt();
            calculator.calculate();
            System.out.println("Хотите продолжить вычисления?(yes/no)");
            calculator.scan.nextLine();
            calculator.nextCountOrNot = calculator.scan.nextLine();
            if (!calculator.nextCountOrNot.equals("yes") & !calculator.nextCountOrNot.equals("no")) {
                while (!calculator.nextCountOrNot.equals("yes") & !calculator.nextCountOrNot.equals("no")) {
                    System.out.println("Хотите продолжить вычисления?(yes/no)");
                    calculator.nextCountOrNot = calculator.scan.nextLine();
                }
            }
            if (calculator.nextCountOrNot.equals("no")) {
                calculator.alive = false;
            } else if (calculator.nextCountOrNot.equals("yes"));
        }
    }
}
