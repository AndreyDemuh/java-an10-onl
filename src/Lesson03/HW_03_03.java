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
//      2.За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//      Напишите программу, в которую пользователь вводит сумму вклада и
//      колчиство месяцев. А банк вычисляет конечную сумму вклада с учетом
//      начисления процнетов за каждый месяц. Для вычисления суммы с учетом
//      процентов используйте цикл for.
//        int a1 - это сумма вклада
//        int b1 - это количество месяцев
//
        System.out.println("\n2.HomeWork Lesson 3, #2");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        float a1 = scn.nextFloat();
        System.out.println("Month: ");
        int b1 = scn.nextInt();
        for (int i = 1; i <= b1; i++) {
            float summa = (float) (a1 * 0.07) + a1;
            a1 = summa;
        }
        System.out.println("On your deposit: " + a1 + " $");
//      3.Напишите программу которая выводит в консоль таблицу умножения.

        System.out.println("\n3.HomeWork Lesson 3, #3");
        System.out.println(" ");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++)
                System.out.println(i + " * " + j + " = " + i * j + " ");
        }

    }
}

