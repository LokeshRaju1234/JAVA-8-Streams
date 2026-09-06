package GUI.Layouts;

import javax.swing.*;
import java.awt.*;
class abc extends JFrame
{
    JLabel l1=new JLabel("1st Number");
    JLabel l2=new JLabel("2nd Number");
    JLabel l3=new JLabel("result");

    JTextField tf1=new JTextField(2);
    JTextField tf2=new JTextField(12);
    JTextField tf3=new JTextField(12);

    JButton b1=new JButton("ADD");
    JButton b2=new JButton("Substract");

    abc()
    {
        setSize(500,400);
        setVisible(true);
        // setLayout(new FlowLayout());
        //setLayout(new GridLayout(4,2));
        // setLayout(new BorderLayout());  //this is the default layout for Frame
        add(l1,BorderLayout.NORTH);
        add(tf1,BorderLayout.SOUTH);
        add(l2,BorderLayout.CENTER);add(tf2,BorderLayout.EAST);
        add(b1,BorderLayout.WEST);
        //add(b2);
        // add(l3);add(tf3);
    }
    public static void main(String args[])
    {
        new abc();
    }
}