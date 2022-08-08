package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Task 1: Перевод псевдокода на язык Java");
        int age = 25;
        boolean isMaleGender = true;
        double height = 1.71;
        String name = "Maks";
        char firstLetterOfName = name.charAt(0);

        if (age > 20) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("В доступе отказано в связи с возврастным ограничением");
        }

        if (!isMaleGender) {
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

        if (srcNum == 0) {
            System.out.println("число равно 0");
        } else {
            if (srcNum > 0 && srcNum % 2 == 0) {
                System.out.println("положительное четное число");
            } else if (srcNum > 0 && srcNum % 2 > 0) {
                System.out.println("положительное нечетное число");
            } else if (srcNum < 0 && srcNum % 2 == 0) {
                System.out.println("отрицательное четное число");
            } else {
                System.out.println("отрицательное нечетное число");
            }
        }

        System.out.println("\nTask 4: Поиск одинаковых цифр в числах");
        //take variables num1 and num2 from Task 2
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int tensNum1 = num1 / 10 % 10;
        int tensNum2 = num2 / 10 % 10;
        int unitsNum1 = num1 % 10;
        int unitsNum2 = num2 % 10;
        int numOfRank;

        System.out.println("исходное число 1 = " + num1 + ", " + "исходное число 2 = " + num2);
        if (unitsNum1 == unitsNum2) {
            numOfRank = 1;
            System.out.println("в разряде "+ numOfRank + " одинаковая цифра " + unitsNum1);
        }
        if (tensNum1 == tensNum2) {
            numOfRank = 2;
            System.out.println("в разряде "+ numOfRank + " одинаковая цифра " + tensNum1);
        }
        if (hundredsNum1 == hundredsNum2) {
            numOfRank = 3;
            System.out.println("в разряде "+ numOfRank + " одинаковая цифра " + hundredsNum1);
        }

        System.out.println("\nTask 5: Определение буквы, числа или символа по их коду");
        char srcChar = '\u0057';

        if ((int)srcChar >= 48 && (int)srcChar <= 57){
            System.out.println("символ " + srcChar + " является числом");
        } else if ((int)srcChar >= 65 && (int)srcChar <= 90) {
            System.out.println("символ " + srcChar + " является большой буквой");
        } else if ((int)srcChar >= 97 && (int)srcChar <= 122) {
            System.out.println("символ " + srcChar + " является маленькой буквой");
        } else {
            System.out.println("символ " + srcChar + " не число и не буква");
        }

        System.out.println("\nTask 6: Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percent;
        int sumDepositWithPercent;

        if (deposit < 100000) {
            percent = 5;
            sumDepositWithPercent = deposit / 100 * 5 + deposit;
            System.out.println("сумма вклада = " + deposit + "\n" +
                    "начисляемый % = " + percent + "\n" +
                    "итоговая сумма с начисленными % = " + sumDepositWithPercent);
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = 7;
            sumDepositWithPercent = deposit / 100 * 7 + deposit;
            System.out.println("сумма вклада = " + deposit + "\n" +
                    "начисляемый % = " + percent + "\n" +
                    "итоговая сумма с начисленными % = " + sumDepositWithPercent);
        } else if (deposit > 300000) {
            percent = 10;
            sumDepositWithPercent = deposit / 100 * 10 + deposit;
            System.out.println("сумма вклада = " + deposit + "\n" +
                    "начисляемый % = " + percent + "\n" +
                    "итоговая сумма с начисленными % = " + sumDepositWithPercent);
        }

        System.out.println("\nTask 7: Определение оценки по предметам");
        int historyPercent = 59;
        int historyRating = 0;
        int programmingPercent = 91;
        int programmingRating = 0;
        int avrRating;
        int avrPercent;

        if (historyPercent <= 60) {
            historyRating = 2;
        }
        if (historyPercent > 60) {
            historyRating = 3;
        }
        if (historyPercent > 73) {
            historyRating = 4;
        }
        if (historyPercent > 91) {
            historyRating = 5;
        }

        if (programmingPercent <= 60) {
            programmingRating = 2;
        }
        if (programmingPercent > 60) {
            programmingRating = 3;
        }
        if (programmingPercent > 73) {
            programmingRating = 4;
        }
        if (programmingPercent > 91) {
            programmingRating = 5;
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
        int NetProfit = (avrMonthIncome - (costGoods + rent)) * 12 ;

        if (NetProfit < 0) {
            System.out.println("прибыль за год: " + NetProfit);
        } else if (NetProfit > 0) {
            System.out.println("прибыль за год: " + NetProfit);
        }

        System.out.println("\nTask 9: Подсчет количества банкнот");
        int AmountOfMoney = 567;
        int tenUsdBanknote = 10;
        int AmountTenUsdBanknote = 5;
        int hundredUsdBanknote = 100;
        int RequireAmountBanknote;

        RequireAmountBanknote = AmountOfMoney / hundredUsdBanknote;
        AmountOfMoney = AmountOfMoney - hundredUsdBanknote * RequireAmountBanknote;
        System.out.println("стодоллоровых купюр требуется: " + RequireAmountBanknote);
        if (AmountOfMoney / 10 % 10 > AmountTenUsdBanknote){
            RequireAmountBanknote = AmountOfMoney - tenUsdBanknote * AmountTenUsdBanknote;
            System.out.println("десятидоллоровых купюр требуется: " + AmountTenUsdBanknote);
            System.out.println("купюр номиналом 1 доллар требуется: " + RequireAmountBanknote);
        } else if (AmountOfMoney / 10 % 10 < AmountTenUsdBanknote) {
            RequireAmountBanknote = AmountOfMoney / 10 % 10;
            System.out.println("десятидоллоровых купюр требуется: " + RequireAmountBanknote);
            System.out.println("купюр номиналом 1 доллар требуется: " + AmountOfMoney % 10);
        }
    }
}
