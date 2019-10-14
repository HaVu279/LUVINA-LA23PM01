<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>User Management</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/list-style.css">
</head>
<body>

	<div id="container" align="center">
		<h1>INFORMATION USER</h1>
		<div id="content">
			<table>
				<tr>
					<th>Name</th>
					<th>Birthday</th>
					<th>BirthPlace</th>
				</tr>

				<c:forEach var="user" items="${USER_LIST}">
					<tr>
						<td>${user.name}</td>
						<td>${user.birthday}</td>
						<td>${user.birthplace }</td>
					</tr>

				</c:forEach>

			</table>
		</div>

	</div>
</body>


</html>








