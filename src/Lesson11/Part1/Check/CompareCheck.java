package Lesson11.Part1.Check;

import Lesson11.Part1.CompareMethod.Comparating;
import Lesson11.Part1.Writer.CustomFile;

// класс для сравнения и записи проведенных "испытаний"
public class CompareCheck {
    private Comparating comparator;
    private CustomFile file;

    public CompareCheck(Comparating comparator, CustomFile file) {
        this.comparator = comparator;
        this.file = file;
    }

    public String getLastResults() {
        return comparator.getLastResults();
    }

  // информация о всех результатах
    public String getAllResults() {
        return file.getContent();
    }

//   Метод сравнения результатов + их запись
    public void startComparing() {
        comparator.compare();
        file.write(getLastResults());
    }
}