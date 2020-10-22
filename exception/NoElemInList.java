package exception;

public class NoElemInList extends Exception {

    public NoElemInList() {
    }

    public NoElemInList(String message) {
        super(message);
    }

    public NoElemInList(String message, Throwable cause) {
        super(message, cause);
    }

    public NoElemInList(Throwable cause) {
        super(cause);
    }

    public NoElemInList(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
