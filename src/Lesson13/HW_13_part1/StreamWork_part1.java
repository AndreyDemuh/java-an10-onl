package Lesson13.HW_13_part1;

import java.util.ArrayList;
import java.util.List;

public class StreamWork_part1 {

//    Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа
//    Integer.
//    С помощью Stream'ов:
//      - Удалить дубликаты
//      - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
//      - Каждый элемент умножить на 2
//      - Отсортировать и вывести на экран первых 4 элемента
//      - Вывести количество элементов в стриме
//      - Вывести среднее арифметическое всех чисел в стриме

    // создаем метод который создает ArrayList и заполняет его 20 случайными числами от 0 до 20
    public static List<Integer> generateArrayList() {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add((int) (Math.random() * 20));
        }
        return randomNumbers;
    }

//метод который будет выводить на печать содержимое коллекции
    public static void printCreateArrayList(int number) {
        System.out.print(number + ", ");

    }

    public static void main(String[] args) {

        List<Integer> myArrayList = generateArrayList();
        System.out.println(myArrayList);

        //удаляем дубликаты чисел из нашего  ArrayList
        System.out.println("Коллекция с удаленными дубликатами:");
        myArrayList.stream()
                .distinct()
                .forEach(StreamWork_part1::printCreateArrayList);
        System.out.println();

        //вывдим все четные элементы в диапазоне от 7 до 17 (включительно)
        System.out.println("Коллекция с четными числами в диапазоне от 7 до 17 (включительно):");
        myArrayList.stream()
                .filter(integer -> integer >= 7 && integer <= 17 && integer % 2 ==0)
                .forEach(StreamWork_part1::printCreateArrayList);
        System.out.println();

        //Каждый элемент умножить на 2
        System.out.println("Каждый элемент коллекции умноженный на 2:");
        myArrayList.stream()
                .map(integer -> integer * 2)
                .forEach(StreamWork_part1::printCreateArrayList);
        System.out.println();

        //Отсортировать и вывести на экран первых 4 элемента
        System.out.println("Первые 4 элемента отсортированной коллекции:");
        myArrayList.stream()
                .sorted()
                .limit(4)
                .forEach(StreamWork_part1::printCreateArrayList);
        System.out.println();

        //Вывести количество элементов в стриме
        System.out.println("Количество элементов в стриме:" + myArrayList.stream().count());

        //Вывести среднее арифметическое всех чисел в стриме
        System.out.println("Среднее арифметическое всех чисел в стриме:" +  myArrayList.stream().
                mapToInt(Integer::intValue).average());
    }

}
