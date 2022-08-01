package Lesson06.HW_part_03;


public class BankomatWorks {
    public static void main(String[] args) {

//        Создать класс, описывающий банкомат.
//        Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//        количеством купюр номиналом 20, 50 и 100.
//        Сделать метод для добавления денег в банкомат.
//        Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение
//         - успешность выполнения операции.
//        При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся
//        сумма.
//        Создать конструктор с тремя параметрами - количеством купюр каждого номинала.

    Bankomat bankomat1 = new Bankomat(5, 20 ,10);
    bankomat1.startCapital();
    bankomat1.putMoney();
    bankomat1.takeMoney();
    bankomat1.isGiveMany();

    Bankomat bankomat2 = new Bankomat(10, 15, 1);
    bankomat2.startCapital();
    bankomat2.putMoney();
    bankomat2.takeMoney();
    }
}
