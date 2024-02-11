package seminar.seminar_4.task2.my_exception;

public class BuyerNotExistException extends Exception{
    public BuyerNotExistException() {
    }

    public BuyerNotExistException(String message) {
        super(message);
    }
}
