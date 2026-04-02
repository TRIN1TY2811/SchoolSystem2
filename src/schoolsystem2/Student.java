/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author admin
 */
public class Student extends JFrame implements ActionListener{
    private JButton btnAttendance, btnGrades, btnPersonal, btnBack;
    private JLabel lblstud;

Student(){
    setSize(800,750);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lblstud = new JLabel("Student Record System: Students");
    lblstud.setBounds(200, 50, 400, 50);
    lblstud.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblstud);
    
    btnAttendance = new JButton("Attendance");
    btnAttendance.setBounds(200, 250, 400, 30);
    this.add(btnAttendance);
    btnAttendance.addActionListener(this);
    
    btnGrades = new JButton("Grades");
    btnGrades.setBounds(200, 300, 400, 30);
    this.add(btnGrades);
    btnGrades.addActionListener(this);
    
    btnPersonal = new JButton("Personal Information");
    btnPersonal.setBounds(200, 350, 400, 30);
    this.add(btnPersonal);
    btnPersonal.addActionListener(this);
    
    btnBack = new JButton("back");
    btnBack.setBounds(200, 400, 400, 30);
    this.add(btnBack);
    btnBack.addActionListener(this);
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAttendance){
            dispose();
            Attendance at = new Attendance();
            at.setVisible(true);
        } else if (e.getSource () == btnGrades) {
            dispose();
            StGrades stgr = new StGrades();
            stgr.setVisible(true);
        } else if (e.getSource () == btnPersonal) {
            dispose();
            Personal pr = new Personal();
            pr.setVisible(true);
        } else if (e.getSource() == btnBack ) {
            Homepage hp = new Homepage();
            hp.setVisible(true);
        }
    }

}
