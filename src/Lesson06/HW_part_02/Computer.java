package Lesson06.HW_part_02;

public class Computer {
    int price;
    String model;
    int RAM;
    int HDD;
    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, int RAM, int HDD) {
        this.price = price;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }
    public void infoComputer(){
        System.out.println("��������� ����������: " + price + " ������\n������ ����������: " + model + "\n����������� ������ ����������: " + RAM + " GB" +
                "\n����� �������� �����: " + HDD + " GB");
    }
}
