package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Task 1: Подсчет суммы чётных и нечётных чисел");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10,21] сумма чётных чисел равна = " + sumEven + ",а нечётных = " + sumOdd);

        System.out.println("\nTask 2: Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum;
        int minNum;
        if (num1 > num2) {
            maxNum = num1;
            minNum = num2;
        } else {
            maxNum = num2;
            minNum = num1;
        }
        if (num3 < maxNum) {
            if (num3 < minNum) {
                minNum = num3;
            }
        } else if (num3 > maxNum) {
            maxNum = num3;
        }

        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i);
        }

        System.out.println("\n\nTask 3: Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        while (srcNum > 0) {
            int nextDigit = srcNum % 10;
            sumDigits += nextDigit;
            srcNum /= 10;
            System.out.printf("%d",nextDigit);
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\nTask 4: Вывод чисел на консоль в несколько строк");
        counter = 1;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
            counter++;
        }
        for (int i = counter; i <= 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\nTask 5: Проверка количества единиц на чётность");
        srcNum = 3141591;
        int copySrcNum = srcNum;
        int numOfOnes = 0;
        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 1) {
                numOfOnes++;
            }
            copySrcNum /= 10;
        }
        if (numOfOnes % 2 == 0) {
            System.out.println("число " + srcNum + " содержит " + numOfOnes + " (чётное) количество единиц");
        } else {
            System.out.println("число " + srcNum + " содержит " + numOfOnes + " (нечётное) количество единиц");
        }

        System.out.println("\nTask 6: Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        int amountStrings = 0;
        int amountChars = 0;
        while (amountStrings < 5) {
            while (amountChars < 5) {
                System.out.print('#');
                amountChars++;
            }
            System.out.println();
            amountStrings++;
            amountChars = amountStrings;
        }

    amountStrings = 6;
        do {
            System.out.println();
            amountStrings--;
            if (amountStrings < 3) {
                amountChars = amountStrings;
            } else {
                amountChars = 6 - amountStrings;
            }
            do {
                System.out.print('$');
            } while (--amountChars > 0);
        } while (amountStrings > 1);

        System.out.println("\nTask 7: Отображение ASCII-символов");
        System.out.printf("%s%6s%n", "DEC", "CHAR");
        for (int i = 0; i < 127; i++) {
            if ((i < 48) && (i % 2 != 0)) {
                System.out.printf("%3d%6c%n", i, i);
            } else if ((i > 96 && i < 123) && (i % 2 == 0)) {
                System.out.printf("%3d%6c%n", i, i);
            }
        }

        System.out.println("\nTask 8: Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int reverseNum = 0;
        while (copySrcNum > 0) {
            int nextDigit = copySrcNum % 10;
            reverseNum = reverseNum * 10 + nextDigit;
            copySrcNum /= 10;
        }
        if (srcNum == reverseNum) {
            System.out.println("число " + srcNum + " является палиндромом");
        } else {
            System.out.println("число " + srcNum + " неявляется палиндромом");
        }

        System.out.println("\nTask 9: Определение, является ли число счастливым");
        srcNum = 621360;
        int sumFirstThreeNum = 0;
        int sumSecondThreeNum = 0;
        counter = 0;
        while (srcNum > 0) {
            int nextDigit = srcNum % 10;
            if (counter < 3) {
                sumSecondThreeNum += nextDigit;
            } else if (counter >= 3) {
                sumFirstThreeNum += nextDigit;
            }
            srcNum /= 10;
            counter++;
        }
        String srcNumLuckyOrNot =  sumFirstThreeNum == sumSecondThreeNum ? "" : " не";
        System.out.println("сумма первых 3 цифр = " + sumFirstThreeNum + ", " +
                    "сумма вторых 3 цифр = " + sumSecondThreeNum +
                    " ,число является" + srcNumLuckyOrNot + " счастливым");


        System.out.println("\nTask 10: Вывод таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            int j = 2;
            if (i < 1 && j < 3) {
                while (j < 10) {
                    if (j < 3) {
                        System.out.printf("%1c%c%2c%d", ' ', '|', ' ', j);
                        j++;
                    }
                    System.out.printf("%3d", j);
                    j++;
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (i = 0; i < 24; i++) {
                System.out.printf("%c", '_');
                if (i == 0) {
                    System.out.printf("%c", '|');
                } else if (i == 23) {
                    System.out.printf("%c%n", '_');
                }
            }
            for (i = 2; i < 10; i++) {
                System.out.printf("%d%c", i, '|');
                for (int j = 2; j < 10; j++) {
                    System.out.printf("%3d", i * j);
                }
                System.out.println();
            }
        }
    }
}

