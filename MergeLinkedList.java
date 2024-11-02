class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLinkedList {
    private Node head;

    // Method to add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to merge two linked lists
    public void merge(MergeLinkedList otherList) {
        if (otherList.head == null) {
            return; // Nothing to merge if the other list is empty
        }
        
        if (head == null) {
            head = otherList.head;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = otherList.head;
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
        MergeLinkedList list1 = new MergeLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.print("List 1: ");
        list1.display();

        MergeLinkedList list2 = new MergeLinkedList();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.print("List 2: ");
        list2.display();

        // Merging list2 into list1
        list1.merge(list2);
        System.out.print("Merged List: ");
        list1.display();
    }
}
