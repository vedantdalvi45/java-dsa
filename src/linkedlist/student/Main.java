package linkedlist.student;

public class Main {


    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addStudent(1,"Ajay",'c');
        linkedList.addStudent(2,"Bijay",'b');
        linkedList.addStudent(3,"Vijay",'d');

        linkedList.printList();

    }

}
