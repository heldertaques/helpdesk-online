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
Clique no funcion�ro que deseja habilitar como usu�rio.
<table border="1">
	<tr>
	<td bordercolor="transparent">Matricula</td>
	<td bordercolor="transparent" width="300">Nome</td>
	</tr>
	<c:forEach items="${listaFuncionarios}" var="funcionarios">
	<tr>
	<td> <a href="CadastroUsuario.jsp?mat=${funcionarios.matricula}&nome=${funcionarios.nome}">${funcionarios.matricula}</a></td>
	<td> <a href="CadastroUsuario.jsp?mat=${funcionarios.matricula}&nome=${funcionarios.nome}">${funcionarios.nome}</a></td>
	</tr>	
	</c:forEach>
</table><br><br>
</body>

</html>