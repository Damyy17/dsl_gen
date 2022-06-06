package antlr.DSLDataType;

import antlr.DSLExceptions.NonexistentFieldException;
import antlr.DSLExceptions.SemanticExceptions;

public interface IDataType{
    String getType();
    String print() throws NonexistentFieldException;
    void setValue(String field, String value) throws SemanticExceptions;
}
