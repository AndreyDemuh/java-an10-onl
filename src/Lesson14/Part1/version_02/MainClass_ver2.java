package Lesson14.Part1.version_02;

public class MainClass_ver2 {
    public static void main(String[] args) throws InterruptedException {


//        Создать три потока Т1, Т2 и Т3
//        Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1. Выполнить 20 раз
//        (используя метод join)
//        Версия #2

        Person2 person = new Person2();

        //Создаю потоки которые реализовывают ранее созданные методы
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                person.T3();

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                person.T2();
            }
        });

        Thread t3 = new Thread(()-> {
            for (int i = 0; i < 20; i++) {
                person.T1();
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
