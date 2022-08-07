package Lesson07.Phone;

//        Класс Phone.
//        + Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
//        + класса. Выведите на консоль значения их переменных.
//        + Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
//        + сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
//        + объектов.
//        + Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
//        + переменных класса - number, model и weight.
//        + Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
//        + number, model.
//        + Добавить конструктор без параметров.
//        + Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        + Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
//        + телефона звонящего.
//        + Вызвать этот метод.
//        + Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
//        + телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
public class UsePhone {
    public static void main(String[] args) {

        Phone samsung =  new Phone("+375(29)987-65-43", "Samsung C100", 76);
        Phone google = new Phone("+375(33)123-45-67", "Pixel 6");
        Phone sony = new Phone();
        sony.setNumber("+375(29) 333-44-55");
        sony.setModel("sony z3 compact");
        sony.setWeight(129);

        System.out.println(samsung.receiveCall("Иван"));
        samsung.getNumber("+375(29)987-65-43");
        System.out.println(samsung.getNumber());
        System.out.println("Номер телефона " + samsung.getNumber() + " вес: " + samsung.getWeight() + " грамм, модель: " + samsung.getModel());

        System.out.println(google.receiveCall("Петя"));
        System.out.println(google.getNumber());
        System.out.println("Номер телефона " + google.getNumber() + " модель: " + google.getModel());

        System.out.println(sony.receiveCall("Коля"));
        System.out.println(sony.getNumber());
        System.out.println("Номер телефона " + sony.getNumber() + " вес: " + sony.getWeight() + " грамм, модель: " + sony.getModel());

        sony.receiveCall("Сергей", "+375(44)111-22-33");

        sony.sendMessage("+375(29)987-65-43", "+375(33)123-45-67", "+375(29)333-44-55");

    }
}
