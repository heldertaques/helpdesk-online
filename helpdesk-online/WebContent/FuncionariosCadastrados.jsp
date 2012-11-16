<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Funcionarios Cadastrados</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id='cssmenu'>
<ul>
   <li class='active '><a href='Principal.jsp'><span>Home</span></a></li>
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
</body>
<form action="ServletPesquisarTodosFuncionarios" method="post">
<table border="1">
	<tr>
	<td bordercolor="transparent">Matricula</td>
	<td bordercolor="transparent" width="300">Nome</td>
	</tr>
</table><br><br>
<input type="submit" value="Pesquisar">
</form>
</html>