package antlr.DSLExceptions;

abstract class GrammarExceptions extends Exception {

    public GrammarExceptions(){
        super();
    }

    public GrammarExceptions(String message) {
        super(message);
    }

    public GrammarExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public GrammarExceptions(Throwable cause) {
        super(cause);
    }

    public GrammarExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

