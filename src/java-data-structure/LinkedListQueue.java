class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class LinkedListQueue {
    private Node front;
    private Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public Integer dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.println(current.data + " ");
            current= current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();

        linkedListQueue.enqueue(10);
        linkedListQueue.enqueue(20);
        linkedListQueue.enqueue(30);

        linkedListQueue.display();

        System.out.println(linkedListQueue.dequeue());

        linkedListQueue.display();
    }
}
