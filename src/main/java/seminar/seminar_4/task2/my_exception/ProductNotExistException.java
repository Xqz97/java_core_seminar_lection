package seminar.seminar_4.task2.my_exception;

public class ProductNotExistException extends Exception{
    public ProductNotExistException() {
    }

    public ProductNotExistException(String message) {
        super(message);
    }
}
