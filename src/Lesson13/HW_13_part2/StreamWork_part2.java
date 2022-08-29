package Lesson13.HW_13_part2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWork_part2 {

//    Cоздать коллекцию класса ArrayList со значениями имен всех студентов в группе.
//    С помощью Stream'ов:
//    - Вернуть количество  людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
//    - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
//    - Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста

    public static void main(String[] args) {
        List<String> myGroup = Stream.of("Артем", "Александ", "Денис", "Андрей", "Екатерина",
                "Артем", "Елизавета", "Евгений", "Надежда", "Иван").collect(Collectors.toList());

//      Вернуть количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
        String result = String.valueOf(myGroup.stream()
                .filter(name -> name.equalsIgnoreCase("Андрей"))
                .count());
        System.out.println("Количество людей в группе с моим именем: " + result);

//      Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
        String result2 = String.valueOf(myGroup.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("а"))
                .count());
        System.out.println("Имена начинающиеся на 'а' (не зависимо от регистра): " + result2);

//      Отсортировать и вернуть первый элемент коллекции или "Empty", если коллекция пуста
        String result3 = String.valueOf(myGroup.stream()
                .sorted()
                .findFirst()
                .orElse("Empty"));
        System.out.println(result3);
    }
}
