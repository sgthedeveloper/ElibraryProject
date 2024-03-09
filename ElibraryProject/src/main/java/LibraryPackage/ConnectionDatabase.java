package LibraryPackage;
import java.sql.*;
import LibraryPackage.PForSQL;
import LibraryPackage.LoginBean;
public class ConnectionDatabase {
	public boolean validate(LoginBean loginBean) throws ClassNotFoundException{  
		boolean status=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try { 
			PForSQL a = new PForSQL();
	        String p = "yourmysqlpassword";
			a.setValue(p);
			String dbPassword = a.getValue();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/recordsusers","root",dbPassword);  
			PreparedStatement preparedStatement = con.prepareStatement("select * from usernamespass where usernameq = ? and passwordq = ? "); 
			preparedStatement.setString(1, loginBean.getUsername());
            preparedStatement.setString(2, loginBean.getPassword());
		    ResultSet rs = preparedStatement.executeQuery();
		    status = rs.next();
		    } catch (SQLException e) {
		    // process sql exception
		    	printSQLException(e);
		    }
		    return status;
	}
	private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}