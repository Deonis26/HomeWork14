package Train;

public class NotEnoughFuelException extends RuntimeException{
    public NotEnoughFuelException() {
    }

    public NotEnoughFuelException(String message) {
        super(message);
    }

    public NotEnoughFuelException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughFuelException(Throwable cause) {
        super(cause);
    }

    public NotEnoughFuelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
