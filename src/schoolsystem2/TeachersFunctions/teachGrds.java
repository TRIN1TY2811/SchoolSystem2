/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolsystem2.TeachersFunctions;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import schoolsystem2.Teachers;

public class teachGrds extends JFrame implements ActionListener {

    private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS;
    private JLabel lblTitle;
    private JPanel pnlSideBar, pnlMain;

    public teachGrds() {

        setSize(800, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.WHITE);

        // ================= SIDEBAR =================
        pnlSideBar = new JPanel();
        pnlSideBar.setLayout(null);
        pnlSideBar.setBounds(0, 0, 180, 750);
        pnlSideBar.setBackground(new Color(245, 245, 245));
        add(pnlSideBar);

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
        pnlMain.setBackground(Color.WHITE);
        add(pnlMain);

        lblTitle = new JLabel("Select a Subject", SwingConstants.CENTER);
        lblTitle.setBounds(120, 20, 320, 40);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        pnlMain.add(lblTitle);

        // ================= BACK BUTTON =================
        btnback = new JButton("Back");
        btnback.setBounds(650, 620, 100, 30);
        add(btnback);

        // ================= ACTIONS =================
        btnOOP.addActionListener(this);
        btnInteg.addActionListener(this);
        btnCP.addActionListener(this);
        btnNetAd.addActionListener(this);
        btnOS.addActionListener(this);
        btnback.addActionListener(this);
    }

    // ================= SIDE BUTTON STYLE =================
    private JButton createSideButton(String text, int y) {
        JButton btn = new JButton(text);
        btn.setBounds(10, y, 160, 35);
        btn.setFont(new Font("Arial", Font.PLAIN, 13));
        btn.setBackground(new Color(230, 230, 230));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        return btn;
    }

    // ================= NO BLINK SUBJECT SWITCH =================
    private void showSubject(String title) {

        pnlMain.removeAll();

        JLabel lbl = new JLabel(title, SwingConstants.CENTER);
        lbl.setBounds(120, 20, 320, 40);
        lbl.setFont(new Font("Arial", Font.BOLD, 24));

        pnlMain.add(lbl);

        pnlMain.revalidate();
        pnlMain.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnback) {
            setVisible(false);
            new Teachers().setVisible(true);
        }

        else if (e.getSource() == btnOOP) {
            OOPGrades ops = new OOPGrades();
            ops.setVisible(true);
            showSubject("OOP Grades");
        }

        else if (e.getSource() == btnInteg) {
            IntegGrades ig = new IntegGrades();
           ig.setVisible(true);
            showSubject("Integrative Grades");
        }

        else if (e.getSource() == btnCP) {
            CompGrades cp = new CompGrades();
            cp.setVisible(true);
            showSubject("Programming Grades");
        }

        else if (e.getSource() == btnNetAd) {
            NetAdGrades nas = new NetAdGrades();
            nas.setVisible(true);
            showSubject("Network Grades");
        }

        else if (e.getSource() == btnOS) {
            OpeGrades os = new OpeGrades();
            os.setVisible(true);
            showSubject("Operating System Grades");
        }
    }
}