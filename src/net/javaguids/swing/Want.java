package net.javaguids.swing;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;


public class Want extends JFrame implements ActionListener
{
    JButton b3,b1,b2;
    JLabel l1,l2;
    JTextField t1;
    
    public Want()
    {
    	setTitle("Flat Registration");
        setBounds(200,17,1200,800);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        l1 = new JLabel("");
        l1.setBounds(300,90,600,500);
        l1.setFont(new Font("Courier", Font.PLAIN,80));
        l1.setForeground(Color.white);
        l1.setText(
        "<html>" +
        "WELCOME TO OUR FAMILY!!!!!!" + "<br><br>" +
        "<html>"
        );
        add(l1);
        l2 = new JLabel("");
        l2.setBounds(300,90,600,900);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Courier", Font.PLAIN,40));
        l2.setText(
        "<html>" +
        "Want to see your details click on display!!!!" + "<br><br>" +
        "<html>"
                );		
        add(l2);
        b1=new JButton("Exit"); 
        b1.setFont(new Font("Verdana", Font.PLAIN,30));
        b1.setBackground(Color.pink);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setBounds(400,650,150,40);
        add(b1);

        b2=new JButton("Display"); 
        b2.setBounds(630,650,170,40);
        b2.setFont(new Font("Verdana", Font.PLAIN,30));
        b2.setBackground(Color.pink);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        add(b2);
         
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b2)
        {
            this.setVisible(false);
            new Main();
        }
        if(ae.getSource() == b1)
        {
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        new Want();
    }
}