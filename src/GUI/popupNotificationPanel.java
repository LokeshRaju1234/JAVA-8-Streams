package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class popupNotificationPanel extends JFrame implements ActionListener
{
    JButton b1 = new JButton("Clicked");
    popupNotificationPanel(){
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(b1);
        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null,"Button clicked","",JOptionPane.ERROR_MESSAGE);
        //INFORMATION_MESSAGE
        //WARNING_MESSAGE
        //QUESTION_MESSAGE
        //PLANE_MESSAGE

        //confirmation message
        JOptionPane.showConfirmDialog(null,"Are you sure want to exit","",JOptionPane.YES_NO_OPTION);
    }

    public static void main(String[] args) {
        new popupNotificationPanel();
    }
}
