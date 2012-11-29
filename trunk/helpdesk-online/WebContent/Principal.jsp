<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Desk - Online</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body background="http://187.45.214.201/~trigueir/wp-content/uploads/2011/07/help_desk.jpg">
	<c:if test="${empty logado}">
    	<c:redirect url="Login.jsp"></c:redirect>
    </c:if>
<jsp:include page="Menu.jsp"></jsp:include>
</body>
</html>