package Lesson07.Hospital;

public class Dentist extends Doctor {

    //   Переопределили для дантиста метод лечения
    @Override
    protected void  methodHeal() {
        System.out.println("Я дантист вырываю зуб");

    }
}
