package Lesson07.Hospital;

public class Dentist extends Doctor {

    public Dentist(String specialization) {
        super(specialization);
    }
    //   Переопределили для дантиста метод лечения
    @Override
    protected void methodHeal() {
        System.out.println("Я дантист лечу зубы");
    }
}

