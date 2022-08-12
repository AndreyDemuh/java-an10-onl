package Lesson08.HW_08_02;

public class Employee implements Position{

    //    Имплементировал метод из интерфейса
    @Override
    public void positionPrint() {
        System.out.println("Моя должность рабочий");
    }
}
