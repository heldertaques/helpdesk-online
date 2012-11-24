<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuarios</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body background="http://187.45.214.201/~trigueir/wp-content/uploads/2011/07/help_desk.jpg">
<jsp:include page="Menu.jsp"></jsp:include>
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
</script>
<h1>Cadastro de Usuário</h1>
<form action="CadastroUsuario" method="post">
<table border="2">
<tr>
<td bordercolor="transparent">Nome:<br><input type="text" name="nome" id="nome" size="30" value="${param.nome}"></td>
<td bordercolor="transparent">Login:<br><input type="text" name="loginName" id="loginName"></td>
<td><input type="hidden" name="codigo" value="${param.mat}"></td>
</tr>
<tr>
<td bordercolor="transparent">Senha:<br><input type="password" name="senha" id="senha"></td>
<td bordercolor="transparent">Status:<br>
<select name="status" id="status">
	<option value="1">Ativo</option>
	<option value="0">Desativado</option>
</select>
</td>
<td bordercolor="transparent">Tipo de Acesso<br>
<select name="privilegio" id="privilegio">
	<option value="1">Administrador</option>
	<option value="2">Operador</option>
	<option value="3">Usuário</option>
</select>
</td>
</tr>
</table><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cadastrar">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="Button" value="Cancelar" onclick="cancelarCadastro()">
</form>

</body>
</html>