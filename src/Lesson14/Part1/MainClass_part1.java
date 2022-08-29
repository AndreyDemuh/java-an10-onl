package Lesson14.Part1;

public class MainClass_part1 {
    public static void main(String[] args) throws InterruptedException {

//        Создать три потока Т1, Т2 и Т3
//        Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
//        (используя метод join)
//        Версия #1

        // Последовательный вывод потоков
        for (int i = 0; i < 20; i++) {

            PersonSay T3 = new PersonSay("Привет, ");
            PersonSay T2 = new PersonSay("как дела? ");
            PersonSay T1 = new PersonSay("что делаешь?");

            T3.start();
            T3.join();
            T2.start();
            T2.join();
            T1.start();
            T2.join();

        }
    }
}
