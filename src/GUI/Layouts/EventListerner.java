package GUI.Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListerner extends JFrame implements ActionListener {
    JLabel l1=new JLabel("1st Number");
    JLabel l2=new JLabel("2nd Number");
    JLabel l3=new JLabel("result");

    JTextField tf1=new JTextField(12);
    JTextField tf2=new JTextField(12);
    JTextField tf3=new JTextField(12);

    JButton b1=new JButton("ADD");
    JButton b2=new JButton("Substract");
    JButton b3 = new JButton("Clear");

    EventListerner()
    {
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        //setLayout(new GridLayout(4,2));
        // setLayout(new BorderLayout());  //this is the default layout for Frame
//        add(l1,BorderLayout.NORTH);
//        add(tf1,BorderLayout.SOUTH);
//        add(l2,BorderLayout.CENTER);add(tf2,BorderLayout.EAST);
//        add(b1,BorderLayout.WEST);
        //add(b2);
        // add(l3);add(tf3);
        tf2.setSize(300,80);
        add(l1);add(tf1);
        add(l2);add(tf2);
        add(b1);
        add(l3);add(tf3);
        add(b3);
        b1.addActionListener(this);
        tf3.setEditable(false);
        b3.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

//        int sum = a + b;
//        String res = String.valueOf(sum);
//        tf3.setText(res);
        int c = 0;
        if(e.getSource() == b1) c = a + b;
        if(e.getSource() == b2) c = a - b;
        tf3.setText(String.valueOf(c));
        if(e.getSource() == b3)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }
    }

    public static void main(String[] args) {
        new EventListerner();
    }
}
