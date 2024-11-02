class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortedLinkedList {
    private Node head;

    // Method to insert a node in a sorted order
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the list is empty or new node should be the first element
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            // Find the correct position for the new node
            Node current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();
        
        sortedList.insert(5);
        sortedList.insert(1);
        sortedList.insert(3);
        sortedList.insert(2);
        sortedList.insert(4);

        System.out.print("Sorted Linked List: ");
        sortedList.display();
    }
}
