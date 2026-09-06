package GUI.Layouts;
import javax.swing.*;
import java.awt.*;

public class ADDTwoNumbers extends JFrame{
    JLabel l1=new JLabel("1st Number");
    JLabel l2=new JLabel("2nd Number");
    JLabel l3=new JLabel("result");

    JTextField tf1=new JTextField(12);
    JTextField tf2=new JTextField(12);
    JTextField tf3=new JTextField(12);

    JButton b1=new JButton("ADD");
    JButton b2=new JButton("Substract");

    ADDTwoNumbers()
    {
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT,15,20));
        add(l1);add(tf1);
        add(l2);add(tf2);
        add(l3);add(tf3);

    }
    public static void main(String[] args) {
        new ADDTwoNumbers();
    }
}
