<%@ page import="entities.Reply"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Reply</title>
</head>
<body>
	<%
		Reply reply = (Reply) session.getAttribute("reply");
		session.setAttribute("reply", reply);
		System.out.println(reply.getId() + " " + reply.getMessage()+ " " + reply.getTopicId() + " " + reply.getUserId());
	%>
	<form action="EditReply" method="post">
		Edit reply
		<table>
			<tr>
				<td>Message</td>
			</tr>
			<tr>
				<td><textarea rows="4" cols="50" name="message"><%=reply.getMessage()%> </textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="Edit" /></td>
			</tr>
			<tr>
				<td><a href="DeleteReply">Delete message</a></td>
			</tr>
		</table>
	</form>
</body>
</html>