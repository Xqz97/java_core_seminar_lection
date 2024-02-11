package seminar.seminar_4.task1.exception;

import lombok.ToString;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
