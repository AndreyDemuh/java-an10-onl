package Lesson06.HW_part_03;


public class BankomatWorks {
    public static void main(String[] args) {

//        ������� �����, ����������� ��������.
//        ����� �����, ����������� � ���������, ������ ���������� ����� ����������:
//        ����������� ����� ��������� 20, 50 � 100.
//        ������� ����� ��� ���������� ����� � ��������.
//        ������� �������, ��������� ������, ������� ��������� ����� �����, � ���������� ������� ��������
//         - ���������� ���������� ��������.
//        ��� ������ ����� ������� ������ ������������� ����� ����������� ����� ������ �������� �������
//        �����.
//        ������� ����������� � ����� ����������� - ����������� ����� ������� ��������.

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
