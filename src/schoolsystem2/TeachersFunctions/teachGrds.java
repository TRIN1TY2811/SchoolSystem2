/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2.TeachersFunctions;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import schoolsystem2.Teachers;

/**
 *
 * @author admin
 */
public class teachGrds extends JFrame implements ActionListener {

     private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS;
     private JLabel lblTitle;
    
    public teachGrds(){
         setSize(800,750);
         setLayout(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JLabel lblTitle = new JLabel("Professors' Subject: Grades");
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
        dispose();
        if(e.getSource()==btnOOP){
            OOPGrades og = new OOPGrades();
            og.setVisible(true);
        }
        else if(e.getSource()==btnInteg){
            IntegGrades ig = new IntegGrades();
            ig.setVisible(true);
        }
        else if(e.getSource()==btnCP){
            CompGrades cg = new CompGrades();
            cg.setVisible(true);
        }
        else if(e.getSource()==btnNetAd){
            NetAdGrades ng = new NetAdGrades();
            ng.setVisible(true);
            }
        else if(e.getSource()==btnOS){
                OpeGrades osg = new OpeGrades();
                osg.setVisible(true);
                } else if (e.getSource() == btnback) {
                    Teachers tch = new Teachers();
                    tch.setVisible(true);
                    
                }
        
    }
    
}
