<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="nguyenthihoai.entities.User" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>

<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>User Management</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/list-style.css">
</head>
<body>
	<%
		ArrayList<User> listUser = new ArrayList();
		listUser = (ArrayList<User>) request.getAttribute("USER_LIST");
		out.print("<div id = 'container'  align = 'center'>");
		out.print("<h1>INFORMATION USER</h1>");
		out.print("<div id='content'><table><tr>");
		out.print("<th>Name</th><th>Birthday</th><th>BirthPlace</th></tr>");
		
		for(User user : listUser) {
			out.print("<tr><td>" 	+ user.getName() + "</td><td>" 
									+ user.getBirthday() + "</td><td>"
									+ user.getBirthplace() + "</td></tr>");
		}
	%>
	
	<%-- <div id="container"  align="center">
		<h1>INFORMATION USER</h1>
		<div id="content">
			<table>
				<tr>
					<th>Name</th>
					<th>Birthday</th>
					<th>BirthPlace</th>
				</tr>

					<tr>
						<td>${user.name}</td>
						<td>${user.birthday}</td>
						<td>${user.birthplace }</td>
					</tr>


			</table>
		</div>

	</div> --%>
</body>


</html>








