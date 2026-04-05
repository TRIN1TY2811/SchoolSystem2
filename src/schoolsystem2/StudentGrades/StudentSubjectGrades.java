/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2.StudentGrades;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import schoolsystem2.*;
/**
 *
 * @author amodi
 */
public class StudentSubjectGrades extends JFrame implements ActionListener {
    
    private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS;
     private JLabel lblTitle;

public StudentSubjectGrades() {
    
    setSize(800,750);
         setLayout(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JLabel lblTitle = new JLabel("Students Subject Attendance");
         lblTitle.setBounds(200, 50, 400, 50);
        lblTitle.setFont(new Font("Arial", Font.PLAIN,24));
        this.add(lblTitle);
        
        btnOOP = new JButton("OOP");
        btnOOP.setBounds(200, 200, 400, 30);
        this.add(btnOOP);
        btnOOP.addActionListener(this);
        
        btnInteg = new JButton("Integrative Programming");
        btnInteg.setBounds(200, 250, 400, 30);
        this.add(btnInteg);
        btnInteg.addActionListener(this);
        
        btnCP = new JButton("Computer Programming");
        btnCP.setBounds(200, 300, 400, 30);
        this.add(btnCP);
        btnCP.addActionListener(this); 
        
        btnNetAd = new JButton("Network Administration");
        btnNetAd.setBounds(200, 350, 400, 30);
        this.add(btnNetAd);
        btnNetAd.addActionListener(this); 
        
        btnOS = new JButton("Operating System");
        btnOS.setBounds(200, 400, 400, 30);
        this.add(btnOS);
        btnOS.addActionListener(this); 
        
        btnback = new JButton("Back");
        btnback.setBounds(225, 450, 350, 50);
        this.add(btnback);
        btnback.addActionListener(this); 
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==btnback){
            dispose();
            Student std = new Student();
            std.setVisible(true);
            
        }
        
        else if (e.getSource()==btnInteg){
            dispose();
            IntegStdGrades integ = new IntegStdGrades();
            integ.setVisible(true);
        }
        
        else if (e.getSource()==btnCP){
            dispose();
            CompStdGrades comp = new CompStdGrades();
            comp.setVisible(true);
        }
        
        else if (e.getSource()==btnback){
            dispose();
            Student std = new Student();
            std.setVisible(true);
        }
        
        else if (e.getSource()==btnback){
            dispose();
            Student std = new Student();
            std.setVisible(true);
        }
        
        else if (e.getSource()==btnback){
            dispose();
            Student std = new Student();
            std.setVisible(true);
        }
        
    }
    
}
