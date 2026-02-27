class SinglyLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return;
        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(int key){
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data == key) {
                if (prev != null) {
                    prev.next = current.next;
                } else {
                    head = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void traverse(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class LinkedListEx {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtHead(17);
        linkedList.insertAtHead(18);
        linkedList.insertAtHead(19);
        linkedList.insertAtHead(76);
        linkedList.insertAtHead(44);

        linkedList.insertAtPosition(34,3);

        linkedList.delete(76);
        System.out.println(linkedList.search(19));
        System.out.println(linkedList.search(30));

        linkedList.traverse();
    }
}
