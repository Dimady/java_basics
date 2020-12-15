package bubble_sort;

import abstract_class.AbstractSortArrayClass;

class BubbleSortTest extends AbstractSortArrayClass {

    @Override
    public void sortArray(int[] array) {
        BubbleSort.sort(array);
    }
}