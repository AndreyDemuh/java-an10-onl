package Lesson11.Part1.Collection;

import java.util.ArrayList;
import java.util.Objects;

//Класс ArrayList с переопределенными методами
    public class ArrayListCreate implements CreatorCollection<Integer> {
        private ArrayList<Integer> list;
        private final int elementsCount;

        public ArrayListCreate(int elementsCount) {
            this.elementsCount = elementsCount;
            this.list = new ArrayList<>(elementsCount);
            fillList();
        }

        @Override
        public void addToBeginning(Integer element) {
            list.add(0, element);
        }

        @Override
        public void addToMiddle(Integer element, int index) {
            list.add(index, element);
        }

        @Override
        public void addToEnd(Integer element) {
            list.add(list.size() - 1, element);
        }

        @Override
        public void removeFromBeginning() {
            list.remove(0);
        }

        @Override
        public void removeFromMiddle(int index) {
            list.remove(index);
        }

        @Override
        public void removeFromEnd() {
            list.remove(list.size() - 1);
        }

        @Override
        public Integer takeByIndexFromBeginning() {
            return list.get(0);
        }

        @Override
        public Integer takeByIndexFromMiddle(int index) {
            return list.get(index);
        }

        @Override
        public Integer takeByIndexFromEnd() {
            return list.get(list.size() - 1);
        }

        @Override
        public Integer findingByElement(Integer element) {
            for (int i = 0; i < list.size(); i++) {
                Integer e = list.get(i);
                if (Objects.equals(e, element)) {
                    return e;
                }
            }
            return null;
        }

        private void fillList() {
            for (int i = 0; i < elementsCount; i++) {
                list.add(i, 1);
            }
        }
    }

