package schoolsystem2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author admin
 */
public class Student1 extends JFrame {

    private JLabel lblName, lblTitle;

    Student1() {

        setLayout(null);
        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTitle = new JLabel("Personal Information");
        lblTitle.setBounds(250, 50, 400, 50);
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 24));
        this.add(lblTitle);
    }
}
