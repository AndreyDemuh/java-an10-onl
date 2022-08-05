package Lesson07.Hospital;

public class Patient extends PlanToHeal {

//    Переопределили метод план лечения ("PlanToHeal") который назначает врача пациенту согласно выбранному плану лечения.
    @Override
    protected void planToHeal(int choosePlanToHeal) {
        if (choosePlanToHeal == 1) {
            System.out.println("План лечения: необходима операция");
            Surgeon surgeon = new Surgeon();
            surgeon.methodHeal();
        } else if (choosePlanToHeal == 2) {
            System.out.println("План лечения: необходимо вырвать зуб");
            Dentist dentist = new Dentist();
            dentist.methodHeal();
        } else {
            System.out.println("План лечения: необходим осмотр терапевта");
            Therapist therapist = new Therapist();
            therapist.methodHeal();
        }
    }
}




