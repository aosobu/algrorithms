package DataStructures.Stack;

import DataStructures.Auditing.CustomLogger;
import DataStructures.Exceptions.EmptyStackException;

public class LinkedListStack<T> {
    @java.io.Serial
    static final long serialVersionUID = -7034897190745766939L;
    Node<T> first;

    public class Node<T>{
        T item;
        Node<T> next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(T item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = null;
    }

    public T pop(){
        throwErrorOnEmptyStack();
        T item = first.item;
        first = first.next;
        return item;
    }

    public T peek(){
        throwErrorOnEmptyStack();
        return first.item;
    }

    public void throwErrorOnEmptyStack(){
        if(isEmpty()){
            try {
                throw new EmptyStackException();
            } catch (EmptyStackException e) {
                CustomLogger.logWarningMessage("referenced stack cannot be empty");
                throw new RuntimeException();
            }
        }
    }
}
