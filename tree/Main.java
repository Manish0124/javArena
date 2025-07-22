// package tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();

        // tree.populate(sc);
        // // tree.display();
        // tree.prettyDisplay();

        // using bst 

        // BST tree = new BST();

        // int[] nums = { 5 , 4, 7, 12, 3, 2, 1, 9};

        // tree.populate(nums);

        // tree.display();


        AVL tree = new AVL();

        for(int i = 0; i < 1000; i++){
            tree.insert(i);
        }
         
        //   something went wrong
        System.out.println(tree.height());

    }
}
