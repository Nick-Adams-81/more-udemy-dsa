package Stack;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printTop() {
        System.out.println("Top: " + top.value);
    }

    public void printHeight() {
        System.out.println("Height: " + height);
    }

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
