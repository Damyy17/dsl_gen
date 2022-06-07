package antlr.DSLDataType;

import javax.swing.*;

public class PunnetSquareFrames extends JFrame{
    private String[][] data;
    private String[] header;
    public PunnetSquareFrames(String[][] data, String[] header){
        this.data = data;
        this.header = header;
        JTable square = new JTable(data, header);
        Box contents = new Box(BoxLayout.Y_AXIS);

        contents.add(new JScrollPane(square));
        setContentPane(contents);
        setSize(400, 400);
        setVisible(true);
    }
}
