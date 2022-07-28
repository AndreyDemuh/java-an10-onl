package Lesson05;

import java.util.Scanner;

public class HW_05_ArraysMulti {
    public static void main(String[] args) {

//        1. �������� ���������� ������ �� ����� �����. � ������� ������ ������� �� �����
//        ������� � ��������� ������ ������� �� �������� �����. ����� �����, �� ������� �����
//        ������������� ������ �������, �������� �� �������.
        System.out.println("���� �5, ������� �1");
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
        System.out.print("������� ����� �� ������� ����� ��������� �������� �������: ");
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

//        2. ��������� �����. �������� ��������� ��� ��������� ��������� ����� � �������
//        �����. ������������ ��������� ������ String �������� 8�8. � ������� ������ ������
//        ��������� �������� B (Black) ��� W (White).
        System.out.println("���� �5, ������� �2");
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

//       1. ��������� ���� ������. �������� ��� ������� ����� ����� �������� 3�3 (��� �������). ��������
//        ��������� ��� ��������� ���� ������.
//                �������� ������:
//        ������ ������ {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}}
//        ������ ������ {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}}
//        ���������: {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}}
        System.out.println("���� �5, �������������� �����, ������� �1");
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

//        2. �������� ��������� ������ ����� �����. �������� �� ������� ����� ���� ���������.
        System.out.println("���� �5, �������������� �����, ������� �2");
        int[][] array3 = {{2, 2, 2}, {2, 2, 2}};
        System.out.println("�������� ������:");
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
        System.out.println(sum + " - ����� ��������� �������");

//        3. �������� ��������� ������. �������� �� ������� ��������� �������.
        System.out.println("���� �5, �������������� �����, ������� �3");
        int[][] array4 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        for (int i = 0; i < array4.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array4[i].length; j++) {
                System.out.printf("%3d", array4[i][j]);
            }
            System.out.println(" }");
        }
        System.out.println("{" + array4[0][0] + " " + array4[1][1] + " " + array4[2][2] + " } " + " - ������ ���������");
        System.out.println("{" + array4[2][0] + " " + array4[1][1] + " " + array4[0][2] + " } " + " - ������ ���������");

//        4. �������� ��������� ������ ����� �����. ������������ �������� � ������� ���������� ������� ��
//        �����������.
        System.out.println("���� �5, �������������� �����, ������� �4");
        System.out.println("�������� ������");
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
        System.out.println("��������������� ������");
        for (int i = 0; i < array5.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array5[i].length; j++) {
                System.out.printf("%3d", array5[i][j]);
            }
            System.out.print(" }\n");
        }
    }
}














