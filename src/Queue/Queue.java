package Queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printFirst() {
        System.out.println("First: " + first.value);
    }

    public void printLast() {
        System.out.println("Last: " + last.value);
    }

    public void printLength() {
        System.out.println("Length: " + length);
    }

    public void printQueue() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
