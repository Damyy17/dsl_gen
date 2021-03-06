package antlr.DSLDataType;

import antlr.DSLExceptions.SemanticExceptions;
import antlr.DSLExceptions.IncompatibleTypeException;

public class DSLNumber implements IDataType{
    double value;
    @Override
    public String getType() {
        return "number";
    }
    public String toString(){
        return String.valueOf(value);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String print() {
        return String.valueOf(this.value);
    }

    @Override
    public void setValue(String field, String value) throws SemanticExceptions {
        try{
            this.value = Double.parseDouble(value);
        }catch (Exception e){
            throw new IncompatibleTypeException("IncompatibleTypeException. "+ value + " cannot be attributed to number.");
        }
    }
}
