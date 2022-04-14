package antlr.DSLDataType;

import antlr.DSLExceptions.GrammarExceptions;
import antlr.DSLExceptions.InaccessibleFieldException;
import antlr.DSLExceptions.NonexistentFieldException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Gene implements IDataType{
    private String location;
    private Map<String, String> labels = new HashMap<String, String>();
    private String dominantGene;
    private String recessiveGene;
    public String[] fields = {"location","labels","dominantGene", "recessiveGene"};


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //Method to get all labels and allele in labels
    public Map<String, String> getLabels() {
        return labels;
    }
    //Method to get only label of a specified allele. If allele nonexistent throws NonSpecifiedAllele Exception
    public String getSpecificLabel(String key){
        return this.labels.get(key);
    }

    public void setLabels(String key, String value) {
        this.labels.put(key, value);
    }

    public String getDominantGene() {
        return dominantGene;
    }

    public void setDominantGene(String dominantGene) {
        this.dominantGene = dominantGene;
    }

    public String getRecessiveGene() {
        return recessiveGene;
    }

    public void setRecessiveGene(String recessiveGene) {
        this.recessiveGene = recessiveGene;
    }

    @Override
    public String getType() {
        return "gene";
    }
    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Gene)) return false;
        Gene obj = (Gene) o;

        return this.dominantGene.equals(obj.getDominantGene()) && this.recessiveGene.equals(obj.getRecessiveGene());
    };

    //By default prints all information about labels. May be subject to change
    @Override
    public void print() {
        System.out.println(getLabels());
    }

    public void print(String field) {
        if (field.equals("location")) System.out.println(this.location);
        else System.out.println(new NonexistentFieldException("Nonexistent Field Exception is occurred!").getMessage());
    }

    //Sets the value of the specific field or throws an NonexistentFieldException
    @Override
    public void setValue(String field, String value) throws GrammarExceptions {
        switch (field) {
            case "location":
                setLocation(value);
                break;
            //For setting label splits the value in 2 based on first ' ' character, left side (allele) is key,
            // right side (phenotype) is the value in the map
            case "label":
                String[] kv = value.split(" ", 2);
                setLabels(kv[0], kv[1]);
                break;
            case "dom":
                setDominantGene(value);
                break;
            case "rec":
                setRecessiveGene(value);
                break;
            default:
                throw new NonexistentFieldException("NonexistentFieldException. No such field " + field + " in Gene.");
        }
    }
}
