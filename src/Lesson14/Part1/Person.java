package Lesson14.Part1;

import static Lesson14.Part1.Message.*;

public class Person {
    private Message currentMessage = MESSAGE1;

    public synchronized void printMessage1() {
        while (currentMessage != MESSAGE1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(MESSAGE1);
        currentMessage = MESSAGE2;
        notifyAll();
    }

    public synchronized void printMessage2(){
        while (currentMessage != MESSAGE2) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(MESSAGE2);
        currentMessage = MESSAGE3;
        notifyAll();
    }

    public synchronized void printMessage3(){
        while (currentMessage != MESSAGE3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.print(MESSAGE3);
        currentMessage = MESSAGE1;
        notifyAll();

    }
}




