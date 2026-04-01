/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;


public class Attendance extends JFrame implements ActionListener{
   private JLabel lblatt, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10;
   private JButton btnback;
   private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23,
           txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48,
           txt49, txt50;
   
   Attendance(){
    setSize(800,800);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lblatt = new JLabel("Student Record System: Attendance");
    lblatt.setBounds(200, 50, 400, 50);
    lblatt.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblatt);
    
    JTextField txt1 = new JTextField(" Amodia, James Earl");
    txt1.setEditable(false); 
    txt1.setBounds(50,120,120,30);
    this.add(txt1);
    
    JTextField txt2 = new JTextField(" Barcelina, Joe");
    txt2.setEditable(false); 
    txt2.setBounds(50,160,120,30);
    this.add(txt2);
    
    JTextField txt3 = new JTextField(" Caldo, Crishalyn");
    txt3.setEditable(false); 
    txt3.setBounds(50,200,120,30);
    this.add(txt3);
    
    JTextField txt4 = new JTextField(" De Jesus, Tom");
    txt4.setEditable(false); 
    txt4.setBounds(50,240,120,30);
    this.add(txt4);
    
    JTextField txt5 = new JTextField(" Ebu, Joshua");
    txt5.setEditable(false); 
    txt5.setBounds(50,280,120,30);
    this.add(txt5);
    
    JTextField txt6 = new JTextField(" Francisco, Kristy");
    txt6.setEditable(false); 
    txt6.setBounds(50,320,120,30);
    this.add(txt6); 
    
    JTextField txt7 = new JTextField(" Gordon, Faye");
    txt7.setEditable(false); 
    txt7.setBounds(50,360,120,30);
    this.add(txt7);
    
    JTextField txt8 = new JTextField(" Hyacinth, Gabriela");
    txt8.setEditable(false); 
    txt8.setBounds(50,400,120,30);
    this.add(txt8);  
    
    JTextField txt9 = new JTextField(" Igloso, Mark");
    txt9.setEditable(false); 
    txt9.setBounds(50,440,120,30);
    this.add(txt9); 
    
    JTextField txt10 = new JTextField(" Jopia, Richard");
    txt10.setEditable(false); 
    txt10.setBounds(50,480,120,30);
    this.add(txt9);
    
    JLabel lbl1 = new JLabel("Week 1");
    lbl1.setBounds(180, 95, 120, 30);
    this.add(lbl1);
    
    JLabel lbl2 = new JLabel("Week 2");
    lbl2.setBounds(300, 95, 120, 30);
    this.add(lbl2);
    
    JLabel lbl3 = new JLabel("Week 3");
    lbl3.setBounds(420, 95, 120, 30);
    this.add(lbl3);
    
    JLabel lbl4 = new JLabel("Week 4");
    lbl4.setBounds(540, 95, 120, 30);
    this.add(lbl4);
    
    JLabel lbl5= new JLabel("Week 5");
    lbl5.setBounds(660, 95, 120, 30);
    this.add(lbl5);
    
    JTextField txt11 = new JTextField();
    txt11.setBounds(180,120,100,30);
    this.add(txt11);
   
    JTextField txt12 = new JTextField();
    txt12.setBounds(290,120,100,30);
    this.add(txt12);
  
    JTextField txt13 = new JTextField();
    txt13.setBounds(400,120,100,30);
    this.add(txt13);
    
    JTextField txt14 = new JTextField();
    txt14.setBounds(510,120,100,30);
    this.add(txt14);
    
    JTextField txt15 = new JTextField();
    txt15.setBounds(620,120,100,30);
    this.add(txt15);
    
    JTextField txt16 = new JTextField();
    txt16.setBounds(180,160,100,30);
    this.add(txt16);
    
    JTextField txt17 = new JTextField();
    txt17.setBounds(290,160,100,30);
    this.add(txt17);
    
    JTextField txt18 = new JTextField();
    txt18.setBounds(400,160,100,30);
    this.add(txt18);
    
    JTextField txt19 = new JTextField();
    txt19.setBounds(510,160,100,30);
    this.add(txt19);
    
    JTextField txt20 = new JTextField();
    txt20.setBounds(620,160,100,30);
    this.add(txt20);
    
     JTextField txt21 = new JTextField();
    txt21.setBounds(180,200,100,30);
    this.add(txt21);
    
    JTextField txt22 = new JTextField();
    txt22.setBounds(290,200,100,30);
    this.add(txt22);
    
    JTextField txt23 = new JTextField();
    txt23.setBounds(400,200,100,30);
    this.add(txt23);
    
    JTextField txt24 = new JTextField();
    txt24.setBounds(510,200,100,30);
    this.add(txt24);
   }
    @Override
    public void actionPerformed(ActionEvent e) {
      
    }
    
}
