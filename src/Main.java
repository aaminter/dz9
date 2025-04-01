import java.awt.geom.Arc2D;

public class Main {
    public static void main(String[] args) {
        System.out.println("Home work 9");

        System.out.println();
        System.out.println("Задание 1");
        int sum = 0;
        int amount = 15_000;
        double percent = 10 / 100;
        int month = 0;
        while (sum < 2_459_000) {
            sum += amount;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + "рублей");
        }

        System.out.println();
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задание 3");
        int fullPeople = 12_000_000;
        int years = 10;
        int plusPeople = 0;
        int minusPeople = 0;
        for (; i <= years; i++) {
            plusPeople = (fullPeople / 1000) * 17;
            minusPeople = (fullPeople / 1000) * 8;
            fullPeople -= minusPeople;
            fullPeople += plusPeople;
            System.out.println("Год " + i + ", численность населения составляет " + fullPeople + " человек");
        }


        System.out.println();
        System.out.println("Задание 4");
        percent = 70 / 100;
        sum = amount;
        month = 0;
        while (sum < 12000000) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }


        System.out.println();
        System.out.println("Задание 5");
        float summm = 15000f;
        int ittt = 0;
        int countMon = 0;
        while (summm < 12000000) {
            countMon++;
            if (ittt > 11)
                ittt = 0;
            float per = (summm / 100) * 7;
            summm += per;
            if (countMon % 6 == 0)
                System.out.println(countMon + ") " + ittt+1 + ", сумма: " + (int) summm);
        }
        System.out.println("\nВсего " + countMon + " месяцев");


        System.out.println();
        System.out.println("Задание 6");
        float su = 15000f;
        int countMo = 0;
        int year = 9;
        while (countMo < year * 12) {
            countMo++;
            float per = (su / 100) * 7;
            su += per;
            if (countMo % 6 == 0)
                System.out.println(countMo + ") сумма: " + (int) su);
        }
        System.out.println("\nВсего " + countMo + " месяцев, общая сумма: " + (int) su + " рублей");


        System.out.println();
        System.out.println("Задание 7");
        int nextInt = 7;
        int currentDay = nextInt + 1;
        while (currentDay < 31) {
            System.out.println("Сегодня пятница," + currentDay + "-е число. Необходимо подготовить отчет");
            currentDay += 7;
        }


        System.out.println();
        System.out.println("Задание 8");
        int tmp = 79;
        int minYear = 1825;
        int maxYear = 2125;
        for (int ii = minYear; ii < maxYear; ii++) {
            if (ii % tmp == 0)
                System.out.println(ii);
        }
    }
}

