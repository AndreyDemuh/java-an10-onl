package Lesson07.Hospital;

public class Doctor {

    String specialization;

    public Doctor(String specialization) {
        this.specialization = specialization;
    }
    //    Создали для родительского класса "Doctor" метод лечения
    protected void methodHeal() {
        System.out.println("Какой-то метод лечения");
    }
}
