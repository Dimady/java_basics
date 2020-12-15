package single_linked_list;

public class Main
{
public static void main(String[] args) {
        SingleLinkedList<String> linkedList = new SingleLinkedList<>();
        linkedList.push(new ListItem("String 1"));
        linkedList.push(new ListItem("String 2"));
        linkedList.push(new ListItem("String 3"));
        linkedList.push(new ListItem("String 4"));
        linkedList.push(new ListItem("String 5"));
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        linkedList.removeLast();
        linkedList.removeTop();
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        }
}