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
<jsp:include page="Menu.jsp"></jsp:include>
<br><br>
Clique no funcionáro que deseja habilitar como usuário.
<table border="1">
	<tr>
	<td bordercolor="transparent">Código</td>
	<td bordercolor="transparent">Nome</td>
	<td bordercolor="transparent" width="300">Login</td>
	</tr>
	<c:forEach items="${listaUsuario}" var="usuarios">
	<tr>
	<td> <a href="AlterarUsuario.jsp?codigo=${usuarios.codigo}&nome=${usuarios.nome}
			&pcodigo=${usuarios.privilegio}&status=${usuarios.status}&login=${usuarios.loginName}">${usuarios.codigo}</a></td>
	<td> <a href="AlterarUsuario.jsp?codigo=${usuarios.codigo}&nome=${usuarios.nome}
			&pcodigo=${usuarios.privilegio}&status=${usuarios.status}&login=${usuarios.loginName}">${usuarios.nome}</a></td>
	<td> <a href="AlterarUsuario.jsp?codigo=${usuarios.codigo}&nome=${usuarios.nome}
			&pcodigo=${usuarios.privilegio}&status=${usuarios.status}&login=${usuarios.loginName}">${usuarios.loginName}</a></td>	
	</tr>	
	</c:forEach>
</table><br><br>
</body>

</html>