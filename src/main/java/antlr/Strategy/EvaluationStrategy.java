package antlr.Strategy;

import antlr.DSLExceptions.IncompatibleTypeException;

public interface EvaluationStrategy {
     String eval(Object a, Object b, String sign) throws IncompatibleTypeException;
}
