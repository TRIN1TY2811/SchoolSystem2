/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInput;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author cubes
 */
public class StudentLogin extends JFrame implements ActionListener{
        JLabel lblLogin;
        
    
     public StudentLogin(){
    setSize(800, 750); 
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     lblLogin = new JLabel("Student Record System: Student Register");
    lblLogin.setBounds(200, 50, 400, 50);
    lblLogin.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblLogin);
    /*
    btnAcademicInfo = new JButton("Academic Information");
    btnAcademicInfo.setBounds(200, 250, 400, 30);
    this.add(btnAcademicInfo);
    btnAcademicInfo.addActionListener(this);
    
    btnHealthInfo = new JButton("Health Form");
    btnHealthInfo.setBounds(200, 300, 400, 30);
    this.add(btnHealthInfo);
    btnHealthInfo.addActionListener(this);
    
    btnAddInfo = new JButton("Personal Information");
    btnAddInfo.setBounds(200, 350, 400, 30);
    this.add(btnAddInfo);
    btnAddInfo.addActionListener(this);
    
    btnBack = new JButton("back");
    btnBack.setBounds(200, 400, 400, 30);
    this.add(btnBack);
    btnBack.addActionListener(this);
*/
     }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
