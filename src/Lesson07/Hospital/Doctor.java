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
    protected void planToHeal(int PlanToHeal) {
        if (PlanToHeal == 1){
            System.out.println("Нужен осмотр хирурга");
        }else if (PlanToHeal == 2) {
            System.out.println("Нужен осмотр дантиста");
        } else {
            System.out.println("Нужен осмотр терапевта");
        }

    }
}
