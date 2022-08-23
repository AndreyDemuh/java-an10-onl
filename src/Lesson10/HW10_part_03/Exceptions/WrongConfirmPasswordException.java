package Lesson10.HW10_part_03.Exceptions;

public class WrongConfirmPasswordException extends  Exception{

//    Класс исключения в котром проверяется соответсвия confirmPassword с password

    private String confirmPassword;

    public WrongConfirmPasswordException(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public WrongConfirmPasswordException(String message, String confirmPassword) {
        super(message);
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String getMessage() {
        return "confirmPassword не соответсвует password";
    }
}
