package view;

import javax.swing.*;
import java.awt.*;

public class ReturnBikePane extends JPanel {
    private GridBagLayout layout;
    private GridBagConstraints c;

    public ReturnBikePane(JPanel searchPane, JScrollPane listPane) {
//        SpringLayout layout = new SpringLayout();
//        this.setLayout(layout);
//
//        this.add(searchPane);
//        this.add(listPane);
//
//        layout.putConstraint(SpringLayout.WEST, searchPane, 5, SpringLayout.WEST, this);
//        layout.putConstraint(SpringLayout.NORTH, searchPane, 5, SpringLayout.NORTH, this);
//        layout.putConstraint(SpringLayout.EAST, searchPane, -5, SpringLayout.EAST, this);
//
//        layout.putConstraint(SpringLayout.WEST, listPane, 5, SpringLayout.WEST, this);
//        layout.putConstraint(SpringLayout.NORTH, listPane, 5, SpringLayout.SOUTH, searchPane);
//        layout.putConstraint(SpringLayout.EAST, listPane, -5, SpringLayout.EAST, this);
//        layout.putConstraint(SpringLayout.SOUTH, listPane, -5, SpringLayout.SOUTH, this);

//        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
//        this.add(searchPane);
//        this.add(listPane);
//        this.setLayout(layout);

//        layout = new GridBagLayout();
//        this.setLayout(layout);
//        c = new GridBagConstraints();
//        c.fill = GridBagConstraints.CENTER;
//        c.weightx = 1;
//
//        int row = getLastRowIndex();
//        c.gridx = 0;
//        c.gridy = row;
//        add(searchPane, c);
//
//        row = getLastRowIndex();
//        c.gridx = 0;
//        c.gridy = row;
//        add(listPane, c);

        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);
        this.add(searchPane, BorderLayout.NORTH);
        this.add(listPane, BorderLayout.CENTER);
    }

    private int getLastRowIndex() {
        layout.layoutContainer(this);
        int[][] dim = layout.getLayoutDimensions();
        int rows = dim[1].length;
        return rows;
    }
}
