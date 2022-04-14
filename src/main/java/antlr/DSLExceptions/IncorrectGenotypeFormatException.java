package antlr.DSLExceptions;

public class IncorrectGenotypeFormatException extends SemanticExceptions {

    public IncorrectGenotypeFormatException() {
        super("Incorrect Genotype Format Exception is occurred!");
    }

    public IncorrectGenotypeFormatException(String message) {
        super(message);
    }

    public IncorrectGenotypeFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectGenotypeFormatException(Throwable cause) {
        super(cause);
    }

    public IncorrectGenotypeFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
