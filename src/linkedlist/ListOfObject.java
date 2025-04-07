package linkedlist;

public class ListOfObject {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int length;

    ListOfObject(int data) {
        this.head = new Node(data);
        this.tail = this.head;
        this.length = 1;
    }

    void insertNode(int data) {
        Node node = new Node(data);
        if (length == 0)
            this.head = node;
        else
            this.tail.next = node;

        this.tail = node;
        length++;
    }

    void printNodes() {
        Node temp = head;
        while (temp != tail.next) {
            System.out.print(temp.data + "[" + temp + "]-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListOfObject list = new ListOfObject(2);
        list.insertNode(3);
        list.printNodes();
        System.out.println(list.length);
    }
}
