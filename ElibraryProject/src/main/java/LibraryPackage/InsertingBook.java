package LibraryPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertingBook
 */
public class InsertingBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertingBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String booktitle = request.getParameter("booktitle");
		String author = request.getParameter("author");
		int price = Integer.parseInt(request.getParameter("price"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int connectivity = InsertingBookConnection.validate(bookid, booktitle, author, price, quantity);
		if(connectivity==1) {
			out.println("<html>\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>E-BOOK LIBRARY</title>\r\n"
					+ "</head>\r\n"
					+ "<body><center>"
					+ "<br><h1><b>Book Detail SuccessFully Added!!!</b></h1>"
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
					+ "<br><h1><b>Book ID Already Taken!!!</b></h1>"
					+ "<br><br><br><br><p><a href=\"Inside.jsp?id=1\"><b>CLICK HERE TO GO BACK</b></a></p>"
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
