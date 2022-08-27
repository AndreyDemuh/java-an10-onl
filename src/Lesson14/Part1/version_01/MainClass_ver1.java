package Lesson14.Part1.version_01;

public class MainClass_ver1 {
    public static void main(String[] args) throws InterruptedException {

//        Создать три потока Т1, Т2 и Т3
//        Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
//        (используя метод join)
//        Версия #1

        // Последовательный вывод потоков
        for (int i = 0; i < 20; i++) {

            Person T3 = new Person("Привет, ");
            Person T2 = new Person("как дела? ");
            Person T1 = new Person("что делаешь?");

            T3.start();
            T3.join();
            T2.start();
            T2.join();
            T1.start();
            T2.join();

        }
    }
}
