package Lesson10.HW10_part_03.Exceptions;

public class WrongPasswordException extends Exception {

    // Класс исключения сравнения пароля с подтверждением пароля
    private String password;
    private String confirmPassword;

    public WrongPasswordException(String password) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public WrongPasswordException(String message, String password, String confirmPassword) {
        super(message);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String getMessage() {
        return "Длинна Password превышает допустимую";
    }
}
