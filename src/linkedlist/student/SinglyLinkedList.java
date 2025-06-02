package linkedlist.student;

public class SinglyLinkedList {
    Student head;
    Student tail;
    int size = 0;

    public Student addStudent(int roll_no, String name, char div) {
        Student student = new Student();

        student.name = name;
        student.roll_No = roll_no;
        student.div = div;
        if (size == 0) {
            head = student;
        } else
            this.tail.next = student;

        student.next = null;
        this.tail = student;
        size++;
        return student;
    }

    public void printList() {
        Student currentStudent = this.head;
        while (currentStudent != null) {
            System.out.println(currentStudent.roll_No + "   " + currentStudent.name + "   " + currentStudent.div + "    "+ currentStudent.hashCode()   );
            currentStudent = currentStudent.next;
        }
    }

}
