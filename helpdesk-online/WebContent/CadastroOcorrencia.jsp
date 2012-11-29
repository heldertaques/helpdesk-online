<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Abertura de Chamados</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
<jsp:include page="Menu.jsp"></jsp:include>
<script type="text/javascript">
	function cancelar(){
		location.href = "Principal.jsp";
	}
</script>
</head>
<body>
<h1>Abertura de Chamado</h1>
<form action="CadastroOcorrencia" method="post">
<table  border="2" bordercolor="blue" width="800">
<tr>
<td>
<table>
<tr>
<td>
Nº do Chamado: <input type="text" readonly="readonly">
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>
Solicitado por: <input type="text" readonly="readonly" size="38" value="${logado.nome}">
</td>
<td>
Setor: <input type="text" readonly="readonly" size="38" value="">
</td>

</tr>
</table>
<br>
<table>
<tr>
<td>
Tipo de Ocorência: <select style="max-width: 200px">
						<option>Instalação de Impressora</option>
						<option>Instalação de Sistema Operacional</option>
						
				   </select>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;Equipamento: <select style="max-width: 180px">
				<option>Impressora HP DeskJet</option>
			 </select>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;Status: <select disabled="disabled" style="width: 110px">
				<option>Não Iniciado</option>
			 </select>
</td>
</tr>
</table>
<table>
<tr>
<td><br>
Descrição do Problema:
</td>
</tr>
<tr>
<td>
<textarea rows="10" cols="50"></textarea>
</td>
</tr>
</table>
</td>
</tr>
</table>
<br>
<table>
<tr>
<td align="center" style="width: 450px"><INPUT TYPE="submit" style="width: 180px;height: 50px;font-size: 18pt;" BORDER="0" value="Salvar"></td>
<td align="center" style="width: 180px"><INPUT TYPE="button" style="width: 180px;height: 50px;font-size: 18pt" BORDER="0" value="Cancelar" onclick="cancelar()"></td>
</tr>
</table>
</form>
</body>
</html>