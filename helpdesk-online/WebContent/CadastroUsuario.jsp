<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuarios</title>
</head>
<body>
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
</script>
<table width="50%">
<tbody>
<tr>
<td>
</td>
</tr>
</tbody>
</table>
<form action="CadastroUsuario" method="post">
<table border="2">
<tr>
<td bordercolor="transparent">Nome:<br><input type="text" name="nome" id="nome" size="30"></td>
<td bordercolor="transparent">Login:<br><input type="text" name="loginName" id="loginName"></td>
</tr>
<tr>
<td bordercolor="transparent">Senha:<br><input type="password" name="senha" id="senha"></td>
<td bordercolor="transparent">Status:<br>
<select name="status" id="status">
	<option value="1">Ativo</option>
	<option value="0">Desativado</option>
</select>
</td>
<td bordercolor="transparent">Privilégio<br>
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