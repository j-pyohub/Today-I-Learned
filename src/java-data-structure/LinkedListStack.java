public class LinkedListStack {
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int count;

    public LinkedListStack(){
        head = null;
        count = 0;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int item= head.data;
        head = head.next;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(10);
        stack.push(4);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }

}

