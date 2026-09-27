package linkedList;

public class DLL {
    private Node Head;
//    private Node Tail;
    private int size;

    public DLL (){
        this.size = 0;
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = Head;
        node.prev = null;
        if(Head != null){
            Head.prev = node;
        }
        Head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node Tail = Head;

        node.next = null;

        if(Head == null){
            node.next = null;
            Head = node;
            return;
        }

        while(Tail.next != null){
            Tail = Tail.next;
        }

        Tail.next = node;
        node.prev = Tail;
    }

    public Node find(int val){
        Node node = Head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node p = find(after);

        if(p == null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
        node.prev = p;
        node.next = p.next;
        p.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = Head;
        while(node != null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertLast(3);
        list.insertLast(6);
        list.insertFirst(1);
        list.insert(1,2);
        list.display();
    }
}
