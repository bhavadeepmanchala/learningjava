package strings;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        Node left;
        int value;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of" + node.value);
        boolean left = scanner.nextBoolean();
        if(left) {
            System.out.println("Enter the value of the left node of:" + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right node of:" + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of:" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
           populate(scanner, node.right);
        }
    }
    public void display(){
        display(this.root, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right, level + 1);//start from right because top --> right tooo bottom --> left

        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|---->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    public void inorder(){
        inorder(root);
    }

    private void inorder(Node node){
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
        System.out.println("\t");
        tree.prettyDisplay();
        System.out.println("\t");
        tree.preorder();
        System.out.println("\t");
        tree.inorder();
        System.out.println("\t");
        tree.postorder();
    }

}
