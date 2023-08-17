public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", cумма накоплений равнв " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int fertility1_000 = fertility - mortality;
        int fertility1_000_000 = fertility1_000 * 1000;
        System.out.println(fertility1_000_000);
        for (int i = 2010; i < 2021; i++) {
            population = population + fertility1_000_000;
            System.out.println("Год " + i + ", численность населения составляет " + population + ".");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum1 = 15000;
        int total = 0;
        int sum = 12_000_000;
        for (int i = 1; i < 61; i++) {
            total = total + total * 7 / 100;
            total = total + sum1;
            System.out.println("Месяц " + i + " - сумма накопления " + total + ".");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum1 = 15000;
        int total = 0;
        int sum = 12_000_000;
        for (int i = 1; i < 61; i++) {
            total = total + total * 7 / 100;
            total = total + sum1;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " - сумма накопления " + total + ".");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum1 = 15000;
        int total = 0;
        for (int i = 1; i <= 108; i++) {
            total = total + total * 7 / 100;
            total = total + sum1;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + " - сумма накопления " + total + ".");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int number = 1;
        for (int i = 1; i < 32; i++) {
            if (i % 7 == 0)
                System.out.println("Сегодня пятница, " + i + " - е число. Необходимо сдать отчет.");
            if (number != 1)
                System.out.println("Не пятница");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        for (int i = 1823; i < 2123; i++) {
            if (i % 79 == 0)
                System.out.println(i);
        }
    }
}

