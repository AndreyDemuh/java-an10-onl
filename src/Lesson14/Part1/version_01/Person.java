package Lesson14.Part1.version_01;

public class Person extends Thread{

    //сделал класс объект которого будет реализовывать потоки
    public Person(String say){
        super(say);
    }
    @Override
    public void run() {
        System.out.println(this.getName());
    }
}

