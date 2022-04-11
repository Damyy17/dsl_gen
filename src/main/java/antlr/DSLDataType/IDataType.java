package antlr.DSLDataType;

public interface IDataType{
    String getType();
    void print();
    void setValue(String field, String value);
}
