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
        System.out.println("Name disk where was installed OC " + nameDiskWithOc +","  +  " Version Of Windows " + versionOfWindows + ","
                + " System Type " + systemType + "," + " Numbers Of Cores " + numOfCores + "," + " Capacity Hard disk in MB " + hardDiskCapacityMb + ","
                + " CPU frequency " + freqCpu + "GHz " + "," + " RAM " + ram + "," + " Availability Of VideoCard in PC " + availabilityOfVideoCard);


        short price1 = 100;
        short price2 = 200;
        short sale = 11;
        System.out.println("\nTask 2: Расчет стоимости товара со скидкой");
        short saleSum = (short) ((price1 + price2) / 100 * sale);
        short costsWithSale = (short) (price1 + price2 - saleSum);
        System.out.println("Сумма скидки = " + saleSum);
        System.out.println("Общая стоимость товаров со скидкой = " + costsWithSale);

        System.out.println("\nTask 3: Вывод на консоль слова JAVA");
        System.out.println("    J    a   v     v  a \n" +
                           "    J   a a   v   v  a a\n" +
                           "J   J  aaaaa   V V  aaaaa\n" +
                           " JJ   a     a   V  a     a");

        System.out.println("\nTask 4: Отображение min и max значений числовых типов данных");
        byte typeByte = 127;
        short typeShort = 32_767;
        int typeInt = 2_147_483_647;
        long typeLong = 9_223_372_036_854_775_807L;
        System.out.println("before operation = " +typeByte  + " after increment = " + ++typeByte + " after decrement = " + --typeByte);
        System.out.println("before operation = " + typeShort + " after increment = " + ++typeShort + " after decrement = " + --typeShort);
        System.out.println("before operation = " + typeInt + " after increment = " + ++typeInt + " after decrement = " + --typeInt);
        System.out.println("before operation = " + typeLong + " after increment = " + ++typeLong + " after decrement = " + --typeLong);

        System.out.println("\nTask 5: Перестановка значений переменных");
        int varForSwap;
        //take vars from past the tasks
        System.out.println("Перестановка через 3-ю переменную:\n" +
                            "Исходные значения: " + "systemType = " + systemType + "," + "typeInt = " + typeInt);
        varForSwap = systemType;
        systemType = typeInt;
        typeInt = varForSwap;
        System.out.println("Новые значения: " + "systemType = " + systemType + "," + "typeInt = " + typeInt);
        System.out.println("\nПерестановка через арифмет-ю опер-ю:\n" +
                "Исходные значения: " + "systemType = " + systemType + "," + "typeInt = " + typeInt);
        systemType = systemType + typeInt;
        typeInt = systemType - typeInt;
        systemType = systemType - typeInt;
        System.out.println("Новые значения: " + "systemType = " + systemType + "," + "typeInt = " + typeInt);
        System.out.println("\nПерестановка с помощью побитовой операции:\n" +
                "Исходные значения: " + "systemType = " + systemType + "," + "typeInt = " + typeInt);
        systemType = systemType ^ typeInt;
        typeInt = typeInt ^ systemType;
        systemType = systemType ^ typeInt;
        System.out.println("Новые значения: " + "systemType = " + systemType + "," + "typeInt = " + typeInt);

        System.out.println("\nTask 6: Вывод символов и их кодов");
        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int e = 95;
        System.out.println(a + " = " + (char) a + "\n" +
                            b + " = " + (char) b + "\n" +
                            c + " = " + (char) c + "\n" +
                            d + " = " + (char) d + "\n" +
                            e + " = " + (char) e + "\n");

        System.out.println("\nTask 7: Произведение и сумма цифр числа");
        int srcNum = 345;
        a = srcNum / 100;
        b = srcNum / 10 % 10;
        c = srcNum % 10;
        int sum = a + b + c;
        System.out.println("сумма цифр числа " + srcNum + " = " + sum);
        sum = a * b * c;
        System.out.println("произведенеи цифр числа " + srcNum + " = " + sum);

        System.out.println("\nTask 8: Вывод на консоль ASCII-арт Дюка");
        d = 92; //'\'
        e = 47; // '/'
        int f = 40; // '('
        int g = 41; // ')'
        int h = 32; // ' '
        int i = 95; // '_'
        System.out.println((char)(h) + "" + (char)(h) + "" + (char)(h) + "" +  (char) (h) + "" + (char)(e) + "" + (char)(d) + "\n" +
                          ((char)(h) + "" + (char)(h) + "" + (char)(h) + "" +(char)(e) + "" +  (char) (h) + "" +(char) (h) + "" + (char)(d) + "\n" +
                          ((char)(h) + "" + (char)(h) + "" + (char) (e) + "" +(char) (i) + "" + (char) (f) + "" + (char) (h) + "" + (char) (g) + "" + (char) (d) + "\n" +
                          (char)(h) +  "" + (char) (e) + "" + (char) (h)+ "" + (char) (h)+ "" + (char) (h)+ "" + (char) (h)+ "" + (char) (h)+ "" + (char) (h) + "" + (char) (d))) + "\n" +
                          (char) (e) + "" + (char) (i) + "" + (char) (i) + "" + (char) (i) + "" + (char) (i) + "" + (char) (e) + "" + (char) (d) + "" + (char) (i) + "" + (char) (i) + "" + (char) (d));

        System.out.println("\nTask 9: Отображение количества сотен, десятков и единиц числа");
        srcNum = 123;
        a = srcNum / 100;
        b = srcNum / 10;
        System.out.println("число " + srcNum + " содержит: " + "\n" +
                           a + " сотен" + "\n" +
                           b + " десятков" + "\n" +
                           srcNum + " единиц");

        System.out.println("\nTask 10: Преобразование секунд");
        srcNum = 86399;
        int hours = srcNum / 3600;
        int minutes = srcNum / 60;
        System.out.println(hours + ":" + minutes + ":" + srcNum);


    }
}
