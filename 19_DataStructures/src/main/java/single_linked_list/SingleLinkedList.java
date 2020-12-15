package single_linked_list;

/**
 * Класс SingleLinkedList.
 * Класс для работы с односвязанным списком.
 */
public class SingleLinkedList<S> {
    private ListItem item;

    /**
     * Метод push.
     * Добавбление элемента в список.
     */
    public void push(ListItem node) {
        if (item != null) {
            node.setNext(item);
        }
        item = node;
    }

    /**
     * Метод pop().
     * Извлечение элемента из списка.
     *
     * @return элемент списка.
     */
    public ListItem pop() {
        ListItem node = item;
        if (item != null) {
            item = item.getNext();
            node.setNext(null);
        }
        return node;
    }

    /**
     * Метод removeTop().
     * Удаление верхнего элемента списка.
     */
    public void removeTop() {
        if (item != null) {
            item = item.getNext();
        }
    }

    /**
     * Метод removeLast().
     * Удаление последнего элемента списка.
     */
    public void removeLast() {
        if (item != null) {
            if (item.getNext() != null) {
                ListItem previous = item;
                ListItem current = item.getNext();
                while (current.getNext() != null) {
                    previous = current;
                    current = current.getNext();
                }
                previous.setNext(null);
            }
        }
    }
}

