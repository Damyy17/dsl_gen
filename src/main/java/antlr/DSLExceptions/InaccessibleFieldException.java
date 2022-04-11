package antlr.DSLExceptions;

public class InaccessibleFieldException extends GrammarExceptions{

    public InaccessibleFieldException() {
        super("Inaccessible Field Exception is occurred!");
    }

    public InaccessibleFieldException(String message) {
        super(message);
    }

    public InaccessibleFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public InaccessibleFieldException(Throwable cause) {
        super(cause);
    }

    public InaccessibleFieldException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
