/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInput;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author cubes
 */
public class PersonalInfo extends JFrame implements ActionListener{

    JLabel lblPersonalInfo;
  public PersonalInfo(){
    setSize(800, 750); 
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    lblPersonalInfo = new JLabel("Student Record System: ");
    lblPersonalInfo.setBounds(200, 50, 500, 50);
    lblPersonalInfo.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblPersonalInfo);
    
  }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
