package LibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeletingBook
 */
public class DeletingBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletingBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			PForSQL a = new PForSQL();
	        String p = "yourmysqlpassword";
			a.setValue(p);
			String dbPassword = a.getValue();
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root",dbPassword);   
			PreparedStatement ps=con.prepareStatement("delete from books where id = ?");
			ps.setInt(1,bookid);
			int rs = ps.executeUpdate();
			if(rs==1) {
				out.println("<html>\r\n"
						+ "<head>\r\n"
						+ "    <meta charset=\"UTF-8\">\r\n"
						+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
						+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
						+ "    <title>E-BOOK LIBRARY</title>\r\n"
						+ "</head>\r\n"
						+ "<body><center>"
						+ "<br><h1><b>Book Detail Deleted SuccessFully!!!</b></h1>"
						+ "<br><br><br><br><p><a href=\"Inside.jsp?id=1\"><b>CLICK HERE TO GO TO MAIN MENU</b></a></p>"
						+ "</center></body>\r\n"
						+ "</html>");
			}
			else {
				out.println("<html>\r\n"
						+ "<head>\r\n"
						+ "    <meta charset=\"UTF-8\">\r\n"
						+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
						+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
						+ "    <title>E-BOOK LIBRARY</title>\r\n"
						+ "</head>\r\n"
						+ "<body><center>"
						+ "<br><h1><b>Book ID Doesn't Exist!!!</b></h1>"
						+ "<br><br><br><br><p><a href=\"Inside.jsp?id=1\"><b>CLICK HERE TO GO BACK</b></a></p>"
						+ "</center></body>\r\n"
						+ "</html>");
			}
		}catch(Exception e) {
			System.out.println(e);
			out.println("<html>\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>E-BOOK LIBRARY</title>\r\n"
					+ "</head>\r\n"
					+ "<body><center>"
					+ "<p><b>An Error Occured</b></p>"
					+ "<p>PLEASE TRY AGAIN...FOR GO BACK <a href=\"Inside.jsp?id=1\"><b>CLICK HERE</b></a></p>"
					+ "</center></body>\r\n"
					+ "</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
