package antlr.DSLDataType;
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
    private boolean isProperGenotype(String genotype){
        //Check if length accounts for 2 allele of each gene type declared
        if (genotype.length() != genes.length * 2) return false; //Should throw IncorrectGenotypeFormat

        //Creates list of all possible Allele
        List<String> possibleGenes = new ArrayList<String>();
        for (Gene allele: this.genes) {
            possibleGenes.addAll(allele.getLabels().keySet());
        }
        for (int i = 0; i < genotype.length(); i++) {
            //Checks if each allele in parent Genotype is in the list of allele
            if (!possibleGenes.contains(String.valueOf(genotype.charAt(i)))){
                return false; //Should Throw NonSpecifiedAllele
            }
            //Checks if each 2 characters are paired properly like Aa or AA
            if (i % 2 == 1){
                if (Character.toUpperCase(genotype.charAt(i - 1)) != Character.toUpperCase(genotype.charAt(i)))
                    return false; //Should Throw Incorrect Genotype Format
            }
        }
        return true;
    }

    public void setGenotype(String genotype) {

        if (isProperGenotype(genotype)) {
            this.genotype = genotype;
            setPhenotype();
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

    public void setSex(String sex) {
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

    //Sets the value of the specific field or throws an NonexistentFieldException/InaccesibleField Exception
    @Override
    public void setValue(String field, String value) {
        if (field.equals("genotype")) setGenotype(value);
        else if (field.equals("sex")) setSex(value);
        else if (field.equals("phenotype")) return; //Throws Inaccesible
        else return; //Throws Nonexistent

    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Parent)) return false;
        Parent obj = (Parent) o;

        return this.genotype.equals(obj.genotype);
    };

}
