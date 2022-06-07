package antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GenUI extends JFrame{
    private JTextArea codeWrite;
    private final JTextArea lines;
    private JLabel punnet;
    private JPanel GenPanel;
    private JScrollPane scrollPane;
    private JButton runButton;
    private JButton clearButton;
    private JTable table1;
    private JTextPane output;
    private JLabel outputName;
    private JScrollPane scrollTxt;
    private JScrollPane tableScroll;
    //Added InputInfo object
    private String inputInfo;

    public GenUI(){
        setFont(new Font("Monospaced", 12, Font.PLAIN));
        setTitle("Genetics DSL");
        setContentPane(GenPanel);
        GenPanel.setBackground(new Color(36, 36, 36));
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //font and colors
        codeWrite.setBackground(new Color(36, 36, 36));
        codeWrite.setFont(new Font("Monospaced", Font.PLAIN,12));
        codeWrite.setForeground(new Color(255,255,255));

        output.setBackground(new Color(36, 36, 36));
        output.setForeground(new Color(30, 215, 96));
        output.setFont(new Font("Monospaced", Font.PLAIN,14));
        outputName.setForeground(new Color(30, 215, 96));
        outputName.setFont(new Font("Monospaced", Font.BOLD, 14));

        punnet.setForeground( new Color(30, 215, 96));
        punnet.setFont(new Font("Monospaced", Font.BOLD,14));
        punnet.setText("Punnet Square");

        table1.setBackground(new Color(36, 36, 36));
        table1.setForeground(new Color(255,255,255));
        table1.setFont(new Font("Monospaced", Font.BOLD, 14));
        table1.setRowHeight(30);
        table1.setGridColor(new Color(30, 215, 96));
        JTableHeader header = table1.getTableHeader();
        header.setBackground(new Color(36, 36, 36));
        header.setForeground(new Color(255,255,255));
        header.setFont(new Font("Monospaced", Font.BOLD, 14));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        table1.setDefaultRenderer(String.class, centerRenderer);

        runButton.setBackground(new Color(30, 215, 96));
        runButton.setForeground(new Color(36, 36, 36));
        runButton.setFont(new Font("Monospaced", Font.BOLD, 14));
        clearButton.setBackground(new Color(30, 215, 96));
        clearButton.setForeground(new Color(36, 36, 36));
        clearButton.setFont(new Font("Monospaced", Font.BOLD, 14));
        //

        //line numbering
        lines = new JTextArea("1");
        lines.setBackground(new Color(36, 36, 36));
        lines.setForeground(new Color(30, 215, 96));
        lines.setEditable(false);
        lines.setFont(new Font("Monospaced", Font.PLAIN, 14));
//        lines.setFont(new Font("Monospaced", 12, Font.PLAIN));

        //code section
        codeWrite.getDocument().addDocumentListener(new DocumentListener(){
            public String getText(){
                int caretPosition = codeWrite.getDocument().getLength();
                Element root = codeWrite.getDocument().getDefaultRootElement();
                StringBuilder text = new StringBuilder("1" + System.getProperty("line.separator"));
                for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
                    text.append(i).append(System.getProperty("line.separator"));
                }
                return text.toString();
            }
            @Override
            public void changedUpdate(DocumentEvent de) {
                lines.setText(getText());
            }

            @Override
            public void insertUpdate(DocumentEvent de) {
                lines.setText(getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                lines.setText(getText());
            }
        });

        //scroll
        scrollPane.getViewport().add(codeWrite);
        scrollPane.setRowHeaderView(lines);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //clear the text
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeWrite.setText("");
            }
        });

        //run the program
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeWrite.setText(codeWrite.getText());
                CharStream codeExample = CharStreams.fromString(String.valueOf(codeWrite.getText()));
                GeneticsGrammarLexer lexer = new GeneticsGrammarLexer(codeExample);
                GeneticsGrammarParser parser = new GeneticsGrammarParser(new CommonTokenStream(lexer));

                ParseTree tree = parser.program();
                GeneticsGrammarBaseVisitor<String> visitor = new Visitor<>();
                String allOutputInfo = visitor.visit(tree);

                //output of the program
                String output1 = allOutputInfo.substring(allOutputInfo.indexOf("[")+1, allOutputInfo.indexOf("]"));
                String[] outputs = output1.split("\\|");
                StringBuilder finalOutput = new StringBuilder();
                for (String word : outputs){
                    finalOutput.append(word);
                }
                output.setText(finalOutput.toString());

                //sqaures of the program
                String squares = allOutputInfo.substring(allOutputInfo.lastIndexOf("[") +1, allOutputInfo.lastIndexOf("]"));
                String[] squarelist = squares.split("}");
                List<String[]> data = new ArrayList<>();
                if (!squarelist[0].equals("")) {
                    for (String square : squarelist) {
                        String s = square.substring(1);
                        String[] rows = s.split("\\)");
                        for (String row : rows) {
                            String col = row.substring(1);
                            String[] elements = col.split("\\|");
                            data.add(elements);
                        }

                    }
                    String[] columnNames = data.get(0);
                    data.remove(0);
                    String[][] pureData = new String[data.size()][columnNames.length];
                    for (int i = 0; i < data.size(); i++) {
                        pureData[i] = data.get(i);
                    }

                    DefaultTableModel model = new DefaultTableModel(pureData, columnNames);
                    table1.setModel(model);
                    tableScroll.getViewport().add(table1);
                    table1.setSize(300, 300);
                }
            }
        });

        table1.setEnabled(false);

        output.setText("");
        output.setEditable(false);
        scrollTxt.getViewport().add(output);
        scrollTxt.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    }

    public String getCodeText(){
        return codeWrite.getText();
    }

    public void setOutputInfo(String inputInfo){
        this.inputInfo = inputInfo;
    }

}
