package Lesson14.Part1;

public class PersonSay extends Thread{

    //сделал класс объект которого будет реализовывать потоки
    public PersonSay(String say){
        super(say);
    }
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}

