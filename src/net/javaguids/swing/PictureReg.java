package net.javaguids.swing;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;


public class PictureReg extends JFrame implements ActionListener
{
    JButton b3,b1,b2;
    JTextField t1;
    
    public PictureReg()
    {
        setTitle("Flat Registration");
        setBounds(200,17,1200,800);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("c2.jpg"));
         JLabel l1 = new JLabel(i1);
         l1.setBounds(0,0,1200,800);
         add(l1);


         b2=new JButton("Next");
         b2.setFont(new Font("Serif ", Font.PLAIN,30));
         b2.setBackground(Color.pink);
         b2.setForeground(Color.black);
         b2.addActionListener(this); 
         b2.setBounds(900,650,150,40);
         add(b2);
         
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b2)
        {
            this.setVisible(false);
            new Rules();
        }
    }
    public static void main(String args[])
    {
        new PictureReg();
    }
}