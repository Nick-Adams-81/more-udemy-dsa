import DoublyLinkedList.DLL;
import Graph.Graph;
import HashTable.HashTable;
import Heap.Heap;
import LinkedList.LinkedList;
import Queue.Queue;
import Stack.Stack;
import Trees.BST;

public class Main {

    public static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n -1);
    }

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

        System.out.println(bst.contains(1));
        System.out.println("recursive contains: " + bst.rContains(25));
        bst.rInsert(25);
        System.out.println(bst.rContains(25));


        HashTable table = new HashTable();
        table.printTable();

        table.set("Nails", 10);
        table.set("Hammer", 45);
        table.set("Screws", 14);
        table.set("Screw Driver", 80);
        table.set("Bolts", 34);

        table.printTable();

        System.out.println(table.get("Screws"));

        System.out.println(table.keys());

        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.printGraph();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.printGraph();

        graph.removeEdge("B", "C");
        graph.printGraph();

        graph.removeVertex("C");
        graph.printGraph();

        Heap heap = new Heap();
        heap.insert(100);
        heap.insert(99);
        heap.insert(75);
        heap.insert(61);
        System.out.println(heap.getHeap());

        heap.remove();
        System.out.println(heap.getHeap());

        System.out.println(factorial(4));



    }
}
