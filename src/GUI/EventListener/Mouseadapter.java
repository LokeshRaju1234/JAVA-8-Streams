package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mouseadapter extends JFrame {
    JLabel l1 = new JLabel("Welcome");

    Mouseadapter(){
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Mouse is clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
              l1.setText("Mouse is pressed");
            }
        });
    }

    public static void main(String[] args) {
        new Mouseadapter();
    }
}
