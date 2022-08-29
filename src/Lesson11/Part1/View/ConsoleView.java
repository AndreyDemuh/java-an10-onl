package Lesson11.Part1.View;

import Lesson11.Part1.Check.CompareCheck;

public class ConsoleView implements View {
    private CompareCheck controller;

    public ConsoleView(CompareCheck controller) {
        this.controller = controller;
    }

//  Вывод результата последнего сравнения
    public void displayResults() {
        System.out.println(controller.getLastResults());
    }

//   Вывод резульатта всех сравнений
    public void displayAllResults() {
        System.out.println(controller.getAllResults());
    }
}