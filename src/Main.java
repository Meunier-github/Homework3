public class Main {
    public static void main(String[] args) {
        //Задача1

        byte typeByte = 127;
        short typeShort = 32767;
        int typeInt = 2000000000;
        long typeLong = 9000000L;
        float typeFloat = 3.5f;
        double typeDouble = 56.54;
        System.out.println("Задача 1");
        System.out.println("Значение переменной typeByte с типом Byte равно " + typeByte);
        System.out.println("Значение переменной typeShort с типом Short равно " + typeShort);
        System.out.println("Значение переменной typeInt с типом Int равно " + typeInt);
        System.out.println("Значение переменной typeLong с типом Long равно " + typeLong);
        System.out.println("Значение переменной typeFloat с типом Float равно " + typeFloat);
        System.out.println("Значение переменной typeDouble с типом Double равно " + typeDouble);

        //Задача2

        float f1 = 27.12f;
        long l1 = 987678965549L;
        double d1 = 2.786;
        short s1 = 569;
        short s2 = -159;
        int i1 = 27897;
        byte b1 = 67;

        //Задача3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int listTotal = 480;
        int classTotal = class1 + class2 + class3;
        double list = listTotal/classTotal;
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги");

        //Задача4
        byte prod1Min = 8;
        int prod20Min = 20 * prod1Min;
        int prodDay = prod1Min * 24 * 60;
        int prod3Day = prod1Min * 3 * 24 * 60;
        int prod1Month = prod1Min * 30 * 24 * 60;
        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + prod20Min + " штук бутылок");
        System.out.println("За день машина произвела " + prodDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + prod3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + prod1Month + " штук бутылок");

        //Задача5
        byte colorTotal = 120;
        byte colorWhite = 2;
        byte colorBrown = 4;
        int colorClass = colorWhite + colorBrown;
        int nClass = colorTotal/colorClass;
        int colorWhiteTotal = colorWhite * nClass;
        int colorBrownTotal = colorBrown * nClass;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + nClass + " классов, нужно "+ colorWhiteTotal + " банок белой краски и "+
                colorBrownTotal + " банок коричневой краски");

        //Задача6
        byte banan1 = 80;
        byte countBanan = 5;
        byte milk100 = 105;
        byte countMilk = 2;
        byte ice1 = 100;
        byte countIce = 2;
        byte egg1 = 70;
        byte countEgg = 4;
        int breakfast = banan1*countBanan + milk100*countMilk + ice1*countIce + egg1*countEgg;
        System.out.println("Задача 6");
        System.out.println("Вес завтрака в граммах = " + breakfast);
        System.out.println("Вес завтрака в килограммах = " + breakfast/1000);

        //Задача7
        int weight = 7000;
        int weight250 = 250;
        int weight500 = 500;
        float day250 = (float) weight /weight250;
        float day500 = (float) weight /weight500;
        float dayAverage = (float) weight/((float) (weight250 + weight500) /2);
        System.out.println("Задача 7");
        System.out.println("Потребуется " + day250 + " дней,если спортсмен теряет 250 гр в день");
        System.out.println("Потребуется " + day500 + " дней,если спортсмен теряет 500 гр в день");
        System.out.println("Потребуется " + dayAverage + " дней,если спортсмен теряет 500 гр в день");

        //Задача8
        int salaryMashaInMonth1 = 67760;
        int salaryDenisInMonth1 = 83690;
        int salaryCristinaInMonth1 = 76230;
        byte pr = 10;
        byte month = 12;

        int salaryMashaInMonth2 = salaryMashaInMonth1 + salaryMashaInMonth1/pr;
        int salaryDenisInMonth2 = salaryDenisInMonth1 +salaryDenisInMonth1/pr;
        int salaryCristinaInMonth2 = salaryCristinaInMonth1 + salaryCristinaInMonth1/pr;

        int diffMashaInYear = salaryMashaInMonth2*month - salaryMashaInMonth1*month;
        int diffDenisInYear = salaryDenisInMonth2*month - salaryDenisInMonth1*month;
        int diffCristinaInYear = salaryCristinaInMonth2*month - salaryCristinaInMonth1*month;


        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " +salaryMashaInMonth2+ "рублей. Годовой доход вырос на " +diffMashaInYear+ " рублей»");
        System.out.println("Денис теперь получает " +salaryDenisInMonth2+ "рублей. Годовой доход вырос на " +diffDenisInYear+ " рублей»");
        System.out.println("Кристина теперь получает " +salaryCristinaInMonth2+ "рублей. Годовой доход вырос на " +diffCristinaInYear+ " рублей»");

    }
}