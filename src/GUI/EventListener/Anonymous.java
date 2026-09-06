package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous extends JFrame
{
    JButton b1 = new JButton("Clicked");

    Anonymous(){
        setSize(500,300);
        setVisible(true);
        setLayout(new FlowLayout());
        add(b1);
        b1.addActionListener(new abc());
    }

    public static void main(String[] args) {
        new Anonymous();
    }
}

class abc implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Button clicked");
        System.out.println("Button clicked");
    }
}
