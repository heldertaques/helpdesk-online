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
<div id='cssmenu'>
<ul>
   <li ><a href='Principal.jsp'><span>Home</span></a></li>
   <li class='has-sub '><a href='#'><span>Ocorrências</span></a>
      <ul>
         <li><a href='#'><span>Inicio</span></a></li>
         <li><a href='#'><span>Abrir Chamado</span></a></li>
         <li><a href='#'><span>Consultar</span></a></li>
      </ul>
   </li>
   <li class='has-sub '><a href='#'><span>Administração</span></a>
      <ul>
         <li><a href='TelaCadastro.jsp'><span>Cadastrar Funcionarios</span></a></li>
         <li><a href='FuncionariosCadastrados.jsp'><span>Cadastrar Usuário</span></a></li>
         <li><a href='#'><span>Alterar Funcionario</span></a></li>
         <li><a href='#'><span>Alterar Usuário</span></a></li>
      </ul>
   </li>
   <li class='has-sub '><a href='#'><span>Relatórios</span></a>
      <ul>
         <li><a href='#'><span>Chamados por Usuario</span></a></li>
         <li><a href='#'><span>Chamados Atendidos no SLA</span></a></li>
      </ul>
   </li>
</ul>
</div>
<br><br>
Clique no funcionáro que deseja habilitar como usuário.
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