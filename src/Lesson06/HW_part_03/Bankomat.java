package Lesson06.HW_part_03;

import java.util.Scanner;

public class Bankomat {
    int money20;
    int money50;
    int money100;
    int newSum;
    int startSum;
    Scanner scn = new Scanner(System.in);

    public Bankomat(int money20, int money50, int money100) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    public void startCapital() {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Введите начальное количество денег наодящихся в банкомате:");
//        System.out.println("Количество банкнот наминалом 20:");
//        money20 = scn.nextInt();
//        System.out.println("Количество банкнот наминалом 50:");
//        money50 = scn.nextInt();
//        System.out.println("Количество банкнот наминалом 100:");
//        money100 = scn.nextInt();
        startSum = 20 * money20 + 50 * money50 + 100 * money100;
        System.out.println("В банкомате " + startSum + " рублей. \n" + money20 + " шт. 20 рублевых купюр\n" + money50 + " шт. 50 рублевых купюр\n" + money100 + " шт. 100 рублевых купюр");
    }

    public void putMoney() {
        System.out.println("Сколько денег хотите добавить в банкомат?");
        int putMoney = scn.nextInt();
        while (putMoney <= 10 || putMoney == 30 || putMoney % 10 != 0) {
//            if ((putMoney <= 10 || putMoney == 30) && putMoney % 10 !=0) {
            System.out.println("Введена некорректная сумма. Принимаются банкноты наминалом в 20, 50 либо 100. Повторите запрос");
            putMoney = scn.nextInt();
        }
        if ((putMoney == 20 || putMoney == 50 || putMoney == 100) && putMoney % 20 == 0 || putMoney % 50 == 0) {
            System.out.println("Вы пополнили сумму на " + putMoney + " рублей");
        }
        newSum = startSum + putMoney;
        System.out.println("В банкомате " + newSum + " рублей");
    }

    public void takeMoney() {
        System.out.println("Введите сумму которую хотите снять ");

        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int remains100 = money100;
        int remains50 = money50;
        int remains20 = money20;
        int giveMoney = 0;

        int takeMoney = scn.nextInt();
        giveMoney = takeMoney;
        while (takeMoney <= 10 || takeMoney == 30 || takeMoney % 10 != 0 || takeMoney > newSum) {
            if (takeMoney <= 10 || takeMoney == 30 || takeMoney % 10 != 0) {
                System.out.println("Невозможно снять заданную сумму, имеются банкноты наминалом только 20, 50, 100 рублей");
                takeMoney = scn.nextInt();
            }
            if (takeMoney > newSum) {
                System.out.println("Недостаточно средств, введите другую сумму.");
                takeMoney = scn.nextInt();
            }
        }
        if ((takeMoney == 20 || takeMoney == 50 || takeMoney == 100) || takeMoney % 20 == 0 || takeMoney % 50 == 0) {
            System.out.println("Вы сняли  " + takeMoney + " рублей");
        }
        for (; takeMoney > 0; ) {
            if (takeMoney != 0) {
                remains100 = remains100 - 1;
                count100++;
                takeMoney = takeMoney - 100;
            } else {
                newSum = newSum - count100 * 100;
            }
        }
        for (; takeMoney > 0; ) {
            if (takeMoney != 0) {
                remains50 = remains50 - 1;
                count50++;
                takeMoney = takeMoney - 100;
            } else {
                newSum = newSum - count50 * 50;
            }
        }
        for (; takeMoney > 0; ) {
            if (takeMoney != 0) {
                remains20 = remains20 - 1;
                count20++;
                takeMoney = takeMoney - 100;
            } else {
                newSum = newSum - count20 * 20;
            }
        }
        newSum = newSum - giveMoney;
        System.out.println("Вам выдало " + giveMoney + " рублей, из них " + count100 + " х 100 рублевых купюр, " + count50 + " х 50 рублевых купюр, " + count20 + " х 20 рублевых купюр");
        System.out.println("В банкомате осталось " + newSum + ", из них " + remains100 + " х 100 рублевых купюр, " + remains50 + " х 50 рублевых купюр, " + remains20 + " х 20 рублевых купюр");
    }

    public boolean isGiveMany() {
        System.out.println("Введите снимаемую сумму: ");
        int takeMoney = scn.nextInt();
        boolean isTakeMoney = false;
        if (takeMoney <= 10 || takeMoney == 30 || takeMoney % 10 != 0 || takeMoney > newSum) {
            isTakeMoney = true;
        }
        return isTakeMoney;
    }
}


