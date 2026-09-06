package GUI.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPractice extends JFrame implements KeyListener
{
    //write a progam to type something in the text field it will automatically convert it to upper case automatically
    JLabel l1 = new JLabel("Welcome");
    JTextField tf1 = new JTextField(15);

    KeyPractice()
    {
        setSize(500,300);
        setVisible(true);
        setLayout(new FlowLayout());
        add(tf1);
        tf1.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        char ch = e.getKeyChar();
        e.setKeyChar( Character.toUpperCase(ch));
    }

    @Override
    public void keyPressed(KeyEvent e)
    {

    }


    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    public static void main(String[] args) {
        new KeyPractice();
    }
}
