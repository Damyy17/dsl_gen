package antlr.DSLDataType;

import antlr.DSLExceptions.SemanticExceptions;

public class DSLString implements IDataType{
    String value;
    @Override
    public String getType() {
        return "string";
    }

    public double toNumber(){
        return Double.parseDouble(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String print() {
        return this.value;
    }

    @Override
    public void setValue(String field, String value) throws SemanticExceptions {
        this.value = value;
    }
}
