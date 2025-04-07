package linkedlist;

public class LiList {
    static class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    Node head;
    Node tail;
    int length;
    public LiList(int value){
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        length = 1;
    }

    private void insert(int value){
        Node node = new Node(value);
        if (length == 0){
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            this.tail = node;
            length++;
        }
    }
    private void printList(){
        Node node = head;
        int i = 1;
        while (node != null){
            if (i==1)
                System.out.print("["+node.hashCode()+"] "+node.value+" ->");

            else if (i==length)
                System.out.print("["+node.hashCode()+"] "+node.value+" ->null");
            else
                System.out.print("["+node.hashCode()+"] "+node.value+" ->");
            i++;
            node = node.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LiList liList = new LiList(1);
        liList.insert(2);
        liList.insert(3);
        liList.insert(3);

        liList.printList();
        System.out.println(liList.length);
    }
}
