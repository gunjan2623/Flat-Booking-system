package net.javaguids.swing;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main2 extends JFrame implements ActionListener
{
	private JLabel l2,ll9,l3,l4,l5,l6;
	private JButton b2;
	
	public static void main(String[] args) throws Exception
	   {
	       EventQueue.invokeLater(new Runnable() 
	       {
	           public void run() 
	           {
	               try 
	               {
	                   Main2 frame = new Main2();
	                   frame.setVisible(true);
	               } catch (Exception e) 
	               {
	                   e.printStackTrace();
	               }
	           }
	       });
	   }
	
	public Main2()
	{
			setTitle("Flat Registration");
	        setBounds(200,17,1200,800);
	        getContentPane().setBackground(Color.black);
	        setLayout(null);
	        
	        l2 = new JLabel("-: RENTER :-");
	        l2.setBounds(300,40,800,25);
	        l2.setFont(new Font("Serif", Font.BOLD,25));
	        l2.setForeground(Color.PINK);
	        add(l2);

	        ll9 = new JLabel("---------------");
	        ll9.setBounds(280,60,800,20);
	        ll9.setFont(new Font("Courier", Font.PLAIN,20));
	        ll9.setForeground(Color.pink);
	        add(ll9);
	        
	        l5 = new JLabel("-: OWNER :-");
	        l5.setBounds(770,40,800,25);
	        l5.setFont(new Font("Serif", Font.BOLD,25));
	        l5.setForeground(Color.PINK);
	        add(l5);

	        l6 = new JLabel("---------------");
	        l6.setBounds(750,60,800,20);
	        l6.setFont(new Font("Courier", Font.PLAIN,20));
	        l6.setForeground(Color.pink);
	        add(l6);
	        
	        l3 = new JLabel("-: PAYMENT :-");
	        l3.setBounds(500,350,800,25);
	        l3.setFont(new Font("Serif", Font.BOLD,25));
	        l3.setForeground(Color.PINK);
	        add(l3);

	        l4 = new JLabel("-----------------");
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
	    
	        	String query3 = "SELECT * FROM owner";
	        	Statement stm = con.createStatement();
	        	ResultSet res3 = stm.executeQuery(query3);	    
	        	String columns3[] = { "Name", "Mobile_no" };
	        	String data3[][] = new String[100][100];
	        	int i = 0;
	        	while (res3.next()) 
	        	{
	        		String nom = res3.getString("name");
	        		String num = res3.getString("Mobile_no");
	        		data3[i][0] = nom;
	        		data3[i][1] = num;
	        		i++;
	        	}
	        	JTable jt3=new JTable(data3,columns3);    
//	        	jt.setBounds(90,90,400,200);        
	        	jt3.setFont(new Font("Courier", Font.PLAIN,15));
	        	JScrollPane sp3=new JScrollPane(jt3);    
	        	sp3.setBounds(700,90,335,220);
	        	add(sp3);    
	        	
	        	String query4 = "SELECT * FROM renter1";
	        	ResultSet res4 = stm.executeQuery(query4);
	        	String columns4[] = { "Name", "Mobile_NO","Aadhar No","Installment" };
	        	String data4[][] = new String[100][100];
	        	int u = 0;
	        	while (res4.next()) 
	        	{
	        		String s11 = res4.getString("Name");
	        		String s22 = res4.getString("Mobile_No");
	        		String s33 = res4.getString("Aadhar");
	        		String s44 = res4.getString("Installements");

	        		data4[u][0] = s11;
	        		data4[u][1] = s22;
	        		data4[u][2] = s33;	
	        		data4[u][3] = s44;
	        		u++;
	        	}
	        	JTable jt4=new JTable(data4,columns4);    
//	        	jt4.setBounds(90,90,400,200);        
	        	jt4.setFont(new Font("Courier", Font.PLAIN,15));
	        	JScrollPane sp4=new JScrollPane(jt4);    
	        	sp4.setBounds(140,90,500,220);
	        	add(sp4);
	        
	        	String query5 = "SELECT * FROM payment2";
	        	ResultSet res5 = stm.executeQuery(query5);
	        	String columns5[] = { "Card_no", "Card Holder Name","Expires","CVV No" };
	        	String data5[][] = new String[100][100];
	        	int v = 0;
	        	while (res5.next()) 
	        	{
	        		String s11 = res5.getString("Card_No");
	        		String s22 = res5.getString("Card_Holder_Name");
	        		String s33 = res5.getString("Expires");
	        		String s44 = res5.getString("CVV_NO");

	        		data5[v][0] = s11;
	        		data5[v][1] = s22;
	        		data5[v][2] = s33;	
	        		data5[v][3] = s44;
       		v++;
	        	}
	        	JTable jt5=new JTable(data5,columns5);    
//	        	jt4.setBounds(90,90,400,200);        
	        	jt5.setFont(new Font("Courier", Font.PLAIN,15));
	        	JScrollPane sp5=new JScrollPane(jt5);    
	        	sp5.setBounds(140,400,900,220);
	        	add(sp5);
	        	
	        	 b2=new JButton("OK");
	             b2.setFont(new Font("Serif", Font.PLAIN,30));
	             b2.setBackground(Color.pink);
	             b2.setForeground(Color.black);
	             b2.addActionListener(this); 
	             b2.setBounds(980,670,100,50);
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
            JOptionPane.showMessageDialog(b2, "Thank You!");
        }
    }
}