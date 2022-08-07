package Lesson07.Hospital;

public class Therapist extends Doctor{

    public Therapist(String specialization) {
        super(specialization);
    }
    //   Переопределили для терапевта метод лечения
    @Override
    protected void methodHeal() {
        System.out.println("Я терапевт провожу общий осмотр");
    }

}
