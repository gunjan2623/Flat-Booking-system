package net.javaguids.swing;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

class OwnerRenter extends JFrame implements ActionListener
{
     private JButton b1,b2;
     private JTextField t1,t2,t4,t3;
     private JLabel l2,ll9,l3,l4,l5,l6,l7,l8,l9,l10;
     private JComboBox z3;
     public static void main(String[] args) throws Exception
     {
         EventQueue.invokeLater(new Runnable() 
         {
             public void run() 
             {
                 try 
                 {
                	 OwnerRenter frame = new OwnerRenter();
                     frame.setVisible(true);
                 } catch (Exception e) 
                 {
                     e.printStackTrace();
                 }
             }
         });
     }
     
     public OwnerRenter()
    {
        setTitle("Flat Registration");
        setBounds(200,25,1200,800);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        l2 = new JLabel("-: DETAILS  OF  RENTER :-");
        l2.setBounds(350,40,850,35);
        l2.setFont(new Font("Serif", Font.BOLD,35));
        l2.setForeground(Color.PINK);
        add(l2);

         ll9 = new JLabel("-------------------------------------------");
        ll9.setBounds(320,80,820,20);
        ll9.setFont(new Font("Courier", Font.PLAIN,20));
        ll9.setForeground(Color.pink);
        add(ll9);

         l3 = new JLabel("Name");
        l3.setBounds(100,130,300,30);
        l3.setFont(new Font("Courier", Font.PLAIN,30));
        l3.setForeground(Color.white);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Courier", Font.PLAIN,30));
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.black);
        t1.setBounds(300,135,220,30);
        add(t1);

        l4 = new JLabel("Mobile No. ");
        l4.setForeground(Color.white);
        l4.setBounds(600,130,300,30);
        l4.setFont(new Font("Courier", Font.PLAIN,30));
        add(l4);


        t2 = new JTextField();
        t2.setBackground(Color.LIGHT_GRAY);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Courier", Font.PLAIN,30));
        t2.setBounds(900,130,230,30);
        add(t2);
        
        l5 = new JLabel("Aadhar No.");
        l5.setForeground(Color.white);
        l5.setBounds(100,270,300,30);
        l5.setFont(new Font("Courier", Font.PLAIN,30));
        add(l5);

         l6 = new JLabel("Installements");
        l6.setBounds(600,265,300,30);
        l6.setForeground(Color.white);
        l6.setFont(new Font("Courier", Font.PLAIN,30));
        add(l6);

        String Installment[]=
            { "1", "2", "3", "4" };

        z3=new JComboBox(Installment);
        z3.setFont(new Font("Raleway", Font.PLAIN,20));
        z3.setBounds(900,270,220,30);
        add(z3);

        t4 = new JTextField();
        t4.setBackground(Color.LIGHT_GRAY);
        t4.setForeground(Color.black);
        t4.setFont(new Font("Courier", Font.PLAIN,30));
        t4.setBounds(300,270,220,30);
        add(t4);


        l7 = new JLabel("-: DETAILS   OF  OWNER :-");
        l7.setBounds(350,370,850,35);
        l7.setFont(new Font("Serif", Font.BOLD,35));
        l7.setForeground(Color.PINK);
        add(l7);

        l8 = new JLabel("-------------------------------------------");
        l8.setBounds(320,420,820,20);
        l8.setFont(new Font("Courier", Font.PLAIN,20));
        l8.setForeground(Color.pink);
        add(l8);

       l9 = new JLabel("Name");
        l9.setBounds(100,495,300,30);
        l9.setFont(new Font("Courier", Font.PLAIN,30));
        l9.setForeground(Color.white);
        add(l9);

        t1 = new JTextField();
        t1.setFont(new Font("Courier", Font.PLAIN,30));
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.black);
        t1.setBounds(300,500,220,30);
        add(t1);

        l10 = new JLabel("Mobile No.");
        l10.setBounds(600,495,300,30);
        l10.setFont(new Font("Courier", Font.PLAIN,30));
        l10.setForeground(Color.white);
        add(l10);

        t3 = new JTextField();
        t3.setBackground(Color.LIGHT_GRAY);
        t3.setForeground(Color.black);
        t3.setFont(new Font("Courier", Font.PLAIN,30));
        t3.setBounds(900,500,230,30);
        add(t3);

        b1=new JButton("Cancel"); 
        b1.setFont(new Font("Verdana", Font.PLAIN,30));
        b1.setBackground(Color.pink);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setBounds(400,650,150,40);
        add(b1);

        b2=new JButton("Next"); 
        b2.setBounds(630,650,150,40);
        b2.setFont(new Font("Verdana", Font.PLAIN,30));
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
            String data1;
            String RName = t1.getText();
            String Mob = t2.getText();
            String aadhar = t4.getText();
            String Oname = t1.getText();
            String OMob = t3.getText();
             data1=  (String)z3.getSelectedItem();

             int len1 = Mob.length();
             if (len1 != 10)
             {
                 JOptionPane.showMessageDialog(b2, "Enter a valid mobile number of Renter");
                 new OwnerRenter();
             }

             int len2 = OMob.length();
             if (len2 != 10)
             {
                 JOptionPane.showMessageDialog(b2, "Enter a valid mobile number of owner");
                 new OwnerRenter();
             }
                    try 
                    {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flatSystem", "root", "root");

                        String query1= "INSERT INTO renter1 values('" + RName + "','"+ Mob + "','" + aadhar + "','"  + data1 + "')";
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query1);
                        if (x == 0) 
                        {
                            JOptionPane.showMessageDialog(b2, "This is alredy exist");
                        } 
//                        connection.close();
                        String query2= "INSERT INTO Owner values('" + Oname + "','"+ OMob +  "')";
                        Statement sta1 = connection.createStatement();
                        int y = sta1.executeUpdate(query2);
                        if (y == 0) 
                        {
                            JOptionPane.showMessageDialog(b2, "This is alredy exist");
                        } 
                        connection.close();
                        new Payment();
                    } 
                    catch (Exception exception) 
                    {
                        exception.printStackTrace();
                    }
        }
    }
}