package GUI.Layouts;

import javax.swing.*;

public class Boxlayot extends JFrame {
    JLabel l1=new JLabel("1st Number");
    JLabel l2=new JLabel("2nd Number");
    JLabel l3=new JLabel("result");

    JTextField tf1=new JTextField(12);
    JTextField tf2=new JTextField(12);
    JTextField tf3=new JTextField(12);

    JButton b1=new JButton("ADD");
    JButton b2=new JButton("Substract");

    Boxlayot()
    {
        setSize(500,400);
        setVisible(true);
        // setLayout(new FlowLayout());
        //setLayout(new GridLayout(4,2));
        // setLayout(new BorderLayout());  //this is the default layout for Frame
        setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
        add(l1);
        add(tf1);
        add(l2);add(tf2);
        add(b1);
        add(b2);
        add(l3);add(tf3);
    }

    public static void main(String[] args) {
        new Boxlayot();
    }
}
