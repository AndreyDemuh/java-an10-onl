package Lesson11.Part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayList_LinkedList {
    public static void main(String[] args) {
        final int size = 10000000;

        ArrayList<Integer> MyArrayList;
        LinkedList<Integer> MyLinkedList;

        //Создаем и заполняем ArrayList значениями
        MyArrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            MyArrayList.add(i);
        }
        System.out.println("Список ArrayList из " + size + " элементов заполнен");

        //Создаем и заполняем LinkedList значениями
        MyLinkedList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            MyLinkedList.add(i);
        }
        System.out.println("Список LinkedList из " + size + " элементов заполнен");

        //реализовываем необходимые методы
        long start1 = System.currentTimeMillis();
        System.out.println("\tДобавляем элемент в начало");
        MyArrayList.add(0);
        MyLinkedList.addFirst(0);
        long finishAddFirstAL = System.currentTimeMillis() - start1;
        long finishAddFirstLL = System.currentTimeMillis() - start1;
        System.out.println("\tВремя добавления элемента в начало ArrayList: " + finishAddFirstAL);
        System.out.println("\tВремя добавления элемента в начало LinkedList: " + finishAddFirstLL);

        long start2 = System.currentTimeMillis();
        System.out.println("Добавляем элемент в середину ");
        MyArrayList.add(MyArrayList.size() / 2);
        MyLinkedList.add(MyLinkedList.size() / 2);
        long finishAddMiddleAL = System.currentTimeMillis() - start2;
        long finishAddMiddleLL = System.currentTimeMillis() - start2;
        System.out.println("Время добавления элемента в середину ArrayList: " + finishAddMiddleAL);
        System.out.println("Время добавления элемента в середину LinkedList: " + finishAddMiddleLL);

        System.out.println("\tДобавляем элемент в конец");
        long start3 = System.currentTimeMillis();
        MyArrayList.add(MyArrayList.size());
        MyLinkedList.addLast(MyArrayList.size());
        long finishAddEndAL = System.currentTimeMillis() - start3;
        long finishAddEndLL = System.currentTimeMillis() - start3;
        System.out.println("\tВремя добавления элемента в конец ArrayList: " + finishAddEndAL);
        System.out.println("\tВремя добавления элемента в конец LinkedList: " + finishAddEndLL);

        System.out.println("Удаляем элемент с начала ");
        long start4 = System.currentTimeMillis();
        MyArrayList.remove(0);
        MyLinkedList.removeFirst();
        long finishRemoveFirstAL = System.currentTimeMillis() - start4;
        long finishRemoveFirstLL = System.currentTimeMillis() - start4;
        System.out.println("Время удаления элемента с начала ArrayList: " + finishRemoveFirstAL);
        System.out.println("Время удаления элемента с начала LinkedList: " + finishRemoveFirstLL);

        System.out.println("\tУдаляем элемент с середины");
        long start5 = System.currentTimeMillis();
        MyArrayList.remove(MyArrayList.size() / 2);
        MyLinkedList.remove(MyLinkedList.size() / 2);
        long finishRemoveMiddleAL = System.currentTimeMillis() - start5;
        long finishRemoveMiddleLL = System.currentTimeMillis() - start5;
        System.out.println("\tВремя удаления элемента с середины ArrayList: " + finishRemoveMiddleAL);
        System.out.println("\tВремя удаления элемента с середины LinkedList: " + finishRemoveMiddleLL);

        System.out.println("Удаляем элемент с конца ");
        long start6 = System.currentTimeMillis();
        MyArrayList.remove(MyArrayList.size()-1);
        MyLinkedList.removeLast();
        long finishRemoveEndAL = System.currentTimeMillis() - start6;
        long finishRemoveEndLL = System.currentTimeMillis() - start6;
        System.out.println("Время удаления элемента с конца ArrayList: " + finishRemoveEndAL);
        System.out.println("Время удаления элемента с конца LinkedList: " + finishRemoveEndLL);

        System.out.println("\tВзятие элемента по индексу с начала ");
        long start7 = System.currentTimeMillis();
        MyArrayList.get(0);
        MyLinkedList.get(0);
        long getIndexFirstAL = System.currentTimeMillis() - start7;
        long getIndexFirstLL = System.currentTimeMillis() - start7;
        System.out.println("\tВремя 'взятия' элемента по индексу с начала ArrayList: " + getIndexFirstAL);
        System.out.println("\tВремя 'взятия' элемента по индексу с начала LinkedList: " + getIndexFirstLL);

        System.out.println("Взятие элемента по индексу с середины ");
        long start8 = System.currentTimeMillis();
        MyArrayList.get(MyArrayList.size() / 2);
        MyLinkedList.get(MyLinkedList.size() / 2);
        long getIndexmiddleAL = System.currentTimeMillis() - start8;
        long getIndexmiddleLL = System.currentTimeMillis() - start8;
        System.out.println("Время 'взятия' элемента по индексу с середины ArrayList: " + getIndexmiddleAL);
        System.out.println("Время 'взятия' элемента по индексу с середины LinkedList: " + getIndexmiddleLL);

        System.out.println("\tВзятие элемента по индексу с конца ");
        long start9 = System.currentTimeMillis();
        MyArrayList.get(MyArrayList.size()-1);
        MyLinkedList.getLast();
        long getIndexEndAL = System.currentTimeMillis() - start9;
        long getIndexEndLL = System.currentTimeMillis() - start9;
        System.out.println("\tВремя 'взятия' элемента по индексу с конца ArrayList: " + getIndexEndAL);
        System.out.println("\tВремя 'взятия' элемента по индексу с конца LinkedList: " + getIndexEndLL);

        Scanner scn = new Scanner (System.in);
        System.out.println("Введите искомое число: ");
        long start10 = System.currentTimeMillis();
        int search = scn.nextInt();
        MyArrayList.equals(search);
        MyLinkedList.equals(search);
        long searchElementTimeAL = System.currentTimeMillis() - start10;
        long searchElementTimeLL = System.currentTimeMillis() - start10;
        System.out.println("Поиск выполнен за " + searchElementTimeAL);
        System.out.println("Поиск выполнен за " + searchElementTimeLL);

        }
}


