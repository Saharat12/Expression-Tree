//
// Name: Chokboonanun, Saharat
// Project: 4
// Due: 4/29/2021
// Course: cs-2400-03-sp21
//
// Description:
// Using the postfix to create a tree and output the evaluation of the postfix and nodes
//
import java.util.Arrays;

public class ExpressionTest {
    public static void main (String[] args){
        System.out.println("Expression Tree by Saharat Chokboonanun");
        System.out.println();

        String temp = "1 2 + 3 /";
        String[] arg = temp.split(" ");

        ExpressionTree expost = new ExpressionTree(arg);

        System.out.println("Input: " + Arrays.toString(arg));
        System.out.println("Value: " + expost.evaluate() + "\n");
        System.out.println("Postorder Traversal: ");
        expost.postorder();
    }
}
