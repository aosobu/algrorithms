package DataStructures.Exceptions;

public class EmptyStackException extends Exception{

    public EmptyStackException() {
        new EmptyStackException("stack is empty");
    }

    private EmptyStackException(String message) {
        super(message);
    }
}
