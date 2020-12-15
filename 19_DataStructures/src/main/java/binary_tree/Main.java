package binary_tree;

public class Main
{
    public static void main(String[] args)
    {
        BinaryTree<String> treeList = new BinaryTree<>();
        treeList.addNode("String 9");
        treeList.addNode("String 14");
        treeList.addNode("String 23");
        treeList.addNode("String 30");
        treeList.addNode("String 34");
        treeList.addNode("String 39");
        treeList.addNode("String 47");
        System.out.println(treeList.searchNodes("String 34"));
        System.out.println(treeList.searchNodes("String 10"));
    }
}
