package antlr.DSLExceptions;

public class NonSpecifiedAlleleException extends SemanticExceptions {

    public NonSpecifiedAlleleException() {
        super("Non Specified Allele Exception is occurred!");
    }

    public NonSpecifiedAlleleException(String message) {
        super(message);
    }

    public NonSpecifiedAlleleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NonSpecifiedAlleleException(Throwable cause) {
        super(cause);
    }

    public NonSpecifiedAlleleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
