package Lesson08.HW_08_01;

public class Test {
    public static void main(String[] args) {

//        1. Написать иерархию классов «Фигуры».
//        Фигура -> Треугольник -> Прямоугольник -> Круг.
//        Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
//        Создать массив из 5 фигур.
//        Вывести на экран сумму периметра всех фигур в массиве.

//        Создаем объект (калькулятор) который будет высчитывать сумму всех периметров фигур, согласно прописанному методу
        GeometricCalculations summaPerimeterFigure = new GeometricCalculations();

//        Создали фигуры
        Figure f1 = new Triangle(5, 7, 9);
        Figure f2 = new Rectangle(2, 6);
        Figure f3 = new Circle(5);
        Figure f4 = new Triangle(6, 9, 12);
        Figure f5 = new Rectangle(4, 3);

//        Создали массив из созданных фигур
        Figure[] figures = new Figure[5];
        figures[0] = f1;
        figures[1] = f2;
        figures[2] = f3;
        figures[3] = f4;
        figures[4] = f5;

//        Реализовали метод подсчета суммы периметров фигур массива
        summaPerimeterFigure.sumPerimeterFigure(figures);

//        Это просто выведены все периметры и площади фигур, для собственной проверки, что все работает верно
        System.out.println(f1.calculationArea());
        System.out.println(f1.calculationPerimeter());
        System.out.println(f2.calculationArea());
        System.out.println(f2.calculationPerimeter());
        System.out.println(f3.calculationArea());
        System.out.println(f3.calculationPerimeter());
        System.out.println(f4.calculationArea());
        System.out.println(f4.calculationPerimeter());
        System.out.println(f5.calculationArea());
        System.out.println(f5.calculationPerimeter());
    }
}




