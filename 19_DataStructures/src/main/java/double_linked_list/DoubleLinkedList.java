package double_linked_list;

/**
 * Класс DoubleLinkedList.
 * Методы для работы с двухсвязным списком.
 */
public class DoubleLinkedList<S> {
    private ListItem topNode;
    private ListItem lastNode;

    /**
     * Метод getHeadElement.
     * Геттер для topNode.
     *
     * @return верхний элемент списка.
     */
    public ListItem getHeadElement()
    {
        if (topNode == null) return null;
        return topNode;
    }

    /**
     * Метод getTailElement.
     * Геттер для lastNode.
     *
     * @return последний элемент списка.
     */
    public ListItem getTailElement()
    {
        if (lastNode == null) return null;
        return lastNode;
    }

    /**
     * Метод removeHeadElement.
     * Удаление верхнего элемента списка.
     */
    public void removeHeadElement() {
        if (topNode != null) {
            topNode = topNode.getNext();
            topNode.setPrev(null);
        }
    }

    /**
     * Метод removeTailElement.
     * Удаление последнего элемента списка.
     */
    public void removeTailElement() {
        if (lastNode != null) {
            lastNode = lastNode.getPrev();
            if (lastNode != null) lastNode.setNext(null);
        }
    }

    /**
     * Метод popHeadElement.
     * Извлечение верхнего элемента списка.
     *
     * @return верхний элемент списка.
     */
    public ListItem popHeadElement() {
        ListItem node = topNode;
        if (node != null) {
            topNode = topNode.getNext();
            if (topNode != null) topNode.setPrev(null);
            node.setNext(null);
        }
        return node;
    }

    /**
     * Метод popTailElement.
     * Извлечение последнего элемента списка.
     *
     * @return последний элемент списка.
     */
    public ListItem popTailElement() {
        ListItem node = lastNode;
        if (node != null) {
            lastNode = lastNode.getPrev();
            if (lastNode != null) lastNode.setNext(null);
            node.setPrev(null);
        }
        return node;
    }

    /**
     * Метод addToHead.
     * Добавление элемента наверх.
     */
    public void addToHead(ListItem node) {
        node.setNext(topNode);
        if (topNode != null) {
            topNode.setPrev(node);
            node.setNext(topNode);
            if (topNode.getNext() == null) {
                lastNode = topNode;
            }
        }
        topNode = node;
        if (lastNode == null) {
            lastNode = topNode;
        }
    }
    /**
     * Метод addToTail.
     * Добавление элемента в конец.
     */
    public void addToTail(ListItem node) {
        node.setPrev(lastNode);
        if (lastNode != null) {
            lastNode.setNext(node);
            node.setPrev(lastNode);
            if (lastNode.getPrev() == null) {
                topNode = lastNode;
            }
        }
        lastNode = node;
        if (topNode == null) {
            topNode = lastNode;
        }
    }
}
