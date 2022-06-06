package antlr;

import java.util.List;

public class InputInfo {

    List<String> output;
    List<String> punnetSquare;

    public List<String> getOutput(){
        return output;
    }

    public List<String> getPunnetSquare(){
        return punnetSquare;
    }

    public void addToList(String input){
        output.add(input);
    }

}
