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



public class flightReg extends JFrame implements ActionListener
{
	private JLabel l2,ll9,l3,l4,l5,l6,l7,l90,l9;
	private JRadioButton r1 ,r2;
    private JButton b1,b2,b3;
    private JTextField t1,t2,t3,t4;
    private JComboBox z3,z1;
    
    public static void main(String[] args) throws Exception
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                	flightReg frame = new flightReg();
                    frame.setVisible(true);
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public flightReg()
    {
        setTitle("Flat Registration");
        setBounds(200,17,1200,800);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        l2 = new JLabel("-: FLAT  INFORMATION :-");
        l2.setBounds(350,40,800,35);
        l2.setFont(new Font("Serif", Font.BOLD,35));
        l2.setForeground(Color.PINK);
        add(l2);

        ll9 = new JLabel("----------------------------------------");
        ll9.setBounds(330,80,800,20);
        ll9.setFont(new Font("Courier", Font.PLAIN,20));
        ll9.setForeground(Color.pink);
        add(ll9);

        l3 = new JLabel("Flat No.");
        l3.setBounds(100,170,300,35);
        l3.setFont(new Font("Courier", Font.PLAIN,30));
        l3.setForeground(Color.white);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Courier", Font.PLAIN,30));
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.black);
        t1.setBounds(340,170,200,30);
        add(t1);

        l4 = new JLabel("NOC No.");
        l4.setForeground(Color.white);
        l4.setBounds(640,170,300,30);
        l4.setFont(new Font("Courier", Font.PLAIN,30));
        add(l4);

        t2 = new JTextField();
        t2.setBackground(Color.LIGHT_GRAY);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Courier", Font.PLAIN,30));
        t2.setBounds(850,170,200,30);
        add(t2);
        
        l5 = new JLabel("Registree No.");
        l5.setForeground(Color.white);
        l5.setBounds(100,250,300,35);
        l5.setFont(new Font("Courier", Font.PLAIN,30));
        add(l5);

        t3 = new JTextField();
        t3.setFont(new Font("Courier", Font.PLAIN,30));
        t3.setBackground(Color.LIGHT_GRAY);
        t3.setForeground(Color.black);
        t3.setBounds(340,250,200,30);
        add(t3);

        l6 = new JLabel("BHK");
        l6.setForeground(Color.white);
        l6.setBounds(640,250,300,30);
        l6.setFont(new Font("Courier", Font.PLAIN,30));
        add(l6);
        
        String com[]= 
            { "1","2","3","4"};
        
        z1=new JComboBox(com);
        z1.setFont(new Font("Courier", Font.PLAIN,30));
        z1.setBounds(850,250,200,30);
        add(z1);

        l7 = new JLabel("Wing");
        l7.setForeground(Color.white);
        l7.setBounds(100,330,300,35);
        l7.setFont(new Font("Courier", Font.PLAIN,30));
        add(l7);

        String com3[]= 
        { "A","B","C","D","E","F","G","H","I","J"};
    
        z3=new JComboBox(com3);
        z3.setFont(new Font("Courier", Font.PLAIN,30));
        z3.setBounds(340,330,200,30);
        add(z3);

        

        l90 = new JLabel("Flat Type");
        l90.setForeground(Color.white);
        l90.setBounds(640,330,300,35);
        l90.setFont(new Font("Courier", Font.PLAIN,30));
        add(l90);


        r1 = new JRadioButton();
        r2 = new JRadioButton();
        r1.setText("Renter");
        r1.setForeground(Color.white);
        r1.setBounds(850,330,150,30);
        r1.setBackground(Color.black);
        r1.setFont(new Font("Courier", Font.PLAIN,30));
        r2.setText("Owned");
        r2.setForeground(Color.white);
        r2.setBounds(850,380,150,30);
        r2.setBackground(Color.black);
        r2.setFont(new Font("Courier", Font.PLAIN,30));
        ButtonGroup G1 = new ButtonGroup();
        this.add(r1);
        this.add(r2);
        G1.add(r1);
        G1.add(r2);

        l9 = new JLabel("Area");
        l9.setForeground(Color.white);
        l9.setBounds(100,410,300,30);
        l9.setFont(new Font("Courier", Font.PLAIN,30));
        add(l9);

        t4 = new JTextField();
        t4.setBackground(Color.LIGHT_GRAY);
        t4.setForeground(Color.black);
        t4.setFont(new Font("Courier", Font.PLAIN,30));
        t4.setBounds(340,410,200,30);
        add(t4);

        b1=new JButton("Cancel"); 
        b1.setFont(new Font("Serif ", Font.PLAIN,30));
        b1.setBackground(Color.pink);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        b1.setBounds(400,580,150,40);
        add(b1);

        b2=new JButton("Next"); 
        b2.setBounds(630,580,150,40);
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
            
            String flatNo = t1.getText();
            String NOC = t2.getText();
            String RegNo = t3.getText();
            String BHK = (String)z1.getSelectedItem();
            String wing = (String)z3.getSelectedItem();
            String flattype ;
            if (r1.isSelected())
                flattype = "Renter";
            else
                flattype= "Owned";
            String a = t4.getText();

            try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flatSystem", "root", "root");

            String query = "INSERT INTO flat values('" + flatNo + "','" + NOC + "','" + RegNo + "','" + BHK + "','" + wing + "','" + flattype + "','" + a +  "')";
            
            Statement sta = connection.createStatement();
            int x = sta.executeUpdate(query);
            if (x == 0) {
            JOptionPane.showMessageDialog(b2, "This is alredy exist");
                         
                         }
                         connection.close();
                         new OwnerRenter();
                     } catch (Exception exception) {
                         exception.printStackTrace();
                     }
        }
    }
}
