package GUI;
import javax.swing.*;
import java.awt.*;

public class gui extends JFrame{
    JLabel l1 = new JLabel("Name");
    JTextField tf1 = new JTextField();
    JButton b1 = new JButton("Save");
    JButton b2 = new JButton("Update");

    gui()
    {
       setSize(200,300);
       setVisible(true);
       setTitle("Student Management");
       setLocation(200,100);
       setLayout(null);
       l1.setBounds(100,70,80,30);
       tf1.setBounds(180,70,80,30);
       b1.setBounds(120,130,80,30);
       b2.setBounds(230,130,80,30);
       add(l1);add(tf1);add(b1);add(b2);
    }

    public static void main(String[] args) {
        new gui();
    }
}
