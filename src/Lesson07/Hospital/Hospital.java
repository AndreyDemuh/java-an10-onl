package Lesson07.Hospital;

import javax.print.Doc;

//        + Создать программу для имитации работы клиники.
//        + Пусть в клинике будет три врача: хирург, терапевт и дантист.
//        + Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
//        + Так же предусмотреть класс «Пациент» и класс «План лечения».
//        + Создать объект класса «Пациент» и добавить пациенту план лечения.
//        + Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
//        Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//        Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//        Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить
public class Hospital {
    public static void main(String[] args) {

    Doctor dentist = new Dentist("dentist");
    Doctor surgeon = new Surgeon("surgeon");
    Doctor therapist = new Therapist("Therapist");

    Patient patient1 = new Patient();
    patient1.setPlanToHeal(1);
    patient1.planToHeal(1);
    dentist.methodHeal();

    Patient patient2 = new Patient();
    patient2.setPlanToHeal(2);
    patient2.planToHeal(2);
    surgeon.methodHeal();

    Patient patient3 = new Patient();
    patient3.setPlanToHeal(32);
    patient3.planToHeal(3);
    therapist.methodHeal();

    }
}
