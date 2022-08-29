package Lesson_2;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.scan = new Scanner(System.in);
        calculator.calculate();
    }
}
