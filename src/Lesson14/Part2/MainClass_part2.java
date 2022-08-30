package Lesson14.Part2;

public class MainClass_part2 {
    public static void main(String[] args) {
        Person3 person3 = new Person3();

//      Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1 не используя метод join()
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                person3.T3();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                person3.T2();
            }
        });

        Thread t3 = new Thread(()-> {
            for (int i = 0; i < 20; i++) {
                person3.T1();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
