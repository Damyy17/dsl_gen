package antlr.DSLExceptions;

public class IncompatibleTypeException extends GrammarExceptions{

    public IncompatibleTypeException() {
        super("Incompatible Type Exception is occurred!");
    }

    public IncompatibleTypeException(String message) {
        super(message);
    }

    public IncompatibleTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncompatibleTypeException(Throwable cause) {
        super(cause);
    }

    public IncompatibleTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
