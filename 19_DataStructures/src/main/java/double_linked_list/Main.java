package double_linked_list;

public class Main
{
        public static void main(String[] args) {
                DoubleLinkedList<String> linkedList = new DoubleLinkedList<>();
                linkedList.addToHead(new ListItem("String 1"));
                linkedList.addToHead(new ListItem("String 2"));
                linkedList.addToHead(new ListItem("String 3"));
                linkedList.addToTail(new ListItem("String 4"));
                linkedList.addToTail(new ListItem("String 5"));
                linkedList.addToTail(new ListItem("String 6"));
                linkedList.removeHeadElement();
                System.out.println("Head Element deleted");
                linkedList.removeTailElement();
                System.out.println("Tail Element deleted");
                System.out.println(linkedList.popHeadElement());
                System.out.println(linkedList.popHeadElement());
                System.out.println(linkedList.popHeadElement());
                System.out.println(linkedList.popTailElement());
                System.out.println(linkedList.popTailElement());
                System.out.println(linkedList.popTailElement());
        }
}