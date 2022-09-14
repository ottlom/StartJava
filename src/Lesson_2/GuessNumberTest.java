package Lesson_2;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String namePl1 = scan.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String namePl2 = scan.nextLine();
        String option = "yes";
        GuessNumber game = new GuessNumber(new Player(namePl1), new Player(namePl2));

        game.setCompNum();
        while (option.equals("yes")) {
            System.out.print("игрок " + game.getP1().getName() + " вводит число = ");
            game.getP1().setNumber(scan.nextInt());
            game.setCurrentPlayerNum(game.getP1().getNumber());
            game.startGame();
            if (game.getCurrentPlayerNum() == game.getCompNum()) {
                scan.nextLine();
                game.setCompNum();
                do {
                    System.out.print("Хотите продолжить вычисления?(yes/no): ");
                    option = scan.nextLine();
                } while (!option.equals("yes") && !option.equals("no"));
            } else {
                System.out.print("игрок " + game.getP2().getName() + " вводит число = ");
                game.getP2().setNumber(scan.nextInt());
                game.setCurrentPlayerNum(game.getP2().getNumber());
                game.startGame();
                if (game.getCurrentPlayerNum() == game.getCompNum()) {
                    scan.nextLine();
                    game.setCompNum();
                    do {
                        System.out.print("Хотите продолжить вычисления?(yes/no): ");
                        option = scan.nextLine();
                    } while (!option.equals("yes") && !option.equals("no"));
                }
            }
        }
    }
}

