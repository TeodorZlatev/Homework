<%@page import="entities.DBManager"%>
<%@ page import="java.util.List"%>
<%@ page import="entities.Reply"%>
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
				<td><a href=editUser.jsp>edit</a></td>
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
	<a href="topic.jsp">Back to Topics</a>
	<br />
	<%
		String topicId = null;
		if (request.getParameter("topicId") != null) {
			topicId = request.getParameter("topicId");
			session.setAttribute("topicId", topicId);
		} else {
			topicId = (String) session.getAttribute("topicId");
			session.setAttribute("topicId", topicId);
		}
		session.setAttribute("topicId", topicId);
		String forumId = (String)session.getAttribute("forumId");
		List<Reply> list = DBManager.getAllRepliesByTopicId(topicId);
	%>
	<h2>Forum:
	<%= DBManager.getForumTitleById(forumId)%></h2>
	<h3>
		Topic:
		<%=DBManager.getTopicTitleById(topicId)%></h3>

	<%
		if (list.size() == 0) {
			out.println("There aren't any replies.");
		}
		for (int i = 0; i < list.size(); i++) {
			out.print("Written by:   " + DBManager.getUsernameById(list.get(i).getUserId()) + "   on date:   "
					+ list.get(i).getCreatedAt().toString());
			if (list.get(i).getModifiedAt() != null) {
				out.println("   , modified on date   " + list.get(i).getModifiedAt().toString());
			}
	%>
	<br />
	<%
		out.println(list.get(i).getMessage());
			if (list.get(i).getUserId() == user.getId()) {
				session.setAttribute("reply", list.get(i));
	%>
	<br />
	<a href="editReply.jsp">edit</a>
	<%
		}
	%>
	<br />
	<br />
	<%
		}
	%>
	<br />
	<form action="addReply" method="post">
		Add Reply
		<table>

			<tr>
				<td>Message</td>
			</tr>
			<tr>
				<td><textarea rows="2" cols="50" name="message"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>