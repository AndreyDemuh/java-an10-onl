package Lesson10.HW10_part_03.Exceptions;

public class WrongPasswordExceptionHaveSpace extends Exception{

    // Класс исключения пароля на наличие пробела
    private String Password;

    public WrongPasswordExceptionHaveSpace(String password) {
        Password = password;
    }

    public WrongPasswordExceptionHaveSpace(String message, String password) {
        super(message);
        Password = password;
    }

    @Override
    public String getMessage() {
        return "Password содержит пробел";
    }
}
