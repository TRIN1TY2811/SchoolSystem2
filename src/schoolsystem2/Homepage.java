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
    
   public Homepage() {

    setSize(800, 750);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);

    ImageIcon img = new ImageIcon("\"C:\\Users\\cubes\\Downloads\\pup.png\"");

    Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

    JLabel background = new JLabel(new ImageIcon(scaled));
    background.setLayout(null);

    setContentPane(background);
    

    pnlPanel = new JPanel();
    pnlPanel.setLayout(null);

    pnlPanel.setBounds(500, 0, 300, 750);

    pnlPanel.setBackground(new Color(255, 255, 255, 170));
    pnlPanel.setBackground(Color.decode("#F8FAFC"));
    background.add(pnlPanel);

   
    lblHome = new JLabel("Hi, PUPian!", SwingConstants.CENTER);
    lblHome.setBounds(20, 120, 260, 50);
    lblHome.setFont(new Font("Arial", Font.BOLD, 28));
    lblHome.setForeground(Color.decode("#0d07ba"));
    pnlPanel.add(lblHome);

    btnStud = new JButton("Student");
 btnStud.setBounds(535, 350, 220, 40);   
 btnStud.setFont(new Font("Arial", Font.BOLD, 18));
 btnStud.setBackground(Color.decode("#0d07ba"));
           btnStud.setForeground(Color.decode("#FFFFFF"));
           btnStud.setOpaque(true);
            btnStud.setBorderPainted(false);
    this.add(btnStud);

    // TEACHER BUTTON
    btnTch = new JButton("Teacher");
    btnTch.setBounds(535, 400, 220, 40);
    btnTch.setFont(new Font("Arial", Font.BOLD, 18));
    btnTch.setBackground(Color.decode("#0d07ba"));
     //btnTch.setBackground(Color.decode("#7FA6E6"));
           btnTch.setForeground(Color.decode("#FFFFFF"));
           btnTch.setOpaque(true);
            btnTch.setBorderPainted(false);
    this.add(btnTch);

    btnStud.addActionListener(this);
    btnTch.addActionListener(this);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource()==btnStud){
            StudentLogIn sc = new StudentLogIn();
            sc.setVisible(true);
        }
        else if(e.getSource() == btnTch) {
            TeacherLogIn tch = new TeacherLogIn();
            tch.setVisible(true);
        }
        }
    }