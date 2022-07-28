package Lesson05;

import java.util.Scanner;

public class HW_05_ArraysMulti {
    public static void main(String[] args) {

//        1. Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему
//        массиву и увеличить каждый элемент на заданное число. Пусть число, на которое будет
//        увеличиваться каждый элемент, задается из консоли.
        System.out.println("Урок №5, Задание №1");
        Scanner scn = new Scanner(System.in);
        int[][][] array = new int[3][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{");
                for (int k = 0; k < array[j].length; k++) {
                    System.out.printf("%4d", array[i][j][k]);
                }
                System.out.print(" } ");
            }
            System.out.println("|");
        }
        System.out.println("___________________________________________________");
        System.out.print("Введите число на которое будут увеличены элементы массива: ");
        int a = scn.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("{");
                for (int k = 0; k < array[j].length; k++) {
                    System.out.printf("%4d", array[i][j][k] + a);
                }
                System.out.print(" }");
            }
            System.out.println("|");
        }

//        2. Шахматная доска. Создайте программу для раскраски шахматной доски с помощью
//        цикла. Использовать двумерный массив String размером 8х8. С помощью циклов задать
//        элементам значения B (Black) или W (White).
        System.out.println("Урок №5, Задание №2");
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < chess[i].length; j++) {
                if ((i + j) % 2 == 0) chess[i][j] = "W";
                else chess[i][j] = "B";
                System.out.printf(chess[i][j] + " | ");
            }
            System.out.println("\n---------------------------------");
        }

//       1. Умножение двух матриц. Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите
//        программу для умножения двух матриц.
//                Тестовые данные:
//        первый массив {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
//        второй массив {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
//        результат: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}}
        System.out.println("Урок №5, дополнительная часть, задание №1");
        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] arrayMulti = new int[arrayOne.length][arrayTwo[0].length];

        for (int i = 0; i < arrayMulti[0].length; i++)
            for (int j = 0; j < arrayMulti.length; j++)
                for (int k = 0; k < arrayOne[0].length; k++)
                    arrayMulti[i][j] = arrayMulti[i][j] + arrayOne[i][k] * arrayTwo[k][j];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[0].length; j++) {
                System.out.print(" " + arrayMulti[i][j] + " ");
            }
            System.out.println();
        }

//        2. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов.
        System.out.println("Урок №5, дополнительная часть, задание №2");
        int[][] array3 = {{2, 2, 2}, {2, 2, 2}};
        System.out.println("исходный массив:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array3[i].length; j++) {
                System.out.printf("%3d", array3[i][j]);
            }
            System.out.println(" }");
        }
        int sum = 0;

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                sum += array3[i][j];
            }
        }
        System.out.println(sum + " - сумма элементов массива");

//        3. Создайте двумерный массив. Выведите на консоль диагонали массива.
        System.out.println("Урок №5, дополнительная часть, задание №3");
        int[][] array4 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        for (int i = 0; i < array4.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array4[i].length; j++) {
                System.out.printf("%3d", array4[i][j]);
            }
            System.out.println(" }");
        }
        System.out.println("{" + array4[0][0] + " " + array4[1][1] + " " + array4[2][2] + " } " + " - первая диагональ");
        System.out.println("{" + array4[2][0] + " " + array4[1][1] + " " + array4[0][2] + " } " + " - вторая диагональ");

//        4. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по
//        возрастанию.
        System.out.println("Урок №5, дополнительная часть, задание №4");
        System.out.println("Исходный массив");
        int[][] array5 = new int[3][3];
        for (int i = 0; i < array5.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d", array5[i][j]);
            }
            System.out.print(" }\n");
        }
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array5.length; i++) {
                for (int j = 0; j < array5[i].length-1; j++) {
                    if (array5[i][j] > array5[i][j + 1]) {
                        temp = array5[i][j];
                        array5[i][j] = array5[i][j + 1];
                        array5[i][j + 1] = temp;
                        isSorted = false;
                    }
                }
            }
        }
        System.out.println("Отсортированный массив");
        for (int i = 0; i < array5.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array5[i].length; j++) {
                System.out.printf("%3d", array5[i][j]);
            }
            System.out.print(" }\n");
        }
    }
}














