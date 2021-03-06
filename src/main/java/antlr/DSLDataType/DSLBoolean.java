package antlr.DSLDataType;

import antlr.DSLExceptions.SemanticExceptions;
import antlr.DSLExceptions.IncompatibleTypeException;

public class DSLBoolean implements IDataType{
    private boolean value;

    public boolean getValue() {
        return value;
    }

    @Override
    public String getType() {
        return "boolean";
    }

    @Override
    public String print() {
        return String.valueOf(this.value);
    }

    public boolean negate(){
        return !value;
    }

    @Override
    public void setValue(String field, String value) throws SemanticExceptions {
            if (value.equals("true")) this.value = true;
            else if (value.equals("false")) this.value = false;
            else throw new IncompatibleTypeException("IncompatibleTypeException. "+ value + " cannot be attributed to boolean."); //Throws Incompatible Type Exception
        }

}
