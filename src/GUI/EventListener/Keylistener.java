package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener extends JFrame implements KeyListener
{
    JLabel l1 = new JLabel("Welcome");

    Keylistener()
    {
        setSize(500,300);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        l1.setText("Key typed.: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        l1.setText("Key Pressed" +  e.getKeyChar());
    }


    @Override
    public void keyReleased(KeyEvent e)
    {
        l1.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new Keylistener();
    }

    //write a progam
}
