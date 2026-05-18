package schoolsystem2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TeacherForgotPassword extends JFrame implements ActionListener {

    private JTextField txtId, txtEmail;
    private JPasswordField txtNewPass, txtConfirmPass;
    private JButton btnReset, btnBack;
    private JLabel lblTitle;

    private JPanel pnlPanel;

    public TeacherForgotPassword() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // BACKGROUND
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");
        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);
        setContentPane(background);

        // GLASS PANEL
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(230, 80, 340, 560);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

        // TITLE
        lblTitle = new JLabel("Forgot Password", SwingConstants.CENTER);
        lblTitle.setBounds(40, 20, 260, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        pnlPanel.add(lblTitle);

        // STUDENT ID
        addLabel("Teacher ID", 70);
        txtId = addField(95);

        // EMAIL / USERNAME
        addLabel("Email / Username", 150);
        txtEmail = addField(175);

        // NEW PASSWORD
        addLabel("New Password", 230);
        txtNewPass = new JPasswordField();
        txtNewPass.setBounds(60, 255, 220, 30);
        pnlPanel.add(txtNewPass);

        // CONFIRM PASSWORD
        addLabel("Confirm Password", 310);
        txtConfirmPass = new JPasswordField();
        txtConfirmPass.setBounds(60, 335, 220, 30);
        pnlPanel.add(txtConfirmPass);

        // RESET BUTTON
        btnReset = new JButton("Reset Password");
        btnReset.setBounds(60, 405, 220, 40);
        btnReset.setFont(new Font("Arial", Font.BOLD, 14));
        pnlPanel.add(btnReset);

        // BACK BUTTON
        btnBack = new JButton("Back");
        btnBack.setBounds(60, 460, 220, 35);
        pnlPanel.add(btnBack);

        btnReset.addActionListener(this);
        btnBack.addActionListener(this);
    }

    // helper label
    private void addLabel(String text, int y) {
        JLabel lbl = new JLabel(text);
        lbl.setBounds(60, y, 220, 20);
        pnlPanel.add(lbl);
    }

    // helper field
    private JTextField addField(int y) {
        JTextField tf = new JTextField();
        tf.setBounds(60, y, 220, 30);
        pnlPanel.add(tf);
        return tf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            dispose();
        if (e.getSource() == btnReset) {

            String pass1 = new String(txtNewPass.getPassword());
            String pass2 = new String(txtConfirmPass.getPassword());

            if (pass1.equals(pass2)) {
                JOptionPane.showMessageDialog(this, "Password Reset Successful!");
                
                TeacherLogIn teachLog = new TeacherLogIn();
                teachLog.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match!");
            }
        }

        if (e.getSource() == btnBack) {
            new StudentLogIn().setVisible(true);
        }
    }
}
