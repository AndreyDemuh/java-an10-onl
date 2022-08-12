package Lesson08.HW_08_02;

public class PositionClass {
    public static void main(String[] args) {

//        2. Создать классы "Директор", "Рабочий", "Бухгалтер".
//        Реализовать интерфейс с методом, который печатает название должности и
//        имплементировать этот метод в созданные классы.

//        Проверил как отрабатывают имплементированные методы

        Position director = new Director();
        Position employee = new Employee();
        Position accountant = new Accountant();

        director.positionPrint();
        employee.positionPrint();
        accountant.positionPrint();
    }
}
