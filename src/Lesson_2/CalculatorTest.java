package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        boolean alive = true;
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String nextCountOrNot;

        while (alive) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(scan.nextInt());
            calculator.getNum1();
            System.out.print("Введите знак математической операции: ");
            scan.nextLine();
            calculator.setMathSign(scan.nextLine().charAt(0));
            calculator.getMathSign();
            System.out.print("Введите второе число: ");
            calculator.setNum2(scan.nextInt());
            calculator.getNum2();
            calculator.calculate();
            System.out.println("Хотите продолжить вычисления?(yes/no)");
            scan.nextLine();
            nextCountOrNot = scan.nextLine();
            while (!nextCountOrNot.equals("yes") && !nextCountOrNot.equals("no")) {
                System.out.println("Хотите продолжить вычисления?(yes/no)");
                nextCountOrNot = scan.nextLine();
                if (nextCountOrNot.equals("no")) {
                    alive = false;
                } else if (nextCountOrNot.equals("yes"));
            }
        }
    }
}
