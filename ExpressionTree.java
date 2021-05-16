//
// Name: Chokboonanun, Saharat
// Project: 4
// Due: 4/29/2021
// Course: cs-2400-03-sp21
//
// Description:
// Using the postfix to create a tree and output the evaluation of the postfix and nodes
//

import java.util.Stack;

class ExpressionTree extends BinaryTree<String> implements ExpressionTreeInterface{

    public ExpressionTree(String[] postfix){
        Stack st = new Stack<>();

		BinaryTreeInterface<String> t = new BinaryTree<>();
        BinaryTreeInterface<String> t1 = new BinaryTree<>();
        BinaryTreeInterface<String> t2 = new BinaryTree<>();

		for (int i = 0; i < postfix.length; i++) {
			if (isOperator(postfix[i])) {
				BinaryNode rightNode = (BinaryNode) st.pop();
                BinaryNode leftNode = (BinaryNode) st.pop();
            
                t2.setTree(leftNode.toString(), null, null);
                t1.setTree(rightNode.toString(), null, null);

                if(getValueOf(postfix[i]) == 1){
                    t.setTree("+", t1, t2);
                }

                if(getValueOf(postfix[i]) == 2){
                    t.setTree("-", t1, t2);
                }

                if(getValueOf(postfix[i]) == 3){
                    t.setTree("*", t1, t2);
                }

                if(getValueOf(postfix[i]) == 4){
                    t.setTree("/", t1, t2);
                }

                if(getValueOf(postfix[i]) == 5){
                    t.setTree("^", t1, t2);
                }

                t.setTree(postfix[i], t1, t2);
                st.push(new BinaryNode<>(postfix[i], leftNode, rightNode));
			} 
            else {
                t.setTree(postfix[i], t1, t2);
				st.push(new BinaryNode<>(postfix[i], null, null));
			}   
		}

        root = (BinaryNode) st.peek();
    }

    
    public boolean isOperator(String c) {
        return(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^")); 
    }

    public double getValueOf(String c){
        if(c == "+"){
            return 1;
        }else if(c == "-"){
            return 2;
        }else if(c == "*"){
            return 3;
        }else if(c == "/"){
            return 4;
        }else if(c == "^"){
            return 5;
        }else
            return 0;
    }
   
    public double compute(String op, double x, double y){
        if (op.equals("+")) { 
            return x + y; 
        }
        else if (op.equals("-")) { 
            return x - y; 
        }
        else if (op.equals("*")) { 
            return x * y; 
        }
        else if (op.equals("/")) { 
            return x / y; 
        }
        else if (op.equals("^")) { 
            return (int)Math.pow(y,x); 
        }
        else
            return 0;
    }

    public double evaluate(){
        return evaluate(getRootNode());
    } 

    private double evaluate(BinaryNode<String> root){
        double result = 0, operand1, operand2;

        if (root != null){
            if (isOperator(root.getData())){
                operand1 = evaluate(root.getLeftChild());
                operand2 = evaluate(root.getRightChild());
                result = compute(root.getData(), operand1, operand2);
            }
            else
                result = Double.parseDouble(root.getData());
        }
            
        return result;
    }

  
    public void postorder(){
        postorder(getRootNode());
    } 

    private void postorder(BinaryNode<String> root){
        if (root != null){

            postorder(root.getLeftChild());
            postorder(root.getRightChild());

            if(root.isLeaf()){
                System.out.print(root.getData() + " ");
                System.out.println();
            }else{
                System.out.print(root.getLeftChild().getData() + " : " + root.getData() + " : " + root.getRightChild().getData());
                System.out.println();
            }
	    }
    } 
  
} 
 


