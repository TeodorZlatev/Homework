<%@page import="entities.DBManager"%>
<%@ page import="java.util.List"%>
<%@ page import="entities.Topic"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FORUM</title>
</head>
<body>
	<br />
	<form>
		<table style="width: 30%">
			<tr>
				<td>Username</td>
				<td><a href="editUser.jsp">edit</a></td>
			</tr>
			<tr>
				<%
					HttpSession sess = request.getSession();
					User user = (User) session.getAttribute("user");
				%>
				<td><%=user.getUserName()%></td>
				<td><a href="Logout">Logout</a></td>
			</tr>
		</table>
	</form>
	<a href="forum.jsp">Back to Forums</a>
	<br />
	<ul style="list-style-type: circle">
		<%
			response.setContentType("text/html");
			String forumId = null;
			if (request.getParameter("forumId") != null) {
				forumId = request.getParameter("forumId");
				session.setAttribute("forumId", forumId);
			} else {
				forumId = (String) session.getAttribute("forumId");
			}
		%>
		<h2>
			Forum:
			<%=DBManager.getForumTitleById(forumId)%></h2>
		<%
			List<Topic> list = DBManager.getAllTopicsByForumId(forumId);
			if (list.size() == 0) {
				out.println("There aren't any topics.");
			}
			for (int i = 0; i < list.size(); i++) {
		%>

		<li><a href="reply.jsp?topicId=<%=list.get(i).getId()%>"><%=list.get(i).getTitle()%></a>
		</li>
		<%
			}
		%>
	</ul>
	<form action="addTopic" method="post">
		<table>
			<tr>Add topic
			</tr>
			<tr>
				<td>Topic</td>
			</tr>
			<tr>
				<td><textarea rows="2" cols="50" name="title"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>