package Lesson06.HW_part_02;

public class UseComputer {
    public static void main(String[] args) {

//        ������� ����� ��� �������� ����������, � ���� ������ ������ ���� ����: ���������, ������(��������� ���), RAM � HDD. ��� ����� RAM �
//        HDD ������� ������� ���� ����������� ������. ������ ��� RAM � HDD ������ ����� ����������� �� ��������� � ����������� �� �����
//        �����������.
//          ����� RAM ����� ���� "��������" � "�����".
//          ����� HDD ����� ���� "��������", "�����" � "���" (������� ��� ����������).
//        ����� Computer ������ ����� ��� ������������:
//        - ������ - � ����������� ��������� � ������,
//        - ������ - �� ����� ������.
//        ��� �������� ������� "���������" � ������� ������� ������������ ������ ����������� ���� RAM � HDD � ������� ������������� ��
//        ���������. � ������ �� ������� ������������� ������ ��� ������ ������ ���������� (����� ���� ����� � ���� ��������).
//        �������� �������� ��� ��������:
//        ������� ������ "��������� 1" � ������� ������� ������������ � ������� ���������� �� �����;
//        ������� ������ "��������� 2" � ������� ������� ������������ � ������� ���������� �� �����.


        Computer computer1 = new Computer(2500, "ASUS");
        computer1.RAM = 8;
        computer1.HDD = 250;
        RAM RAM1 = new RAM();
        RAM1.nameRAM = "HyperX";
        RAM1.memoryRAM = 8;
        HDD HDD1 = new HDD();
        HDD1.nameHDD = "SEAGATE";
        HDD1.memoryHDD = 400;
        HDD1.type = "�������";

        Computer computer2 = new Computer(3200, "SAMSUNG", 8, 250);
        RAM RAM2 = new RAM("Kingston", 8);
        HDD HDD2 = new HDD("TOSHIBA", 250, "����������");
        System.out.println("���������� � ������ ����������:");
        computer1.infoComputer();
        RAM1.infoRAM();
        HDD1.infoHDD();

        System.out.println();

        System.out.println("���������� � ������ ����������:");
        computer2.infoComputer();
        RAM2.infoRAM();
        HDD2.infoHDD();
    }
}
