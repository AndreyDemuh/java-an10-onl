package Lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class HW_04_Array {
    public static void main(String[] args) {
//    Домашнее задание. Часть #1
//    1. Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,
//    входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
//    (класс Scanner).
        System.out.println("Урок №4, Задание №1");
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int searchInt = scn.nextInt();
        boolean b = false;
        int[] arr1 = new int[]{4, 2, 3, 74, -32, 903, 12};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == searchInt){
                b = true;
                break;
                }
        }
        System.out.println(b ? searchInt + " - есть в массиве" : searchInt + " - нет в массиве");

//   2.Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть
//   число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
//   об этом.
        System.out.println("\nУрок №4, Задание №2");
        int[] arr2 = new int[]{6, 34, 267, 57, 6, 18, 4, 56, 6, 1};

        System.out.println("Первоначальный массив - " + Arrays.toString(arr2));
        System.out.print("Введите число, которое необходимо удалить из массива: ");

        int deleteNumber = scn.nextInt();
        int countSizeNewArray = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == deleteNumber) {
                countSizeNewArray++;
            }
        }
        int[] newArray = new int[arr2.length - countSizeNewArray];
        int indexNewArray = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != deleteNumber) {
                newArray[indexNewArray] = arr2[i];
                indexNewArray++;
            }
        }
        if (countSizeNewArray == 0) {
            System.out.println("Число " + deleteNumber + " отсутствует в массиве");
        } else {
            System.out.println(Arrays.toString(newArray) + " - отформатированный массив (заданное число удалено)");
        }
//        3.Создайте и заполните массив случайными числами и выведите минимальное,
//        максимальное и среднее значение. Для генерации случайного числа используйте метод
//        Math.random(). Пусть будет возможность создавать массив произвольного размера. Пусть
//        размер массива вводится с консоли.
        System.out.println("\nУрок №4, Задание №3");
        System.out.print("Введите размер массива: ");
        int sizeArray = scn.nextInt();
        int[] arr4 = new int[sizeArray];
        int min = 0;
        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = ((int) (Math.random() * 10) + 5);
            sum += arr4[i];
            max = arr4[0];
            min = arr4[0];
        }
        System.out.println(Arrays.toString(arr4));
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
        System.out.println(Arrays.toString(oneArr)+ " - первый массив");
        System.out.println(Arrays.toString(twoArr)+ " - второй массив");

        for (int i = 0; i < oneArr.length; i++) {
            sumOne += oneArr[i];
            sumTwo += twoArr[i];
        }
        int avgOneArr = sumOne / 5;
        int avgTwoArr = sumTwo / 5;
        System.out.println(avgOneArr + " - среднее арифметическое первого массива");
        System.out.println(avgTwoArr + " - среднее арифметическое второго массива");
        if (avgOneArr > avgTwoArr) {
            System.out.println("Среднее арифметическое элементов первого массива больше.");
        } else if (avgOneArr < avgTwoArr) {
            System.out.println("Среднее арифметическое элементов второго массива больше.");
        } else {
            System.out.println("Среднее арифметическое элементов двух массивов равны.");
        }

//      1. Создайте массив из N-случайных целых чисел и выведите его на экран. Размер массива пусть
//      задается с консоли и размер массива может быть больше 5 и меньше или равно 10. Если N не
//      удовлетворяет условиям – выведите сообщение. Если пользователь ввел неподходящее N, то
//      программа должна просить пользователя повторить ввод. Создайте второй массив только из четных
//      элементов первого массива, если они там есть, и выведите eго на экран.
        System.out.println("\nУрок №4, дополнительная часть, задание №1");
        System.out.print("Введите размер массива: ");
        int size = scn.nextInt();
        while (size < 5 || size >10) {
            System.out.print("Введен неверный размер массива, повторите ввод:");
            size = scn.nextInt();
            }
            System.out.println("размер массива - " + size );

            int[] arr5 = new int[size];
            int even = 0;
            for (int i = 0; i < size; i++) {
                arr5[i] = ((int) (Math.random() * 20) + 11);
                if (arr5[i] % 2 == 0) {
                    even++;
                }
            }
            System.out.println(Arrays.toString(arr5) + " - cозданный массив");
            if (even == 0) {
                System.out.println("В массиве нет четных чисел");
            } else {
                int[] arr6 = new int[even];
                int indexArr2 = 0;
                for (int i = 0; i < size; i++) {
                    if (arr5[i] % 2 == 0) {
                        arr6[indexArr2] = arr5[i];
                        indexArr2++;
                    }
                }
                System.out.println(Arrays.toString(arr6) + " - отредактированный массив (только с четными элементами)");
            }

//      2. Создайте массив и заполните его. Выведите массив на экран в строку. Заменитe каждый элемент с
//      нечетным индексом на 0. Снова выведите массив на экран на отдельной строке.
            System.out.println("\nУрок №4, дополнительная часть, задание №2");
            int[] arr7 = {6, 7, 83, 25, 16, 3, 28};
            System.out.println(Arrays.toString(arr7) + " - первоначальный массив");
            for (int i = 0; i < arr7.length; i++) {
                if (i % 2 != 0) {
                    arr7[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr7) + " - отформатированный массив (нечетные индексы равны 0)");

//      3. Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив.
//      Результат выведите на консоль.
            System.out.println("\nУрок №4, дополнительная часть, задание №3");
            String[] ArrayString = {"Helen", "Jack", "Ivan", "David", "Agneshka", "Bob"};
            Arrays.sort(ArrayString);
            System.out.println(Arrays.toString(ArrayString));

//      4. Реализуйте алгоритм сортировки пузырьком, проставляя комментарии на каждом шаге.
            System.out.println("\nУрок №4, дополнительная часть, задание №4");
            int[] arr8 = new int[]{5, 9, 6, 2, 3, 1, 4, 8, 7};
            // - инициализировали массив который необходимо отсортировать
            System.out.println(Arrays.toString(arr8) + " - исходный массив");
            // выводим созданный массив в консоль
            boolean isSorted = false;
            // вводим дополнительную переменную которая будет продолжать цикл сортировки пока не будет отсортирован весь массив.
            int temp;
            // еще одна дополнительная (резервная) переменая, введена для того, что бы мы могли поменять
            // местами сравниваемые элементы
            while (!isSorted) {
                //создаем цикл, который будет работать до тех пор пока не отсортируем весь массив.
                isSorted = true;
                // присваиваем значение переменной. в конце цикла, если будет какое либо изменение,
                // мы ее меняем обратно на false и продолжаем сортировку.
                for (int i = 0; i < arr8.length - 1; i++) {
                    //создаем еще один цикл, который будет проверять каждый элемент массива с правым от себя элементом.
                    if (arr8[i] > arr8[i + 1]) {
                        //здесь прописали условие что бы элемент сравнивался с правым от себя элементом по возрастанию.
                        temp = arr8[i];
                        // если условие вложенного цикла выполняется, сразу присваиваем нашей "резервной" переменной значение i-того элемента массива.
                        arr8[i] = arr8[i + 1];
                        //в значение i-того элемента перемещаем в право (на следующую по порядку ячейку).
                        arr8[i + 1] = temp;
                        // значение правой ячейки смещаем левее по массиву,таким образом меняем элементы массива местами.
                        isSorted = false;
                        //т.к. условие сортировки вполнилось, т.е. было изменение, опять присваиваем значение false
                        // и продолжаем цикл пока весь массив не будет отсортирован.
                        // переменная  isSorted = true говорит о том что цикл while выполнен, соответственно массив отсортирован.
                    }
                }
                System.out.println(Arrays.toString(arr8));
                // выводим в консоль отсортированный массив
            }

        }
    }
