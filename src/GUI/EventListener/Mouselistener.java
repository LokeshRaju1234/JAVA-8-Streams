package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouselistener extends JFrame implements MouseListener {
    JLabel l1 = new JLabel("Welcome");

    Mouselistener(){
    setSize(500,200);
    setVisible(true);
    setLayout(new FlowLayout());
    add(l1);
    addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new Mouselistener();
    }
}
