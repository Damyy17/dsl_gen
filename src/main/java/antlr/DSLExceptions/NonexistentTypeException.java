package antlr.DSLExceptions;

public class NonexistentTypeException extends SemanticExceptions {

    public NonexistentTypeException() {
        super("Nonexistent Type Exception is occurred!");
    }

    public NonexistentTypeException(String message) {
        super(message);
    }

    public NonexistentTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentTypeException(Throwable cause) {
        super(cause);
    }

    public NonexistentTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
