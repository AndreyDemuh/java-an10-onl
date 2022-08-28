package Lesson12.HW_12_part_01;

//класс отчета
public class Report {

    private int planOnMonth;  //поставленный план по производсту продукции
    private int resultPlanOnMoth;    //факт выполнения плана
    private double salary;    //размер оклада
    private double prize;    //размер премии
    private boolean isWriteReport;    //факт ознакомления сотрудника

    public Report(int planOnMonth, int resultPlanOnMoth, double salary) {
        this.planOnMonth = planOnMonth;
        this.resultPlanOnMoth = resultPlanOnMoth;
        this.salary = salary;
        this.prize = calculatePrize();
    }

    //геттер поставленного плана на месяц
    public int getPlanOnMonth() {
        return planOnMonth;
    }
    // сеттер поставленного плана на месяц
    public void setPlanOnMonth(int planOnMonth) {
        this.planOnMonth = planOnMonth;
    }
    //геттер на факт выполнения плана
    public int getResultPlanOnMoth() {
        return resultPlanOnMoth;
    }
    //сеттер на факт выполнения плана
    public void setResultPlanOnMoth(int resultPlanOnMoth) {
        this.resultPlanOnMoth = resultPlanOnMoth;
        setPrize((int) calculatePrize());
    }

    // геттер на размер оклада
    public double getSalary() {
        return salary;
    }
    //сеттер на размер оклада
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //геттер на размер премии

    public double getPrize() {
        return prize;
    }

    //сеттер на размер премии
    public void setPrize(double prize) {
        this.prize = prize;
    }

    //метод который устанавливает факт подписи, т.к. по условию всегда должен быть ознакомлен то и возвращаю true
    public boolean isWriteReport() {
        return true;
    }

    //метод который рассчитывает размер премии

    private double calculatePrize() {
        if(resultPlanOnMoth >= 2 * planOnMonth) {
            prize = salary;
        }if(resultPlanOnMoth >= 1.5 * planOnMonth && resultPlanOnMoth <= 2 * planOnMonth) {
            prize = salary * 0.5;
        }if(resultPlanOnMoth <= planOnMonth) {
            prize = 0;
        }
        return prize;
    }

    public double showInfoOnYear() {
        return allCashOnMoth() * 12;
    }

    //Метод который выведет общий заработок за месяц.
    public double allCashOnMoth() {
        return salary + prize;
    }

    //Вывод  отчетной информации

    @Override
    public String toString() {
        return "Отчет о выполненой работе за месяц:\n" +
                "План на месяц по производству продукции: " + planOnMonth + " ед.\n" +
                "количество произведенной продукции: " + resultPlanOnMoth + " ед.\n" +
                "размер оклада: " + salary + " руб.," +
                " размер премии: " + prize + " руб.\n" +
                "Общий размер заработка за месяц: " + (int) allCashOnMoth() + " руб.\n" +
                "Отчет о выполненной работе за год:\n" +
                "План на год по производству продукции за год: " + planOnMonth*12 + " ед.\n" +
                "количество произведенной продукции за год: " + resultPlanOnMoth*12 + " ед.\n" +
                "размер годового оклада : " + salary*12 + " руб.," +
                " размер премии полученной за год: " + prize*12 + " руб.\n"+
                "Отметка об ознакомлении работника с отчетом: " + isWriteReport();
    }
}



