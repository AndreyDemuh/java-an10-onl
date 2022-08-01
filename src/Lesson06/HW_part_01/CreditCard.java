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
        System.out.println("Введите сумму которую хотите положить на счет: ");
        int money = scn.nextInt();
        currentSum = currentSum + money;
        System.out.println("Вы положили " + money + " рублей, на Вашем счету " + currentSum + " рублей");
    }
    public void takeMoney() {
        System.out.println("Введите сумму которую хотите снять со счета");
        int money = scn.nextInt();

        while (money > currentSum) {
            if (money > currentSum) {
                System.out.println("Введена некорректная сумма. Недостаточно средств. Повторите ввод. ");
                money = scn.nextInt();
            }
        }
            if (money < currentSum) {
                currentSum = currentSum - money;
                System.out.println("Вы сняли " + money + " рублей, на Вашем счету " + currentSum + " рублей");
            }
        }
        public void infoCard(){
            System.out.println("Введите 1, если хотите получить инфомрацию о карте, и введите 2, если хотите забрать вашу карту. ");
            int choose;
            choose = scn.nextInt();

            while (choose >= 2) {
                if (choose > 2) {
                    System.out.println("Вы ввели некорректное число, повторите ввод: ");
                    choose = scn.nextInt();
                }
                if (choose == 2) {
                    System.out.println("Заберите карту");
                    break;
                }
            }
                if (choose == 1) {
                    System.out.println("Информация о карте: номер лицевого счета " +  accauntNum + ", на счету " + currentSum + " рублей");
                }
    }
}


