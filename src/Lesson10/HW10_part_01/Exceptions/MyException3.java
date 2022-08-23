package Lesson10.HW10_part_01.Exceptions;

public class MyException3 extends Exception {
//    Класс исключения для проверки заканчивается ли номер документа на последовательность 1a2b.

    private String userInput;

    public MyException3(String userInput) {
        this.userInput = userInput;
    }

    public MyException3(String message, String userInput) {
        super(message);
        this.userInput = userInput;
    }

    @Override
    public String getMessage() {
        return "Длинна искомого текста больше длинны исходного текста";
    }

    public static boolean method3(String s1, String userInput) throws MyException3 {
        System.out.println("Проверяем заканчивается ли номер документа на 1a2b");
        if (s1.length() > userInput.length()) {
            System.out.println(s1.endsWith(userInput) ? "Да, заканчивается" : "Нет, не заканчивается");
        } else {
            throw new MyException3(userInput);
        }
        return false;
    }

    public static void exception3(String s1, String userInput) {
        try {
            if (method3(s1, userInput)) {

            } else {

            }
        } catch (MyException3 e) {
            throw new RuntimeException(e);
        }
    }
}







