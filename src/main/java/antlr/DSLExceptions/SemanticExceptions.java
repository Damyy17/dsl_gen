package antlr.DSLExceptions;

public class SemanticExceptions extends Exception {

    public SemanticExceptions(){
        super();
    }

    public SemanticExceptions(String message) {
        super(message);
    }

    public SemanticExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public SemanticExceptions(Throwable cause) {
        super(cause);
    }

    public SemanticExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

