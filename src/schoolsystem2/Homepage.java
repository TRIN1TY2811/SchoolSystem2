/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
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
    private JPanel pnlPanel;
    
    public Homepage(){
    this.setSize(800, 750);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(null); // Keep your null layout

// 1. Setup Background Label
ImageIcon img = new ImageIcon("\\Users\\cubes\\Downloads\\download (10).jpg"); // Ensure path is correct
Image scaledImage = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

JLabel background = new JLabel(new ImageIcon(scaledImage));
background.setBounds(0, 0, 800, 750);


// 2. Setup Foreground Panel (pnlPanel)
pnlPanel = new JPanel();
pnlPanel.setLayout(null); 
pnlPanel.setBounds(533, 0, 300, 750);



pnlPanel.add(lblHome = new JLabel("Student Record System: Home Page"));
lblHome.setBounds(10, 50, 280, 50); // Adjusted for panel relative coords
lblHome.setFont(new Font("Arial", Font.PLAIN,14));

this.add(pnlPanel);
this.add(background); // Background must be added last or use setContentPane

            
    btnStud = new JButton("Student");
    btnStud.setBounds(533, 250, 300, 30);
    // btnStud.setIcon(new ImageIcon("\\Users\\cubes\\Downloads\\download (12).jpg"));

    this.add(btnStud);
    btnStud.addActionListener(this);
    
    btnTch = new JButton("Teacher");
    btnTch.setBounds(533, 300, 300, 30);
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

