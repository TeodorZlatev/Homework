<%@page import="entities.DBManager"%>
<%@ page import="entities.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit profile</title>
</head>
<body>
	<p>
	<h1>Edit profile</h1>
	</p>
	<%
		User user = (User) session.getAttribute("user");
		session.setAttribute("user", user);
	%>
	<form action="EditUser" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username"
					value="<%=user.getUserName()%>" /></td>
			</tr>
			<tr>
				<td>Current password:</td>
				<td><%=user.getPassword()%></td>
			</tr>
			<tr>
				<td>New password:</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>Names:</td>
				<td><input type="text" name="names"
					value="<%=user.getNames()%>" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"
					value="<%=user.getEmail()%>" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><select name="gender">
						<option value="<%=user.getGender()%>"><%=user.getGender()%></option>
						<option value="male">male</option>
						<option value="female">female</option>
				</select></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="text" name="age" value="<%=user.getAge()%>" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form>
</body>
</html>