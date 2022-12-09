package antlr.Strategy;

import antlr.DSLExceptions.IncompatibleTypeException;

public class EvaluationBoolStrategy implements EvaluationStrategy{

    @Override
    public String eval(Object a, Object b, String sign) throws IncompatibleTypeException {
        return eval((boolean)a, (boolean) b, sign);
    }

    public String eval(boolean value1, boolean value2, String sign) throws IncompatibleTypeException {
        switch (sign){
            case "and":
                if(value1 && value2) return "true";
                else return "false";
            case "or":
                if(value1 || value2) return "true";
                else return "false";
            case "==":
                if(value1 == value2) return "true";
                else return "false";
            case "!=":
                if(value1 != value2) return "true";
                else return "false";
            default:
                throw new IncompatibleTypeException("Incompatible Type Exception is occured! " + value1 + " and " + value2 + " can't be compared through " + sign);
        }
    }
}
