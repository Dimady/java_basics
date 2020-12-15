package binary_search;

import java.util.ArrayList;

public class BinarySearch {
    private static ArrayList<String> list;

    public BinarySearch(ArrayList<String> list) {
        this.list = list;
    }

    public static int search(String query) {
        return search(query, 0, list.size());
    }

    private static int search(String query, int from, int to) {
            int middle = (from + to) / 2;
            if (to < from) {
                return -1;
            }
            int comparsion = query.compareTo(list.get(middle));
            if (comparsion == 0) {
                return middle;
            }
            if ((from == middle) && (middle == (to - 1))) {
            return -1;
            }
            if (comparsion > 0) {
                return search(query, middle, to);
            }
            return search(query, from, middle);
    }
}
