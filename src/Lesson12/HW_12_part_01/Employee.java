package Lesson12.HW_12_part_01;

import java.util.Objects;


public class Employee {

    // Общий класс сотрудника для последующего создания работника (workera)
    private String name;   //имя работника
    private String surname;    //фамилия работника
    private String lastname;   //отчество работника
    private int age;   //возраст работника
    private String specialization;   //специальность работника
    private Report report;   // отчет  работника
    private int numberCard;    //номер карты работника
    private String startContract;   //дата заключения контракта

    public Employee(String name, String surname, String lastname, int age, String specialization,
                    Report report, int numberCard, String startContract) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.age = age;
        this.specialization = specialization;
        this.report = report;
        this.numberCard = numberCard;
        this.startContract = startContract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public String getStartContract() {
        return startContract;
    }

    public void setStartContract(String startContract) {
        this.startContract = startContract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && numberCard == employee.numberCard &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) && Objects.equals(lastname, employee.lastname) &&
                Objects.equals(specialization, employee.specialization) &&
                Objects.equals(report, employee.report) && Objects.equals(startContract, employee.startContract);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, lastname, age, specialization,
                report, numberCard, startContract);
    }

    @Override
    public String toString() {
        return "Сотрудник: \n" +
                "Имя: " + name +
                "; Фамилия: " + surname +
                "; Отчество: " + lastname + "\n" +
                "Возраст: " + age + "\n" +
                "Должность: " + specialization + "\n"
                 + report + "\n" +
                "№ карты: " + numberCard + "\n" +
                "Дата начала контракта: " + startContract;
    }

}
