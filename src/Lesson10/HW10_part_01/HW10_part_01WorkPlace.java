package Lesson10.HW10_part_01;

public class HW10_part_01WorkPlace {

//       Метод который выводит на экран в одну строку два первых блока по 4 цифры.
    public static void task1(String s1) {
        System.out.println(s1.substring(0, 4) + " " + s1.substring(9, 13));
    }
//        Метод выводит на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *)
    public static void task2(String s1) {
        System.out.println(s1.replaceAll("\\D{3}\\S", "-***"));
    }

//        Метод выводит на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    public static void task3(String s1) {
        String s2 = s1.replace("2022-", "");
        String s3 = s2.replace("-1708-", "/");
        String s4 = s3.replace("-1", "/");
        String s5 = s4.replace("4", "/");
        System.out.println(s5.toLowerCase());
    }
//        Метод выводит на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
    public static void task4(String s1) {
        StringBuilder sb1 = new StringBuilder("2022-doc-1708-jav-1A4B");
        sb1.delete(0, 5);
        sb1.replace(3, 9, "/");
        sb1.replace(0, 3, "DOC");
        sb1.replace(7, 9, "/");
        sb1.replace(4, 7, "JAV");
        sb1.replace(9, 10, "/");
        System.out.println("Latters:" + sb1);
    }
//        Метод проверяет содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
//        (причем, abc и ABC считается одинаковой последовательностью).
    public static void task5(String s1) {
        if (s1.contains("abc")) {
            System.out.println("Содержит abc");
        } else if (s1.contains("ABC")) {
            System.out.println("Содержит ABC");
        } else {
            System.out.println("Не содержит");
        }
    }
//        Метод проверяет начинается ли номер документа с последовательности 555.
    public static void task6(String s1) {
        System.out.println(s1.startsWith("555"));
    }
//        Метод проверяет заканчивается ли номер документа на последовательность 1a2b.
    public static void task7(String s1) {
          System.out.println(s1.endsWith("1a2b"));
    }
}


