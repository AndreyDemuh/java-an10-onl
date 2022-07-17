package Lesson03;

import java.util.Scanner;

public class HW_03_01 {
    public static void main(String[] args) {

//  1.Написать программу для вывода времени года по номеру месяца.
//      Реализация через if-else-if. Вводим месяц с консоли.
        System.out.println("1.HomeWork Lesson 3, #1.1");
        System.out.println("Write the number of the month of the year: ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a == 12 || (a >= 1 && a <= 2)) {
            System.out.println("Winter");
        } else if (a >= 3 && a <= 5) {
            System.out.println("Spring");
        } else if (a >= 6 && a <= 8) {
            System.out.println("Summer");
        } else if (a >= 9 && a <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong number");
        }

        //    Реализация через switch-case. Явно задаем номер месяца
        System.out.println("1.HomeWork Lesson 3, #1.2");
        int season = 5;
        switch (season) {
            case (1):
                System.out.println("Winter");
                break;
            case (2):
                System.out.println("Winter");
                break;
            case (3):
                System.out.println("Spring");
                break;
            case (4):
                System.out.println("Spring");
                break;
            case (5):
                System.out.println("Spring");
                break;
            case (6):
                System.out.println("Summer");
                break;
            case (7):
                System.out.println("Summer");
                break;
            case (8):
                System.out.println("Summer");
                break;
            case (9):
                System.out.println("Autumn");
                break;
            case (10):
                System.out.println("Autumn");
                break;
            case (11):
                System.out.println("Autumn");
                break;
            case (12):
                System.out.println("Winter");
                break;
            default:
                System.out.println("Wrong number");
        }

        //2. Напишите программу, которая будет принимать на вход число,
        //а на выходе выводить сообщение о четности числа.
        System.out.println("2.HomeWork Lesson 3, #2");
        System.out.println("Write the number");
        int number = scn.nextInt();
        if (number % 2 == 0) {
            System.out.println("My number " + number + " - Number is even");
        } else {
            System.out.println("My number " + number + " - Number is not even");
        }

//      3.Для числа t вывести "Тепло", "Нормально", "Холодно",
//      если t>15, если t<=15 и t>-5, если t<=-5 соответственно
        System.out.println("3.HomeWork Lesson 3, #3");
        System.out.println("Write the t: ");
        int t = scn.nextInt();
        if (t > 15) {
            System.out.println("teplo");
        } else if (t <= 15 && t > -5) {
            System.out.println("norm");
        } else if (t <= -5) {
            System.out.println("xolodno");
        } else {
            System.out.println("uncorrect t");
        }

//      4. ПО введеному ноиеру определить цвет радуги
        System.out.println("4.HomeWork Lesson 3, #4");
        System.out.println("Write the № color: ");
        int color = scn.nextInt();
        switch (color) {
            case (1):
                System.out.println("Krasniy");
                break;
            case (2):
                System.out.println("Oranjeviy");
                break;
            case (3):
                System.out.println("Jeltiy");
                break;
            case (4):
                System.out.println("Zeleniy");
                break;
            case (5):
                System.out.println("Golyboy");
                break;
            case (6):
                System.out.println("Siniy");
                break;
            case (7):
                System.out.println("Fioletoviy");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}

