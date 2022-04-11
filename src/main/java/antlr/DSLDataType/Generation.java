package antlr.DSLDataType;

import antlr.DSLExceptions.GrammarExceptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Generation implements IDataType{
    private Parent [] parents;
    private Parent[] children;
    private String[][] square;
    private Map<String, Integer> genotypeFrequency;

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public Parent[] getChildren() {
        return children;
    }

    public void setChildren(Parent[] children) {
        this.children = children;
    }

    public String[][] getSquare() {
        return square;
    }

    public void setSquare(String[][] square) {
        this.square = square;
    }

    public Map<String, Integer> getGenotypeFrequency() {
        return genotypeFrequency;
    }

    public void setGenotypeFrequency(Map<String, Integer> genotypeFrequency) {
        this.genotypeFrequency = genotypeFrequency;
    }
    public void generateGametes(){
        List<String> gametes1 = new ArrayList<String>();
        List<String> gametes2 = new ArrayList<String>();

        String parent1 = this.parents[0].getGenotype();
        String parent2 = this.parents[1].getGenotype();

    }

    public void cross(Parent p1, Parent p2){
        Parent[] p= {p1, p2};
        setParents(p);
        generateGametes();

    }

    @Override
    public String getType() {
        return "generation";
    }

    @Override
    public void print() {
        for (String[] row: square) {
            for(String element : row) System.out.print("|" +element +"|");
            System.out.println("");
            for (String element : row)System.out.print("----");
        }
    }

    @Override
    public void setValue(String field, String value) throws GrammarExceptions {
        System.out.println("Nothing yet");
    }
}
