package schoolsystem2;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author admin
 */
public class Student1 extends JFrame {

    private JLabel lblTitle,lblNameTitle,lblAgeTitle,lblYearTitle,lblCourseTitle;
    private JTextField txtName,txtAge,txtYear,txtCourse;

    public Student1() {

        setLayout(null);
        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTitle = new JLabel("Personal Information");
        lblTitle.setBounds(300, 50, 400, 50);
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 24));
        this.add(lblTitle);
        
        txtName = new JTextField ("Amodia, James Earl");
        txtName.setBounds (200, 150, 400,50);
        txtName.setHorizontalAlignment(JTextField.CENTER);
        txtName.setEditable(false);
        add(txtName);
        
        lblNameTitle = new JLabel("Name");
        lblNameTitle.setBounds(380,200,400,50);
        add(lblNameTitle);
        
        txtAge = new JTextField ("20");
        txtAge.setBounds (200, 250, 400,50);
        txtAge.setHorizontalAlignment(JTextField.CENTER);
        txtAge.setEditable(false);
        add(txtAge);
        
        lblAgeTitle = new JLabel("Age");
        lblAgeTitle.setBounds(380,300,400,50);
        add(lblAgeTitle);
        
        txtYear = new JTextField ("Second Year");
        txtYear.setBounds (200, 350, 400,50);
        txtYear.setHorizontalAlignment(JTextField.CENTER);
        txtYear.setEditable(false);
        add(txtYear);
        
        lblYearTitle = new JLabel("Year");
        lblYearTitle.setBounds(380,400,400,50);
        add(lblYearTitle);
        
        txtCourse = new JTextField ("Information Technology");
        txtCourse.setBounds (200, 450, 400,50);
        txtCourse.setHorizontalAlignment(JTextField.CENTER);
        txtCourse.setEditable(false);
        add(txtCourse);
        
        lblCourseTitle = new JLabel("Course");
        lblCourseTitle.setBounds(380,500,400,50);
        add(lblCourseTitle);
    }
}
