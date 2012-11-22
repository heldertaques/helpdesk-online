<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuarios</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body onload="definirStatus(${param.status})">
<div id='cssmenu'>
<ul>
   <li><a href='Principal.jsp'><span>Home</span></a></li>
   <li class='has-sub '><a href='#'><span>Ocorr�ncias</span></a>
      <ul>
         <li><a href='#'><span>Inicio</span></a></li>
         <li><a href='#'><span>Abrir Chamado</span></a></li>
         <li><a href='#'><span>Consultar</span></a></li>
      </ul>
   </li>
   <li class='has-sub '><a href='#'><span>Administra��o</span></a>
      <ul>
         <li><a href='TelaCadastro.jsp'><span>Cadastrar Funcionarios</span></a></li>
         <li><a href='CadastroUsuario.jsp'><span>Cadastrar Usu�rio</span></a></li>
         <li><a href='#'><span>Alterar Funcionario</span></a></li>
         <li><a href='#'><span>Alterar Usu�rio</span></a></li>
      </ul>
   </li>
   <li class='has-sub '><a href='#'><span>Relat�rios</span></a>
      <ul>
         <li><a href='#'><span>Chamados por Usuario</span></a></li>
         <li><a href='#'><span>Chamados Atendidos no SLA</span></a></li>
      </ul>
   </li>
</ul>
</div>
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
	function definirStatus(status){
		
		if (status == 1){
			document.getElementById("ativo").setAttribute("checked", "checked");
		}else{
			document.getElementById("desativado").setAttribute("checked", "checked");
		};
		
		document.getElementById("${param.pcodigo}").selected = true;
	}
</script>
<h1>Altera��o de Usu�rio</h1>
<form action="CadastroUsuario" method="post">
<table border="2">
<tr>
<td bordercolor="transparent">Codigo:<br><input type="text" name="codigo" id="codigo" value="${param.codigo}" readonly="readonly"></td>
<td bordercolor="transparent">Nome:<br><input type="text" name="nome" id="nome" size="30" value="${param.nome}" readonly="readonly"></td>
<td bordercolor="transparent">Login:<br><input type="text" name="loginName" id="loginName" value="${param.login}"></td>
</tr>
<tr>
<td bordercolor="transparent">Status<br>
<input type="radio" name="ativo" id="ativo" value="1">Ativo
<input type="radio" name="desativado" id="desativado" value="0">Desativado
</td>
<td bordercolor="transparent">Tipo de Acesso<br>
<select>
	<option value="1" id="1">Administrador</option>
	<option value="2" id="2">Operador</option>
	<option value="3" id="3">Usu�rio</option>
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