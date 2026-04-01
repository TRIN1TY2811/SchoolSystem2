
package schoolsystem2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author admin
 */
public class Personal extends JFrame implements ActionListener {
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

Personal() {

    setSize(800,800);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    btn1 = new JButton("Amodia, James Earl");
    btn1.setBounds(50,50,250,40);
    btn1.addActionListener(this);
    this.add(btn1);

    btn2 = new JButton("Barcelina, Joe");
    btn2.setBounds(50,100,250,40);
    btn2.addActionListener(this);
    this.add(btn2);

    btn3 = new JButton("Caldo, Crishalyn");
    btn3.setBounds(50,150,250,40);
    btn3.addActionListener(this);
    this.add(btn3);

    btn4 = new JButton("De Jesus, Tom");
    btn4.setBounds(50,200,250,40);
    btn4.addActionListener(this);
    this.add(btn4);

    btn5 = new JButton("Ebu, Joshua");
    btn5.setBounds(50,250,250,40);
    btn5.addActionListener(this);
    this.add(btn5);

    btn6 = new JButton("Francisco, Kristy");
    btn6.setBounds(50,300,250,40);
    btn6.addActionListener(this);
    this.add(btn6);

    btn7 = new JButton("Gordon, Faye");
    btn7.setBounds(50,350,250,40);
    btn7.addActionListener(this);
    this.add(btn7);

    btn8 = new JButton("Hyacinth, Gabriela");
    btn8.setBounds(50,400,250,40);
    btn8.addActionListener(this);
    this.add(btn8);

    btn9 = new JButton("Igloso, Mark");
    btn9.setBounds(50,450,250,40);
    btn9.addActionListener(this);
    this.add(btn9);

    btn10 = new JButton("Jopia, Richard");
    btn10.setBounds(50,500,250,40);
    btn10.addActionListener(this);
    this.add(btn10);

    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
     }
    

    
    
 

    
    

