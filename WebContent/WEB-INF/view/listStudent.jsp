<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Java Institution</h1>
	<hr>
	<div id="wrapper">
		<div id="header">
			<h2>Our Students</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>Sid</th>
					<th>Sname</th>
					<th>Email</th>
					<th>Yoj</th>
				</tr>
				<c:forEach var="st" items="${students}">
					<tr>
						<td>${st.sid }</td>
						<td>${st.sname }</td>
						<td>${st.email }</td>
						<td>${st.syoj }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>