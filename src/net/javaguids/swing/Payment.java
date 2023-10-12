package net.javaguids.swing;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

class Payment extends JFrame implements ActionListener
{
    private JButton b1,b2,b3;
    private JTextField t1,t2,t3;
    private JLabel l2,ll9,l3, l4,l5,l6,l7,l15,l13;
    private JComboBox z2,z3;
    public static void main(String[] args) throws Exception
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                	Payment frame = new Payment();
                    frame.setVisible(true);
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }
   public Payment()
    {
        setTitle("Flat Registration");
        setBounds(200,25,1200,800);
        getContentPane().setBackground(Color.black);
        setLayout(null);

         l2 = new JLabel("-: PAYMENT  DETAILS :-");
        l2.setBounds(350,40,550,35);
        l2.setFont(new Font("Serif", Font.BOLD,35));
        l2.setForeground(Color.PINK);
        add(l2);

         ll9 = new JLabel("---------------------------------------");
        ll9.setBounds(320,80,800,20);
        ll9.setFont(new Font("Courier", Font.PLAIN,20));
        ll9.setForeground(Color.pink);
        add(ll9);

         l3 = new JLabel("Card No");
        l3.setBounds(100,170,300,30);
        l3.setFont(new Font("Courier", Font.PLAIN,30));
        l3.setForeground(Color.white);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Courier", Font.PLAIN,30));
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.black);
        t1.setBounds(300,170,220,30);
        add(t1);

         l4 = new JLabel("Card Holder ");
        l4.setForeground(Color.white);
        l4.setBounds(600,160,300,30);
        l4.setFont(new Font("Courier", Font.PLAIN,30));
        add(l4);
       l13 = new JLabel("Name");
        l13.setForeground(Color.white);
        l13.setBounds(600,190,300,30);
        l13.setFont(new Font("Courier", Font.PLAIN,30));
        add(l4);
        add(l13);

        t2 = new JTextField();
        t2.setBackground(Color.LIGHT_GRAY);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Courier", Font.PLAIN,30));
        t2.setBounds(900,170,230,30);
        add(t2);
        
        l5 = new JLabel("Month");
        l5.setForeground(Color.white);
        l5.setBounds(100,270,300,30);
        l5.setFont(new Font("Courier", Font.PLAIN,30));
        add(l5);

         l6 = new JLabel("Year");
        l6.setBounds(600,270,300,30);
        l6.setForeground(Color.white);
        l6.setFont(new Font("Courier", Font.PLAIN,30));
        add(l6);

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

         z2=new JComboBox(months);
        z2.setFont(new Font("Courier", Font.PLAIN,30));
        z2.setBounds(300,270,220,30);
        add(z2);

         z3=new JComboBox(years);
        z3.setFont(new Font("Courier", Font.PLAIN,30));
        z3.setBounds(900,270,220,30);
        add(z3);


         l7 = new JLabel("CVV No.");
        l7.setForeground(Color.white);
        l7.setBounds(100,380,300,30);
        l7.setFont(new Font("Courier", Font.PLAIN,30));
        add(l7);

         t3 = new JTextField();
        t3.setFont(new Font("Courier", Font.PLAIN,30));
        t3.setBackground(Color.LIGHT_GRAY);
        t3.setBounds(300,380,250,30);
        add(t3);

        
         l15 = new JLabel("THANKS  FOR  PAYMENT !");
        l15.setBounds(380,600,700,30);
        l15.setFont(new Font("Serif", Font.BOLD,30));
        l15.setForeground(Color.white);
        add(l15);

        b1=new JButton("Cancel"); 
        b1.setFont(new Font("Serif", Font.PLAIN,30));
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setBounds(350,500,150,40);
        add(b1);

        b2=new JButton("Book"); 
        b2.setBounds(650,500,150,40);
        b2.setFont(new Font("Serif", Font.PLAIN,30));
        b2.setBackground(Color.PINK);
        b2.addActionListener(this);
        b2.setForeground(Color.black);
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
    	        String data1,data2;
    	        String Cardno = t1.getText();
    	        String CHName = t2.getText();
    	        String CVVNO = t3.getText();
    	         data1
    	                =  (String)z2.getSelectedItem()
    	                  + "/" + (String)z3.getSelectedItem();


    	                try 
    	                {
    	                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flatsystem", "root", "root");

//    	                    
    	                    String query = "INSERT INTO payment2 values('" + Cardno + "','" + CHName + "','" + data1 + "','" + CVVNO +  "')";
    	                    Statement sta = connection.createStatement();
    	                    int x = sta.executeUpdate(query);
    	                    if (x == 0) 
    	                    {
    	                        JOptionPane.showMessageDialog(b2, "This is alredy exist");
    	                    } 
    	                    connection.close();
    	                    new Want();
    	                } 
    	                catch (Exception exception) 
    	                {
    	                    exception.printStackTrace();
    	                }
    	                
            } 
    	    }
    }
//}