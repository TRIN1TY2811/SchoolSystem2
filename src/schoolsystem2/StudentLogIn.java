package schoolsystem2;
import schoolsystem2.StudentsData.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentLogIn extends JFrame implements ActionListener {

    private JButton btnLogin, btnRegister, btnBack;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JLabel lblTitle, lblUser, lblPass;
    private JPanel pnlPanel;

    public StudentLogIn() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ================= BACKGROUND =================
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");

        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);

        setContentPane(background);

        // ================= PANEL =================
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(250, 120, 300, 450);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

        // ================= TITLE =================
        lblTitle = new JLabel("Student Login", SwingConstants.CENTER);
        lblTitle.setBounds(40, 40, 220, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));

        pnlPanel.add(lblTitle);

        // ================= USERNAME =================
        lblUser = new JLabel("Student ID");
        lblUser.setBounds(40, 110, 220, 20);

        pnlPanel.add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(40, 135, 220, 35);

        pnlPanel.add(txtUser);

        // ================= PASSWORD =================
        lblPass = new JLabel("Password");
        lblPass.setBounds(40, 185, 220, 20);

        pnlPanel.add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(40, 210, 220, 35);

        pnlPanel.add(txtPass);

        // ================= LOGIN BUTTON =================
        btnLogin = new JButton("Login");
        btnLogin.setBounds(40, 280, 220, 40);
        btnLogin.setFont(new Font("Arial", Font.BOLD, 16));

        pnlPanel.add(btnLogin);

        // ================= FORGOT PASSWORD BUTTON =================
        btnRegister = new JButton("Forgot Password");
        btnRegister.setBounds(40, 330, 220, 40);
        btnRegister.setFont(new Font("Arial", Font.BOLD, 16));

        pnlPanel.add(btnRegister);

        // ================= BACK BUTTON =================
        btnBack = new JButton("Back");
        btnBack.setBounds(40, 380, 220, 40);
        btnBack.setFont(new Font("Arial", Font.BOLD, 16));

        pnlPanel.add(btnBack);

        // ================= ACTION LISTENERS =================
        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
dispose();
        // ================= LOGIN =================
        if (e.getSource() == btnLogin) {
            
            Student1 stud = new Student1();
            stud.setVisible(true);

//            String username = txtUser.getText().trim();
//            String password = String.valueOf(txtPass.getPassword()).trim();
//
//            // EMPTY CHECK
//            if (username.isEmpty() || password.isEmpty()) {
//
//                JOptionPane.showMessageDialog(
//                        this,
//                        "Please enter your credentials to proceed",
//                        "Login Error",
//                        JOptionPane.WARNING_MESSAGE
//                );
//            }
//
//            // CORRECT LOGIN
//            else if (username.equals("JamesEarlAmodia")
//                    && password.equals("Amodia2811")) {
//
//                dispose();
//
//                Student1 std1 = new Student1();
//                std1.setVisible(true);
//            }
//            
//            else if (username.equals("EdwardAyson")
//                    && password.equals("Edward123")) {
//
//                dispose();
//
//                Student3 std3 = new Student3();
//                std3.setVisible(true);
//            }
//            
//            else if (username.equals("ThomasAlonde")
//                    && password.equals("Thomas123")) {
//
//                dispose();
//
//                Student2 std2 = new Student2();
//                std2.setVisible(true);
//            }
//
//            // WRONG LOGIN
//            else {
//
//                JOptionPane.showMessageDialog(
//                        this,
//                        "Invalid username or password",
//                        "Login Failed",
//                        JOptionPane.ERROR_MESSAGE
//                );
//            }
            // Here
        }

        // ================= FORGOT PASSWORD =================
        else if (e.getSource() == btnRegister) {

            dispose();

            StudentForgotPassword stdforg = new StudentForgotPassword();
            stdforg.setVisible(true);
        }

        // ================= BACK =================
        else if (e.getSource() == btnBack) {

            dispose();

            Homepage hp = new Homepage();
            hp.setVisible(true);
        }
    }
}