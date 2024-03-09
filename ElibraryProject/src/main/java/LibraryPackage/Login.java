package LibraryPackage;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import LibraryPackage.LoginBean;
import LibraryPackage.ConnectionDatabase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnectionDatabase loginDao;

    public void init() {
        loginDao = new ConnectionDatabase();
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);
		try {
				if(loginDao.validate(loginBean)) {
					out.println("<html>\r\n"
							+ "<head>\r\n"
							+ "    <meta charset=\"UTF-8\">\r\n"
							+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
							+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
							+ "    <title>E-BOOK LIBRARY</title>\r\n"
							+ "</head>\r\n"
							+ "<body><center>"
							+ "<br><br><h1><b>LOGGED IN SUCCESSFULLY!!!</b></h1>"
							+ "<br><br><br><h3><a href=\"Inside.jsp?id=1\"><b>Click Here To Proceed Further</b></a></h3>"
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
							+ "<h1>Username Or Password Is Incorrect!!!</h1>"
							+ "<br><br><br><h3>PLEASE TRY AGAIN...FOR GO BACK TO HOMEPAGE <a href=\"index.jsp?id=1\"><b>CLICK HERE</b></a></h3>"
							+ "<br><h3>FOR GO BACK TO LOG IN PAGE <a href=\"Username.jsp?id=1\"><b>CLICK HERE</b></a></h3>"
							+ "</center></body>\r\n"
							+ "</html>");
				}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
