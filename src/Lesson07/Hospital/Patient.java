package Lesson07.Hospital;

public class Patient {
    //    Переопределили метод план лечения ("PlanToHeal") который назначает врача пациенту согласно выбранному плану лечения.
    private int planToHeal;

    public int getPlanToHeal() {
        return planToHeal;
    }

    public void setPlanToHeal(int planToHeal) {
        this.planToHeal = planToHeal;
    }
    protected void planToHeal(int setPlanToHeal) {
        if (setPlanToHeal == 1) {
            System.out.println("Нужен осмотр хирурга");
        } else if (setPlanToHeal == 2) {
            System.out.println("Нужен осмотр дантиста");
        } else {
            System.out.println("Нужен осмотр терапевта");
        }
    }
}




