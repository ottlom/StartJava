package Lesson_1;

public class MyFirstGame {
    public static void main(String[] args) {
        int numComp = 16;
        int numPlayer = 67;
        while (numPlayer != numComp) {
            if (numPlayer < numComp) {
                System.out.println("число " + numPlayer + " меньше того, что загадал компьютер");
                numPlayer += 3;
            } else if (numPlayer > numComp) {
                System.out.println("число " + numPlayer + " больше того, что загадал компьютер");
                numPlayer -= 4;
            }
            if (numPlayer == numComp) {
                System.out.println("Вы победили!");
            }
        }
    }
}
