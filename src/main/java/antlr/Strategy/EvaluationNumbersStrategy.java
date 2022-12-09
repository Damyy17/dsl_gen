package antlr.Strategy;

import antlr.DSLExceptions.IncompatibleTypeException;

public class EvaluationNumbersStrategy implements EvaluationStrategy{
    public String eval(double value1, double value2, String sign) throws IncompatibleTypeException {
        switch (sign){
            case ">":
                if(value1 > value2) return "true";
                else return "false";
            case "<":
                if(value1 < value2) return "true";
                else return "false";

            case "<=":
                if(value1 <= value2) return "true";
                else return "false";
            case ">=":
                if(value1 >= value2) return "true";
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
    @Override
    public String eval(Object a, Object b, String sign) throws IncompatibleTypeException {
        return eval((double) a, (double) b, sign);
    }


}
