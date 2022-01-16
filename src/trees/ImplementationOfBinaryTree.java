package trees;

import java.util.Scanner;

//Anuj Video

/**
 *           1
 *         /  \
 *        2    3
 *       / \   /
 *      4   5  6
 */
public class ImplementationOfBinaryTree {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();

        System.out.println("Inorder traversal :: ");
        inorder(root);
        System.out.println("\n Preorder traversal :: ");
        preorder(root);
        System.out.println("\n Postorder traversal :: ");
        postorder(root);
        System.out.println();

        int height = findHeight(root);
        System.out.println("height of the tree = "+height);

        int size = findSize(root); // no of nodes present in the tree.
        System.out.println("size of binary tree: "+ size);

        int max = findMax(root); // max node in the tree.
        System.out.println("max node in binary tree: "+ max);  // space complexity : O(h) , Time Complexity : O(n)
    }

    public static Node createTree(){
        Node root = null;
        System.out.println("enter data : ");
        int data =sc.nextInt();
        if(data == -1) return null;
        root = new Node(data);

        System.out.println("enter left for "+data);
        root.left = createTree();

        System.out.println("enter right for "+ data);
        root.right = createTree();

        return root;
    }

    static void inorder(Node root){
        if(root == null) return;
            //LVR
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root){
        if(root == null) return;
        //VLR
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root){
        if(root == null) return;
        //LRV
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // can be any definition :: nodes kitni hai??? (here we are using this) or edges kitni hai???
    static int findHeight(Node root){
        if(root == null)
            return 0;
        return Math.max( findHeight(root.left), findHeight(root.right))+1;
    }

    static int findSize(Node root){
        if(root == null)
            return 0;
        return findSize(root.left) + findSize(root.right) + 1;
    }

    static int findMax(Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data ,
                       Math.max(
                               findMax(root.left) ,
                               findMax(root.right)));
    }
}

class Node {

    Node left , right;
    int data;
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}