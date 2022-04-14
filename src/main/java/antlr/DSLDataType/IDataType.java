package antlr.DSLDataType;

import antlr.DSLExceptions.SemanticExceptions;

public interface IDataType{
    String getType();
    void print();
    void setValue(String field, String value) throws SemanticExceptions;
}
