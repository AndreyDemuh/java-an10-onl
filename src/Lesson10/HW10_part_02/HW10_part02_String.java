package Lesson10.HW10_part_02;


import java.util.Scanner;

public class HW10_part02_String {

//        Домашнее задание. Part #1 (String)
//        1. Дана строка произвольной длины с произвольными словами.
//        Найти самое короткое слово в строке и вывести его на экран.
//        Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.

        public static void String1Method (String string1){
        String[] arraysString = string1.split(" ");
        String longWorld = arraysString[0];
        String shortWorld = longWorld;

        for (int i = 0; i < arraysString.length; i++) {
            if (arraysString[i].length() >= longWorld.length()) {
                longWorld = arraysString[i];
            }
            if (arraysString[i].length() <= shortWorld.length()) {
                shortWorld = arraysString[i];
            }
        }
        System.out.println(longWorld + " - самое длинное слово");
        System.out.println(shortWorld + " - самое короткое слово");
        }

//    2. Дана строка произвольной длины с произвольными словами.
//    Найти слово, в котором число различных символов минимально.
//    Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.
//    Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff"

        public static void String2Method(String string2) {
        String[] arraysString2 = string2.split(" "); //разбиваем исходную строку на массив отдельных слов(подстрок)
        String goal = arraysString2[0]; // первоначально определеяем что искомое слово первое из массива
        for (int i=1;i<arraysString2.length;i++) {
            if (searchWords(arraysString2[i]) < searchWords(goal)) // проверяем по условию, каждое слово в массиве.
                goal = arraysString2[i]; // если условие выполняется определояем что эт ослово с минимальным количеством различных элементов.
        }
            System.out.println("слово, в котором число различных символов минимально: " + goal); //выводим в консоль
        }

        private static int searchWords(String string2){ // Метод для поиска количества уникальных символов
            StringBuffer sb1 = new StringBuffer(); // строка, в которой символ будет содержаться единожды
            String symbolInString; // текущий символ в строке
            for (int i=0;i<string2.length();i++) { // проверяем строку
                symbolInString = String.valueOf(string2.charAt(i)); // получаем текущий символ
                if (sb1.indexOf(symbolInString)==-1) // проверяем встречался ли этот символ в обрабатываем слове
                    sb1.append(symbolInString); // добавляем
            }
            return sb1.length(); // возвращаем длину получившейся строки
        }

//        3. Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
//        Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
//        Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
//        например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.

        public static void String3Method (String string3) {
            String[] arraysString3 = string3.split(" ");
            boolean isPolindrome = false;
            System.out.println("Введите число: ");
            Scanner scn = new Scanner(System.in);
            int number = scn.nextInt();
            if (number < arraysString3.length) {
                for (int i = 0; i < arraysString3[i].length() / 2; i++) {
                    if (arraysString3[number].charAt(i) == arraysString3[number].charAt(arraysString3[number].length() - i - 1)) {
                        isPolindrome = true;
                    }
                }
                System.out.print(arraysString3[number]);
                System.out.println(isPolindrome ? " полиндром" : " не полиндром");
                }
            if (number > arraysString3.length) {
                System.out.println("Введеное значение превышает длинну исходной строки");
            }
        }

//       4.Дана произвольная строка. Вывести на консоль новую строку, которой задублирована каждая буква из
//        начальной строки. Например, "Hello" -> "HHeelllloo".

            public static void doubleLetterMethod (String string4){
                String result = "";

                for (int i = 0; i < string4.length(); i++) {
                    result = result + string4.charAt(i) + string4.charAt(i);
                }

                System.out.println(result);

            }
        }










