package schoolsystem2.TeachersFunctions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OpeGrades extends JFrame implements ActionListener {

    private JLabel lblatt;
    private JButton btnback;
    private JButton btnOOP, btnInteg, btnCP, btnNetAd, btnOS;
    private JPanel pnlSideBar;

    public OpeGrades() {

        setSize(800, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        btnOOP.addActionListener(this);
        btnInteg.addActionListener(this);
        btnCP.addActionListener(this);
        btnNetAd.addActionListener(this);
        btnOS.addActionListener(this);

        // ================= TITLE =================
        lblatt = new JLabel("OOP Grades");
        lblatt.setBounds(220, 50, 400, 50);
        lblatt.setFont(new Font("Arial", Font.PLAIN, 24));
        add(lblatt);

        // ================= ROW 1 =================
        addField("Amodia, James Earl", 220, 120);
        addField("", 350, 120);
        addField("", 460, 120);
        addField("", 570, 120);
        addField("", 680, 120);

        // ================= ROW 2 =================
        addField("Barcelina, Joe", 220, 160);
        addField("", 350, 160);
        addField("", 460, 160);
        addField("", 570, 160);
        addField("", 680, 160);

        // ================= ROW 3 =================
        addField("Caldo, Crishalyn", 220, 200);
        addField("", 350, 200);
        addField("", 460, 200);
        addField("", 570, 200);
        addField("", 680, 200);

        // ================= ROW 4 =================
        addField("De Jesus, Tom", 220, 240);
        addField("", 350, 240);
        addField("", 460, 240);
        addField("", 570, 240);
        addField("", 680, 240);

        // ================= ROW 5 =================
        addField("Ebu, Joshua", 220, 280);
        addField("", 350, 280);
        addField("", 460, 280);
        addField("", 570, 280);
        addField("", 680, 280);

        // ================= ROW 6 =================
        addField("Francisco, Kristy", 220, 320);
        addField("", 350, 320);
        addField("", 460, 320);
        addField("", 570, 320);
        addField("", 680, 320);

        // ================= ROW 7 =================
        addField("Gordon, Faye", 220, 360);
        addField("", 350, 360);
        addField("", 460, 360);
        addField("", 570, 360);
        addField("", 680, 360);

        // ================= ROW 8 =================
        addField("Hyacinth, Gabriela", 220, 400);
        addField("", 350, 400);
        addField("", 460, 400);
        addField("", 570, 400);
        addField("", 680, 400);

        // ================= ROW 9 =================
        addField("Igloso, Mark", 220, 440);
        addField("", 350, 440);
        addField("", 460, 440);
        addField("", 570, 440);
        addField("", 680, 440);

        // ================= ROW 10 =================
        addField("Jopia, Richard", 220, 480);
        addField("", 350, 480);
        addField("", 460, 480);
        addField("", 570, 480);
        addField("", 680, 480);

        // ================= BACK BUTTON =================
        btnback = new JButton("Back");
        btnback.setBounds(220, 550, 350, 50);
        add(btnback);

        btnback.addActionListener(this);
    }

    // ================= HELPER METHOD =================
    private void addField(String text, int x, int y) {
        JTextField txt = new JTextField(text);
        txt.setEditable(false);
        txt.setBounds(x, y, 100, 30);
        add(txt);
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

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnback) {
            dispose();
            new teachGrds().setVisible(true);
        }

        else if (e.getSource() == btnOOP) {
            new OOPGrades().setVisible(true);
        }

        else if (e.getSource() == btnInteg) {
            dispose();
            new IntegGrades().setVisible(true);
        }

        else if (e.getSource() == btnCP) {
            dispose();
            new CompGrades().setVisible(true);
        }

        else if (e.getSource() == btnNetAd) {
            dispose();
            new NetAdGrades().setVisible(true);
        }

        else if (e.getSource() == btnOS) {
            dispose();
            return;
        }
    }
}