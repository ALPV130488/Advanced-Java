package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		1)loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://10.0.20.64:3306/javacore", "adminuser", "password");
//		3)creating the statement 
		Statement stmt = conn.createStatement();
//		4)executing query DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery()
		
		ResultSet result=stmt.executeQuery("select * from flipkart");
		
//		5)close the connection
		System.out.println("proId | proName | proPrice | proDesc");
		while(result.next())
		{
			
System.out.println(result.getInt("proid")+"     "+result.getString(2)+"      "+result.getInt(3)+"     "+result.getString(4));
		}
		conn.close();
	

	}

}
