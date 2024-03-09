package LibraryPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertingBookConnection {
	public static int validate(int bookid, String booktitle, String author, int price, int quantity){  
		int status=0;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			PForSQL a = new PForSQL();
	        String p = "yourmysqlpassword";
			a.setValue(p);
			String dbPassword = a.getValue();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root",dbPassword);  
			PreparedStatement ps=con.prepareStatement("insert into books(id, title, author, price, qty) values(?, ?, ?, ?, ?)");  
			ps.setInt(1,bookid);  
			ps.setString(2,booktitle);
			ps.setString(3,author);
			ps.setInt(4,price);
			ps.setInt(5,quantity);
			status = ps.executeUpdate();
			con.close();
			}catch(Exception e){
				System.out.println(e);
			}  
		return status;
	}
}
