package tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node {
        int value;
        Node left ;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert element;
    public void populate(Scanner scanner){
        System.out.println("enter your root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }


    // lets make the recursive function to insert the node 
    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter left of : " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("ENTER the value of left of  : " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
    }
  
}
