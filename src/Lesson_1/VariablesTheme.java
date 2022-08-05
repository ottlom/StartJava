package Lesson_1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Task 1: Создание переменных и вывод их значений на консоль");
        byte numOfCores = 8;
        short versionOfWindows = 11;
        int systemType = 64;
        long hardDiskCapacityMb  = 1500000;
        float freqCpu = 3.80f;
        double ram = 32.0;
        char nameDiskWithOc = 'C';
        boolean availabilityOfVideoCard = true;
        System.out.println("Name disk where was installed OC " + nameDiskWithOc +","  +
                " Version Of Windows " + versionOfWindows + "," + " System Type " + systemType + "," +
                " Numbers Of Cores " + numOfCores + "," + " Capacity Hard disk in MB " + hardDiskCapacityMb + "," +
                " CPU frequency " + freqCpu + "GHz " + "," +
                " RAM " + ram + "," + " Availability Of VideoCard in PC " + availabilityOfVideoCard);

        System.out.println("\nTask 2: Расчет стоимости товара со скидкой");
        short priceGoodsX = 100;
        short priceGoodsY = 200;
        short discount = 11;
        short discountSum = (short) ((priceGoodsX + priceGoodsY) / 100 * discount);
        short discountPrice = (short) (priceGoodsX + priceGoodsY - discountSum);
        System.out.println("Сумма скидки = " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой = " + discountPrice);

        System.out.println("\nTask 3: Вывод на консоль слова JAVA");
        System.out.println("    J    a   v     v  a \n" +
                "    J   a a   v   v  a a\n" +
                "J   J  aaaaa   V V  aaaaa\n" +
                " JJ   a     a   V  a     a");

        System.out.println("\nTask 4: Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("before operation = " + byteMax  + " after increment = " + ++byteMax +
                " after decrement = " + --byteMax);
        System.out.println("before operation = " + shortMax + " after increment = " + ++shortMax +
                " after decrement = " + --shortMax);
        System.out.println("before operation = " + intMax + " after increment = " + ++intMax +
                " after decrement = " + --intMax);
        System.out.println("before operation = " + longMax + " after increment = " + ++longMax +
                " after decrement = " + --longMax);

        System.out.println("\nTask 5: Перестановка значений переменных");
        int tmp;
        int num1 = 1;
        int num2 = 2;
        //take vars from past the tasks
        System.out.println("Перестановка через 3-ю переменную:\n" +
                "Исходные значения: " + "num1 = " + num1 + "," + "num2 = " + num2);
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Новые значения: " + "num1 = " + num1 + "," + "num2 = " + num2);
        System.out.println("\nПерестановка через арифмет-ю опер-ю:\n" +
                "Исходные значения: " + "num1 = " + num1 + "," + "num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения: " + "num1 = " + num1 + "," + "num2 = " + num2);
        System.out.println("\nПерестановка с помощью побитовой операции:\n" +
                "Исходные значения: " + "num1 = " + num1 + "," + "num2 = " + num2);
        num1 ^= num2;
        num2 = num2 ^ num1;
        num1 ^= num2;
        System.out.println("Новые значения: " + "num1 = " + num1 + "," + "num2 = " + num2);

        System.out.println("\nTask 6: Вывод символов и их кодов");
        char a = 35;
        char b = 38;
        char c = 64;
        char d = 94;
        char e = 95;
        System.out.println((int) a + " = " + a + "\n" +
                (int) b + " = " + b + "\n" +
                (int) c + " = " + c + "\n" +
                (int) d + " = " + d + "\n" +
                (int) e + " = " + e);

        System.out.println("\nTask 7: Произведение и сумма цифр числа");
        int srcNum = 345;
        int hundreds = srcNum / 100;
        int tens = srcNum / 10 % 10;
        int units = srcNum % 10;
        int sum = hundreds + tens + units;
        System.out.println("сумма цифр числа " + srcNum + " = " + sum);
        int product = hundreds * tens * units;
        System.out.println("произведение цифр числа " + srcNum + " = " + product);

        System.out.println("\nTask 8: Вывод на консоль ASCII-арт Дюка");
        char backSlash= '\\';
        char fwdSlash = '/';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        char space = ' ';
        char underScore = '_';
        System.out.println("" + space + space + space + space + fwdSlash + backSlash + "\n" +
                space + space + space + fwdSlash + space + space + backSlash + "\n" +
                space + space + fwdSlash + underScore + openParenthesis + space + closeParenthesis + backSlash + "\n" +
                space + fwdSlash + space + space + space + space + space + space + backSlash + "\n" +
                fwdSlash + underScore + underScore + underScore + underScore + fwdSlash +
                backSlash + underScore + underScore + backSlash);

        System.out.println("\nTask 9: Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        hundreds = srcNum / 100;
        tens = srcNum % 100 / 10;
        units = srcNum % 10;
        System.out.println("число " + srcNum + " содержит: " + "\n" +
                hundreds + " сотен" + "\n" +
                tens + " десятков" + "\n" +
                units + " единиц");

        System.out.println("\nTask 10: Преобразование секунд");
        srcNum = 86399;
        int hours = srcNum / 3600;
        int minutes = srcNum % 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
