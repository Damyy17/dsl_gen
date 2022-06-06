package antlr;

import java.util.ArrayList;
import java.util.List;

public class InputInfo {

    List<String> output;
    List<List<List<String>>> punnetSquare;

    public InputInfo() {
        this.output = new ArrayList<>();
        this.punnetSquare = new ArrayList<>();
    }

    public List<String> getOutput(){
        return output;
    }

    public List<List<List<String>>> getPunnetSquare(){
        return punnetSquare;
    }

    public void addToOutput(String input){
        output.add(input);
    }

    public void addToPunnet(List<List<String>> square){
        punnetSquare.add(square);
    }

    public String getAllOutput(){
        StringBuilder allOutputInfo = new StringBuilder();
        //Pack the text from output section
        if (output.size() == 0) allOutputInfo.append("[]");
        else {
            StringBuilder alloutput = new StringBuilder();
            alloutput.append("[");
            for (String s : this.output) {
                alloutput.append(s);
                alloutput.append("|");
            }
            alloutput.deleteCharAt(alloutput.length() - 1);
            alloutput.append("]");
            allOutputInfo.append(alloutput);

        }

        if (punnetSquare.size() == 0) allOutputInfo.append("[]");
        else {
            //Pack text from punnet section
            StringBuilder allpunnett = new StringBuilder();
            allpunnett.append("[");
            for (List<List<String>> square : this.punnetSquare) {
                allpunnett.append("{");
                for (List<String> row : square) {
                    allpunnett.append("(");
                    for (String element : row) {
                        allpunnett.append(element);
                        allpunnett.append("|");
                    }
                    //deletes last |
                    allpunnett.deleteCharAt(allpunnett.length() - 1);
                    allpunnett.append(")");
                }
                allpunnett.append("}");
            }
            allpunnett.append("]");
            allOutputInfo.append(allpunnett);
        }
        return allOutputInfo.toString();
    }

}
