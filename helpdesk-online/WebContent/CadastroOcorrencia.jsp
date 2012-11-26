<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Abertura de Chamados</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
<jsp:include page="Menu.jsp"></jsp:include>
</head>
<body>
<h1>Abertura de Chamado</h1>
<form>
<table  border="2" bordercolor="blue" width="800">
<tr>
<td>
<table>
<tr>
<td>
Nº do Chamado: <input type="text" readonly="readonly">
</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>
Solicitado por: <input type="text" readonly="readonly" size="38">
</td>
</tr>
</table>
<br>
<table>
<tr>
<td>
Tipo da Ocorência: <select>
						<option>Instalação de Impressora</option>
				   </select>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;Equipamento: <select>
				<option>Impressora HP DeskJet</option>
			 </select>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;Status: <select disabled="disabled">
				<option>Não Iniciado</option>
			 </select>
</td>

</tr>
</table>
</td>
</tr>
</table>
</form>

<!--
descricao varchar(255) not null,
cd_responsavel int,
cd_status int,
data_abertura timestamp not null default current_timestamp,
data_fechamento timestamp,
idade time not null default '0:00',
-->
</body>
</html>