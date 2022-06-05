package antlr;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, Exception {
        if (args.length == 0) {System.out.println("Please input code file");return;}
        StringBuilder inputCode = new StringBuilder();
        try {
            File myObj = new File(args[0]);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                inputCode.append(myReader.nextLine());
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        CharStream codeExample = CharStreams.fromString(String.valueOf(inputCode));
        GeneticsGrammarLexer lexer = new GeneticsGrammarLexer(codeExample);
        GeneticsGrammarParser parser = new GeneticsGrammarParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.program();
        GeneticsGrammarBaseVisitor<String> visitor = new Visitor<>();
        visitor.visit(tree);
    }
}
