package Lesson10.HW10_part_01;

import Lesson10.HW10_part_01.Exceptions.MyException3;

import static Lesson10.HW10_part_01.Exceptions.MyException1.exception1;
import static Lesson10.HW10_part_01.Exceptions.MyException2.exception2;
import static Lesson10.HW10_part_01.HW10_part_01WorkPlace.*;
import static Lesson10.HW10_part_01.Exceptions.MyException3.exception3;


public class HW10_part_01_Main {
    public static void main(String[] args) throws MyException3 {

//        Написать программу со следующим функционалом:
//        На вход передать строку (будем считать, что это номер документа).
//        Номер документа имеет формат "xxxx-yyy-xxxx-yyy-xyxy", где x — это число, а y — это буква.
        String s1 = "2022-doc-1708-jav-1A4B";
        System.out.println(s1 + " - исходная строка");

//        Вывести на экран в одну строку два первых блока по 4 цифры.
        task1(s1);
//        Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *)
        task2(s1);
//        Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        task3(s1);
//        Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
        task4(s1);
//        Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
//        (причем, abc и ABC считается одинаковой последовательностью).
        task5(s1);
//        Проверить начинается ли номер документа с последовательности 555.
        task6(s1);
//        Проверить заканчивается ли номер документа на последовательность 1a2.
        task7(s1);

//        Во всех методах исключений заложил ошибку, которая проверят длинну исходной строки с длинной строки которую хотим найти
//        Метод исключений проверяющий содержит ли номер документа последовательность abc
        System.out.println("------------------------------------------------------");
        exception1(s1, "abc");
//        Метод исключений проверяющий начинается ли номер документа с последовательности 555.
        System.out.println("------------------------------------------------------");
        exception2(s1, "555");
//        Метод исключений проверяющий заканчивается ли номер документа на последовательность 1a2b
        System.out.println("------------------------------------------------------");
        exception3(s1, "dfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdf");
    }
}