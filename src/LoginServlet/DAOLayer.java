 package LoginServlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOLayer {
	private Connection con;
	public DAOLayer()
	{
		//this all needed to build connection
		try {
			String cn="org.mariadb.jdbc.Driver";
			String url ="jdbc:mariadb://localhost:3306/bank";
			String username="root";
			String password="";
			Class.forName(cn);//not needed in present day jdbc, but still it is ok..
			
			 con = DriverManager.getConnection(url,username,password);
			
			System.out.println("connection is working or not");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	
	 
	 
	public boolean CloseConnection() {
		// TODO Auto-generated method stub
		boolean closedStatus=false;
		try {
			con.close();
			closedStatus=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return closedStatus;
	}
	public Item GetDetailsFromDB(String userid,String password) {
		// TODO Auto-generated method stub
		Item i=new Item("xyz","123");
		
		try {
			String sql="  select loginId,loginPassword from tbl_login where loginId=? and loginPassword=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,userid);
			stmt.setString(2,password);
	        ResultSet ra=stmt.executeQuery();
	        if(ra.next())
	        {
	        	String uid=ra.getString("loginId");
	        	i.setUserid(uid);
	        	System.out.println(uid);
	        	String pass=ra.getString("loginPassword");
	        	i.setPassword(pass);
	        	System.out.println(pass);
	        }
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	
}
