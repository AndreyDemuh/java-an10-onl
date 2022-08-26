package Lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//    Домашнее задание. Часть #1
//    1. Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
//    входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
//    (класс Scanner).
//        System.out.println("Урок №4, Задание №1");
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scn.nextInt();
        boolean b = false;
        int[] arr1 = new int[]{4, 2, 3, 74, -32, 903, 12};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == a)
                b = true;
        }
        System.out.println(b ? a + " - есть в миссиве" : a + " - нет в массиве");

//   2.Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
//   число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
//   об этом.
        System.out.println("\nУрок №4, Задание №2");
        int[] arr2 = new int[]{6, 34, 267, 57, 6, 18, 4, 56, 6, 1};

        System.out.println("Source array " + Arrays.toString(arr2));
        System.out.print("Write the number for delete: ");

        int deleteNumber = scn.nextInt();
        int sizeNewArray;
        int countSizeNewArray = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == deleteNumber) {
                countSizeNewArray++;
            }
        }
        sizeNewArray = arr2.length - countSizeNewArray;
        int[] newArray = new int[sizeNewArray];
        int indexNewArray = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != deleteNumber) {
                newArray[indexNewArray] = arr2[i];
                indexNewArray++;
            }
        }
        if (countSizeNewArray == 0) {
            System.out.println("The number " + deleteNumber + " is not in the array");
        } else {
            System.out.println(Arrays.toString(newArray));

        }


//        3.Создайте и заполните массив случайными числами и выведите минимальное,
//        максимальное и среднее значение. Для генерации случайного числа используйте метод
//        Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
//        размер массива вводится с консоли.
        System.out.println("\nУрок №4, Задание №3");
        System.out.print("Enter the length of the array: ");
        int sizeArray = scn.nextInt();
        int[] arr4 = new int[sizeArray];
        int min = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = ((int) (Math.random() * 10) + 5);
            System.out.println(Arrays.toString(arr4));
            sum += arr4[i];
            max = arr4[0];
            min = arr4[0];
        }
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max)
                max = arr4[i];
            if (arr4[i] < min)
                min = arr4[i];
        }
        System.out.println("Max = " + max + ", Min = " + min + ", Sum = " + sum);

//        4.Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
//        из массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).
        System.out.println("\nУрок №4, Задание №4");
        int[] oneArr = {1, 2, 3, 4, 10};
        int[] twoArr = {2, 3, 4, 8, 6};
        int sumOne = 0;
        int sumTwo = 0;
            System.out.println(Arrays.toString(oneArr));
            System.out.println(Arrays.toString(twoArr));

        for (int i = 0; i < oneArr.length; i++) {
            sumOne += oneArr[i];
            sumTwo += twoArr[i];
            }
        int avgOneArr = sumOne / 5;
        int avgTwoArr = sumTwo / 5;
            System.out.println(avgOneArr); //- вывел ср.арифметическое с целью собственной проверки
            System.out.println(avgTwoArr); //
            if (avgOneArr > avgTwoArr) {
                System.out.println("Среднее арифметическое элементов первого массива больше");
            } else if (avgOneArr < avgTwoArr) {
                System.out.println("Среднее арифметическое элементов второго массива больше");
            } else {
                System.out.println("Среднее арифметическое элементов двух массивов равны");
            }
    }
}













