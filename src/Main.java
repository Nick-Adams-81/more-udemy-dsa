import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();

        list.append(5);
        list.append(6);
        list.append(7);
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();

        list.removeLast();
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();
    }
}
