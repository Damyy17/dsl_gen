package antlr.Strategy;

import antlr.DSLExceptions.IncompatibleTypeException;

public class EvaluationStringStrategy implements EvaluationStrategy{
    @Override
    public String eval(Object a, Object b, String sign) throws IncompatibleTypeException {
        return eval((String) a, (String) b, sign);
    }

    public String eval(String value1, String value2, String sign) throws IncompatibleTypeException {
        switch (sign){
            case "==":
                if(value1.equals( value2)) return "true";
                else return "false";
            case "!=":
                if(!value1.equals( value2)) return "true";
                else return "false";
            default:
                throw new IncompatibleTypeException("Incompatible Type Exception is occured! " + value1 + " and " + value2 + " can't be compared through " + sign);
        }
    }
}
