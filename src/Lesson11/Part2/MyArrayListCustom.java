package Lesson11.Part2;

import java.util.Arrays;

public class MyArrayListCustom <T>{

        private static final int LENGTH_LIST = 15;
        private T[] array;
        private int size = 0;


        public MyArrayListCustom() {
            this(LENGTH_LIST);
        }

        public MyArrayListCustom(int size) {
            array = (T[]) new Object[size];
        }
        // Добавление элемента
        public void add(T element) {
            if (array.length == size) {
                T[] tmpArr = (T[]) new Object[size * 2];
                System.arraycopy(array, 0, tmpArr, 0, size);
                array = tmpArr;

            }
            array[size] = element;
            size += 1;
        }

        //получение элемента по индексу (с проверкой)
        public T get(int index) throws ArrayIndexOutOfBoundsException {
            if (index > array.length) {
                throw new ArrayIndexOutOfBoundsException("Индекс " + index + " за пределами длинны массива " + array.length);
            }
            return array[index];
        }

        //Проверка массива на наличие элемента
        public boolean hasElement(T element) {
            for (T e : array) {
                if (e != null && e.equals(element)) {
                    return true;
                }
            }
            return false;
        }

        //метод удаления всех элементов
        public void clear() {
            for (int i = 0; i < size; i++) {
                array[i] = null;
            }
            size = 0;
        }
        // удаление элемента
        public boolean remove(T element) {
            for (int i = 0; i < size; i++) {
                if (array[i] != null && array[i].equals(element)) {
                    return remove(i);
                }
            }
            return false;
        }

        //Удаление элемента по индексу (с проверкой на исключение)
        public boolean remove(int index) throws ArrayIndexOutOfBoundsException {
            if (index >= size) {
                throw new ArrayIndexOutOfBoundsException("В массиве после  значение " + index + " имеет значение null" );
            }
            if (index != size) {
                System.arraycopy(array, index + 1, array, index, size - index - 1);
                array[size - 1] = null;
            }
            if (size != 0) {
                size -= 1;
            }
            return true;
        }

        @Override
        public String toString() {
            return Arrays.toString(array);
        }
    }
