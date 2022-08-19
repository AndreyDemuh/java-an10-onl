package Lesson10.HW10_part_01.Exceptions;

public class MyException2 extends Exception{
//    Класс исключения для проверки начинается ли номер документа с последовательности 555.

    private String userInput;

    public MyException2(String userInput) {
        this.userInput = userInput;
    }

    public MyException2(String message, String userInput) {
        super(message);
        this.userInput = userInput;
    }

    @Override
    public String getMessage() {
        return "Длинна искомого текста больше длинны исходного текста";
    }

    public static void exception2 (String s1, String userInput) {
        try {
            if(method2(s1, userInput)) {

            }else {

            }
        } catch (MyException2 e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean method2(String s1, String userInput) throws MyException2 {
        System.out.println("Проверяем начинается ли номер документа с 555");
            if (s1.length() > userInput.length()) {
                System.out.println(s1.startsWith(userInput) ? "Да, начинается" : "Нет, не начинается");
            }else {
                throw new MyException2(userInput);
            }

        return false;
    }
}
