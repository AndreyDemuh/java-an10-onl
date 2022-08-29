package Lesson14.Part1;

public class MainClass_part1 {
    public static void main(String[] args) throws InterruptedException {

//        Создать три потока Т1, Т2 и Т3
//        Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
//        (используя метод join)
//        Версия #1

        // Последовательный вывод потоков
        Person person = new Person();

        Thread T3 = new Thread (() -> {
            for (int i = 0; i < 20; i++) {
                person.printMessage1();
            }
        });

        Thread T2 = new Thread (() -> {
            for (int i = 0; i < 20; i++) {
                person.printMessage2();
            }
        });

        Thread T1 = new Thread (() -> {
            for (int i = 0; i < 20; i++) {
                person.printMessage3();
            }
        });

        T3.start();
        T2.start();
        T1.start();

        T3.join();
        T2.join();
        T1.join();

        }
    }



