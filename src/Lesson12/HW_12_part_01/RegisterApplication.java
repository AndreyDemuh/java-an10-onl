package Lesson12.HW_12_part_01;


import java.util.HashMap;
import java.util.Map;

public class RegisterApplication {
    public static void main(String[] args) {

        //Создаем работников (объекты)
        Worker worker1 = new Worker("Игорь", "Фролов", "Федорович", 34, "Штамповщик",
                new Report(5000, 10000, 2500), 1, "18.04.2021");

        Worker worker2 = new Worker("Семен", "Иванов", "Кириллович", 24, "Грузчик",
                new Report(4000, 6000, 1300), 2, "10.03.2021");

        Worker worker3 = new Worker("Игнат", "Долгов", "Михайлович", 48, "Слесарь",
                new Report(600, 200, 1500), 3, "22.08.2020");

        Worker worker4 = new Worker("Кирилл", "Крылов", "Сергеевич", 20, "Монтажник",
                new Report(600, 800, 900), 3, "12.10.2021");

        //Создаем Map и заполняем его нашими объектами
        Map<Integer, Worker> WorkerMap = new HashMap<>();
        WorkerMap.put(1,worker1);
        WorkerMap.put(2,worker2);
        WorkerMap.put(3,worker3);
        WorkerMap.put(4,worker4);


        //выводим информацию
        printInfo(WorkerMap);

    }
// метод для итеррации нащих объектов содержащихся в Map
    public static <K,V> void printInfo(Map<K,V> map) {
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

}
