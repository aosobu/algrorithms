package DataStructures.stack;

import DataStructures.Exceptions.EmptyStackException;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class LinkedListStack<T> {

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
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String [] args){
        LinkedListStack<String> stackOfStrings = new LinkedListStack<>();

        System.out.println("Popped Item : " + stackOfStrings.pop());

        stackOfStrings.push("to");
        stackOfStrings.push("be");
        stackOfStrings.push("or not");
    }
}
