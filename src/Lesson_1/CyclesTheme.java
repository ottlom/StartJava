package Lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Task 1: Подсчет суммы чётных и нечётных чисел");
        int i = -10;
        int numEven = 0;
        int numOdd = 0;
        do {
            if (i % 2 == 0) {
                numEven += i;
            } else {
                numOdd += i;
            }
            i++;
        } while (i <= 21);
        System.out.println("в промежутке [-10,21] сумма чётных чисел равна = " + numEven + ",а нечётных = " + numOdd);

        System.out.println("\nTask 2: Вывод чисел в интервале (min и max) в порядке убывания");
        int maxNum = 0;
        int minNum = 0;
        if (10 > 5 && 10 > -1) {
            maxNum = 10;
            if (5 > -1) {
                minNum = -1;
            } else if (5 < -1) {
                minNum = 5;
            }
        }
        for (i = maxNum - 1; i > minNum; i--) {
            System.out.print(i);
        }

        System.out.println("\n\nTask 3: Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int nextNum;
        int sum = 0;
        int divider = 1;
        i = 0;
        while (i < 4) {
            nextNum = srcNum / divider % 10;
            sum += nextNum;
            divider *= 10;
            System.out.print(nextNum);
            i++;
        }
        System.out.println("\n" + sum);

        System.out.println("\nTask 4: Вывод чисел на консоль в несколько строк");
        int numInString = 1;
        for (i = 1; i < 24; i++) {
            System.out.printf("%3d", i);
            if (numInString == 5) {
                System.out.print("\n");
                numInString = 0;
            }
            i++;
            numInString++;
        }
        for (i = numInString; i <= 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\nTask 5: Проверка количества единиц на чётность");
        srcNum = 3141591;
        int numOfUnits = 0;
        i = 0;
        int numAfterDivide = srcNum;
        while (i < 7) {
            if (numAfterDivide % 10 == 1) {
                numOfUnits++;
            }
            i++;
            numAfterDivide /= 10;
        }
        if (numOfUnits % 2 == 0) {
            System.out.println("число " + srcNum + " содержит " + numOfUnits + " (чётное) количество единиц");
        } else {
            System.out.println("число " + srcNum + " содержит " + numOfUnits + " (нечётное) количество единиц");
        }

        System.out.println("\nTask 6: Отображение фигур в консоли");
        char signMultiply = '*';
        char signHash = '#';
        char signDollar = '$';
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(signMultiply);
            }
            System.out.println(signMultiply);
        }

        System.out.println();
        i = 0;
        int j = 0;
        while (i < 5) {
            while (j < 5) {
                System.out.print(signHash);
                j++;
            }
            System.out.println();
            i++;
            j = i;
        }

        System.out.println();
        i = 5;
        do {
            if (i < 3) {
                j = i;
            } else {
                j = 6 - i;
            }
            do {
                System.out.print(signDollar);
            } while (--j > 0);
            System.out.println();
            i--;
        } while (i > 0);

        System.out.println("\nTask 7: Отображение ASCII-символов");
        System.out.printf("%s%6s%n", "DEC", "CHAR");
        for (i = 0; i < 127; i++) {
            if (i % 2 != 0 && i < 48) {
                if (i < 10) {
                    System.out.printf("%3d%6c%n", i, i);
                } else {
                    System.out.printf("%3d%6c%n", i, i);
                }
            } else if (i % 2 == 0 && i > 96 && i < 123) {
                if (i < 100) {
                    System.out.printf("%3d%6c%n", i, i);
                } else {
                    System.out.printf("%2d%6c%n", i, i);
                }
            }
        }

        System.out.println("\nTask 8: Проверка, является ли число палиндромом");
        srcNum = 1234321;
        int numX = 1000000;
        int numY = 10;
        divider = 1;
        int palindromeCounter = 0;
        for (i = 0; i < 4; i++) {
            if (srcNum / numX % 10 == srcNum % numY / divider) {
                palindromeCounter++;
            }
            numX /= 10;
            numY *= 10;
            divider *= 10;
        }
        if (palindromeCounter == 4) {
            System.out.println("число " + srcNum + " является палиндромом");
        } else {
            System.out.println("число " + srcNum + " неявляется палиндромом");
        }

        System.out.println("\nTask 9: Определение, является ли число счастливым");
        srcNum = 621360;
        int sumFirstThreeNum = 0;
        int sumSecondThreeNum = 0;
        divider = 1;
        for (i = 0; i <= 6; i++) {
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
        j = 2;
        for (i = 1; i < 10; i++) {
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

