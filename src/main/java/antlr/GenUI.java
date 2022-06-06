package antlr;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    //Added InputInfo object
    private String inputInfo;

    public GenUI(){
        setFont(new Font("Monospaced", 12, Font.PLAIN));
        setTitle("Genetics DSL");
        setContentPane(GenPanel);
        setVisible(true);
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //line numbering
        lines = new JTextArea("1");
        lines.setBackground(Color.LIGHT_GRAY);
        lines.setEditable(false);
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

            }
        });

        //Punnet Square
        punnet.setText("Punnet Square");
        String[][] data = {
                {"F/M", "AB", "aB", "Ab", "ab"},
                {"AB", "AABB", "AaBB", "AABb", "AaBb"},
                {"aB", "AaBB", "aaBB", "AaBb", "aaBb"},
                {"Ab", "AABb", "AaBb", "AAbb", "AaBb"},
                {"ab", "AaBb", "aaBb", "Aabb", "aabb"}
        };
        String[] columnNames = {"F/M", "AB", "aB", "Ab", "ab"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table1.setModel(model);
        table1.setEnabled(false);
        output.setText("aabb - \"Blue eyes\" \"Blond hair\"\n" +
                "100.0\n" +
                "8");

    }

    public String getCodeText(){
        return codeWrite.getText();
    }

    public void setOutputInfo(String inputInfo){
        this.inputInfo = inputInfo;
    }

}
