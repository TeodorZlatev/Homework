package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.DBManager;
import entities.Reply;
import entities.User;

/**
 * Servlet implementation class DeleteReplyServlet
 */
@WebServlet("/DeleteReply")
public class DeleteReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteReplyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		Reply reply = (Reply) session.getAttribute("reply");
		// reply.setMessage(request.getParameter("message"));
		// User user = (User) session.getAttribute("user");
		// String topicId = (String) session.getAttribute("topicId");
		// session.setAttribute("user", user);
		// session.setAttribute("topicId", topicId);
		try {
			DBManager.deleteReply(reply);
			RequestDispatcher rs = request.getRequestDispatcher("reply.jsp");
			rs.include(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}