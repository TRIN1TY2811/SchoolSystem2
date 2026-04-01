/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class TeacherSubjectAtt extends JFrame implements ActionListener {

     private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS;
     private JLabel lblTitle;
    
     TeacherSubjectAtt(){
         setSize(800,800);
         setLayout(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JLabel lblTitle = new JLabel("Professors' Subject: Attendance");
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
            OOPAttend oa = new OOPAttend();
            oa.setVisible(true);
        }
        else if(e.getSource()==btnInteg){
            IntegAttend ia = new IntegAttend();
            ia.setVisible(true);
        }
        else if(e.getSource()==btnCP){
            CompAttend ca = new CompAttend();
            ca.setVisible(true);
        }
        else if(e.getSource()==btnNetAd){
            NetAdAttend na = new NetAdAttend();
            na.setVisible(true);
            }
        else if(e.getSource()==btnOS){
                OpeAttend osa = new OpeAttend();
                osa.setVisible(true);
                }
        
    }
    
}
