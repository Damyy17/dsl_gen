package antlr;

import antlr.DSLExceptions.NonexistentTypeException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, Exception {
        String inputCode = "genes a, b;\n" +
                "parents parent1, parent2;\n" +
                "generation Fam;\n" +
                "generation Fam2;\n" +
                "number int1;\n" +
                "family fam1;\n" +
                "dom: A -> a;\n" +
                "dom: B -> b;\n" +
                "\n" +
                "set label A = \"Hazel eyes\";\n" +
                "set label a = \"Blue eyes\";\n" +
                "set label B = \"Brown hair\";\n" +
                "set label b = \"Blond hair\";\n" +
                "\n" +
                "set genotype parent1 = aabb;\n" +
                "set genotype parent2 = AaBb;\n" +
                "\n" +
                "\n" +
                "set genotype Fam = cross parent1 * parent2 ;\n" +
               // "print Fam genotype; \n" +
                "set gen Fam1 = pred Fam;\n" +
                //"print fam1;\n" +
                "set value int1 = estimate frequency Fam, bb;\n" +
               "set value int1 = estimate frequency Fam, bb 200 ;\n" +
                "\n" +
                "number int2;\n" +
                "set value int2 = 0;\n"+
                "if int2<=10 then \n" +
                "set value int2 = 3;\n" +
                "set value int1 = 5;\n" +
                "else set value int2 = 4;\n" +
                "end;\n" +

                "parents parent3;\n" +
                "for parent3 from Fam:\n" +
                "set genotype Fam2 = cross parent3 * parent1;\n" +
                "end;\n" +
                "print parent1;\n"+
                "print Fam square;\n" +
                "print int1;\n" +
                "print Fam frequency bb;";
        CharStream codeExample = CharStreams.fromString(inputCode);
        GeneticsGrammarLexer lexer = new GeneticsGrammarLexer(codeExample);
        GeneticsGrammarParser parser = new GeneticsGrammarParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        GeneticsGrammarBaseVisitor<String> visitor = new Visitor<>();
        visitor.visit(tree);
    }
}
