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
import entities.Topic;
import entities.User;

/**
 * Servlet implementation class AddTopicServlet
 */
@WebServlet("/addTopic")
public class AddTopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddTopicServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Topic topic = new Topic();
		topic.setTitle(request.getParameter("title"));
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String forumId = (String) session.getAttribute("forumId");
		session.setAttribute("user", user);
		session.setAttribute("forumId", forumId);
		System.out.println("add topic user.getId " + user.getId() + " forumid " + forumId);
		try {
			DBManager.insertTopic(topic, forumId, new Integer(user.getId()).toString());
			RequestDispatcher rs = request.getRequestDispatcher("topic.jsp");
			rs.include(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
	}

}
