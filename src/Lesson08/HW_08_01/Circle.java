package Lesson08.HW_08_01;

public class Circle extends Figure{

    //    Создал класс круг, который наследник класса фигура.
    private int diameter;
    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    //    Переопределили методы подсчета периметра (длины окружности) и площади для круга.
    @Override
    public int calculationArea() {
        int area = (this.diameter*this.diameter) / 4;
        return area;
    }

    @Override
    public int calculationPerimeter() {
        int perimeter = (int) (3.14 * this.diameter);
        return perimeter;
    }
}
