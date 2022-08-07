package Lesson07.Phone;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String receiveCall(String nameCall) {
        return "Звонит " + nameCall;
    }
    public void receiveCall(String nameCall, String numberCall){
        System.out.println("Звонит " + nameCall + " с номера " + numberCall);
    }
    public String getNumber(String number) {
        return number;
    }
    public void sendMessage(String ... number) {
        System.out.println("Сообщение отправлено на номера:");
        for (String o: number)
            System.out.println(o.toString()+" ");

    }
}
