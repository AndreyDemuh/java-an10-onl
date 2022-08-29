package Lesson11.Part1;

import Lesson11.Part1.Collection.ArrayListCreate;
import Lesson11.Part1.Collection.LinkedListCreate;
import Lesson11.Part1.CompareMethod.CollectionsCompare;
import Lesson11.Part1.Check.CompareCheck;
import Lesson11.Part1.View.ConsoleView;
import Lesson11.Part1.Writer.ResultFile;
public class Main {
    public static void main(String[] args) {
        final String PATH_TO_HISTORY_FILE = "src/Lesson11/Part1/result.txt";
        final int ELEMENTS_COUNT = 10_000_000;

        CompareCheck compareController = new CompareCheck(
                new CollectionsCompare(
                        new ArrayListCreate(ELEMENTS_COUNT),
                        new LinkedListCreate(ELEMENTS_COUNT)
                ),
                new ResultFile(PATH_TO_HISTORY_FILE)
        );

        ConsoleView consoleView = new ConsoleView(compareController);

        compareController.startComparing();
        consoleView.displayAllResults();
        consoleView.displayResults();
    }
}