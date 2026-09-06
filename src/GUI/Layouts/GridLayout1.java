package GUI.Layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayout1 extends JFrame{
    JLabel l1=new JLabel("1st Number");
    JLabel l2=new JLabel("2nd Number");
    JLabel l3=new JLabel("result");

    JTextField tf1=new JTextField(2);
    JTextField tf2=new JTextField(12);
    JTextField tf3=new JTextField(12);

    JButton b1=new JButton("ADD");
    JButton b2=new JButton("Substract");

    GridLayout1()
    {
        setSize(500,400);
        setVisible(true);
        // setLayout(new FlowLayout());
        setLayout(new GridLayout(0,3));
        // setLayout(new BorderLayout());  //this is the default layout for Frame
        add(l1);
        add(tf1);
        add(l2);add(tf2);
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        new GridLayout1();
    }
}
