package schoolsystem2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentLogIn extends JFrame implements ActionListener {

    private JButton btnLogin, btnRegister,btnBack;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JLabel lblTitle, lblUser, lblPass;
    private JPanel pnlPanel;

    public StudentLogIn() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // BACKGROUND
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");
        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);
        setContentPane(background);

        // CENTER GLASS PANEL
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(250, 120, 300, 450);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

        // TITLE
        lblTitle = new JLabel("Student Login", SwingConstants.CENTER);
        lblTitle.setBounds(40, 40, 220, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setForeground(Color.decode("#312E81"));
        pnlPanel.add(lblTitle);

        // USERNAME LABEL
        lblUser = new JLabel("Student ID");
        lblUser.setBounds(40, 110, 220, 20);
        lblUser.setForeground(Color.decode("#312E81"));
        pnlPanel.add(lblUser);

        // USERNAME FIELD
        txtUser = new JTextField();
        txtUser.setBounds(40, 135, 220, 35);
        pnlPanel.add(txtUser);

        // PASSWORD LABEL
        lblPass = new JLabel("Password");
        lblPass.setBounds(40, 185, 220, 20);
        lblPass.setForeground(Color.decode("#312E81"));
        pnlPanel.add(lblPass);

        // PASSWORD FIELD
        txtPass = new JPasswordField();
        txtPass.setBounds(40, 210, 220, 35);
        pnlPanel.add(txtPass);

        // LOGIN BUTTON
        btnLogin = new JButton("Login");
        btnLogin.setBounds(40, 280, 220, 40);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 16));
        pnlPanel.add(btnLogin);

        // REGISTER BUTTON
        btnRegister = new JButton("Forgot Password");
        btnRegister.setBounds(40, 330, 220, 40);
        btnRegister.setFont(new Font("Arial", Font.BOLD, 16));
        pnlPanel.add(btnRegister);
        
        //BACK BUTTON
        btnBack = new JButton("Back");
        btnBack.setBounds(40, 380, 220, 40);
        btnBack.setFont(new Font("Arial", Font.BOLD, 16));
        pnlPanel.add(btnBack);

        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        btnBack.addActionListener(this);
          btnLogin.setForeground(Color.decode("#1E1B4B"));
            btnLogin.setBackground(Color.decode("#BEE9FF"));
        btnRegister.setForeground(Color.decode("#1E1B4B"));
            btnRegister.setBackground(Color.decode("#BEE9FF"));
        btnBack.setForeground(Color.decode("#1E1B4B"));
            btnBack.setBackground(Color.decode("#BEE9FF"));
        addHoverEffect(btnLogin);
        addHoverEffect(btnRegister);
        addHoverEffect(btnBack);
    }

      public void addHoverEffect(JButton button) {
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 21));
            button.setForeground(Color.decode("#FFFFFF"));
            button.setBackground(Color.decode("#312E81"));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setForeground(Color.decode("#1E1B4B"));
            button.setBackground(Color.decode("#BEE9FF"));
        }
    });
        }
    @Override
    public void actionPerformed(ActionEvent e) {
           dispose();
        if (e.getSource() == btnLogin) {
//            Student std = new Student();
//            std.setVisible(true);
        }

        if (e.getSource() == btnRegister) {
            StudentForgotPassword stdforg = new StudentForgotPassword();
              stdforg.setVisible(true);
            
        }
        
        if (e.getSource() == btnBack) {
            Homepage hp = new Homepage(); 
                
            hp.setVisible(true);
        }
    }
}