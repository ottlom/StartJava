package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Task 1: Перевод псевдокода на язык Java");
        int age = 25;
        boolean maleGender = true;
        double height = 1.71;
        String name = "Maks";
        char firstLetterOfName = name.charAt(0);

        if (age > 20) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("В доступе отказано в связи с возврастным ограничением");
        }

        if (!maleGender) {
            System.out.println("Выбран женский пол для персонажа");
        }

        if (height < 1.80) {
            System.out.println("Не начинать просмотр игрока");
        } else {
            System.out.println("Помечаем как требующего дальнейшего изучения");
        }

        if (firstLetterOfName ==  'M') {
            System.out.println("Имя начинается на М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Имя начинается на I");
        } else {
            System.out.println("Имя начинается на иную букву");
        }

        System.out.println("\nTask 2: Поиск max и min числа");
        int num1 = 325;
        int num2 = 125;
        if (num1 > num2) {
            System.out.println("Максимальное число = " + num1 + " минимальное число = " + num2);
        } else if (num2 > num1) {
            System.out.println("Максимальное число = " + num2 + " минимальное число = " + num1);
        }

        System.out.println("\nTask 3: Работа с числом");
        int srcNum = -7;

        if (srcNum != 0) {
            if (srcNum > 0) {
                System.out.println("число " + srcNum + " положительное");
            } else {
                System.out.println("число " + srcNum + " отрицательное");
            }
            if (srcNum % 2 == 0) {
                System.out.println("число " + srcNum + " четное");
            } else {
                System.out.println("число " + srcNum + " нечетное");
            }
        } else {
            System.out.println("число равно 0");
        }

        System.out.println("\nTask 4: Поиск одинаковых цифр в числах");
        //take variables num1 and num2 from Task 2
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int tensNum1 = num1 / 10 % 10;
        int tensNum2 = num2 / 10 % 10;
        int unitsNum1 = num1 % 10;
        int unitsNum2 = num2 % 10;

        System.out.println("исходное число 1 = " + num1 + ", " + "исходное число 2 = " + num2);
        if (unitsNum1 == unitsNum2) {
            System.out.println("в разряде 1" +  " одинаковая цифра " + unitsNum1);
        }
        if (tensNum1 == tensNum2) {
            System.out.println("в разряде 2" + " одинаковая цифра " + tensNum1);
        }
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("в разряде 3" + " одинаковая цифра " + hundredsNum1);
        }

        System.out.println("\nTask 5: Определение буквы, числа или символа по их коду");
        char srcChar = '\u0057';

        if (srcChar >= '0' && srcChar <= '9') {
            System.out.println("символ " + srcChar + " является числом");
        } else if (srcChar >= 'A' && srcChar <= 'Z') {
            System.out.println("символ " + srcChar + " является большой буквой");
        } else if (srcChar >= 'a' && srcChar <= 'z') {
            System.out.println("символ " + srcChar + " является маленькой буквой");
        } else {
            System.out.println("символ " + srcChar + " не число и не буква");
        }

        System.out.println("\nTask 6: Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percent = 0;
        int sumDepositWithPercent;
        if (deposit < 100000) {
            percent = 5;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = 7;
        } else if (deposit > 300000) {
            percent = 10;
        }
        sumDepositWithPercent = deposit / 100 * 5 + deposit;
        System.out.println("сумма вклада = " + deposit + "\n" +
                "начисляемый % = " + percent + "\n" +
                "итоговая сумма с начисленными % = " + sumDepositWithPercent);

        System.out.println("\nTask 7: Определение оценки по предметам");
        int historyPercent = 59;
        int historyRating = 0;
        int programmingPercent = 91;
        int programmingRating = 0;
        int avrRating;
        int avrPercent;

        if (historyRating > 91) {
            historyRating = 5;
        } else if (historyPercent > 73) {
            historyRating = 4;
        } else if (historyPercent > 60) {
            historyRating = 3;
        } else if (historyPercent <= 60) {
            historyRating = 2;
        }

        if (programmingPercent > 91) {
            programmingRating = 5;
        } else if (programmingPercent > 73) {
            programmingRating = 4;
        } else if (programmingPercent > 60) {
            programmingRating = 3;
        } if (programmingPercent <= 60) {
            programmingRating = 2;
        }
        avrRating = (historyRating + programmingRating) / 2;
        avrPercent = (historyPercent + programmingPercent) / 2;
        System.out.println(historyRating + " History rating, " + programmingRating + " Programming rating\n" +
                avrRating + " average rating\n" +
                avrPercent + " average percent");

        System.out.println("\nTask 8: Расчет прибыли");
        int rent = 5000;
        int avrMonthIncome = 13000;
        int costGoods = 9000;
        int netProfit = (avrMonthIncome - (costGoods + rent)) * 12 ;

        if (netProfit < 0) {
            System.out.println("прибыль за год: " + netProfit);
        } else if (netProfit > 0) {
            System.out.println("прибыль за год: +" + netProfit);
        }

        System.out.println("\nTask 9: Подсчет количества банкнот");
        int amountOfMoney = 567;
        int tenUsdBanknote = 10;
        int amountTenUsdBanknote = 5;
        int hundredUsdBanknote = 100;
        int requireAmountBanknote;

        requireAmountBanknote = amountOfMoney / hundredUsdBanknote;
        amountOfMoney = amountOfMoney - hundredUsdBanknote * requireAmountBanknote;
        System.out.println("стодоллоровых купюр требуется: " + requireAmountBanknote);
        if (amountOfMoney / 10 % 10 > amountTenUsdBanknote){
            requireAmountBanknote = amountOfMoney - tenUsdBanknote * amountTenUsdBanknote;
            System.out.println("десятидоллоровых купюр требуется: " + amountTenUsdBanknote);
            System.out.println("купюр номиналом 1 доллар требуется: " + requireAmountBanknote);
        } else if (amountOfMoney / 10 % 10 < amountTenUsdBanknote) {
            requireAmountBanknote = amountOfMoney / 10 % 10;
            System.out.println("десятидоллоровых купюр требуется: " + requireAmountBanknote);
            System.out.println("купюр номиналом 1 доллар требуется: " + amountOfMoney % 10);
        }
    }
}
