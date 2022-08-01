package Lesson06.HW_part_01;

public class UseCreditCard {
    public static void main(String[] args) {
//        Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//        Добавьте метод, который выводит текущую информацию о карточке.
//        Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер
//        счета и начальная сумма
//        Тестовый сценарий для проверки:
//        Положите деньги на первые две карточки и снимите с третьей.
        CreditCard MasterCard = new CreditCard(1, 500.25);
        CreditCard BPSCard = new CreditCard(2, 1000);
        CreditCard TexnoBankCard = new CreditCard(3, 450.50);

        MasterCard.putMoney();

        BPSCard.putMoney();

        TexnoBankCard.takeMoney();

        MasterCard.infoCard();
        BPSCard.infoCard();
        TexnoBankCard.infoCard();

    }
}
