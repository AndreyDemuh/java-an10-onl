package Lesson14.Part2;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass_part2 {
    public static void main(String[] args) {

//      Реализовать выполнение потоков в последовательности Т3 -> Т2 -> Т1 не используя метод join()
        Thread T1 = new Thread(() -> System.out.println("что делаешь?"));
        Thread T2 = new Thread(() -> System.out.print("как дела? "));
        Thread T3 = new Thread(() -> System.out.print("Привет, "));
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 20; i++) {
            executor.submit(T3);
            executor.submit(T2);
            executor.submit(T1);
        }
        executor.shutdown();
    }
}
