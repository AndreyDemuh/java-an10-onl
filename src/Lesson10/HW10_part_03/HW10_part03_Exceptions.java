package Lesson10.HW10_part_03;

import Lesson10.HW10_part_03.Exceptions.*;

public class HW10_part03_Exceptions {

//    Класс по написанию методов необходимых проверок и основного метода
        public static void  Registration (String login, String password, String confirmPassword) {
            try {
                if (methodLoginLength(login)) {
                } else {

                }
            } catch (WrongLoginException e) {
                throw new RuntimeException(e);
            }
            try {
                if (methodLoginHaveSpace(login)) {
                } else {

                }
            } catch (WrongLoginExceptionHaveSpace e) {
                throw new RuntimeException(e);
            }
            try {
                if (methodPasswordLength(password)) {

                }
            } catch (WrongPasswordException e) {
                throw new RuntimeException(e);
            }
            try {
                if (methodPasswordHaveSpace(password)) {

                }
            } catch (WrongPasswordExceptionHaveSpace e) {
                throw new RuntimeException(e);
            }
            try {
                if (methodPasswordHaveNumber(password)) {

                }
            } catch (WrongPasswordHaveNotHaveNumber e) {
                throw new RuntimeException(e);
            }
            try {
                if (methodConfirmPassword(password, confirmPassword)) {

                }
            } catch (WrongConfirmPasswordException e) {
                throw new RuntimeException(e);
            }
        }

// метод которвый проверяет длину логина
            public static boolean methodLoginLength (String login) throws WrongLoginException {
                if (login.length() < 20) {
                    System.out.println("ok, login (по длине)");
                } else {
                    throw new WrongLoginException(login);
                }
                return false;
            }

// метод которвый проверяет содержит ли логин пробел
            public static boolean methodLoginHaveSpace (String login) throws WrongLoginExceptionHaveSpace {
             int index1 = login.indexOf(" ");
                if(index1 <= 0){
                    System.out.println("ok, login (без пробелов)");
                }else {
                    throw new WrongLoginExceptionHaveSpace(login);
                }
                return false;
            }

// метод которвый проверяет длину password и равенство с confirmPassword
        public static boolean methodPasswordLength (String password) throws WrongPasswordException {
                if(password.length() < 20 ) {
                    System.out.println("password,ok (по длине)");
                } else {
                    throw new WrongPasswordException(password);
                }
                return false;
        }

// метод которвый проверяет соответствие password с confirmPassword
    public static boolean methodConfirmPassword (String password, String confirmPassword) throws WrongConfirmPasswordException {
        if(password.length()==confirmPassword.length()) {
            System.out.println("password,ok (confirmPassword - соответсвует password");
        } else {
            throw new WrongConfirmPasswordException(confirmPassword);
        }
        return false;
    }

// метод которвый проверяет содержит ли пароль пробелы
         public static boolean methodPasswordHaveSpace (String password) throws WrongPasswordExceptionHaveSpace {
                int index1 = password.indexOf(" ");
                if(index1 <= 0){
                    System.out.println("ok, login (без пробелов)");
                }else {
                    throw new WrongPasswordExceptionHaveSpace(password);
        }
                return false;
    }
// метод которвый проверяет содержит ли пароль числовое значение
    public static boolean methodPasswordHaveNumber (String password) throws WrongPasswordHaveNotHaveNumber {
        if (!password.matches("[^0-9]+")) {
            System.out.println("ok, password (содержит цифровой символ)");
        } else {
            throw new WrongPasswordHaveNotHaveNumber(password);
        }
        return false;
    }
}










