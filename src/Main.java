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

        newList.prepend(100);
        newList.append(30);
        newList.append(40);
        newList.printList();
        newList.printHead();
        newList.printTail();
        newList.printLength();

        newList.set(0, 12);

        newList.printHead();
        newList.printTail();
        newList.printLength();
        newList.printList();
        System.out.println("\n");

        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.prepend(0);
        myList.printList();
        myList.printHead();
        myList.printTail();
        myList.printLength();

        myList.insert(2, 500);
        myList.printList();
        myList.printHead();
        myList.printTail();
        myList.printLength();

        myList.remove(2);
        myList.printList();
        myList.printHead();
        myList.printTail();
        myList.printLength();

        myList.reverse();
        myList.printList();

        System.out.println(myList.findMiddleNode().value);

    }
}
