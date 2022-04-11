package antlr.DSLExceptions;

public class UndeclaredVariableException extends GrammarExceptions{

    public UndeclaredVariableException() {
        super("Undeclared Variable Exception is occurred");
    }

    public UndeclaredVariableException(String message) {
        super(message);
    }

    public UndeclaredVariableException(String message, Throwable cause) {
        super(message, cause);
    }

    public UndeclaredVariableException(Throwable cause) {
        super(cause);
    }

    public UndeclaredVariableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
