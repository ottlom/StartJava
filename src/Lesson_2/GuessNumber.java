package Lesson_2;

public class GuessNumber {
    private int compNum;
    private Player p1;
    private Player p2;
    private int currentPlayerNum;

    public GuessNumber(Player pl1, Player pl2) {
        p1 = pl1;
        p2 = pl2;
    }

    public void setCompNum() {
        compNum = (int) (1 + (Math.random()) * 100);
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

    public void setCurrentPlayerNum(int currentPlayerNum) {
        this.currentPlayerNum = currentPlayerNum;
    }

    public int getCurrentPlayerNum() {
        return currentPlayerNum;
    }

    public void startGame() {
        if (getCurrentPlayerNum() > getCompNum()) {
            System.out.println("это число больше числа которое загадал компьютер");
        } else if (getCurrentPlayerNum() < getCompNum()) {
            System.out.println("это число меньше числа которое загадал компьютер");
        } else if (getCurrentPlayerNum() == getCompNum()) {
            if (getP1().getNumber() == getCurrentPlayerNum()) {
                System.out.println("игрок " + getP1().getName() + " победил");
            } else if (getP2().getNumber() == getCurrentPlayerNum()) {
                System.out.println("игрок " + getP2().getName() + " победил");
            }
        }
    }
}
