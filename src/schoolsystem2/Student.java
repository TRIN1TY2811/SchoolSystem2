package schoolsystem2;

import schoolsystem2.personalInformation.Personal;
import schoolsystem2.StudentAttendance.SubjectAttendance;
import schoolsystem2.StudentGrades.StudentSubjectGrades;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Student extends JFrame implements ActionListener {

    private JButton btnAttendance, btnGrades, btnBack;
    private JLabel lblTitle, lblPersonalTitle;
    private JPanel pnlPanel, pnlPersonal;

    public Student() {

        setSize(800, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // BACKGROUND
        ImageIcon img = new ImageIcon("C:\\Users\\admin\\Downloads\\pup1.jpg");
        Image scaled = img.getImage().getScaledInstance(800, 750, Image.SCALE_SMOOTH);

        JLabel background = new JLabel(new ImageIcon(scaled));
        background.setLayout(null);
        setContentPane(background);

        // MAIN GLASS PANEL
        pnlPanel = new JPanel();
        pnlPanel.setLayout(null);
        pnlPanel.setBounds(120, 60, 560, 420);
        pnlPanel.setBackground(new Color(255, 255, 255, 180));

        background.add(pnlPanel);

        // TITLE
        lblTitle = new JLabel("Student Dashboard", SwingConstants.CENTER);
        lblTitle.setBounds(120, 20, 320, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        pnlPanel.add(lblTitle);

        // GRADES BUTTON (big tile style)
        btnGrades = new JButton("Grades");
        btnGrades.setBounds(70, 100, 220, 40);
        btnGrades.setFont(new Font("Arial",Font.BOLD, 18));
        pnlPanel.add(btnGrades);

        // ATTENDANCE BUTTON (big tile style)
        btnAttendance = new JButton("Attendance");
        btnAttendance.setBounds(310, 100, 220, 40);
        btnAttendance.setFont(new Font("Arial", Font.BOLD, 18));
        pnlPanel.add(btnAttendance);

        // PERSONAL INFO SECTION TITLE
        lblPersonalTitle = new JLabel("Personal Information");
        lblPersonalTitle.setBounds(70, 250, 300, 30);
        lblPersonalTitle.setFont(new Font("Arial", Font.BOLD, 18));
        pnlPanel.add(lblPersonalTitle);

        // PERSONAL INFO PANEL (EMPTY FOR YOU TO FILL)
        pnlPersonal = new JPanel();
        pnlPersonal.setLayout(null);
        pnlPersonal.setBounds(70, 285, 420, 100);
        pnlPersonal.setBackground(new Color(240, 240, 240, 180));

        pnlPanel.add(pnlPersonal);

        // BACK BUTTON (bottom right)
        btnBack = new JButton("Back");
        btnBack.setBounds(650, 620, 100, 30);
        background.add(btnBack);

        // ACTIONS
        btnGrades.addActionListener(this);
        btnAttendance.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == btnGrades) {
            new StudentSubjectGrades().setVisible(true);
        }

        if (e.getSource() == btnAttendance) {
            new SubjectAttendance().setVisible(true);
        }

        if (e.getSource() == btnBack) {
            new Homepage().setVisible(true);
        }
    }
}