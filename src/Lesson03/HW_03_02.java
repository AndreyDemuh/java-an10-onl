package Lesson03;

import java.util.Scanner;

public class HW_03_02 {
    public static void main(String[] args) {
//      1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        System.out.println("1.HomeWork Lesson 3, #1");
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

//      2. При помощи цикла for вывести на экран числа от 15 до 1.
        System.out.println(" ");
        System.out.println("2.HomeWork Lesson 3, #2");
        for (int i = 15; i > 0; i--) {
            System.out.print(i + " ");
        }

//      3.Напишите программу, где пользователь вводит любое целое
//      положительное число N. Программа суммирует все числа от 1 до N.
//      Для ввода числа исользовать класс Scanner.
        System.out.println(" ");
        System.out.println("3.HomeWork Lesson 3, #3");
        System.out.print("Write the number: ");
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int summa = 0;
        for (int i = 0; i <= N; i++) {
            summa += i;
            System.out.print(summa + " ");
        }

//      4.Напишите программу, которая будет выводить на экран
//      такую последовательность 7, 14, 21, 28, 35, 42, 49, 56, 63,
//      70, 77, 84, 91, 98. В решении использовать цикл while.
        System.out.println(" ");
        System.out.print("4.HomeWork Lesson 3, #4\n");
        int a = 7;
        while (a < 100) {
            System.out.print(a + " ");
            a = a + 7;
        }

//      5.Вывести 10 первых чисел последовательности 0, -5, -10, -15 .....
        System.out.println("\n5.HomeWork Lesson 3, #5");
//        int b = 0;
//        while (b < -50) ;
//        System.out.print(b + " ");
//        b = b - 5;
        for (int i = 0; i > -50 ; i--) {
            if(i % 5==0){
                System.out.print(i + " ");
            }
        }
//      6. Составьте программу, выводящую на экран
//      квадраты чисел от 10 до 20 включительно.
        System.out.println("\n6.HomeWork Lesson 3, #6");
        for (int i = 10; i <= 20; i++) {
            int square = i*i;
            System.out.print(square + " ");
        }
 }
}
