package Lesson06.HW_part_03;

public class Bankomat {
    int money20;
    int money50;
    int money100;
    int startSum;

    public Bankomat(int money20, int money50, int money100) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
        startSum = this.money20 * 20 + this.money50 * 50 + this.money100 * 100;
        System.out.println("В банкомате " + startSum + " рублей. \n" + money20 + " шт. 20 рублевых купюр\n" + money50 + " шт. 50 рублевых купюр\n" + money100 + " шт. 100 рублевых купюр");

    }
    public void putMoney(int putMoney) {
        System.out.println("Вы  положили " + putMoney + " рублей");
        startSum = startSum + putMoney;
        System.out.println("На счете " + startSum + " рублей");
    }
    public void takeMoney(int takeMoney) {
        int remains100 = money100;
        int remains50 = money50;
        int remains20 = money20;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        boolean isTakeMoney = false;
        int giveMoney = takeMoney;

        System.out.println("Вы хотите снять " + takeMoney + " рублей");
        if (takeMoney < startSum) {
            isTakeMoney = true;
        }
        System.out.println(isTakeMoney ? "Операция выполнена успешно" : "Ошибка выполнения операции. Недостаточно средств");

        if (takeMoney % 100 == 0 && money100 != 0) {
                    remains100 = remains100 - 1;
                    count100++;
                    takeMoney -= 100;
                    }
                    startSum = startSum - count100 * 100;
                    if (takeMoney % 50 == 0 && money50 != 0) {
                    remains50 = remains50 - 1;
                    count50++;
                    takeMoney -= 50;
                    }
                    startSum = startSum - count50 * 50;
                    if (takeMoney % 20 == 0 && money20 != 0) {
                    remains20 = remains20 - 1;
                    count20++;
                    takeMoney -= 20;
                    }
                    startSum = startSum - count20 * 20;

            System.out.println("Вам выдало " + giveMoney + " рублей, из них " + (money100 - count100) + " 100 рублевых купюр, " + (money50 - count50) + " 50 рублевых купюр, " + count20 + " 20 рублевых купюр");
            System.out.println("В банкомате осталось " + (startSum-takeMoney) + ", из них " + (remains100 - count100) + " 100 рублевых купюр, " + (remains50 - count50) + " 50 рублевых купюр, " + (remains20 - count20) + " 20 рублевых купюр");
    }
}








