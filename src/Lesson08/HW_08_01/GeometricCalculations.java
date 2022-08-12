package Lesson08.HW_08_01;

public class GeometricCalculations {

//    Создал класс в котором объявляю массиф фигур.
    private Figure[] figures;

//    Создал конструктор для создания будущего объекта GeometricCalculations (в моем понимании своего рода калькулдятора),
//    определяю размерность массива.
    public GeometricCalculations() {
        this.figures = new Figure[5];
    }
// Прописал метод который подсчитывает сумму периметров всех фигур находящихся в массиве. Вероятнее всего этот метод противоречит
// "принципу единственной ответственности". Я прав?
    public void sumPerimeterFigure(Figure[] figures) {
        int sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                sum += figures[i].calculationPerimeter();
            } else {
                break;
            }
        }
        System.out.println("Сумма периметров всех фигур массива равна: " + sum);
    }
}
