import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList newList = new LinkedList(1);
        newList.printList();
        newList.append(2);
        newList.append(3);
        System.out.println("\n");
        newList.printList();

        newList.removeFirst();
        System.out.println("\n");
        newList.printList();
        newList.printHead();
        newList.printTail();
        newList.printLength();

        newList.removeLast();
        newList.printList();
        newList.printHead();
        newList.printTail();
        newList.printLength();

        System.out.println(newList.get(0).value);


    }
}
