package antlr.DSLExceptions;

public class NonexistentFieldException extends SemanticExceptions {

    public NonexistentFieldException() {
        super("Nonexistent Field Exception is occurred!");
    }

    public NonexistentFieldException(String message) {
        super(message);
    }

    public NonexistentFieldException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonexistentFieldException(Throwable cause) {
        super(cause);
    }

    public NonexistentFieldException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
