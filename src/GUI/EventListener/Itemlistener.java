package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Itemlistener extends JFrame implements ItemListener {
    JCheckBox c1 = new JCheckBox("Java");
    JCheckBox c2 = new JCheckBox("C++");
    JCheckBox c3 = new JCheckBox("DSA");

    JLabel l1 = new JLabel();

    Itemlistener(){
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(c1);add(c2);add(c3);add(l1);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if (c1.isSelected())
        {
            str += "JAVA";
        }
        else if(c2.isSelected()){
            str += "C++";
        }
        else if(c3.isSelected())
        {
            str += "DSA";
        }
        l1.setText("Selected Course is: " + str);
    }

    public static void main(String[] args) {
        new Itemlistener();
    }
}
