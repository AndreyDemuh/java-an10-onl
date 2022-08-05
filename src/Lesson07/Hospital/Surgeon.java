package Lesson07.Hospital;

public class Surgeon extends Doctor{

    //   Переопределили для хирурга метод лечения
    @Override
    protected void methodHeal() {
        System.out.println("Я хирург провожу операцию");
    }
}
