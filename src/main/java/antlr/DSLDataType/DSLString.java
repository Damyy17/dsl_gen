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

    @Override
    public void print() {
        System.out.println(value);
    }

    @Override
    public void setValue(String field, String value) throws SemanticExceptions {
        this.value = value;
    }
}
