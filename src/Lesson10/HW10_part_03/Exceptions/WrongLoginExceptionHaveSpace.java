package Lesson10.HW10_part_03.Exceptions;

public class WrongLoginExceptionHaveSpace extends Exception{

    // Класс исключения для проверки логина на наличие пробела

    private String login;

    public WrongLoginExceptionHaveSpace(String login) {
        this.login = login;
    }

    public WrongLoginExceptionHaveSpace(String message, String login) {
        super(message);
        this.login = login;
    }

    @Override
    public String getMessage() {
        return "Login содержит пробел";
    }
}
