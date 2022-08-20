package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Task 1: Подсчет суммы чётных и нечётных чисел");
        int gap = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (gap % 2 == 0) {
                sumEven += gap;
            } else {
                sumOdd += gap;
            }
            gap++;
        } while (gap <= 21);
        System.out.println("в промежутке [-10,21] сумма чётных чисел равна = " + sumEven + ",а нечётных = " + sumOdd);

        System.out.println("\nTask 2: Вывод чисел в интервале (min и max) в порядке убывания");
        int maxNum = 0;
        int minNum = 0;
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
            if (num2 > num3) {
                minNum = num3;
            } else if (num2 < num3) {
                minNum = num2;
            }
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i);
        }

        System.out.println("\n\nTask 3: Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int nextDigit;
        int sum = 0;
        int divider = 1;
        while (srcNum / divider != 0) {
            nextDigit = srcNum / divider % 10;
            sum += nextDigit;
            divider *= 10;
            System.out.print(nextDigit);
        }
        System.out.println("\n" + sum);

        System.out.println("\nTask 4: Вывод чисел на консоль в несколько строк");
        int counter = 1;
        for (int i = 1; i < 24; i++) {
            System.out.printf("%3d", i);
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
            i++;
            counter++;
        }
        for (int i = counter; i <= 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\nTask 5: Проверка количества единиц на чётность");
        srcNum = 3141591;
        int numOfOnes = 0;
        int reverse = 1;
        while (srcNum / reverse != 0) {
            if (srcNum / reverse % 10 == 1) {
                numOfOnes++;
            }
            reverse *= 10;
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
        int counter1 = 0;
        int counter2 = 0;
        while (counter1 < 5) {
            while (counter2 < 5) {
                System.out.print('#');
                counter2++;
            }
            System.out.println();
            counter1++;
            counter2 = counter1;
        }

        System.out.println();
        counter1 = 5;
        do {
            if (counter1 < 3) {
                counter2 = counter1;
            } else {
                counter2 = 6 - counter1;
            }
            do {
                System.out.print('$');
            } while (--counter2 > 0);
            System.out.println();
            counter1--;
        } while (counter1 > 0);

        System.out.println("\nTask 7: Отображение ASCII-символов");
        System.out.printf("%s%6s%n", "DEC", "CHAR");
        for (int i = 0; i < 127; i++) {
            if (i < 48 &&  i % 2 != 0) {
                System.out.printf("%3d%6c%n", i, i);
            } else if (i > 96 && i < 123 && i % 2 == 0) {
                    System.out.printf("%3d%6c%n", i, i);
                }
            }

        System.out.println("\nTask 8: Проверка, является ли число палиндромом");
        srcNum = 1234321;
        nextDigit = srcNum;
        int reverseNum = 0;
        while (nextDigit % 10 != 0) {
            reverseNum =  reverseNum * 10 + nextDigit % 10;
            nextDigit /= 10;
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
        divider = 1;
        for (int i = 0; i <= 6; i++) {
            if (i < 3) {
                sumSecondThreeNum += srcNum / divider % 10;
                divider *= 10;
            } else if (i > 3) {
                sumFirstThreeNum += srcNum / divider % 10;
                divider *= 10;
            }
        }

        if (sumFirstThreeNum == sumSecondThreeNum) {
            System.out.println("сумма первых 3 цифр = " + sumFirstThreeNum + ", " +
                    "сумма вторых 3 цифр = " + sumSecondThreeNum +
                    " ,число является счастливым");
        } else {
            System.out.println("сумма первых 3 цифр = " + sumFirstThreeNum + ", " +
                    "сумма вторых 3 цифр = " + sumSecondThreeNum +
                    " ,число не является счастливым");
        }

        System.out.println("\nTask 10: Вывод таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            int j = 2;
            if (i < 3 && j < 3) {
                while (j < 10) {
                    if (j < 3) {
                        System.out.printf("%1c%c%2c%d", ' ', '|', ' ', j);
                        j++;
                    }
                    System.out.printf("%3d", j);
                    j++;
                }
                }
                System.out.println();
                for (i = 0; i < 24; i++) {
                    System.out.printf("%c", '_');
                    if (i == 0) {
                        System.out.printf("%c", '|');
                    }else if (i == 23) {
                        System.out.printf("%c%n", '_');
                    }
                }
                for (i = 2; i < 10; i++) {
                    System.out.printf("%d%c", i, '|');
                    for (j = 2; j < 10; j++) {
                        System.out.printf("%3d", i * j);
                    }
                    System.out.println();
                }
            }
        }
    }

