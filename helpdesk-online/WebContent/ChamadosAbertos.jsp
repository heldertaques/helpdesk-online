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
<body onload="ListarChamadosAbertos">
<jsp:include page="Menu.jsp"></jsp:include>
<script>
	function pesquisarCargos(){
		location.href = "PesquisarTodosCargos";
	}

</script>

<h1>Chamados</h1>
Clique no Funcion�rio que deseja alterar.
<select></select>
<table border="1px">
	<tr>
		<td width="50px">Matr�cula</td>   <td width="300px">Nome</td>
	</tr>
		<c:forEach items="${listaF}" var="func">
	<tr>
        <td><a href="AlterarFuncionario.jsp?nome=${func.nome}">${func.matricula}</a></td>
        	<td><a href="AlterarFuncionario.jsp?nome=${func.nome}">${func.nome} </a></td>
    </tr>
		</c:forEach>
		
</table><br><br>

</body>
</html>



