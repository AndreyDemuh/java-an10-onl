package Lesson10.HW10_part_03.Exceptions;

public class WrongPasswordHaveNotHaveNumber extends Exception{

    // Класс исключения пароля на наличие числового значения
    private String password;

    public WrongPasswordHaveNotHaveNumber(String password) {
        this.password = password;
    }

    public WrongPasswordHaveNotHaveNumber(String message, String password) {
        super(message);
        this.password = password;
    }

    @Override
    public String getMessage() {
        return "Password должен сдержать числовое значение";
    }
}
