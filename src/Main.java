import DoublyLinkedList.DLL;
import LinkedList.LinkedList;
import Queue.Queue;
import Stack.Stack;
import Trees.BST;

public class Main {

    public static void main(String[] args) {

//        LinkedList newList = new LinkedList(1);
//        newList.printList();
//        newList.append(2);
//        newList.append(3);
//        System.out.println("\n");
//        newList.printList();
//
//        newList.removeFirst();
//        System.out.println("\n");
//        newList.printList();
//        newList.printHead();
//        newList.printTail();
//        newList.printLength();
//
//        newList.removeLast();
//        newList.printList();
//        newList.printHead();
//        newList.printTail();
//        newList.printLength();
//
//        System.out.println(newList.get(0).value);
//
//        newList.prepend(100);
//        newList.append(30);
//        newList.append(40);
//        newList.printList();
//        newList.printHead();
//        newList.printTail();
//        newList.printLength();
//
//        newList.set(0, 12);
//
//        newList.printHead();
//        newList.printTail();
//        newList.printLength();
//        newList.printList();
//        System.out.println("\n");
//
//        LinkedList myList = new LinkedList(1);
//        myList.append(2);
//        myList.append(3);
//        myList.prepend(0);
//        myList.printList();
//        myList.printHead();
//        myList.printTail();
//        myList.printLength();
//
//        myList.insert(2, 500);
//        myList.printList();
//        myList.printHead();
//        myList.printTail();
//        myList.printLength();
//
//        myList.remove(2);
//        myList.printList();
//        myList.printHead();
//        myList.printTail();
//        myList.printLength();
//
//        myList.reverse();
//        myList.printList();
//
//        System.out.println(myList.findMiddleNode().value);

        DLL dll = new DLL(1);
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        dll.append(2);
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        dll.removeLast();
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        dll.prepend(0);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        dll.removeFirst();
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        System.out.println(dll.get(0).value);

        dll.set(2, 300);
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        dll.insert(4, 234);
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        dll.remove(2);
        dll.remove(3);
        dll.printList();
        dll.printLength();
        dll.printHead();
        dll.printTail();

        Stack stack = new Stack(1);
        stack.printStack();
        stack.printTop();
        stack.printHeight();

        stack.push(2);
        stack.push(3);
        stack.printStack();
        stack.printTop();
        stack.printHeight();

        stack.pop();
        stack.printStack();
        stack.printTop();
        stack.printHeight();

        Queue queue = new Queue(1);
        queue.printFirst();
        queue.printLast();
        queue.printLength();
        queue.printQueue();

        queue.enqueue(2);
        queue.enqueue(3);
        queue.printFirst();
        queue.printLast();
        queue.printLength();
        queue.printQueue();

        queue.dequeue();
        queue.printFirst();
        queue.printLast();
        queue.printLength();
        queue.printQueue();

        System.out.println("\n");
        BST bst = new BST();

        bst.insert(52);
        bst.insert(18);
        bst.insert(76);
        bst.insert(21);
        bst.insert(47);
        bst.insert(82);
        System.out.println(bst.root.left.right.value);

    }
}
