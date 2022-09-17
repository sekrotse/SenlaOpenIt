package by.senla.openit.exception;

public class DataValidException extends RuntimeException {
    public DataValidException() {
    }

    public DataValidException(String message) {
        super(message);
    }

    public DataValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidException(Throwable cause) {
        super(cause);
    }
}

