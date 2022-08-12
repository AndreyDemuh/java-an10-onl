package Lesson08.HW_08_01;

public class Rectangle extends Figure{

    //    Создал класс Прямоугольник, который наследник класса фигура.
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //    Переопределили методы подсчета периметра и площади для прямоугольника.
    @Override
    public int calculationArea() {
        int area = this.height * this.width;
        return area;
    }

    @Override
    public int calculationPerimeter() {
        int perimeter = (this.height + this.width) * 2;
        return perimeter;
    }
}
