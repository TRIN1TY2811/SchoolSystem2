package schoolsystem2;

import schoolsystem2.personalInformation.Student2;
import schoolsystem2.personalInformation.Student10;
import schoolsystem2.personalInformation.Student1;
import schoolsystem2.personalInformation.Student6;
import schoolsystem2.personalInformation.Student8;
import schoolsystem2.personalInformation.Student3;
import schoolsystem2.personalInformation.Student7;
import schoolsystem2.personalInformation.Student5;
import schoolsystem2.personalInformation.Student4;
import schoolsystem2.personalInformation.Student9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author admin
 */
public class Personal extends JFrame implements ActionListener {

    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    public Personal() {

        setSize(800, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1 = new JButton("Amodia, James Earl");
        btn1.setBounds(50, 50, 250, 40);
        btn1.addActionListener(this);
        this.add(btn1);

        btn2 = new JButton("Barcelina, Joe");
        btn2.setBounds(50, 100, 250, 40);
        btn2.addActionListener(this);
        this.add(btn2);

        btn3 = new JButton("Caldo, Crishalyn");
        btn3.setBounds(50, 150, 250, 40);
        btn3.addActionListener(this);
        this.add(btn3);

        btn4 = new JButton("De Jesus, Tom");
        btn4.setBounds(50, 200, 250, 40);
        btn4.addActionListener(this);
        this.add(btn4);

        btn5 = new JButton("Ebu, Joshua");
        btn5.setBounds(50, 250, 250, 40);
        btn5.addActionListener(this);
        this.add(btn5);

        btn6 = new JButton("Francisco, Kristy");
        btn6.setBounds(50, 300, 250, 40);
        btn6.addActionListener(this);
        this.add(btn6);

        btn7 = new JButton("Gordon, Faye");
        btn7.setBounds(50, 350, 250, 40);
        btn7.addActionListener(this);
        this.add(btn7);

        btn8 = new JButton("Hyacinth, Gabriela");
        btn8.setBounds(50, 400, 250, 40);
        btn8.addActionListener(this);
        this.add(btn8);

        btn9 = new JButton("Igloso, Mark");
        btn9.setBounds(50, 450, 250, 40);
        btn9.addActionListener(this);
        this.add(btn9);

        btn10 = new JButton("Jopia, Richard");
        btn10.setBounds(50, 500, 250, 40);
        btn10.addActionListener(this);
        this.add(btn10);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btn1) {
            dispose();
            Student1 stud1 = new Student1();
            stud1.setVisible(true);
        }
        
        else if (e.getSource() == btn2) {
            dispose();
            Student2 stud2 = new Student2();
            stud2.setVisible(true);
            
        }
        
        else if (e.getSource() == btn3) {
            dispose();
            Student3 stud3 = new Student3();
            stud3.setVisible(true);
            
        }
        
        else if (e.getSource() == btn4) {
            dispose();
            Student4 stud4 = new Student4();
            stud4.setVisible(true);
            
        }
        
        else if (e.getSource() == btn5) {
            dispose();
            Student5 stud5 = new Student5();
            stud5.setVisible(true);
            
        }
        
        else if (e.getSource() == btn6) {
            dispose();
            Student6 stud6 = new Student6();
            stud6.setVisible(true);
            
        }
        
        else if (e.getSource() == btn7) {
            dispose();
            Student7 stud7 = new Student7();
            stud7.setVisible(true);
            
        }
        
        else if (e.getSource() == btn8) {
            dispose();
            Student8 stud8 = new Student8();
            stud8.setVisible(true);
            
        }
        
        else if (e.getSource() == btn9) {
            dispose();
            Student9 stud9 = new Student9();
            stud9.setVisible(true);
            
        }
        
        else if (e.getSource() == btn10) {
            dispose();
            Student10 stud10 = new Student10();
            stud10.setVisible(true);
            
        }
        
        
    }

}
