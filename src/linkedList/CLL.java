package linkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(head != null){
            while(node.next != head){
                System.out.print(node.val + "->");
                node = node.next;
            }
            System.out.println("END");
        }
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(81);
        list.insert(4);
        list.insert(6);
        list.insert(9);
        list.insert(7);
        list.display();

    }

}
