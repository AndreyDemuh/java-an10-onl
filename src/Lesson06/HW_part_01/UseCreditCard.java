package Lesson06.HW_part_01;

public class UseCreditCard {
    public static void main(String[] args) {
//        ������� ����� CreditCard c ������ ����� �����, ������� ����� �� �����.
//        �������� �����, ������� ��������� ��������� ����� �� ��������� ��������.
//        �������� �����, ������� ��������� ������� � �������� ��������� �����.
//        �������� �����, ������� ������� ������� ���������� � ��������.
//        �������� ���������, ������� ������� ��� ������� ������ CreditCard � ������� ������ �����
//        ����� � ��������� �����
//        �������� �������� ��� ��������:
//        �������� ������ �� ������ ��� �������� � ������� � �������.

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
