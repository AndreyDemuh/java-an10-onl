package Lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class HW_04_Array {
    public static void main(String[] args) {
//    �������� �������. ����� #1
//    1. �������� ������ ����� �����. �������� ���������, ������� ������� ��������� � ���,
//    ������ �� �������� ����� � ������ ��� ���. ����� ����� ��� ������ �������� � �������
//    (����� Scanner).
        System.out.println("���� �4, ������� �1");
        Scanner scn = new Scanner(System.in);
        System.out.print("������� �����: ");
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
        System.out.println(b ? searchInt + " - ���� � �������" : searchInt + " - ��� � �������");

//   2.�������� ������ ����� �����. ������� ��� ��������� ��������� ����� �� �������. �����
//   ����� �������� � ������� (����� Scanner). ���� ������ ����� ��� � �������� ���������
//   �� ����.
        System.out.println("\n���� �4, ������� �2");
        int[] arr2 = new int[]{6, 34, 267, 57, 6, 18, 4, 56, 6, 1};

        System.out.println("�������������� ������ - " + Arrays.toString(arr2));
        System.out.print("������� �����, ������� ���������� ������� �� �������: ");

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
            System.out.println("����� " + deleteNumber + " ����������� � �������");
        } else {
            System.out.println(Arrays.toString(newArray) + " - ����������������� ������ (�������� ����� �������)");
        }
//        3.�������� � ��������� ������ ���������� ������� � �������� �����������,
//        ������������ � ������� ��������. ��� ��������� ���������� ����� ����������� �����
//        Math.random(). ����� ����� ����������� ��������� ������ ������������� �������. �����
//        ������ ������� �������� � �������.
        System.out.println("\n���� �4, ������� �3");
        System.out.print("������� ������ �������: ");
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

//        4.�������� 2 ������� �� 5 �����. �������� ������� �� ������� � ���� ��������� �������.
//        ���������� ������� �������������� ��������� ������� ������� � ��������, ��� ������
//        �� �������� ��� �������� ��������� ������ (���� ��������, ��� �� �������
//        �������������� �����).
        System.out.println("\n���� �4, ������� �4");
        int[] oneArr = {1, 2, 3, 4, 10};
        int[] twoArr = {2, 3, 4, 8, 6};
        int sumOne = 0;
        int sumTwo = 0;
        System.out.println(Arrays.toString(oneArr)+ " - ������ ������");
        System.out.println(Arrays.toString(twoArr)+ " - ������ ������");

        for (int i = 0; i < oneArr.length; i++) {
            sumOne += oneArr[i];
            sumTwo += twoArr[i];
        }
        int avgOneArr = sumOne / 5;
        int avgTwoArr = sumTwo / 5;
        System.out.println(avgOneArr + " - ������� �������������� ������� �������");
        System.out.println(avgTwoArr + " - ������� �������������� ������� �������");
        if (avgOneArr > avgTwoArr) {
            System.out.println("������� �������������� ��������� ������� ������� ������.");
        } else if (avgOneArr < avgTwoArr) {
            System.out.println("������� �������������� ��������� ������� ������� ������.");
        } else {
            System.out.println("������� �������������� ��������� ���� �������� �����.");
        }

//      1. �������� ������ �� N-��������� ����� ����� � �������� ��� �� �����. ������ ������� �����
//      �������� � ������� � ������ ������� ����� ���� ������ 5 � ������ ��� ����� 10. ���� N ��
//      ������������� �������� � �������� ���������. ���� ������������ ���� ������������ N, ��
//      ��������� ������ ������� ������������ ��������� ����. �������� ������ ������ ������ �� ������
//      ��������� ������� �������, ���� ��� ��� ����, � �������� e�� �� �����.
        System.out.println("\n���� �4, �������������� �����, ������� �1");
        System.out.print("������� ������ �������: ");
        int size = scn.nextInt();
        while (size < 5 || size >10) {
            System.out.print("������ �������� ������ �������, ��������� ����:");
            size = scn.nextInt();
            }
            System.out.println("������ ������� - " + size );

            int[] arr5 = new int[size];
            int even = 0;
            for (int i = 0; i < size; i++) {
                arr5[i] = ((int) (Math.random() * 20) + 11);
                if (arr5[i] % 2 == 0) {
                    even++;
                }
            }
            System.out.println(Arrays.toString(arr5) + " - c�������� ������");
            if (even == 0) {
                System.out.println("� ������� ��� ������ �����");
            } else {
                int[] arr6 = new int[even];
                int indexArr2 = 0;
                for (int i = 0; i < size; i++) {
                    if (arr5[i] % 2 == 0) {
                        arr6[indexArr2] = arr5[i];
                        indexArr2++;
                    }
                }
                System.out.println(Arrays.toString(arr6) + " - ����������������� ������ (������ � ������� ����������)");
            }

//      2. �������� ������ � ��������� ���. �������� ������ �� ����� � ������. �������e ������ ������� �
//      �������� �������� �� 0. ����� �������� ������ �� ����� �� ��������� ������.
            System.out.println("\n���� �4, �������������� �����, ������� �2");
            int[] arr7 = {6, 7, 83, 25, 16, 3, 28};
            System.out.println(Arrays.toString(arr7) + " - �������������� ������");
            for (int i = 0; i < arr7.length; i++) {
                if (i % 2 != 0) {
                    arr7[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr7) + " - ����������������� ������ (�������� ������� ����� 0)");

//      3. �������� ������ �����. ��������� ��� ������������� ������� �����. ������������ ������.
//      ��������� �������� �� �������.
            System.out.println("\n���� �4, �������������� �����, ������� �3");
            String[] ArrayString = {"Helen", "Jack", "Ivan", "David", "Agneshka", "Bob"};
            Arrays.sort(ArrayString);
            System.out.println(Arrays.toString(ArrayString));

//      4. ���������� �������� ���������� ���������, ���������� ����������� �� ������ ����.
            System.out.println("\n���� �4, �������������� �����, ������� �4");
            int[] arr8 = new int[]{5, 9, 6, 2, 3, 1, 4, 8, 7};
            // - ���������������� ������ ������� ���������� �������������
            System.out.println(Arrays.toString(arr8) + " - �������� ������");
            // ������� ��������� ������ � �������
            boolean isSorted = false;
            // ������ �������������� ���������� ������� ����� ���������� ���� ���������� ���� �� ����� ������������ ���� ������.
            int temp;
            // ��� ���� �������������� (���������) ���������, ������� ��� ����, ��� �� �� ����� ��������
            // ������� ������������ ��������
            while (!isSorted) {
                //������� ����, ������� ����� �������� �� ��� ��� ���� �� ����������� ���� ������.
                isSorted = true;
                // ����������� �������� ����������. � ����� �����, ���� ����� ����� ���� ���������,
                // �� �� ������ ������� �� false � ���������� ����������.
                for (int i = 0; i < arr8.length - 1; i++) {
                    //������� ��� ���� ����, ������� ����� ��������� ������ ������� ������� � ������ �� ���� ���������.
                    if (arr8[i] > arr8[i + 1]) {
                        //����� ��������� ������� ��� �� ������� ����������� � ������ �� ���� ��������� �� �����������.
                        temp = arr8[i];
                        // ���� ������� ���������� ����� �����������, ����� ����������� ����� "���������" ���������� �������� i-���� �������� �������.
                        arr8[i] = arr8[i + 1];
                        //� �������� i-���� �������� ���������� � ����� (�� ��������� �� ������� ������).
                        arr8[i + 1] = temp;
                        // �������� ������ ������ ������� ����� �� �������,����� ������� ������ �������� ������� �������.
                        isSorted = false;
                        //�.�. ������� ���������� ����������, �.�. ���� ���������, ����� ����������� �������� false
                        // � ���������� ���� ���� ���� ������ �� ����� ������������.
                        // ����������  isSorted = true ������� � ��� ��� ���� while ��������, �������������� ������ ������������.
                    }
                }
                System.out.println(Arrays.toString(arr8));
                // ������� � ������� ��������������� ������
            }

        }
    }
