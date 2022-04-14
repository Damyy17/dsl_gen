package antlr;

import antlr.DSLExceptions.NonexistentTypeException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, Exception {
        String inputCode = "genes a, b;\n" +
                "parents parent1, parent2;\n" +
                "generation F1;\n" +
               // "number int1;\n" +
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
                "find genotype bb;\n" +
                "\n" +
                "set genotype F1 = cross parent1 * parent2;\n" +
               // "set value F1 = estimate frequency P1 bb;;\n" +
               // "set value F1 = estimate frequency P1 bb 200;;\n" +
                "\n" +
                "print parent1;\n"+
                "print F1 square;\n" +
                "print F1 frequency bb;";
        CharStream codeExample = CharStreams.fromString(inputCode);
        GeneticsGrammarLexer lexer = new GeneticsGrammarLexer(codeExample);
        GeneticsGrammarParser parser = new GeneticsGrammarParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        GeneticsGrammarBaseVisitor<String> visitor = new Visitor<>();
        visitor.visit(tree);
    }
}
