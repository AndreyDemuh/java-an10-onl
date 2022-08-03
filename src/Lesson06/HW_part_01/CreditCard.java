package Lesson06.HW_part_01;

public class CreditCard {
    int accauntNum;
    double currentSum;

    public CreditCard(int accauntNum, double currentSum) {
        this.accauntNum = accauntNum;
        this.currentSum = currentSum;
    }
    public void putMoney(double putMoney) {
        currentSum = currentSum + putMoney;
        System.out.println("Вы положили " + putMoney + " рублей, на Вашем счету " + currentSum + " рублей");
    }
    public void takeMoney(double takeMoney) {
            if (takeMoney > currentSum) {
                System.out.println("Введена некорректная сумма. Недостаточно средств.");
            }else {
                currentSum = currentSum - takeMoney;
                System.out.println("Вы сняли " + takeMoney + " рублей, на Вашем счету " + currentSum + " рублей");
            }
        }
        public void infoCard(){
            System.out.println("Информация о карте: номер лицевого счета " +  accauntNum + ", на счету " + currentSum + " рублей");
        }
    }



