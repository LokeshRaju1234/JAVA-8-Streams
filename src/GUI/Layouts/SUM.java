package GUI.Layouts;

import javax.swing.*;
import java.awt.*;

public class SUM extends JFrame {

    JLabel l1=new JLabel("Enter 1st Number");
    JLabel l2=new JLabel("Enter 2nd Number");
    JLabel l3=new JLabel("Result");

    JTextField tf1=new JTextField(15);
    JTextField tf2=new JTextField(15);
    JTextField tf3=new JTextField(15);

    JButton b1=new JButton("ADD");
    JButton b2=new JButton("Substract");
    SUM(){
        setSize(500,400);
        setVisible(true);
        setLayout(null);
        l1.setBounds(100,150,80,30);
        tf1.setBounds(200,150,80,30);
        l2.setBounds(100,200,80,30);
        tf2.setBounds(200,200,80,30);
        b1.setBounds(200,250,80,30);
        l3.setBounds(100,300,80,30);
        tf3.setBounds(200,300,80,30);
//        b1.setBackground(Color.darkGray);
        b1.setBackground(new Color(44,24,232));
        b1.setForeground(Color.green);
        Font f = new Font("Arial",Font.BOLD,15);
        l1.setFont(f);
        l2.setFont(f);
        add(l1);add(tf1);add(l2);add(tf2);add(b1);add(l3);add(tf3);
    }

    public static void main(String[] args) {
        new SUM();
    }
}
