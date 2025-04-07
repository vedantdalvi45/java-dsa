package linkedlist;


import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {
    static class Node{
        int value ;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    public LinkedListDemo (int value){
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public void printList(){
        Node temp = head;
        int i =1;
        while (temp != tail.next){
            if (i == 1)
                System.out.print(temp.value+"->");
            else if (i == length)
                System.out.printf(temp.value+"->null");
            else
                System.out.print(temp.value+"->");
            i++;
            temp = temp.next;
        }
        System.out.println();
    }
    public void addNode(int val){
        Node newnode = new Node(val);
        if (length == 0){
            head = newnode;
        }
        else {
            tail.next = newnode;
        }
        tail = newnode;
        length++;
    }
    public void search(int val){
        Node node = head;
        int position = 0;
        List<Integer> elements= new ArrayList<>();
        while (node != null){
            if (node.value == val)
                elements.add(position);
            node = node.next;
            position++;
        }
        if (elements.isEmpty())
            System.out.println("element not found");
        else
            System.out.println("Found at Positions : "+elements);
    }


public int removeLast(){
        Node temp = head;
        Node pre = head;

        while (temp != null){
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        length--;
        if (length == 0){
            this.head = null;
            this.tail = null;
        }
        return pre.value;
}
public void prepend(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        length++;
}

    public static void main(String[] args) {
        LinkedListDemo listDemo = new LinkedListDemo(1);
        listDemo.addNode(2);
        listDemo.addNode(3);
        listDemo.addNode(3);
        listDemo.addNode(2);
        listDemo.printList();

        listDemo.search(3);
        listDemo.prepend(10);
        listDemo.printList();
//        System.out.println("Removed Element : "+listDemo.removeLast());
    }
}
