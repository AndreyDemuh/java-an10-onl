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
    Bankomat bankomat1 = new Bankomat(50, 20 ,10);

    bankomat1.putMoney(500);
    bankomat1.takeMoney(700);

    System.out.println("------------------------------------------");

    Bankomat bankomat2 = new Bankomat(5, 10, 3);

    bankomat2.putMoney(600);
    bankomat2.takeMoney(200);
    }
}
