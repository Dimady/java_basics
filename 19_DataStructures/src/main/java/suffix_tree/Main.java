package suffix_tree;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SuffixTree suffixTree = new SuffixTree("this text tightly some terrible sophisticated text");
        List<String> matches1 = suffixTree.searchText("text");
        matches1.stream().forEach(m -> System.out.println(m));
        System.out.println();
        List<String> matches2 = suffixTree.searchText("terrible");
        matches2.stream().forEach(m -> System.out.println(m));
        System.out.println();
        List<String> matches3 = suffixTree.searchText("true");
        matches3.stream().forEach(m -> System.out.println(m));
    }
}
