package linkedList;

public class LL {
    private Node Head;
    private Node Tail;
    private int size;

    public LL (){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = Head;
        Head = node;

       if(Tail == null){
           Tail = Head;
       }
       size += 1;
    }

    public void insertLast(int val){
        if(Tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Tail.next = node;
        Tail = node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
       if(index == size){
           insertLast(val);
           return;
       }
       Node temp = Head;
       for(int i = 1; i < index; i++){
           temp = temp.next;
       }
       Node node = new Node(val, temp.next);
       temp.next = node;

       size++;
    }

    public int deleteFirst(){
        int val = Head.value;
        Head = Head.next;
        if(Head == null){
            Tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = Tail.value;
        Tail = secondLast;
        Tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node node = Head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
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

    public void display() {
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.value + "->" );
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        LL first = new LL();
        first.insertLast(5);
        first.insertFirst(55);
        first.insertLast(43);
        first.insertLast(42);
        first.insertFirst(6);
        first.insert(7,1);
        first.insertLast(13);
        first.insert(45,3);
        first.display();
        first.deleteFirst();
        first.display();
        first.deleteLast();
        first.display();
        first.delete(3);
        first.display();
    }
}


