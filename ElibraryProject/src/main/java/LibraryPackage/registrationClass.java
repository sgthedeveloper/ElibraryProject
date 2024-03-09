package LibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import LibraryPackage.DatabaseConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationClass
 */
public class registrationClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("psw");
		String password1 = request.getParameter("psw-repeat");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if(!password.equals(password1)) {
			out.println("<html>\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>E-BOOK LIBRARY</title>\r\n"
					+ "</head>\r\n"
					+ "<body><center>"
					+ "<br><br><h1>PASSWORD DOES NOT MATCH WITH RE-TYPE PASSWORD</h1>"
					+ "<br><br><br><br><p><b>PLEASE TRY AGAIN... FOR GO BACK</b> <a href=\"index.jsp?id=1\"><b>CLICK HERE</b></a></p>"
					+ "</center></body>\r\n"
					+ "</html>");
		}
		else if(password.equals(password1)) {
			int connectivity = DatabaseConnection.validate(username, password); 
			if(connectivity!=0) {
				out.println("<html>\r\n"
						+ "<head>\r\n"
						+ "    <meta charset=\"UTF-8\">\r\n"
						+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
						+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
						+ "    <title>E-BOOK LIBRARY</title>\r\n"
						+ "</head>\r\n"
						+ "<body><center>"
						+ "<br><br><h1>Username SuccessFully Added!!!</h1>"
						+ "<br><br><br><br><p><b>Click Here To</b> <a href=\"Inside.jsp?id=1\"><b>Proceed Further</b></a></p>"
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
						+ "<br><br><h1>Username Already Taken</h1>"
						+ "<br><br><br><br><p><b>PLEASE TRY AGAIN... FOR GO BACK</b> <a href=\"index.jsp?id=1\"><b>CLICK HERE</b></a></p>"
						+ "</center></body>\r\n"
						+ "</html>");
			}
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
					+ "<p><b>An Error Occured</b></p>"
					+ "<p>PLEASE TRY AGAIN...FOR GO BACK <a href=\"index.jsp?id=1\"><b>CLICK HERE</b></a></p>"
					+ "</center></body>\r\n"
					+ "</html>");
		}
		}
}
