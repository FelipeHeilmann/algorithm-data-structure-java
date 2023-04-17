package datastructure;

import javax.swing.*;

public class BinarySearchTree {
    // binary search tree = a tree data structure, where each node is grater than it's left child, but less than it's right

    //                      benefit = easy to locate a node when they are in this order

    //                      time complexity: best case O(log(n))
    //                                      worst case O(n)
    //                      space complexity: O(n)
    Node root;

    public void insert(Node node){
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){
        int data = node.treeData;
        if(root == null){
            root = node;
            return root;
        }
        else if(data < root.treeData) {
            root.left = insertHelper(root.left, node);
        }
        else{
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.treeData);
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data){
        if(root == null){
            return false;
        }
        else if (root.treeData == data) {
            return true;
        }
        else if(root.treeData > data){
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }
    }
    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " Could not be found");
        }
    }
    private Node removeHelper(Node root, int data){
        if(root == null){
            return root;
        }
        else if(data < root.treeData){
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.treeData){
            root.right = removeHelper(root.right, data);
        }
        else{
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right != null){
                root.treeData = successor(root);
                root.right = removeHelper(root.right, data);
            }
            else {
                root.treeData = predecessor(root);
                root.left = removeHelper(root.left, data);
            }
        }
        return root;
    }
    private int successor(Node root){
        //find the least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.treeData;
    }
    private int predecessor(Node root){
        //find the greater value below the right child of this root node
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.treeData;
    }
}
