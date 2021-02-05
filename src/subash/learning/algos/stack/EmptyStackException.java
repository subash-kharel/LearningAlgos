package subash.learning.algos.stack;

public class EmptyStackException extends RuntimeException{
    private String exceptionMessage;
    public EmptyStackException(String exceptionMessage){
        this.exceptionMessage = exceptionMessage;
    }
}
