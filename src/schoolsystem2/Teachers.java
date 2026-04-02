/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2;
import schoolsystem2.TeachersFunctions.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

 public class Teachers extends JFrame implements ActionListener {
     
    
     private JButton btnattendance, btngrades, btnback;
     private JLabel lblteach;
      Teachers(){
          setSize(800, 750);
          setLayout(null);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          lblteach = new JLabel("Teacher Record System: Teacher");
    lblteach.setBounds(200, 50, 400, 50);
    lblteach.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblteach);
          
    btnattendance = new JButton("Attendance");
    btnattendance.setBounds(200, 250, 400, 30);
    this.add(btnattendance);
    btnattendance.addActionListener(this);
    
    btngrades = new JButton("Grade");
    btngrades.setBounds(200, 300, 400, 30);
    this.add(btngrades);
    btngrades.addActionListener(this);
    
    btnback = new JButton("Back");
    btnback.setBounds(200, 350, 400, 40);
    this.add(btnback);
    btnback.addActionListener(this);
     
     
     
     
     


     
      }  

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()== btnattendance ) {
          dispose();
            TeacherSubjectAtt TeachAtt = new TeacherSubjectAtt();
          TeachAtt.setVisible(true); 
          } else if (e.getSource() == btngrades) {
              teachGrds tgrd = new teachGrds ();
              tgrd.setVisible(true);
          } else if (e.getSource() == btnback ){       
              Homepage hp = new Homepage();
              hp.setVisible(true);
    }
}
 }