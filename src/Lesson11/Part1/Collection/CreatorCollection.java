package Lesson11.Part1.Collection;

public interface CreatorCollection<T> {

//  Интерфейс с необходимыми методами для проведения "сравнения"

//    добавление элемента в начало
    void addToBeginning(T element);

//    добавление элемента в середину
    void addToMiddle(T element, int index);

//    добавление элемента в конец

     void addToEnd(T element);

    //    удадление элемнета с начала
    void removeFromBeginning();

    //    удаление элемнета с середины
    void removeFromMiddle(int index);

    //    удаление элемнета с конца
    void removeFromEnd();

    //    "взятие" элемнета по индексу с начала
    T takeByIndexFromBeginning();

    //    "взятие" элемнета по индексу с середины
    T takeByIndexFromMiddle(int index);

    //    "взятие" элемнета по индексу с конца
    T takeByIndexFromEnd();

    //    поиск элемнета по индексу
    T findingByElement(T element);
}