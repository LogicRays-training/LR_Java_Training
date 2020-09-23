package Student_Management_Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Student_CRUD implements ActionListener {
	//frame for container
	
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,lfnm,llnm,lem,lpwd;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4,b5,b6;
	
	public Student_CRUD() {
	f=new JFrame("Student Registration Form");
	f.setSize(650, 350);
	f.setVisible(true);
	f.setLayout(null);//user will define its own layout for this we have to keep null
	
	l1=new JLabel("Student Id");
	l2=new JLabel("First Name");
	l3=new JLabel("Last Name");
	l4=new JLabel("Email Id");
	l5=new JLabel("Password");
	l6=new JLabel("");
	l7=new JLabel("");
	lfnm=new JLabel("");
	llnm=new JLabel("");
	lem=new JLabel("");
	lpwd=new JLabel("");
	
	f.add(l1);
	f.add(l2);
	f.add(l3);
	f.add(l4);
	f.add(l5);
	f.add(l6);
	f.add(l7);
	f.add(lfnm);
	f.add(llnm);
	f.add(lem);
	f.add(lpwd);
	
	

	l1.setBounds(50, 50, 120, 20);
	l2.setBounds(50, 80, 120, 20);
	l3.setBounds(50, 110, 120, 20);
	l4.setBounds(50, 140, 120, 20);
	l5.setBounds(50, 170, 120, 20);
	l6.setBounds(200, 30, 120, 20);
	l7.setBounds(330, 30, 350, 20);
	lfnm.setBounds(330, 80, 120, 20);
	llnm.setBounds(330, 110, 120, 20);
	lem.setBounds(330, 140, 120, 20);
	lpwd.setBounds(330, 170, 120, 20);
	

	
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(t5);
	
	t1.setBounds(200, 50, 120, 20);
	t2.setBounds(200, 80, 120, 20);
	t3.setBounds(200, 110, 120, 20);
	t4.setBounds(200, 140, 120, 20);
	t5.setBounds(200, 170, 120, 20);
	
	b1=new JButton("Insert");
	b2=new JButton("Search");
	b3=new JButton("Update");
	b4=new JButton("Delete");
	b5=new JButton("Reset All");
	b6=new JButton("<--Click to search Record");
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	
	b1.setBounds(50, 200, 120, 20);
	b2.setBounds(200, 200, 120, 20);
	b3.setBounds(50, 230, 120, 20);
	b4.setBounds(200, 230, 120, 20);
	b5.setBounds(130, 260, 120, 20);
	b6.setBounds(330, 50, 180, 20);
	
	
	t1.setEnabled(false);//student is is set to disable initially
	
	b1.addActionListener(this);//for b1 it will listen the action as click and call actionPerformed()
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1)
	{
		System.out.println("\n Insert button is clicked");
		if(t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t4.getText().equals(""))
		{
			lfnm.setText("Invalid First Name");
			llnm.setText("Invalid Last Name");
			lem.setText("Invalid Email Id");
			lpwd.setText("Invalid Password");
		}
		else
		{
			lfnm.setText("");
			llnm.setText("");
			lem.setText("");
			lpwd.setText("");
		try 
		{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Open the connection
			String url,username,password;
			Connection con=null;//connection interface reference to open connection for db
			   url="jdbc:mysql://localhost:3306/javalr_preet";
		       username="root";
		       password=null;
		       
		       con=DriverManager.getConnection(url, username, password);
		    //Write a query for inserting value into table
		     String qur=" INSERT INTO student_reg(fname,lname,email,pass)VALUE(?,?,?,?)";
		     
		     //Create a statement which convert ypur query string into statemnts
		     PreparedStatement ps=con.prepareStatement(qur);
		     ps.setString(1, t2.getText());
		     ps.setString(2, t3.getText());
		     ps.setString(3, t4.getText());
		     ps.setString(4, t5.getText());

		     
		     ps.executeUpdate();//commit the operation
		     
		     con.close();//close the connection with db
		     
		     System.out.println("\n Record is inserted successfully");
		       
		} 
		catch (Exception e1)
		{
			e1.printStackTrace();
		}

		}
	}
	else if(e.getSource()==b2)
	{
		System.out.println("\n Serach button is clicked");
		if(t1.isEnabled()==true)
		{
			int stdid=Integer.parseInt(t1.getText());
			
			try
			{
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Open the connection
			String url,username,password;
			Connection con=null;//connection interface reference to open connection for db
			   url="jdbc:mysql://localhost:3306/javalr_preet";
		       username="root";
		       password=null;
		       
		       con=DriverManager.getConnection(url, username, password);
		    //Write a query for fetching value into table
		       String qur="Select *from student_reg where studid=?";
		       PreparedStatement ps=con.prepareStatement(qur);
		       ps.setInt(1, stdid);
		      
		       ResultSet rs1=ps.executeQuery();
		       while(rs1.next())
		       {
	    		  t2.setText(rs1.getString(2));
	    		  t3.setText(rs1.getString(3));
	    		  t4.setText(rs1.getString(4));
	    		  t5.setText(rs1.getString(5));
		       }
		       t1.setEnabled(false);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		else
		{
		    l7.setText("Please click on Click to search Record button");
		}
		
		
	}
	else if(e.getSource()==b3)
	{
		System.out.println("\n Update button is clicked");
         int stdid=Integer.parseInt(t1.getText());
		
		try
		{
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Open the connection
		String url,username,password;
		Connection con=null;//connection interface reference to open connection for db
		   url="jdbc:mysql://localhost:3306/javalr_preet";
	       username="root";
	       password=null;
	       
	       con=DriverManager.getConnection(url, username, password);
	    //Write a query for updating value into table
	       String qur="update student_reg set fname=?,lname=?,email=?,pass=? where studid=?";
	       PreparedStatement ps=con.prepareStatement(qur);
	         ps.setString(1, t2.getText());
		     ps.setString(2, t3.getText());
		     ps.setString(3, t4.getText());
		     ps.setString(4, t5.getText());
	         ps.setInt(5, stdid);
	 
             ps.executeUpdate();//commit the operation
		     
		     con.close();//close the connection with db
		     
		     System.out.println("\n Record is updated successfully");
	       
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	else if(e.getSource()==b4)
	{
		System.out.println("\n Delete button is clicked");
		
	}
	else if(e.getSource()==b6)
	{
		l7.setText("");
		System.out.println("\n <--Click to search Record button is clicked");
		t1.setEnabled(true);		
	}
	else
	{
		System.out.println("\n Reset All button is clicked");
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
	}
		
	}
	public static void main(String[] args) {
    //anonymouse object
	new Student_CRUD();

	}
	

}
