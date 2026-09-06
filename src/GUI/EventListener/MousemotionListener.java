package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousemotionListener extends JFrame implements MouseMotionListener {
    JLabel l1 = new JLabel("");
    MousemotionListener(){
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        l1.setText("Mouse dragged with coordinates: " + "x: " + x + " Y: " + y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        l1.setText("Mouse Moved with coordinates: " + "x: " + x + " Y: " + y);
    }

    public static void main(String[] args) {
        new MousemotionListener();
    }
}
