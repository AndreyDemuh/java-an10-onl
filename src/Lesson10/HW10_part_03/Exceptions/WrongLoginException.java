package Lesson10.HW10_part_03.Exceptions;

public class WrongLoginException extends Exception{

    // Класс исключения для проверки логина на длинну
    private String login;

    public WrongLoginException(String login) {
        this.login = login;
    }

    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    @Override
    public String getMessage() {
        return "Поле login превышает допустимую длинну";
    }
}
