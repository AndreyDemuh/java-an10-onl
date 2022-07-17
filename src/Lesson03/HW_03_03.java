package Lesson03;

import java.util.Scanner;

public class HW_03_03 {
    public static void main(String[] args) {

//  1.Выведите на экран первые 11 членов последовательности Фибоначчи.
        System.out.println("1.HomeWork Lesson 3, #1");
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= 11; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
//      1.За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//      Напишите программу, в которую пользователь вводит сумму вклада и
//      колчиство месяцев. А банк вычисляет конечную сумму вклада с учетом
//      начисления процнетов за каждый месяц. Для вычисления суммы с учетом
//      процентов используйте цикл for.
//        int a1  это сумма вклада
//        int b1  это количество месяцев
//
        System.out.println("\n2.HomeWork Lesson 3, #2");
        Scanner scn = new Scanner(System.in);
        System.out.println("BBedite summy vklada: ");
        float a1 = scn.nextFloat();
        System.out.println("BBedite kol-Bo mesyacev: ");
        int b1 = scn.nextInt();
        for (int i = 1; i <= b1; i++) {
            float summa = (float) (a1 * 0.07) + a1;
            System.out.println("Cymma scheta 3a " + i + " mesyaceB " + summa + " $");
            a1 = summa;
        }
//        1.Напишите программу которая выводит в консоль таблицу умножения.

        System.out.println("\n3.HomeWork Lesson 3, #3");
        System.out.println("1 BAPIAHT");
        System.out.println(" ");
        System.out.println("  | 1  2   3   4   5  6  7  8  9   10");
        System.out.println(" _____________________________________");
        System.out.println("1 | 1  2   3   4   5  6  7  8  9   10");
        System.out.println("2 | 2  4   6   8   10 12 14 16 18  20");
        System.out.println("3 | 3  6   9   12  15 18 21 24 27  30");
        System.out.println("4 | 4  8   12  16  20 24 28 32 36  40");
        System.out.println("5 | 5  10  15  20  25 30 35 40 45  50");
        System.out.println("6 | 6  12  18  24  30 36 42 48 54  60");
        System.out.println("7 | 7  14  21  28  35 42 49 56 63  70");
        System.out.println("8 | 8  16  24  32  40 48 56 64 72  80");
        System.out.println("9 | 9  18  27  36  45 54 63 72 81  90");
        System.out.println("10| 10  20  30  40 50 60 70 80 90 100");

        System.out.println("2 BAPIAHT");
        System.out.println(" ");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++)
                System.out.println(i + " * " + j + " = " + i * j + " ");
        }

    }
}

