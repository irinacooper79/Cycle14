public class Main {
    public static void main(String[] args) {

        System.out.println("Cycle-1");

        System.out.println("Задание 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i <= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание 4");
        for (int i = 10; i <= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");

        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }

        System.out.println("Задание 9");
        int part = 29000;
        double sumWithPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sumWithPercent = (sumWithPercent + part) * (1 + percent);
            System.out.println("Месяц" + i + "сумма накоплений равна" + sumWithPercent + "рублей");
        }

        System.out.println("Задание 10");
        int cash = 29000;
        int totalSum = 0;
        int i = 0;
        while (totalSum <= 2459000) {
            totalSum += totalSum / 100;
            totalSum += cash;
            i++;
            System.out.println("Месяц" + i + "сумма накоплений равна" + total + "рублей");
        }

        System.out.println("Задание 11");
        int num = 1;
        while (num <= 10) {
            i++;
            System.out.println(num);
        }


        System.out.println("Задание 12");
        int people = 12000000;
        int newpeople = 17;
        int dadpeople = 8;
        int different = newpeople - dadpeople;
        for (int year = 1; year <= 10; year++) {
            people += people * different / 1000;
            System.out.println("Год" + i + "Численность населения состава" + people + "людей");
        }

        System.out.println("Задание 13");
        int bak = 15000;
        int allSumme = 12000000;
        i = 0;
        while (allSumme <= 12000000) {
            allSumme += allSumme * 0.07;
            allSumme += bak;
            i++;
            System.out.println("Месяц" + i + "Суммв накоплений равна" + allSumme + "рублей");
        }

        System.out.println("Задание 14");
        while (allSumme <= 12000000) ;
        allSumme += allSumme * 0.07;
        i++;
        if (i % 6 == 0) {
        }
            System.out.println("Месяц" + i + "Сумма накоплений равна" + allSumme + "рублей");
        }

        System.out.println("Задание 15");
        while (allSumme <= 12000000) {
            allSumme += allSumme * 0.07;
            allSumme += bak;
            i++;
            for (int a = 0; a <= 108; a++) {
                if (i % 6 == 0) {
                }
                System.out.println("Месяц" + i + "Сумма накоплений равна" + allSumme + "рублей");
            }

            System.out.println("Задание 16");
            int daysInSeptember = 31;
            int firstFriday = 5;
            for (int k = firstFriday; k <= daysInSeptember; k = k + 7) {
                if (firstFriday % 6 == 0) {
                }
                System.out.println("Сегодня пятница" + firstFriday + "Число необходимо подготовить отчет");
            }

            System.out.println("Задание 16");
            int start = 1822;
            int end = 2022;
            for (int year = 1822; year <= 2022; year += 79) {
                if (year % 79 == 0) {
                }
                System.out.println("Комета прилетела в этот год");
            }

            System.out.println("Задание 17");
            int x = 2;
            for (int k = 1; k <= 10; k++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.println(k + "х" + j + "=" + (k * j));
                }
            }
        }
    }
}