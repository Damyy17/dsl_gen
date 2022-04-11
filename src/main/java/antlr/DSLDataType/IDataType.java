package antlr.DSLDataType;

import antlr.DSLExceptions.GrammarExceptions;
import antlr.DSLExceptions.InaccessibleFieldException;
import antlr.DSLExceptions.NonexistentFieldException;

public interface IDataType{
    String getType();
    void print();
    void setValue(String field, String value) throws GrammarExceptions;
}
