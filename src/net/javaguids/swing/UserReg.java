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



public class UserReg extends JFrame implements ActionListener
{
   private JLabel l12,res,l3,ll9,l11,ll2,l10,l90,l2,l5,l4,l6,l7,l9;
   private JCheckBox cb;
   private JButton b1,b2;
   private JTextField t1,t2,t3,t7,t5;
   private JTextArea t6,tout,resadd;
   private JComboBox z1,z2,z3;
   private JRadioButton r1,r2;
   
   public static void main(String[] args) throws Exception
   {
       EventQueue.invokeLater(new Runnable() 
       {
           public void run() 
           {
               try 
               {
                   UserReg frame = new UserReg();
                   frame.setVisible(true);
               } catch (Exception e) 
               {
                   e.printStackTrace();
               }
           }
       });
   }
   
    public UserReg()
    {
    	setTitle("Flat Registration");
        setBounds(200,17,1200,800);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        l2 = new JLabel("-: CUSTOMER  INFORMATION :-");
        l2.setBounds(300,40,800,35);
        l2.setFont(new Font("Serif", Font.BOLD,35));
        l2.setForeground(Color.PINK);
        add(l2);

        ll9 = new JLabel("-------------------------------------------------");
        ll9.setBounds(280,80,800,20);
        ll9.setFont(new Font("Courier", Font.PLAIN,20));
        ll9.setForeground(Color.pink);
        add(ll9);

        l3 = new JLabel("First Name");
        l3.setBounds(100,120,300,30);
        l3.setFont(new Font("Courier", Font.PLAIN,30));
        l3.setForeground(Color.white);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Courier", Font.PLAIN,30));
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.black);
        t1.setBounds(320,120,200,30);
        add(t1);

        l4 = new JLabel("Last Name");
        l4.setForeground(Color.white);
        l4.setBounds(600,120,300,30);
        l4.setFont(new Font("Courier", Font.PLAIN,30));
        add(l4);

        t2 = new JTextField();
        t2.setBackground(Color.LIGHT_GRAY);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Courier", Font.PLAIN,30));
        t2.setBounds(820,120,200,30);
        add(t2);
        
        l5 = new JLabel("D-O-B");
        l5.setForeground(Color.white);
        l5.setBounds(100,200,300,30);
        l5.setFont(new Font("Courier", Font.PLAIN,30));
        add(l5);

        String dates[]= 
            { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
        String months[]=
            { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12" };
        String years[]=
             { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

        z1=new JComboBox(dates);
        z1.setFont(new Font("Courier", Font.PLAIN,20));
        z1.setBounds(320,200,55,30);
        add(z1);

        z2=new JComboBox(months);
        z2.setFont(new Font("Courier", Font.PLAIN,20));
        z2.setBounds(380,200,55,30);
        add(z2);

        z3=new JComboBox(years);
        z3.setFont(new Font("Courier", Font.PLAIN,20));
        z3.setBounds(440,200,80,30);
        add(z3);

        l6 = new JLabel("Gender");
        l6.setForeground(Color.white);
        l6.setBounds(600,200,300,30);
        l6.setFont(new Font("Courier", Font.PLAIN,30));
        add(l6);

        r1 = new JRadioButton();
        r2 = new JRadioButton();
        r1.setText("Male");
        r1.setForeground(Color.white);
        r1.setBounds(820,200,100,30);
        r1.setBackground(Color.black);
        r1.setFont(new Font("Courier", Font.PLAIN,30));
        r2.setText("Female");
        r2.setForeground(Color.white);
        r2.setBounds(930,200,150,30);
        r2.setBackground(Color.black);
        r2.setFont(new Font("Courier", Font.PLAIN,30));
        ButtonGroup G1 = new ButtonGroup();
        this.add(r1);
        this.add(r2);
        G1.add(r1);
        G1.add(r2);

        l7 = new JLabel("Aadhar No.");
        l7.setForeground(Color.white);
        l7.setBounds(100,280,300,30);
        l7.setFont(new Font("Courier", Font.PLAIN,30));
        add(l7);

        t3 = new JTextField();
        t3.setBackground(Color.LIGHT_GRAY);
        t3.setForeground(Color.black);
        t3.setFont(new Font("Courier", Font.PLAIN,30));
        t3.setBounds(320,280,200,30);
        add(t3);

        l9 = new JLabel("Mobile No.");
        l9.setForeground(Color.white);
        l9.setBounds(600,280,300,30);
        l9.setFont(new Font("Courier", Font.PLAIN,30));
        add(l9);

        t5 = new JTextField();
        t5.setBackground(Color.LIGHT_GRAY);
        t5.setForeground(Color.black);
        t5.setFont(new Font("Courier", Font.PLAIN,30));
        t5.setBounds(820,280,200,30);
        add(t5);

        l90 = new JLabel("Email");
        l90.setForeground(Color.white);
        l90.setBounds(100,360,300,30);
        l90.setFont(new Font("Courier", Font.PLAIN,30));
        add(l90);

        t7 = new JTextField();
        t7.setBackground(Color.LIGHT_GRAY);
        t7.setForeground(Color.black);
        t7.setFont(new Font("Courier", Font.PLAIN,30));
        t7.setBounds(320,360,500,30);
        add(t7);

        l10 = new JLabel("Permanant");
        l10.setForeground(Color.white);
        l10.setBounds(100,440,300,30);
        l10.setFont(new Font("Courier", Font.PLAIN,30));
        add(l10);

        l11 = new JLabel("Address");
        l11.setForeground(Color.white);
        l11.setBounds(100,475,300,30);
        l11.setFont(new Font("Courier", Font.PLAIN,30));
        add(l11);

        t6 = new JTextArea();
        t6.setBackground(Color.LIGHT_GRAY);
        t6.setForeground(Color.black);
        t6.setFont(new Font("Courier", Font.PLAIN,30));
        t6.setBounds(320,440,500,100);
        add(t6);
        
        cb = new JCheckBox(); 
        cb.setBounds(320,570,30,30);
        cb.setBackground(Color.black);
        add(cb);

        l12 = new JLabel("I accept terms and conditions");
        l12.setForeground(Color.white);
        l12.setBounds(360,570,550,30);
        l12.setFont(new Font("Courier", Font.PLAIN,30));
        add(l12);

        b1=new JButton("Cancel"); 
        b1.setFont(new Font("Serif ", Font.PLAIN,30));
        b1.setBackground(Color.pink);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setBounds(400,650,150,40);
        add(b1);

        b2=new JButton("Next"); 
        b2.setBounds(630,650,150,40);
        b2.setFont(new Font("Serif ", Font.PLAIN,30));
        b2.setBackground(Color.pink);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
}
    
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource() == b1)
    {
        System.exit(0);
    }
    else if(ae.getSource() == b2)
    {
        this.setVisible(false);
        if (cb.isSelected()) {
        String data1,data2;
        String firstName = t1.getText();
        String lastName = t2.getText();
        String emailId = t7.getText();
        String aadhar = t3.getText();
        String mob = t5.getText();
        String address = t6.getText();
        int len = mob.length();
        if (r1.isSelected())
                data1 = "Male";
        else
                data1 = "Female";
         data2
                =  (String)z1.getSelectedItem()
                  + "/" + (String)z2.getSelectedItem()
                  + "/" + (String)z3.getSelectedItem();

                if (len != 10)
                {
                    JOptionPane.showMessageDialog(b2, "Enter a valid mobile number");
                    new UserReg();
                }

                try 
                {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flatSystem", "root", "root");

                    String query = "INSERT INTO customer2 values('" + firstName +"','"+ lastName + "','" + data1 + "','" + data2 + "','" + emailId + "','" + aadhar + "','" + mob +  "','" + address + "')";
                    
                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) 
                    {
                        JOptionPane.showMessageDialog(b2, "This is alredy exist");
                    } 
                    connection.close();
                    new flightReg();
                } 
                catch (Exception exception) 
                {
                    exception.printStackTrace();
                }    
    }
        else
        {
        	JOptionPane.showMessageDialog(b2, "Please  select terms and condition");
        	new UserReg();
        }
}
}
}

