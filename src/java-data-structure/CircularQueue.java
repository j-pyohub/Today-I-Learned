public class CircularQueue {
    private int[] queue;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    public Integer dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public void display() {
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[index]+" ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        
        circularQueue.enqueue(5);
        circularQueue.enqueue(3);
        circularQueue.enqueue(8);
        circularQueue.enqueue(1);
        circularQueue.enqueue(10);

        circularQueue.display();

        circularQueue.dequeue();

        circularQueue.display();
    }
}
