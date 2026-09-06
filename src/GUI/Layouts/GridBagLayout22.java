package GUI.Layouts;

import javax.swing.*;
import java.awt.*;
public class GridBagLayout22 extends JFrame {
    JLabel l1 = new JLabel("Student");
    JLabel l2 = new JLabel("Name");
    JLabel l3 = new JLabel("RollNO");

    JTextField tf1 = new JTextField(15);
    JTextField tf2 = new JTextField(15);

    JButton b1 = new JButton("Save");

    GridBagLayout22()
    {
        setSize(500,400);
        setVisible(true);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor=GridBagConstraints.CENTER;

        add(l1,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor=GridBagConstraints.WEST;

        add(l2,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;

        add(tf1,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        add(l3,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;

        add(tf2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        add(b1,gbc);
    }

    public static void main(String[] args) {
        new GridBagLayout22();
    }
}
