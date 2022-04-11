package antlr.DSLExceptions;

public class ReservedKeywordException extends GrammarExceptions{

    public ReservedKeywordException() {
        super("Reserved Keyword Exception is occurred!");
    }

    public ReservedKeywordException(String message) {
        super(message);
    }

    public ReservedKeywordException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReservedKeywordException(Throwable cause) {
        super(cause);
    }

    public ReservedKeywordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
