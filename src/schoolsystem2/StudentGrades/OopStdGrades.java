
package schoolsystem2.StudentGrades;


    
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
    
public class OopStdGrades extends JFrame implements ActionListener{
    
     private JLabel lblatt, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10;
    private JButton btnback;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23,
            txt24, txt25, txt26, txt27, txt28, txt29, txt30, txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42, txt43, txt44, txt45, txt46, txt47, txt48,
            txt49, txt50, txt51, txt52, txt53, txt54, txt55, txt56, txt57, txt58, txt59, txt60;
    
    public OopStdGrades() {
        
        setSize(800, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblatt = new JLabel("OOP Grades");
        lblatt.setBounds(200, 50, 400, 50);
        lblatt.setFont(new Font("Arial", Font.PLAIN, 24));
        this.add(lblatt);

        JTextField txt1 = new JTextField(" Amodia, James Earl");
        txt1.setEditable(false);
        txt1.setBounds(50, 120, 120, 30);
        this.add(txt1);

        JTextField txt2 = new JTextField(" Barcelina, Joe");
        txt2.setEditable(false);
        txt2.setBounds(50, 160, 120, 30);
        this.add(txt2);

        JTextField txt3 = new JTextField(" Caldo, Crishalyn");
        txt3.setEditable(false);
        txt3.setBounds(50, 200, 120, 30);
        this.add(txt3);

        JTextField txt4 = new JTextField(" De Jesus, Tom");
        txt4.setEditable(false);
        txt4.setBounds(50, 240, 120, 30);
        this.add(txt4);

        JTextField txt5 = new JTextField(" Ebu, Joshua");
        txt5.setEditable(false);
        txt5.setBounds(50, 280, 120, 30);
        this.add(txt5);

        JTextField txt6 = new JTextField(" Francisco, Kristy");
        txt6.setEditable(false);
        txt6.setBounds(50, 320, 120, 30);
        this.add(txt6);

        JTextField txt7 = new JTextField(" Gordon, Faye");
        txt7.setEditable(false);
        txt7.setBounds(50, 360, 120, 30);
        this.add(txt7);

        JTextField txt8 = new JTextField(" Hyacinth, Gabriela");
        txt8.setEditable(false);
        txt8.setBounds(50, 400, 120, 30);
        this.add(txt8);

        JTextField txt9 = new JTextField(" Igloso, Mark");
        txt9.setEditable(false);
        txt9.setBounds(50, 440, 120, 30);
        this.add(txt9);

        JTextField txt10 = new JTextField(" Jopia, Richard");
        txt10.setEditable(false);
        txt10.setBounds(50, 480, 120, 30);
        this.add(txt9);

        JLabel lbl1 = new JLabel("Activities");
        lbl1.setBounds(180, 95, 120, 30);
        this.add(lbl1);

        JLabel lbl2 = new JLabel("Project");
        lbl2.setBounds(300, 95, 120, 30);
        this.add(lbl2);

        JLabel lbl3 = new JLabel("Quiz");
        lbl3.setBounds(420, 95, 120, 30);
        this.add(lbl3);

        JLabel lbl4 = new JLabel("Exam");
        lbl4.setBounds(540, 95, 120, 30);
        this.add(lbl4);

        JLabel lbl5 = new JLabel("Final Grade");
        lbl5.setBounds(660, 95, 120, 30);
        this.add(lbl5);

        JTextField txt11 = new JTextField();
        txt11.setBounds(180, 120, 100, 30);
        this.add(txt11);

        JTextField txt12 = new JTextField();
        txt12.setBounds(290, 120, 100, 30);
        this.add(txt12);

        JTextField txt13 = new JTextField();
        txt13.setBounds(400, 120, 100, 30);
        this.add(txt13);

        JTextField txt14 = new JTextField();
        txt14.setBounds(510, 120, 100, 30);
        this.add(txt14);

        JTextField txt15 = new JTextField();
        txt15.setBounds(620, 120, 100, 30);
        this.add(txt15);

        JTextField txt16 = new JTextField();
        txt16.setBounds(180, 160, 100, 30);
        this.add(txt16);

        JTextField txt17 = new JTextField();
        txt17.setBounds(290, 160, 100, 30);
        this.add(txt17);

        JTextField txt18 = new JTextField();
        txt18.setBounds(400, 160, 100, 30);
        this.add(txt18);

        JTextField txt19 = new JTextField();
        txt19.setBounds(510, 160, 100, 30);
        this.add(txt19);

        JTextField txt20 = new JTextField();
        txt20.setBounds(620, 160, 100, 30);
        this.add(txt20);

        JTextField txt21 = new JTextField();
        txt21.setBounds(180, 200, 100, 30);
        this.add(txt21);

        JTextField txt22 = new JTextField();
        txt22.setBounds(290, 200, 100, 30);
        this.add(txt22);

        JTextField txt23 = new JTextField();
        txt23.setBounds(400, 200, 100, 30);
        this.add(txt23);

        JTextField txt24 = new JTextField();
        txt24.setBounds(510, 200, 100, 30);
        this.add(txt24);
        
        JTextField txt25 = new JTextField();
        txt25.setBounds(620, 200, 100, 30);
        this.add(txt25);
        
        JTextField txt26 = new JTextField();
        txt26.setBounds(180, 240, 100, 30);
        this.add(txt26);

        JTextField txt27 = new JTextField();
        txt27.setBounds(290, 240, 100, 30);
        this.add(txt27);

        JTextField txt28 = new JTextField();
        txt28.setBounds(400, 240, 100, 30);
        this.add(txt28);

        JTextField txt29 = new JTextField();
        txt29.setBounds(510, 240, 100, 30);
        this.add(txt29);
        
        JTextField txt30 = new JTextField();
        txt30.setBounds(620, 240, 100, 30);
        this.add(txt30);
        
        JTextField txt31 = new JTextField();
        txt31.setBounds(180, 280, 100, 30);
        this.add(txt31);

        JTextField txt32 = new JTextField();
        txt32.setBounds(290, 280, 100, 30);
        this.add(txt32);

        JTextField txt33 = new JTextField();
        txt33.setBounds(400, 280, 100, 30);
        this.add(txt33);

        JTextField txt34 = new JTextField();
        txt34.setBounds(510, 280, 100, 30);
        this.add(txt34);
        
        JTextField txt35 = new JTextField();
        txt35.setBounds(620, 280, 100, 30);
        this.add(txt35);
        
         JTextField txt36 = new JTextField();
        txt36.setBounds(180, 320, 100, 30);
        this.add(txt36);

        JTextField txt37 = new JTextField();
        txt37.setBounds(290, 320, 100, 30);
        this.add(txt37);

        JTextField txt38 = new JTextField();
        txt38.setBounds(400, 320, 100, 30);
        this.add(txt38);

        JTextField txt39 = new JTextField();
        txt39.setBounds(510, 320, 100, 30);
        this.add(txt39);
        
        JTextField txt40 = new JTextField();
        txt40.setBounds(620, 320, 100, 30);
        this.add(txt40);
        
         JTextField txt41 = new JTextField();
        txt41.setBounds(180, 360, 100, 30);
        this.add(txt41);

        JTextField txt42 = new JTextField();
        txt42.setBounds(290, 360, 100, 30);
        this.add(txt42);

        JTextField txt43 = new JTextField();
        txt43.setBounds(400, 360, 100, 30);
        this.add(txt43);

        JTextField txt44 = new JTextField();
        txt44.setBounds(510, 360, 100, 30);
        this.add(txt44);
        
        JTextField txt45 = new JTextField();
        txt45.setBounds(620, 360, 100, 30);
        this.add(txt45);
        
         JTextField txt46 = new JTextField();
        txt46.setBounds(180, 400, 100, 30);
        this.add(txt46);

        JTextField txt47 = new JTextField();
        txt47.setBounds(290, 400, 100, 30);
        this.add(txt47);

        JTextField txt48 = new JTextField();
        txt48.setBounds(400, 400, 100, 30);
        this.add(txt48);

        JTextField txt49 = new JTextField();
        txt49.setBounds(510, 400, 100, 30);
        this.add(txt49);
        
        JTextField txt50 = new JTextField();
        txt50.setBounds(620, 400, 100, 30);
        this.add(txt50);
        
         JTextField txt51 = new JTextField();
        txt51.setBounds(180, 440, 100, 30);
        this.add(txt51);

        JTextField txt52 = new JTextField();
        txt52.setBounds(290, 440, 100, 30);
        this.add(txt52);

        JTextField txt53 = new JTextField();
        txt53.setBounds(400, 440, 100, 30);
        this.add(txt53);

        JTextField txt54 = new JTextField();
        txt54.setBounds(510, 440, 100, 30);
        this.add(txt54);
        
        JTextField txt55 = new JTextField();
        txt55.setBounds(620, 440, 100, 30);
        this.add(txt55);
        
        JTextField txt56 = new JTextField();
        txt56.setBounds(180, 480, 100, 30);
        this.add(txt56);

        JTextField txt57 = new JTextField();
        txt57.setBounds(290, 480, 100, 30);
        this.add(txt57);

        JTextField txt58 = new JTextField();
        txt58.setBounds(400, 480, 100, 30);
        this.add(txt58);

        JTextField txt59 = new JTextField();
        txt59.setBounds(510, 480, 100, 30);
        this.add(txt59);
        
        JTextField txt60 = new JTextField();
        txt60.setBounds(620, 480, 100, 30);
        this.add(txt60);
        
        btnback = new JButton("Back");
        btnback.setBounds(225, 550, 350, 50);
        add(btnback);
        btnback.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnback) {
            dispose();
            StudentSubjectGrades subgrades = new StudentSubjectGrades();
            subgrades.setVisible(true);
        }
    };
}

    
    


    

