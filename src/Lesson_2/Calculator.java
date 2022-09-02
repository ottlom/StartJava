package Lesson_2;

public class Calculator {
    private int num1;
    private int num2;
    private char mathSign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setMathSign(char mathSign) {
        this.mathSign = mathSign;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void calculate() {
        switch (mathSign) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '^':
                for (int i = num2; i > 1; i--) {
                    num1 *= num1;
                }
                System.out.println(num1);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
        }
    }
}


