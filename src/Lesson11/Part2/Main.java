package Lesson11.Part2;

public class Main {
    public static void main(String[] args) {
        MyArrayListCustom<Integer> list = new MyArrayListCustom<>();
        System.out.println(list);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        list.remove(7);
        System.out.println(list);
        list.remove(Integer.valueOf(15));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.hasElement(3));
        list.clear();
        System.out.println(list);
    }
}

