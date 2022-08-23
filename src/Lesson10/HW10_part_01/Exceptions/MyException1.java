package Lesson10.HW10_part_01.Exceptions;

public class MyException1 extends Exception {

    private String userInput;

    public MyException1(String userInput) {
        this.userInput = userInput;
    }

    public MyException1(String message, String userInput) {
        super(message);
        this.userInput = userInput;
    }

    @Override
    public String getMessage() {
        return "Длинна искомого текста больше длинны исходного текста";
    }

    public static void exception1(String s1, String userInput) {
        try {
            if (method1(s1, userInput)) {

            } else {

            }
        } catch (MyException1 e) {
            throw new RuntimeException(e);
        }
    }

        public static boolean method1(String s1, String userInput) throws MyException1 {
        System.out.println("Ищем последовательность abc");
        if (s1.length() > userInput.length()) {
            System.out.println(s1.contains(userInput) ? "Да, содержит" : "Нет, не содержит");
        } else {
            throw new MyException1(userInput);
        }

        return false;
    }
}

