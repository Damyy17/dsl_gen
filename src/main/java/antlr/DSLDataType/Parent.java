package antlr.DSLDataType;
import antlr.DSLExceptions.*;

import java.lang.Character;
import java.util.ArrayList;
import java.util.List;

public class Parent implements IDataType{
    private Gene[] genes;
    private String genotype = "";
    private String phenotype = "";
    private String sex = "";

    public Gene[] getGenes() {
        return genes;
    }

    public void setGenes(Gene[] genes) {
        this.genes = genes;
    }

    public String getGenotype() {
        return genotype;
    }

    //Method to check if the Genotype is properly declared
    //Instead of boolean, will throw the proper errors
    private void isProperGenotype (String genotype) throws SemanticExceptions {
        //Check if length accounts for 2 allele of each gene type declared
        if (genotype.length() != genes.length * 2) throw new IncorrectGenotypeFormatException("IncorrectGenotypeFormatException. Illegal Genotype length for " + genotype); //Should throw IncorrectGenotypeFormat

        //Creates list of all possible Allele
        List<String> possibleGenes = new ArrayList<>();
        for (Gene allele: this.genes) {
            possibleGenes.addAll(allele.getLabels().keySet());
        }
        for (int i = 0; i < genotype.length(); i++) {
            //Checks if each allele in parent Genotype is in the list of allele
            if (!possibleGenes.contains(String.valueOf(genotype.charAt(i)))){
                throw new NonSpecifiedAlleleException("NonSpecifiedAlleleException. " + String.valueOf(genotype.charAt(i)) + " is an nonspecified allele."); //Should Throw NonSpecifiedAllele
            }
            //Checks if each 2 characters are paired properly like Aa or AA
            if (i % 2 == 1){
                if (Character.toUpperCase(genotype.charAt(i - 1)) != Character.toUpperCase(genotype.charAt(i)))
                    throw new IncorrectGenotypeFormatException("IncorrectGenotypeFormatException. Allele on a gene should be adjacent"); //Should Throw Incorrect Genotype Format
            }
        }
    }

    private void setGenotype(String genotype) {
        try{
            isProperGenotype(genotype);
            this.genotype = genotype;
            setPhenotype();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getPhenotype() {
        return phenotype;
    }

    //Sets Phenotype
    private void setPhenotype() {
        //Iterates through genes and checks if genotype contains a dominant gene to determine phenotype.
        for (Gene gene: this.genes) {
            if (this.genotype.contains(gene.getDominantGene())) phenotype=phenotype.concat(gene.getSpecificLabel(gene.getDominantGene())).concat(" ");
            else phenotype=phenotype.concat(gene.getSpecificLabel(gene.getRecessiveGene())).concat(" ");
        }

        this.phenotype = phenotype.trim();
    }

    public String getSex() {
        return sex;
    }

    private void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getType() {
        return "parent";
    }

    //By default, prints "genotype - phenotype" or None if genotype not declared
    @Override
    public void print() {
        if (this.genotype.length() == 0) System.out.println("None");
        System.out.println(this.genotype + " - " + this.phenotype);
    }

    public void print(String field){
        if (field.equals("genotype")) System.out.println(this.genotype);
        else if (field.equals("phenotype")) System.out.println(this.phenotype);
        else System.out.println(new NonexistentFieldException("Nonexistent Field Exception is occurred!").getMessage());
    }

//    public void print(String field, String alpha){
//        if (field.equals("genotype") && genotype.contains(alpha)) System.out.println(this.genotype);
//        if (field.equals("phenotype") && phenotype.contains(alpha)) System.out.println(this.phenotype);
//    }

    //Sets the value of the specific field or throws an NonexistentFieldException/InaccesibleField Exception
    @Override
    public void setValue(String field, String value) throws SemanticExceptions {
        switch (field) {
            case "genotype":
                setGenotype(value);
                break;
            case "sex":
                setSex(value);
                break;
            case "phenotype":
                throw new InaccessibleFieldException("InaccessibleFieldException. Field " + field + " cannot be accessed directly in Parent."); //Throws Inaccesible
            default:
                throw new NonexistentFieldException("NonexistentFieldException. No such field " + field + " in Parent."); //Throws Nonexistent
        }

    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Parent)) return false;
        Parent obj = (Parent) o;

        return this.genotype.equals(obj.genotype);
    };

}
