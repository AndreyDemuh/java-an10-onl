package Lesson07.Hospital;

public class Therapist extends Doctor{

    //   Переопределили для терапевта метод лечения
    @Override
    protected void methodHeal() {
        System.out.println("Я терапевт провожу общий осмотр");
    }
}
