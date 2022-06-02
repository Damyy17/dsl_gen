package antlr.DSLDataType;

import antlr.DSLExceptions.IncorrectGenotypeFormatException;
import antlr.DSLExceptions.SemanticExceptions;
import antlr.DSLExceptions.NonexistentFieldException;

import java.util.*;

import java.lang.String;

public class Generation implements IDataType{
    private Parent [] parents;
    private List<Parent> children = new ArrayList<>();
    private String[][] square;
    private Map<String, Integer> genotypeFrequency = new HashMap<>();

    public Parent[] getParents() {
        return parents;
    }

    private void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public List<Parent> getChildren() {return children;}

    public String[][] getSquare() {
        return square;
    }

    public Map<String, Integer> getGenotypeFrequency() {
        return genotypeFrequency;
    }

    private void setGenotypeFrequency(String genotype, int frequency) {
        this.genotypeFrequency.put(genotype, frequency);
    }

    private List<String> makeGametes(List<String> previous, String current){
        List<String> tempGam = new ArrayList<>();

        for (String p: previous) {
            tempGam.add(String.valueOf(current.charAt(0)) + p);
            tempGam.add(String.valueOf(current.charAt(1)) + p);
        }

        return tempGam;
    }

    private List<String> generateGametes(String gen){
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

    private String makeChild(String parent1, String parent2) {
        String childgene = "";

        for (int i = 0; i < parent1.length(); i++) {
            if (String.valueOf(parent1.charAt(i)).equals(this.parents[1].getGenes()[i].getDominantGene())) {
                childgene = childgene + String.valueOf(parent1.charAt(i)) + String.valueOf(parent2.charAt(i));
            } else {
                childgene = childgene + String.valueOf(parent2.charAt(i)) + String.valueOf(parent1.charAt(i));
            }

        }

        createParent(this.parents[0].getGenes(), childgene);
        return childgene;
    }

    void createParent(Gene[] genes, String childgene){
        Parent temp = new Parent();
        temp.setGenes(genes);
        try{
            temp.setValue("genotype", childgene);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        this.children.add(temp);
    }


    private void estimateFreq(){
        for (int i = 1; i < square.length; i++) {
            for (int j = 1; j < square[0].length; j++) {
                if (genotypeFrequency.containsKey(square[i][j])){
                    setGenotypeFrequency(square[i][j], genotypeFrequency.get(square[i][j]) + 1);
                } else{
                    setGenotypeFrequency(square[i][j], 1);
                }
            }

        }
    }

    public int estimateFreq(String segment){
        if (genotypeFrequency.isEmpty()) estimateFreq();
        int i = 0;
        for (String gene: genotypeFrequency.keySet()) {
            if (gene.contains(segment)) i = i + genotypeFrequency.get(gene);
        }
        return i;
    }

    public int estimateFreq(String segment, int population){
        if (genotypeFrequency.isEmpty()) estimateFreq();
        int total = children.size();
        Map<String, Integer> popfreq = new HashMap<>();
        for (String gene: genotypeFrequency.keySet()) {
            int i = genotypeFrequency.get(gene);
            int pf = (int) Math.floor((double) i/total * population);
            popfreq.put(gene, pf);
        }
        int i = 0;
        for (String gene: popfreq.keySet()) {
            if (gene.contains(segment)) i = i + popfreq.get(gene);
        }
        return i;
    }

    private void createSquare(List<String> parent1, List<String> parent2){
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

    private void cross(){
        List<String> gam1 = generateGametes(this.parents[0].getGenotype());
        List<String> gam2 = generateGametes(this.parents[1].getGenotype());
        createSquare(gam1, gam2);
    }

    public void find(String alpha, Map<String, Gene> genes)throws IncorrectGenotypeFormatException {
        Map<String, Gene> existingGenes = new HashMap<>(genes);
        if (alpha.length() % 2 != 0) throw new IncorrectGenotypeFormatException("Incorrect Genotype Exception is occured. " + alpha +"is not a proper allele");
        //Checks if the allele is defined properly and deletes the genes from map of existing genes
        for (int i  = 1; i < alpha.length(); i+=2){
            if (!Character.toString(alpha.charAt(i)).equalsIgnoreCase(Character.toString(alpha.charAt(i - 1)))) throw new IncorrectGenotypeFormatException("Incorrect Genotype Exception is occured. " + alpha +"is not a proper allele");
            else {
                existingGenes.remove(Character.toString(alpha.charAt(i)).toLowerCase());
            }
        }
        List<String> gene = new ArrayList<>(existingGenes.keySet());
        List<String> geno1 = new ArrayList<>();
        geno1.add(alpha);
        for (String k: gene) {
            //Creates each allele variant
            String mix = existingGenes.get(k).getDominantGene() + existingGenes.get(k).getRecessiveGene();
            String rec = existingGenes.get(k).getRecessiveGene() + existingGenes.get(k).getRecessiveGene();
            String dom = existingGenes.get(k).getDominantGene() + existingGenes.get(k).getDominantGene();
            //Creates list to hold more complete genotype
            List<String> geno2 = new ArrayList<>();
            //Adds to each uncomplete genotype variant the current new mixed, rec and dom allele
            for (String s: geno1) {
                geno2.add(s + mix);
                geno2.add(s + rec);
                geno2.add(s + dom);
            }
            geno1 = geno2;
        }
        List<String> geno3 = new ArrayList<>();
        //Sorts each allele alphabetically
        for (String s: geno1) {
            String [] c = new String[s.length()];
            for (int i = 0; i < s.length(); i++) c[i] = Character.toString(s.charAt(i));
            Arrays.sort(c, String.CASE_INSENSITIVE_ORDER);
            StringBuilder tmp = new StringBuilder("");
            for (int i = 0; i < s.length(); i++) tmp.append(c[i]);
            geno3.add(tmp.toString());
        }
        //Create children
        for (String s: geno3) {
            createParent(genes.values().toArray(new Gene[genes.size()]), s);
        }
    }


    @Override
    public String getType() {
        return "generation";
    }

    @Override
    public void print() {
        for (String[] row: square) {
            for(String element : row) System.out.print("|" + element +"|");
            System.out.println(" ");
        }
    }

    public void print(String field){
        if (field.equals("square")) print();
        else if (field.equals("genotype")){
            for (Parent p: this.children) {
                p.print();
            }
        }
        else if (field.equals("frequency")) {
            if (this.genotypeFrequency.isEmpty()) estimateFreq();
            System.out.println(this.genotypeFrequency);
        }
        else if (field.equals("phenotype")){
            for(Parent child : children){
                System.out.println(child.getGenotype() + "-" + child.getPhenotype());
            }
        }
        else System.out.println( new NonexistentFieldException("Nonexistent Field Exception is occurred!").getMessage());
    }

    public void print(String field, String alpha) {
        switch (field) {
            case "frequency":
                System.out.println(estimateFreq(alpha));
                break;
            case "genotype":
                for (Parent child : children) {
                    if (child.getGenotype().contains(alpha)) child.print(field);
                }
                break;
            case "phenotype":
                for (Parent child : children) {
                    if (child.getGenotype().contains(alpha))
                        System.out.println(child.getGenotype() + " - " + child.getPhenotype());
                }
                break;
            default:
                System.out.println( new NonexistentFieldException("Nonexistent Field Exception is occurred!").getMessage());
        }
    }

    public void setValue(String field, Parent[] value) throws SemanticExceptions {
        setParents(value);
    }

    @Override
    public void setValue(String field, String value) throws SemanticExceptions {
        if (field.equals("square") ||field.equals("genotype")) cross();
        if (field.equals("frequency")) estimateFreq();
    }


}
