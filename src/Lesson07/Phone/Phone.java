package Lesson07.Phone;

public class Phone {
    String number;
    String model;
    int weight;
        public void receiveCall(String nameCall){
        System.out.println("Звонит " + nameCall);
    }
    static void receiveCall(String nameCall, String numberCall){
        System.out.println("Звонит " + nameCall + " с номера " + numberCall);
    }
    public String getNumber(String number) {
        return number;
    }
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
    static void sendMessage(String ... number) {
        System.out.println("Сообщение отправлено на номера:");
        for (String o: number)
            System.out.println(o.toString()+" ");
    }
}
