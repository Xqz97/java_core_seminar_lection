package seminar.seminar_4.task2.my_exception;

public class IncorrectQuantityException extends Exception{
    public IncorrectQuantityException() {
    }

    public IncorrectQuantityException(String message) {
        super(message);
    }
}
