<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Funcionarios Cadastrados</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>

<body>
<table border="1px">
	<tr>
		<td width="50px">Código</td>   <td width="300px">Nome</td>
	</tr>
		<tr>
			<c:forEach items="${listaF}" var="func">
					<td>${func.matricula} </td>	<td>${func.nome} </td>
			</c:forEach>
		
		</tr>
</table>

</body>
</html>