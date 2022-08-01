package Lesson06.HW_part_02;

public class UseComputer {
    public static void main(String[] args) {

//        Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD. Для полей RAM и
//        HDD следует создать свои собственные классы. Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми
//        параметрами.
//          Класс RAM имеет поля "название" и "объем".
//          Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
//        Класс Computer должен иметь два конструктора:
//        - первый - с параметрами стоимость и модель,
//        - второй - со всеми полями.
//        При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью конструкторов по
//        умолчанию. В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
//        Тестовый сценарий для проверки:
//        создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
//        создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.


        Computer computer1 = new Computer(2500, "ASUS");
        computer1.RAM = 8;
        computer1.HDD = 250;
        RAM RAM1 = new RAM();
        RAM1.nameRAM = "HyperX";
        RAM1.memoryRAM = 8;
        HDD HDD1 = new HDD();
        HDD1.nameHDD = "SEAGATE";
        HDD1.memoryHDD = 400;
        HDD1.type = "внешний";

        Computer computer2 = new Computer(3200, "SAMSUNG", 8, 250);
        RAM RAM2 = new RAM("Kingston", 8);
        HDD HDD2 = new HDD("TOSHIBA", 250, "внутренний");
        System.out.println("Информация о первом компьютере:");
        computer1.infoComputer();
        RAM1.infoRAM();
        HDD1.infoHDD();

        System.out.println();

        System.out.println("Инфомрация о втором компьютере:");
        computer2.infoComputer();
        RAM2.infoRAM();
        HDD2.infoHDD();
    }
}
