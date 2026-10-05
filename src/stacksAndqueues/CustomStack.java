package stacksAndqueues;

import java.util.EmptyStackException;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack in Full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop()throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop an empty stack!");
        }

        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = ptr ; i >=0 ; i--) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(7);

        stack.push(9);
        stack.push(8);
        stack.push(5);
        stack.display();

        stack.pop();

        stack.display();
        System.out.println(stack.peek());


    }

}
