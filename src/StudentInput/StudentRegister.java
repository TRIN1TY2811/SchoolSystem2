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
import schoolsystem2.Homepage;


/**
 *
 * @author cubes
 */
public class StudentRegister extends JFrame implements ActionListener{

    
    private JButton btnPersonalInfo, btnAcademicInfo, btnHealthInfo, btnAddInfo, btnBack;
    private JLabel lblRegister;
    
    public StudentRegister(){
    setSize(800, 750); 
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

     lblRegister = new JLabel("Student Record System: Student Register");
    lblRegister.setBounds(200, 50, 400, 50);
    lblRegister.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblRegister);
    
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btnPersonalInfo){
            dispose();
             PersonalInfo pi = new PersonalInfo();
            pi .setVisible(true);
        } else if (e.getSource () == btnAcademicInfo) {
            dispose();
            AcademicInfo ai = new AcademicInfo();
            ai.setVisible(true);
        } else if (e.getSource () == btnHealthInfo) {
            dispose();
            HealthInfo hi = new HealthInfo();
            hi.setVisible(true);
        } else if (e.getSource() == btnBack ) {
            dispose();
            Homepage hp = new Homepage();
            hp.setVisible(true);

    }


    }
}