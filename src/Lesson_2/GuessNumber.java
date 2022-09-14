package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private int compNum;
    private Player p1;
    private Player p2;

    public GuessNumber(Player pl1, Player pl2) {
        p1 = pl1;
        p2 = pl2;
    }

    public void setCompNum() {
        compNum = (int) (1 + (Math.random()) * 5);
    }

    public int getCompNum() {
        return compNum;
    }

    public Player getP1() {
        return p1;
    }

    public Player getP2() {
        return p2;
    }

    public void startGame() {
        Scanner scanNum = new Scanner(System.in);
        setCompNum();
        while (true) {
            System.out.print("игрок " + getP1().getName() + " вводит число = ");
            getP1().setNum(scanNum.nextInt());
            if (getP1().getNum() > getCompNum()) {
                System.out.println("это число больше числа которое загадал компьютер");
            } else if (getP1().getNum() < getCompNum()) {
                System.out.println("это число меньше числа которое загадал компьютер");
            } else {
                System.out.println("игрок " + getP1().getName() + " победил");
                break;
            }
            System.out.print("игрок " + getP2().getName() + " вводит число = ");
            getP2().setNum(scanNum.nextInt());
            if (getP2().getNum() > getCompNum()) {
                System.out.println("это число больше числа которое загадал компьютер");
            } else if (getP2().getNum() < getCompNum()) {
                System.out.println("это число меньше числа которое загадал компьютер");
            } else {
                System.out.println("игрок " + getP2().getName() + " победил");
                break;
            }
        }
    }
}
