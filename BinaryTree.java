//
// Name: Chokboonanun, Saharat
// Project: 4
// Due: 4/29/2021
// Course: cs-2400-03-sp21
//
// Description:
// Using the postfix to create a tree and output the evaluation of the postfix and nodes
//

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

class BinaryTree<T> implements BinaryTreeInterface<T>{
    
    public BinaryNode<T> root;

    public BinaryTree(){
        root = null;
    } 

    public BinaryTree(T rootData){
        root = new BinaryNode<>(rootData);
    } 

    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        initializeTree(rootData, leftTree, rightTree);
    } 

    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree){
        initializeTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
    } 

    private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
        root = new BinaryNode<>(rootData);

        if(leftTree != null)
            root.setLeftChild(leftTree.root);

        if(rightTree != null)
            root.setRightChild(rightTree.root);
    }

    public T getRootData(){
            return root.getData();
    } 

    public boolean isEmpty(){
        return root == null;
    } 

    public void clear(){
        root = null;
    }

    public void setRootData(T rootData){
        root.setData(rootData);
    }

    // protected void setRootNode(BinaryNode<T> rootNode){
    //     root = rootNode;
    // } 

    public BinaryNode<T> getRootNode(){
        return root;
    } 
} 
