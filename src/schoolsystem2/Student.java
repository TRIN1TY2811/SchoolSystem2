/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2;
<<<<<<< Updated upstream

import StudentInput.StudentRegister;
=======
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
>>>>>>> Stashed changes
import schoolsystem2.personalInformation.Personal;
import schoolsystem2.StudentAttendance.SubjectAttendance;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import schoolsystem2.StudentGrades.StudentSubjectGrades;


/**
 *
 * @author admin
 */
public class Student extends JFrame implements ActionListener{
    private JButton btnAttendance, btnGrades, btnPersonal, btnBack, btnStuRegis;
    private JLabel lblstud;
    private JPanel pnlmenu;
            
public Student(){
    setSize(800,750);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lblstud = new JLabel("Student Record System: Students");
    lblstud.setBounds(200, 50, 400, 50);
    lblstud.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblstud);
    ImageIcon img = new ImageIcon("\\Users\\cubes\\Downloads\\download (10).jpg"); // Ensure path is correct
    Image scaledImage = img.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
 
    JLabel background = new JLabel(new ImageIcon(scaledImage));
    background.setBounds(10, 10, 80, 80);
    
<<<<<<< Updated upstream
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
    
    btnStuRegis = new JButton("Register");
    btnStuRegis.setBounds(200, 450, 400, 30);
    this.add(btnStuRegis);
    btnStuRegis.addActionListener(this);
}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAttendance){
            dispose();
            SubjectAttendance at = new SubjectAttendance();
            at.setVisible(true);
        } else if (e.getSource () == btnGrades) {
            dispose();
            StudentSubjectGrades stgr = new StudentSubjectGrades();
            stgr.setVisible(true);
        } else if (e.getSource () == btnPersonal) {
            dispose();
            Personal pr = new Personal();
            pr.setVisible(true);
        } else if (e.getSource() == btnBack ) {
            dispose();
            Homepage hp = new Homepage();
            hp.setVisible(true);
        } else if (e.getSource() == btnStuRegis){
            dispose();
            StudentRegister sr = new StudentRegister();
            sr.setVisible(true);
    }

}}
=======
    pnlmenu = new JPanel();
        pnlmenu.setBounds(0,0, 800, 80);
    pnlmenu.setBackground(Color.WHITE);
    this.add(pnlmenu);

    btnAttendance = createSideButton("Attendance", 100);    
   // btnAttendance = new JButton("Attendance");
    // btnAttendance.setBounds(200, 250, 400, 30);
    pnlmenu.add(btnAttendance);
    btnAttendance.addActionListener(this);

   btnGrades = createSideButton("Grades", 100);    
   // btnGrades = new JButton("Grades");
   // btnGrades.setBounds(200, 300, 400, 30);
    pnlmenu.add(btnGrades);
    btnGrades.addActionListener(this);

   btnPersonal = createSideButton("Personal Information", 200);    
  //  btnPersonal = new JButton("Personal Information");
    // btnPersonal.setBounds(200, 350, 400, 30);
   pnlmenu.add(btnPersonal);
    btnPersonal.addActionListener(this);

    
    btnBack = createSideButton("Back", 50);
       // btnBack = new JButton("back");
    btnBack.setBounds(200, 400, 400, 30);
    pnlmenu.add(btnBack);
    btnBack.addActionListener(this);
    
    addHoverEffect(btnBack);
    addHoverEffect(btnAttendance);
    addHoverEffect(btnGrades);
    addHoverEffect(btnPersonal);
  //  this.add(pnlmenu);
   pnlmenu.add(background);
}


public void addHoverEffect(JButton button) {
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setForeground(Color.BLACK);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            button.setForeground(Color.GRAY);
        }
    });
}

















    
    


    public JButton createSideButton(String text, int y) {
          JButton button = new JButton(text);
          button.setBounds(20, y, 160, 40);
          button.setFocusPainted(false);
          button.setBackground(Color.WHITE);
          button.setForeground(Color.GRAY);
          button.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
          button.setBorder(BorderFactory.createEmptyBorder());
          button.addActionListener(this);
          return button;
}
    
     
   @Override
   public void actionPerformed(ActionEvent e) {
       if(e.getSource() == btnAttendance){
           dispose();
           SubjectAttendance at = new SubjectAttendance();
           at.setVisible(true);
       } else if(e.getSource() == btnGrades){
           dispose();
           StudentSubjectGrades stgr = new StudentSubjectGrades();
           stgr.setVisible(true);
       } else if(e.getSource() == btnPersonal){
           dispose();
           Personal pr = new Personal();
           pr.setVisible(true);
       } else if(e.getSource() == btnBack){
           dispose();
           Homepage hp = new Homepage();
           hp.setVisible(true);
       }
   }
}

>>>>>>> Stashed changes
