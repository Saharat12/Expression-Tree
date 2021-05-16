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

public interface TreeIteratorInterface<T>{
    public Iterator<T> getPreorderIterator();
    public Iterator<T> getPostorderIterator();
    public Iterator<T> getInorderIterator();
    public Iterator<T> getLevelOrderIterator();
} 