package Lesson14.Part2;

public class Person3 {

    private int switcher = 0;

    private boolean isSwitch = false;

    public synchronized void T3() {
        while(switcher == 1 && isSwitch) {
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }System.out.print("Привет, ");
        switcher = 1;
        isSwitch = true;
        notify();

    }
    public synchronized void T2() {
        while(switcher == 0){
            try {
                wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        } System.out.print("как дела? ");
        switcher = 0;
        isSwitch = true;
        notify();
    }

    public synchronized void T1 () {
        while(!isSwitch) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }System.out.println("что делаешь?");
        isSwitch = true;
        notify();
    }

}
