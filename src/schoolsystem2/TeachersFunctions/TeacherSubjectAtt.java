package schoolsystem2.TeachersFunctions;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TeacherSubjectAtt extends JFrame implements ActionListener {

    private JButton btnback, btnOOP, btnInteg, btnCP, btnNetAd, btnOS;
    private JLabel lblatt;

    private JPanel pnlSideBar, pnlMain;
    private CardLayout cardLayout;

    // Colors
    private final Color defaultColor = new Color(230, 230, 230);
    private final Color activeColor = new Color(100, 149, 237);

    public TeacherSubjectAtt() {

        setSize(1000, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.WHITE);

        //  SIDEBAR 
        pnlSideBar = new JPanel();
        pnlSideBar.setLayout(null);
        pnlSideBar.setBounds(0, 0, 180, 750);
        pnlSideBar.setBackground(Color.decode("#c0c0c0"));
        add(pnlSideBar);

        JLabel lblMenu = new JLabel("ATTENDANCE");
        lblMenu.setBounds(50, 40, 100, 30);
        lblMenu.setFont(new Font("Arial", Font.BOLD, 16));
        lblMenu.setForeground(Color.decode("#191970"));
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

        //  MAIN PANEL 
        cardLayout = new CardLayout();

        pnlMain = new JPanel(cardLayout);
        pnlMain.setBounds(200, 0, 800, 500);

        // Add pages
        pnlMain.add(createOOPPanel(), "OOP");
        pnlMain.add(createIntegPanel(), "INTEG");
        pnlMain.add(createCompPanel(), "CP");
        pnlMain.add(createNetAdPanel(), "NET");
        pnlMain.add(createOSPanel(), "OS");

        add(pnlMain);

        //  BACK BUTTON 
        btnback = new JButton("Back");
        btnback.setBounds(650, 620, 100, 30);
        btnback.setForeground(Color.decode("#1E1B4B"));
            btnback.setBackground(Color.decode("#BEE9FF"));
        add(btnback);

        //  ACTIONS 
        btnOOP.addActionListener(this);
        btnInteg.addActionListener(this);
        btnCP.addActionListener(this);
        btnNetAd.addActionListener(this);
        btnOS.addActionListener(this);
        btnback.addActionListener(this);
        addHoverEffectBack(btnback);
      

        // Default page
        cardLayout.show(pnlMain, "OOP");
        setActiveButton(btnOOP);
    }
    private JPanel createOOPPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    // TITLE
    JLabel title = new JLabel("OOP Attendance", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

    //  HEADER ROW 
    addHeader(panel, "Months", 20, 70);

    addHeader(panel, "Week 1", 140, 70);
    addHeader(panel, "Week 2", 260, 70);
    addHeader(panel, "Week 3", 380, 70);
    addHeader(panel, "Week 4", 500, 70);

    //  MONTHS 
    String[] months = { "Jun",
        "Jul", "Aug", "Sep"};

    int y = 110;

    for (String month : months) {

        // Month label
        JTextField monthField = new JTextField(month);
        monthField.setEditable(false);
        monthField.setBounds(20, y, 100, 30);
        monthField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(monthField);

        // Weeks (P/A placeholders)
        addField(panel, "", 140, y, 100, 30);
        addField(panel, "", 260, y, 100, 30);
        addField(panel, "", 380, y, 100, 30);
        addField(panel, "", 500, y, 100, 30);

        y += 35;
    }

    return panel;
}
    
    private JPanel createIntegPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    // TITLE
    JLabel title = new JLabel("Integrative Programming Attendance", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

    //  HEADER ROW 
    addHeader(panel, "Months", 20, 70);

    addHeader(panel, "Week 1", 140, 70);
    addHeader(panel, "Week 2", 260, 70);
    addHeader(panel, "Week 3", 380, 70);
    addHeader(panel, "Week 4", 500, 70);

    //  MONTHS 
    String[] months = { "Jun",
        "Jul", "Aug", "Sep"};

    int y = 110;

    for (String month : months) {

        // Month label
        JTextField monthField = new JTextField(month);
        monthField.setEditable(false);
        monthField.setBounds(20, y, 100, 30);
        monthField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(monthField);

        // Weeks (P/A placeholders)
        addField(panel, "", 140, y, 100, 30);
        addField(panel, "", 260, y, 100, 30);
        addField(panel, "", 380, y, 100, 30);
        addField(panel, "", 500, y, 100, 30);

        y += 35;
    }

    return panel;
}
    private JPanel createCompPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    // TITLE
    JLabel title = new JLabel("Computer Programming Attendance", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

    //  HEADER ROW 
    addHeader(panel, "Months", 20, 70);

    addHeader(panel, "Week 1", 140, 70);
    addHeader(panel, "Week 2", 260, 70);
    addHeader(panel, "Week 3", 380, 70);
    addHeader(panel, "Week 4", 500, 70);

    //  MONTHS 
    String[] months = { "Jun",
        "Jul", "Aug", "Sep"};

    int y = 110;

    for (String month : months) {

        // Month label
        JTextField monthField = new JTextField(month);
        monthField.setEditable(false);
        monthField.setBounds(20, y, 100, 30);
        monthField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(monthField);

        // Weeks (P/A placeholders)
        addField(panel, "", 140, y, 100, 30);
        addField(panel, "", 260, y, 100, 30);
        addField(panel, "", 380, y, 100, 30);
        addField(panel, "", 500, y, 100, 30);

        y += 35;
    }
    

    return panel;
}private JPanel createNetAdPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    // TITLE
    JLabel title = new JLabel("Network Administration Attendance", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

    //  HEADER ROW 
    addHeader(panel, "Months", 20, 70);

    addHeader(panel, "Week 1", 140, 70);
    addHeader(panel, "Week 2", 260, 70);
    addHeader(panel, "Week 3", 380, 70);
    addHeader(panel, "Week 4", 500, 70);

    //  MONTHS 
    String[] months = { "Jun",
        "Jul", "Aug", "Sep"};

    int y = 110;

    for (String month : months) {

        // Month label
        JTextField monthField = new JTextField(month);
        monthField.setEditable(false);
        monthField.setBounds(20, y, 100, 30);
        monthField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(monthField);

        // Weeks (P/A placeholders)
        addField(panel, "", 140, y, 100, 30);
        addField(panel, "", 260, y, 100, 30);
        addField(panel, "", 380, y, 100, 30);
        addField(panel, "", 500, y, 100, 30);

        y += 35;
    }

    return panel;
}
    private JPanel createOSPanel() {

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.WHITE);

    // TITLE
    JLabel title = new JLabel("Operating System Attendance", SwingConstants.CENTER);
    title.setBounds(0, 10, 760, 40);
    title.setFont(new Font("Arial", Font.BOLD, 24));
    panel.add(title);

    //  HEADER ROW 
    addHeader(panel, "Months", 20, 70);

    addHeader(panel, "Week 1", 140, 70);
    addHeader(panel, "Week 2", 260, 70);
    addHeader(panel, "Week 3", 380, 70);
    addHeader(panel, "Week 4", 500, 70);

    //  MONTHS 
    String[] months = { "Jun",
        "Jul", "Aug", "Sep"};

    int y = 110;

    for (String month : months) {

        // Month label
        JTextField monthField = new JTextField(month);
        monthField.setEditable(false);
        monthField.setBounds(20, y, 100, 30);
        monthField.setHorizontalAlignment(JTextField.CENTER);
        panel.add(monthField);

        // Weeks (P/A placeholders)
        addField(panel, "", 140, y, 100, 30);
        addField(panel, "", 260, y, 100, 30);
        addField(panel, "", 380, y, 100, 30);
        addField(panel, "", 500, y, 100, 30);

        y += 35;
    }

    return panel;
}

    
    //  CREATE PAGE 
    private JPanel createPage(String Teachers) {

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        JLabel lbl = new JLabel(Teachers, SwingConstants.CENTER);
        lbl.setBounds(100, 200, 350, 40);
        lbl.setFont(new Font("Arial", Font.BOLD, 24));

        panel.add(lbl);

        return panel;
    }

    //  BUTTON STYLE 
    private JButton createSideButton(String text, int y) {

        JButton btn = new JButton(text);

        btn.setBounds(10, y, 160, 35);
        btn.setFont(new Font("Arial", Font.PLAIN, 18));
        btn.setBackground(Color.decode("#FFFFFF"));
        btn.setForeground(Color.decode("#191970"));

        btn.setFocusPainted(false);
        btn.setBorderPainted(false);

        return btn;
    }
        
    //  ACTIVE BUTTON 
    private void setActiveButton(JButton activeBtn) {

        JButton[] buttons = {
            btnOOP, btnInteg, btnCP, btnNetAd, btnOS
        };

        for (JButton btn : buttons) {

            btn.setForeground(Color.decode("#FFFFFF"));
            btn.setBackground(Color.decode("#191970"));
            btn.setFont(new Font("Arial", Font.BOLD, 18));
              
        }

        activeBtn.setBackground(Color.decode("#a1dff7"));
        activeBtn.setForeground(Color.decode("#4b0082"));
        activeBtn.setFont(new Font("Arial", Font.BOLD, 21));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnback) {

            setVisible(false);
            new TeacherDashB().setVisible(true);
        }

        else if (e.getSource() == btnOOP) {

            cardLayout.show(pnlMain, "OOP");
            setActiveButton(btnOOP);
            
            addHoverEffect(btnCP);
            addHoverEffect(btnInteg);
            addHoverEffect(btnNetAd);
            addHoverEffect(btnOS);
        }

        else if (e.getSource() == btnInteg) {

            cardLayout.show(pnlMain, "INTEG");
            setActiveButton(btnInteg);
            
            addHoverEffect(btnCP);
            addHoverEffect(btnOOP);
            addHoverEffect(btnNetAd);
            addHoverEffect(btnOS);
        }

        else if (e.getSource() == btnCP) {

            cardLayout.show(pnlMain, "CP");
            setActiveButton(btnCP);
            
            addHoverEffect(btnOOP);
            addHoverEffect(btnInteg);
            addHoverEffect(btnNetAd);
            addHoverEffect(btnOS);
        }

        else if (e.getSource() == btnNetAd) {

            cardLayout.show(pnlMain, "NET");
            setActiveButton(btnNetAd);
            
            addHoverEffect(btnCP);
            addHoverEffect(btnInteg);
            addHoverEffect(btnOOP);
            addHoverEffect(btnOS);
        }

        else if (e.getSource() == btnOS) {

            cardLayout.show(pnlMain, "OS");
            setActiveButton(btnOS);
            
            addHoverEffect(btnCP);
            addHoverEffect(btnInteg);
            addHoverEffect(btnNetAd);
            addHoverEffect(btnOOP);
        }
    }
   private void addField(JPanel panel, String text,int x, int y, int width, int height) {

    JTextField txt = new JTextField(text);

    txt.setBounds(x, y, width, height);

    panel.add(txt);
}
   private void addHeader(JPanel panel, String text, int x, int y) {

    JLabel lbl = new JLabel(text, SwingConstants.CENTER);
    lbl.setBounds(x, y, 100, 30);
    lbl.setFont(new Font("Arial", Font.BOLD, 14));
    panel.add(lbl);
}
  public void addHoverEffect(JButton button) {
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 21));
            button.setForeground(Color.decode("#191970"));
            button.setBackground(Color.decode("#b57edc"));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setForeground(Color.decode("#FFFFFF"));
            button.setBackground(Color.decode("#191970"));
        }
    });
        }  
    public void addHoverEffectBack(JButton button) {
    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.setForeground(Color.decode("#FFFFFF"));
            button.setBackground(Color.decode("#312E81"));
        }
        @Override
        public void mouseExited(MouseEvent e) {
            button.setFont(new Font("Arial", Font.BOLD, 13));
            button.setForeground(Color.decode("#1E1B4B"));
            button.setBackground(Color.decode("#BEE9FF"));
        }
    });
        }
}