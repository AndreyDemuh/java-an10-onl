package Lesson07.Phone;


//        Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
//        класса. Выведите на консоль значения их переменных.
//        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
//        сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
//        объектов.
//        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
//        переменных класса - number, model и weight.
//        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
//        number, model.
//        Добавить конструктор без параметров.
//        Вызвать из конструктора с тремя параметрами конструктор с двумя.
//        Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
//        телефона звонящего.
//        Вызвать этот метод.
//        Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
//        телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
public class UsePhone extends Phone{
    public static void main(String[] args) {

        Phone samsung =  new Phone("+375(29)987-65-43", "C100", 76);
        Phone google = new Phone("+375(33)123-45-67", "Pixal 6");
        Phone sony = new Phone();
        sony.number = "+375(29) 333-44-55";
        sony.model = "z3 compact";
        sony.weight = 129;

        samsung.receiveCall("Иван");
        samsung.getNumber("+375(29)987-65-43");

        google.receiveCall("Петя");
        google.getNumber("+375(33)123-45-67");

        sony.receiveCall("Коля");
        sony.getNumber("+375(29) 333-44-55");

        receiveCall("Евгений", "+375(44) 111-22-33");

        sendMessage("+375(29)987-65-43", "+375(33)123-45-67", "+375(29) 333-44-55");
    }
}
