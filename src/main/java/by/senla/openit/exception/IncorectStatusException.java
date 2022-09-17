package by.senla.openit.exception;

public class IncorectStatusException extends RuntimeException {
    public IncorectStatusException() {
    }

    public IncorectStatusException(String message) {
        super(message);
    }

    public IncorectStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorectStatusException(Throwable cause) {
        super(cause);
    }

    public IncorectStatusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
