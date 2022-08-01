package Lesson06.HW_part_01;

import java.util.Scanner;



public class CreditCard {
    Scanner scn = new Scanner(System.in);
    int accauntNum;
    double currentSum;

    public CreditCard(int accauntNum, double currentSum) {
        this.accauntNum = accauntNum;
        this.currentSum = currentSum;
    }

    public void putMoney() {
        System.out.println("������� ����� ������� ������ �������� �� ����: ");
        int money = scn.nextInt();
        currentSum = currentSum + money;
        System.out.println("�� �������� " + money + " ������, �� ����� ����� " + currentSum + " ������");
    }

    public void takeMoney() {
        System.out.println("������� ����� ������� ������ ����� �� �����");
        int money = scn.nextInt();

        while (money > currentSum) {
            if (money > currentSum) {
                System.out.println("������� ������������ �����. ������������ �������. ��������� ����. ");
                money = scn.nextInt();
            }
        }
            if (money < currentSum) {
                currentSum = currentSum - money;
                System.out.println("�� ����� " + money + " ������, �� ����� ����� " + currentSum + " ������");
            }
        }
        public void infoCard(){
            System.out.println("������� 1, ���� ������ �������� ���������� � �����, � ������� 2, ���� ������ ������� ���� �����. ");
            int choose;
            choose = scn.nextInt();

            while (choose >= 2) {
                if (choose > 2) {
                    System.out.println("�� ����� ������������ �����, ��������� ����: ");
                    choose = scn.nextInt();
                }
                if (choose == 2) {
                    System.out.println("�������� �����");
                    break;
                }
            }
                if (choose == 1) {
                    System.out.println("���������� � �����: ����� �������� ����� " +  accauntNum + ", �� ����� " + currentSum + " ������");
                }
    }
}


