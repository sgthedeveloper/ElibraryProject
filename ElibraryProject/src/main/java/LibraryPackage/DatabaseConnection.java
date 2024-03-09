package LibraryPackage;

import java.sql.*;
import LibraryPackage.PForSQL;

public class DatabaseConnection {
	public static int validate(String name,String pass){  
		int status=0;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			PForSQL a = new PForSQL();
	        String p = "yourmysqlpassword";
			a.setValue(p);
			String dbPassword = a.getValue();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/recordsusers","root",dbPassword);  
			PreparedStatement ps=con.prepareStatement(  
			"insert into usernamespass(usernameq,passwordq) values(?, ?)");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			status = ps.executeUpdate();
			con.close();
			}catch(Exception e){
				System.out.println(e);
			}  
		return status;
	}
}
