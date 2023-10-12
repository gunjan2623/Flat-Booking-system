package net.javaguids.swing;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

public class Main extends JFrame implements ActionListener
{
	private JLabel l2,ll9,l3,l4;
	private JButton b2;
	
	public static void main(String[] args) throws Exception
	   {
	       EventQueue.invokeLater(new Runnable() 
	       {
	           public void run() 
	           {
	               try 
	               {
	                   Main frame = new Main();
	                   frame.setVisible(true);
	               } catch (Exception e) 
	               {
	                   e.printStackTrace();
	               }
	           }
	       });
	   }
	
	public Main()
	{
			setTitle("Flat Registration");
	        setBounds(200,17,1200,800);
	        getContentPane().setBackground(Color.black);
	        setLayout(null);
	        
	        l2 = new JLabel("-: CUSTOMER :-");
	        l2.setBounds(450,40,800,25);
	        l2.setFont(new Font("Serif", Font.BOLD,25));
	        l2.setForeground(Color.PINK);
	        add(l2);

	        ll9 = new JLabel("--------------------");
	        ll9.setBounds(430,60,800,20);
	        ll9.setFont(new Font("Courier", Font.PLAIN,20));
	        ll9.setForeground(Color.pink);
	        add(ll9);
	        
	        
	        l3 = new JLabel("-: FLAT :-");
	        l3.setBounds(500,350,800,25);
	        l3.setFont(new Font("Serif", Font.BOLD,25));
	        l3.setForeground(Color.PINK);
	        add(l3);

	        l4 = new JLabel("-------------");
	        l4.setBounds(480,370,800,20);
	        l4.setFont(new Font("Courier", Font.PLAIN,20));
	        l4.setForeground(Color.pink);
	        add(l4);
	        try 
	        {
	        	String url = "jdbc:mysql://localhost:3306/flatsystem?autoReconnect=true&useSSL=false";
	        	String user = "root";
	        	String password = "root";
	    
	        	Connection con = DriverManager.getConnection(url, user, password);
	    
	        	Statement stm = con.createStatement();
	        	
	        	
	        	String query1 = "SELECT * FROM customer2";
	        	ResultSet res1 = stm.executeQuery(query1);
	        	String columns1[] = { "First Name", "Last Name","Gender","DOB","Email ID","Aadhar No","Mobile No","Address" };
	        	String data1[][] = new String[100][100];
	        	int j = 0;
	        	while (res1.next()) 
	        	{
	        		String s1 = res1.getString("first_name");
	        		String s2 = res1.getString("last_name");
	        		String s3 = res1.getString("gender");
	        		String s4 = res1.getString("dob");
	        		String s5 = res1.getString("email_id");
	        		String s6 = res1.getString("aadhar");
	        		String s7 = res1.getString("mobile_number");
	        		String s8 = res1.getString("address");

	        		data1[j][0] = s1;
	        		data1[j][1] = s2;
	        		data1[j][2] = s3;	
	        		data1[j][3] = s4;
	        		data1[j][4] = s5;
	        		data1[j][5] = s6;
	        		data1[j][6] = s7;
	        		data1[j][7] = s8;
	        		j++;
	        	}
	        	JTable jt1=new JTable(data1,columns1);    
//	        	jt.setBounds(90,90,400,200);        
	        	jt1.setFont(new Font("Courier", Font.PLAIN,15));
	        	JScrollPane sp1=new JScrollPane(jt1);    
	        	sp1.setBounds(140,90,900,220);
	        	add(sp1);
	        	
	        	String query2 = "SELECT * FROM flat";
	        	ResultSet res2 = stm.executeQuery(query2);
	        	String columns2[] = { "Flat No", "NOC No","Reg No","BHK","Wing","Flat Type","Area" };
	        	String data2[][] = new String[100][100];
	        	int k = 0;
	        	while (res2.next()) 
	        	{
	        		String s1 = res2.getString("flat_No");
	        		String s2 = res2.getString("NOC_No");
	        		String s3 = res2.getString("Reg_No");
	        		String s4 = res2.getString("BHK");
	        		String s5 = res2.getString("Wing");
	        		String s6 = res2.getString("Flat_type");
	        		String s7 = res2.getString("Area");

	        		data2[k][0] = s1;
	        		data2[k][1] = s2;
	        		data2[k][2] = s3;	
	        		data2[k][3] = s4;
	        		data2[k][4] = s5;
	        		data2[k][5] = s6;
	        		data2[k][6] = s7;
	        		k++;
	        	}
	        	JTable jt2=new JTable(data2,columns2);    
//	        	jt.setBounds(90,90,400,200);        
	        	jt2.setFont(new Font("Courier", Font.PLAIN,15));
	        	JScrollPane sp2=new JScrollPane(jt2);    
	        	sp2.setBounds(140,400,900,220);
	        	add(sp2);
	        	
	        	 b2=new JButton("Next");
	             b2.setFont(new Font("Serif", Font.PLAIN,30));
	             b2.setBackground(Color.pink);
	             b2.setForeground(Color.black);
	             b2.addActionListener(this); 
	             b2.setBounds(950,670,150,40);
	             add(b2);
	             
	        	setVisible(true);
	        	} 
	        	catch(SQLException e) 
	        	{
	        		e.printStackTrace();
	        	}
	}
	public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b2)
        {
            this.setVisible(false);
            new Main2();
        }
    }
}