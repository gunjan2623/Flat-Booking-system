package net.javaguids.swing;



import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Rules extends JFrame implements ActionListener
{
    private JButton b;
    private JLabel l2,ll9;
    private JButton b1,b2,b3;
    
    public static void main(String[] args) throws Exception
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                	Rules frame = 
                			new Rules();
                    frame.setVisible(true);
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public Rules()
    {
    	setTitle("Flat Registration");
        setBounds(200,17,1200,800);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        l2 = new JLabel("-: RULES  AND  REGULATIONS :-");
        l2.setBounds(300,40,800,35);
        l2.setFont(new Font("Serif", Font.BOLD,35));
        l2.setForeground(Color.PINK);
        add(l2);

        ll9 = new JLabel("--------------------------------------------------");
        ll9.setBounds(280,80,800,20);
        ll9.setFont(new Font("Courier", Font.PLAIN,20));
        ll9.setForeground(Color.pink);
        add(ll9);
        
        JLabel l1 = new JLabel("");
        l1.setBounds(200,90,850,500);
        l1.setFont(new Font("Courier", Font.PLAIN,20));
        l1.setForeground(Color.white);
        l1.setText(
        		"<html>" +
        		        "1. Members and residents are required to keep their flats/homes and nearby premises clean and habitable." + "<br><br>" +
        		        "2.Members must regularly pay the maintenance charges and all other dues necessitated by the society." + "<br><br>" +
        		        "3.Residents should be well-aware of society’s rules and obey the provisions of the bye-laws." + "<br><br>" +
        		        "4.The Secretary, after prior intimation to the member, inspects the flat/home to inspect its conditions and to ascertain if any repairs are needed." + "<br><br>"+
        		        "5.Residents should maintain good relationships among one another to prosper as a society collectively." + "<br><br>" +
        		        "<html>"
        );
        add(l1);


        b1=new JButton("Cancel"); 
        b1.setFont(new Font("Serif", Font.PLAIN,30));
        b1.setBackground(Color.pink);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setBounds(400,580,150,40);
        add(b1);

        b2=new JButton("Next"); 
        b2.setBounds(630,580,150,40);
        b2.setFont(new Font("Serif", Font.PLAIN,30));
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
            new UserReg();
        }
        else
        {
            System.exit(0);
        }
    }
}
