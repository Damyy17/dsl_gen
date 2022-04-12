package antlr.DSLDataType;

import antlr.DSLExceptions.GrammarExceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.lang.String;

public class Generation implements IDataType{
    private Parent [] parents;
    private List<Parent> children = new ArrayList<>();
    private String[][] square;
    private Map<String, Integer> genotypeFrequency = new HashMap<>();

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public List<Parent> getChildren() {return children;}

    public String[][] getSquare() {
        return square;
    }

    public Map<String, Integer> getGenotypeFrequency() {
        return genotypeFrequency;
    }

    public void setGenotypeFrequency(String genotype, int frequency) {
        this.genotypeFrequency.put(genotype, frequency);
    }

    public List<String> makeGametes(List<String> previous, String current){
        List<String> tempGam = new ArrayList<>();

        for (String p: previous) {
            tempGam.add(String.valueOf(current.charAt(0)) + p);
            tempGam.add(String.valueOf(current.charAt(1)) + p);
        }

        return tempGam;
    }

    public List<String> generateGametes(String gen){
        List<String> geneset1 = new ArrayList<>();
        for (int i = 1; i < gen.length(); i+=2) {
            geneset1.add(String.valueOf(gen.charAt(i-1)) + String.valueOf(gen.charAt(i)));
        }
        List<String> gametes1 = new ArrayList<>();
        gametes1.add("");

        for (int i = geneset1.size() - 1; i >=0 ; i--) {
            gametes1 = makeGametes(gametes1, geneset1.get(i));
        }

        return gametes1;

    }

    public String makeChild(String parent1, String parent2) {
        String childgene = "";

        for (int i = 0; i < parent1.length(); i++) {
            if (String.valueOf(parent1.charAt(i)).equals(this.parents[1].getGenes()[i].getDominantGene())) {
                childgene = childgene + String.valueOf(parent1.charAt(i)) + String.valueOf(parent2.charAt(i));
            } else {
                childgene = childgene + String.valueOf(parent2.charAt(i)) + String.valueOf(parent1.charAt(i));
            }

        }

        Parent temp = new Parent();
        temp.setGenes(this.parents[0].getGenes());
        try{
            temp.setValue("genotype", childgene);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.children.add(new Parent());
        if (genotypeFrequency.containsKey(childgene)){
            setGenotypeFrequency(childgene, genotypeFrequency.get(childgene) + 1);
        } else{
            setGenotypeFrequency(childgene, 1);
        }

        return childgene;
    }

    public void createSquare(List<String> parent1, List<String> parent2){
        this.square = new String[parent1.size() + 1][parent2.size() + 1];

        for (int i = 0; i <= parent1.size(); i++) {
            for (int j = 0; j <= parent2.size(); j++) {
                if (i == 0 && j == 0) this.square[0][0] = "F/M";
                else if (i == 0) this.square[i][j] = parent2.get(j - 1);
                else if (j == 0) this.square[i][j] = parent1.get(i - 1);
                else{
                    this.square[i][j] = makeChild(parent1.get(i - 1), parent2.get(j - 1));
                }
            }
        }
    }

    public void cross(Parent p1, Parent p2){
        Parent[] p= {p1, p2};
        setParents(p);
        List<String> gam1 = generateGametes(this.parents[0].getGenotype());
        List<String> gam2 = generateGametes(this.parents[1].getGenotype());
        createSquare(gam1, gam2);

    }

    @Override
    public String getType() {
        return "generation";
    }

    @Override
    public void print() {
        for (String[] row: square) {
            for(String element : row) System.out.print("|" + element +"|");
            System.out.println("");
            for (String element : row)System.out.print("--------");
        }
    }
    public void setValue(String field, Parent[] value) throws GrammarExceptions {
        setParents(value);
    }

    @Override
    public void setValue(String field, String value) throws GrammarExceptions {

    }


}
