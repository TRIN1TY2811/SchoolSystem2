package schoolsystem2.StudentGrades;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import schoolsystem2.Student;
import schoolsystem2.StudentGrades.*;

public class ActiveButton extends JFrame implements ActionListener {

    private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS; 
    private JLabel lblTitle;

    private JPanel pnlSideBar, pnlMain;

    // ✅ ACTIVE BUTTON TRACKER
    private JButton activeButton;

    public ActiveButton() {

        setSize(800, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.WHITE);

        // ================= SIDEBAR =================
        pnlSideBar = new JPanel();
        pnlSideBar.setLayout(null);
        pnlSideBar.setBounds(0, 0, 180, 750);
        pnlSideBar.setBackground(new Color(245, 245, 245));

        this.add(pnlSideBar);

        JLabel lblMenu = new JLabel("GRADES");
        lblMenu.setBounds(50, 40, 100, 30);
        lblMenu.setFont(new Font("Arial", Font.BOLD, 16));
        pnlSideBar.add(lblMenu);

        btnOOP = createSideButton("OOP", 120);
        btnInteg = createSideButton("Integrative", 170);
        btnCP = createSideButton("Programming", 220);
        btnNetAd = createSideButton("Network", 270);
        btnOS = createSideButton("Operating Sys", 320);

        pnlSideBar.add(btnOOP);
        pnlSideBar.add(btnInteg);
        pnlSideBar.add(btnCP);
        pnlSideBar.add(btnNetAd);
        pnlSideBar.add(btnOS);

        // ================= MAIN PANEL =================
        pnlMain = new JPanel();
        pnlMain.setLayout(null);
        pnlMain.setBounds(200, 60, 560, 500);
        pnlMain.setBackground(new Color(255, 255, 255));

        this.add(pnlMain);

        lblTitle = new JLabel("Subject Grades", SwingConstants.CENTER);
        lblTitle.setBounds(120, 20, 320, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        pnlMain.add(lblTitle);

        // BACK BUTTON
        btnback = new JButton("Back");
        btnback.setBounds(650, 620, 100, 30);
        this.add(btnback);

        // ACTION LISTENERS
        btnOOP.addActionListener(this);
        btnInteg.addActionListener(this);
        btnCP.addActionListener(this);
        btnNetAd.addActionListener(this);
        btnOS.addActionListener(this);
        btnback.addActionListener(this);

        // OPTIONAL: default active button
        setActiveButton(btnOOP);
    }

    // ================= SIDEBAR BUTTON STYLE =================
    private JButton createSideButton(String text, int y) {
        JButton btn = new JButton(text);
        btn.setBounds(10, y, 160, 35);
        btn.setFont(new Font("Arial", Font.PLAIN, 13));
        btn.setBackground(new Color(230, 230, 230));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        return btn;
    }

    // ================= ACTIVE BUTTON METHOD =================
    private void setActiveButton(JButton button) {

        if (activeButton != null) {
            activeButton.setBackground(new Color(230, 230, 230));
            activeButton.setForeground(Color.BLACK);
        }

        activeButton = button;

        activeButton.setBackground(new Color(100, 149, 237)); // active blue
        activeButton.setForeground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnOOP) {
            setActiveButton(btnOOP);
            new OopStdGrades().setVisible(true);
        }

        else if (e.getSource() == btnInteg) {
            setActiveButton(btnInteg);
            new IntegStdGrades().setVisible(true);
        }

        else if (e.getSource() == btnCP) {
            setActiveButton(btnCP);
            new CompStdGrades().setVisible(true);
        }

        else if (e.getSource() == btnNetAd) {
            setActiveButton(btnNetAd);
            new NetAdStdGrades().setVisible(true);
        }

        else if (e.getSource() == btnOS) {
            setActiveButton(btnOS);
            new OpeStdGrades().setVisible(true);
        }

        else if (e.getSource() == btnback) {
            new Student().setVisible(true);
        }
    }
}