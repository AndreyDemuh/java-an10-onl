package Lesson10.HW10_part_03;

import static Lesson10.HW10_part_03.HW10_part03_Exceptions.*;

//    Создать класс, в котором будет статический метод. Этот метод принимает на вход три параметра:
//    Login, Password, confirmPassword.
//    Все поля имеют тип данных String.
//    Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//    Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//    Длина password должна быть меньше 20 символов, не должен содержать пробелов и должен
//    содержать хотя бы одну цифру.
//    Также password и confirmPassword должны быть равны.
//    Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//    WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя
//    конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в
//    конструктор класса Exception.
//    Метод возвращает true, если значения верны или false в другом случае

public class HW10_part03_Main {

    public static void main(String[] args) {
        Registration("Login", "pass1word", "pass1word");

    }
}


