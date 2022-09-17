package Lesson_2;

import java.util.Scanner;

public class GuessNumber {
    private int targetNum;
    private Player p1;
    private Player p2;

    public GuessNumber(Player pl1, Player pl2) {
        this.p1 = pl1;
        this.p2 = pl2;
    }

    public void start() {
        targetNum = (int) (1 + (Math.random()) * 100);
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("игрок " + p1.getName() + " вводит число = ");
            p1.setNum(console.nextInt());
            if (p1.getNum() > targetNum) {
                System.out.println("это число больше числа которое загадал компьютер");
            } else if (p1.getNum() < targetNum) {
                System.out.println("это число меньше числа которое загадал компьютер");
            } else {
                System.out.println("игрок " + p1.getName() + " победил");
                break;
            }

            System.out.print("игрок " + p2.getName() + " вводит число = ");
            p2.setNum(console.nextInt());
            if (p2.getNum() > targetNum) {
                System.out.println("это число больше числа которое загадал компьютер");
            } else if (p2.getNum() < targetNum) {
                System.out.println("это число меньше числа которое загадал компьютер");
            } else {
                System.out.println("игрок " + p2.getName() + " победил");
                break;
            }
        }
    }
}
