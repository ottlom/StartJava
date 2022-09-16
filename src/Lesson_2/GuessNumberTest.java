package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player pl1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player pl2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(pl1, pl2);
        String option = "yes";

        while (option.equals("yes")) {
            game.start();
            do {
                System.out.print("Хотите продолжить вычисления?(yes/no): ");
                option = scan.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }
}

