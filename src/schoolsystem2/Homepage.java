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
public class Homepage extends JFrame implements ActionListener {
    private JButton btnStud, btnTch;
    private JLabel lblHome;
    
    public Homepage(){
    setSize(800, 750); 
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lblHome = new JLabel("Student Record System: Home Page");
    lblHome.setBounds(200, 50, 400, 50);
    lblHome.setFont(new Font("Arial", Font.PLAIN,24));
    this.add(lblHome);
            
    btnStud = new JButton("Student");
    btnStud.setBounds(200, 250, 400, 30);
    this.add(btnStud);
    btnStud.addActionListener(this);
    
    btnTch = new JButton("Teacher");
    btnTch.setBounds(200, 300, 400, 30);
    this.add(btnTch);
    btnTch.addActionListener(this);
            }
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnStud){
            Student sc = new Student();
            sc.setVisible(true);
        }
        else if(e.getSource() == btnTch) {
            Teachers tch = new Teachers();
            tch.setVisible(true);
        }
        }
    }

