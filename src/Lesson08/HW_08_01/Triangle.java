package Lesson08.HW_08_01;

public class Triangle extends Figure{

//    Создал класс Треугольник, который наследник класса фигура.
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

//    Переопределили методы подсчета периметра и площади для треугольника.
    @Override
    public int calculationArea() {
        int p = (this.sideA + this.sideB + this.sideC) / 2;
        int area = (int) Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
        return area;
    }

    @Override
    public int calculationPerimeter() {
        int perimeter = this.sideA + this.sideB + this.sideC;
        return perimeter;
    }
}

