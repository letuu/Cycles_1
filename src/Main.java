public class Main {
    public static void main(String[] args) {

        System.out.println("Циклы. Часть 1");

        //1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ - 1");
        System.out.println("Задание 1");
        // С помощью цикла for выведите в консоль все числа от 1 до 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание 2");
        // С помощью цикла for выведите в консоль все числа от 10 до 1
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание 3");
        // Выведите в консоль все четные числа от 0 до 17
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n" + "Задание 3 - решение 2");
        for (int i = 0; i < 18; i += 2) {
            System.out.println(i);
        }

        System.out.println("\n" + "Задание 4");
        // Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();

        //222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ - 2");
        System.out.println("Задание 1");
        // Вывести все високосные года, начиная с 1904 года до 2096
        for (int i = 1904; i < 2097; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("\n" + "Задание 2");
        // Вывести в консоль 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Задание 3");
        // Вывести в консоль 1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        System.out.println();

        //3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ - 3");
        System.out.println("Задание 1");
        // Посчитайте сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей
        // Месяц … , сумма накоплений равна … рублей
        int monthMoney = 29000;
        int totalMoney = 0;
        for (int i = 0; i < 12; i++) {
            totalMoney = totalMoney + monthMoney;
            System.out.println("Месяц " + (i + 1) + ", сумма накоплений равна " + totalMoney + " рублей");
        }

        System.out.println("\n" + "Задание 2");
        // Сумму годовых накоплений, если каждый месяц ложить в банк по 29 000 рублей под проценты – 12% годовых
        int monthMoney2 = 29000;
        float totalMoney2 = 0f;
        for (int i = 1; i < 13; i++) {
            totalMoney2 = totalMoney2 + totalMoney2 / 100;
            totalMoney2 = totalMoney2 + monthMoney2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", totalMoney2) + " рублей");
        }
    }
}