package antlr.DSLDataType;

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
    public void print() {
        System.out.println(this.value);
    }

    @Override
    public void setValue(String field, String value) {
        if (value.equals("true")) this.value = true;
        else if (value.equals("false")) this.value = false;
        else return; //Throws Incompatible Type Exception
    }
}
