class DoublyLinkedList{
    class Node{
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
        }
    }
    Node head, tail;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void deleteFromHead(){
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    public void deleteFromTail(){
        if(tail == null) return;
        if (tail == head) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    public boolean searchFromHead(int key){
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean searchFromTail(int key) {
        Node current = tail;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.prev;
        }
        return false;
    }
    public void traverseForward(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void traverseBackward(){
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "<-");
            current = current.prev;
        }
        System.out.println("null");
    }
}

class DoublyLinkedListEx {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtHead(14);
        doublyLinkedList.insertAtHead(36);
        doublyLinkedList.insertAtHead(62);
        doublyLinkedList.insertAtHead(77);
        doublyLinkedList.insertAtHead(22);

        doublyLinkedList.insertAtTail(48);
        doublyLinkedList.deleteFromHead();

        System.out.println(doublyLinkedList.searchFromHead(36));
        doublyLinkedList.traverseForward();
        System.out.println();
        doublyLinkedList.traverseBackward();
    }
}
