<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelpDesk - Online</title>
<script type="text/javascript">
	function alertaSenha(){
		var message = document.getElementById("mesg").value;
		alert(message);
		location.href = "Login.jsp";
	}

</script>
</head>
<body onload="alertaSenha()">
	<c:forEach items="${msg}" var="erro">
		<input type="hidden" name="mesg" id="mesg" value="${erro}">
	</c:forEach>
</body>
</html>