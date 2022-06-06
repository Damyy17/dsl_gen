package antlr.DSLDataType;

import antlr.DSLExceptions.NonexistentFieldException;
import antlr.DSLExceptions.SemanticExceptions;

import java.util.*;

public class Family implements IDataType{
    private List<Generation> gen = new ArrayList<>();
    @Override
    public String getType() {
        return "family";
    }

    public List<Generation> getGen() {
        return gen;
    }

    @Override
    //
    public String print() throws NonexistentFieldException {
        return "";
    }
    public String print(String field) throws NonexistentFieldException {
        StringBuilder builder = new StringBuilder();
        if (field.equals("genotype")) for (Generation g: this.gen) builder.append(g.print("genotype"));
        else if (field.equals("ancestors")) for (Generation g: this.gen) builder.append(g.print("ancestors"));
        return builder.toString();
    }
    public List<List<List<String>>> printSquares(){
        List<List<List<String>>> squarelist = new ArrayList<>();
        for (Generation g: this.gen) {
            squarelist.add(g.printSquare());
        }
        return squarelist;
    }

    public void setValue(String field, List<Generation> gen){
        this.gen = gen;
    }
    @Override
    public void setValue(String field, String value) throws SemanticExceptions {

    }
    public void pred(List<Parent> children) throws SemanticExceptions {
        this.gen = new ArrayList<>();
        Generation samplegen = new Generation();
        Map<String, Gene> g = new HashMap<>();
        Gene[] sample = children.get(0).getGenes();
        for (Gene gene : sample) {
            g.put(gene.getRecessiveGene(), gene);
        }
        samplegen.find("", g);
        List<Parent> candidateparent1 = new ArrayList<>(samplegen.getChildren());
        List<Parent> candidateparent2 = new ArrayList<>(samplegen.getChildren());

        List<Parent[]> actualparents = new ArrayList<>();

        Map<String, Integer> childfreq = new HashMap<>();

        for (Parent p: children) {
            if (childfreq.containsKey(p.getGenotype())) childfreq.put(p.getGenotype(), childfreq.get(p.getGenotype()) + 1);
            else childfreq.put(p.getGenotype(), 1);
        }

        for (Parent dad : candidateparent1){
            for (Parent mom : candidateparent2){
                boolean improperFlag = false;
                Generation g1 = new Generation();
                Parent[] p = {dad, mom};
                g1.setValue("parent", p);
                g1.setValue("square", "");
                g1.estimateFreq();
                for (String gen: childfreq.keySet()) {
                    if (!g1.getGenotypeFrequency().containsKey(gen) || g1.getGenotypeFrequency().get(gen) < childfreq.get(gen)){
                        improperFlag = true;
                        break;
                    }
                }
                if (!improperFlag) {
                    this.gen.add(g1);
                };
            }
        }
    }
}
