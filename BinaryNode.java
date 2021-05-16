//
// Name: Chokboonanun, Saharat
// Project: 4
// Due: 4/29/2021
// Course: cs-2400-03-sp21
//
// Description:
// Using the postfix to create a tree and output the evaluation of the postfix and nodes
//

class BinaryNode<T>{

    private T  data;
    BinaryNode<T> leftChild;  
    BinaryNode<T> rightChild; 

    public BinaryNode(){
        this(null); 
    } 

    public BinaryNode(T dataPortion){
        this(dataPortion, null, null); 
    } 

    public BinaryNode(T dataPortion, BinaryNode<T> newLeftChild, BinaryNode<T> newRightChild){
        data = dataPortion;
        leftChild = newLeftChild;
        rightChild = newRightChild;
    } 

    public T getData(){
        return data;
    } 

    public void setData(T newData){
        data = newData;
    } 
  
    public BinaryNode<T> getLeftChild(){
        return leftChild;
    } 

    public void setLeftChild(BinaryNode<T> newLeftChild){
        leftChild = newLeftChild;
    }

    public boolean hasLeftChild(){
        return leftChild != null;
    } 
   
    public BinaryNode<T> getRightChild(){
        return rightChild;
    } 

    public void setRightChild(BinaryNode<T> newRightChild){
        rightChild = newRightChild;
    }  

    public boolean hasRightChild(){
        return rightChild != null;
    } 

    public boolean isLeaf(){
        return (leftChild == null) && (rightChild == null);
    } 


} 