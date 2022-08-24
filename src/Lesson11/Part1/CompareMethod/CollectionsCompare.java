package Lesson11.Part1.CompareMethod;


import Lesson11.Part1.Collection.ExecutCompare;
import Lesson11.Part1.Collection.CreatorCollection;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CollectionsCompare implements Comparating {
    private static final String DATE_FORMAT = "dd.MM.yyyy H:mm:ss";
    private CreatorCollection<Integer> collection1;
    private CreatorCollection<Integer> collection2;
    private StringBuilder results = new StringBuilder();
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT);


    public CollectionsCompare(CreatorCollection<Integer> collection1, CreatorCollection<Integer> collection2) {
        this.collection1 = collection1;
        this.collection2 = collection2;
    }

    @Override
    public String getLastResults() {
        return results.toString();
    }

//    Методы сравнения
    public void compare() {
        String dateTime = dateFormatter.format(new Date());
        results
                .append("Дата: ")
                .append(dateTime)
                .append("\n");
        compareStat(
                "Добавление элемента в начало",
                () -> collection1.addToBeginning(2),
                () -> collection2.addToBeginning(2)
        );
        compareStat(
                "Добавление элемента в середину",
                () -> collection1.addToMiddle(3, 5_000_000),
                () -> collection2.addToMiddle(3, 5_000_000)
        );
        compareStat(
                "Добавление элемента в конец",
                () -> collection1.addToEnd(4),
                () -> collection2.addToEnd(4)
        );
        compareStat(
                "Удаление элемента с начала",
                () -> collection1.removeFromBeginning(),
                () -> collection2.removeFromBeginning()
        );
        compareStat(
                "Удаление элемента с середины",
                () -> collection1.removeFromMiddle(1_000_000),
                () -> collection2.removeFromMiddle(1_000_000)
        );
        compareStat(
                "Удаление элемента с конца",
                () -> collection1.removeFromEnd(),
                () -> collection2.removeFromEnd()
        );
        compareStat(
                "'Взятие' элемнета по индексу с начала",
                () -> collection1.takeByIndexFromBeginning(),
                () -> collection2.takeByIndexFromBeginning()
        );
        compareStat(
                "'Взятие' элемнета по индексу с середины",
                () -> collection1.takeByIndexFromMiddle(500_000),
                () -> collection2.takeByIndexFromMiddle(500_000)
        );
        compareStat(
                "'Взятие' элемнета по индексу с конца",
                () -> collection1.takeByIndexFromEnd(),
                () -> collection2.takeByIndexFromEnd()
        );

        results
                .append("Дата: ")
                .append(dateTime)
                .append("\nСравнение окончено\n");
    }

//    Метод AArrayList и LinkedList фиксирующий результат выполнения методов (время)

    private void compareStat(String title, ExecutCompare executor1, ExecutCompare executor2) {
        results.append(title).append("\n");
        long startCol1 = System.nanoTime();
        executor1.execute();
        long finishCol1 = System.nanoTime();
        long startCol2 = System.nanoTime();
        executor2.execute();
        long finishCol2 = System.nanoTime();
        long diffCol1 = finishCol1 - startCol1;
        long diffCol2 = finishCol2 - startCol2;
        results
                .append(compareIntermediateResults("Результат ArrayList: ", startCol1, finishCol1, diffCol1))
                .append(compareIntermediateResults("Результат LinkedList : ", startCol2, finishCol2, diffCol2))
                .append(compareResults(diffCol1, diffCol2))
                .append("Сравнение на ")
                .append(title)
                .append(" окончено\n");
    }

//    Вывод информации по результатам сравнения
    private String compareResults(long diffCol1, long difCol2) {
        return String.format(
                "Сравнение результата: %s отработал быстрее на %d\n",
                diffCol1 > difCol2
                        ? "ArrayList"
                        : "LinkedList",
                Math.abs(diffCol1 - difCol2)
        );
    }

//Выавод информации  о начале, конце и их разницей на обработку метода
    private String compareIntermediateResults(String title, long startTime, long finishTime, long diff) {
        return String.format(
                "%s\n Начало: %d.\n Конец: %d\n время выполнения операции: %d\n",
                title,
                startTime,
                finishTime,
                diff
        );
    }
}
