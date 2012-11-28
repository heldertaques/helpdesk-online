<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro - Tipo de Ocorrencia</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
<jsp:include page="Menu.jsp"></jsp:include>
<jsp:include page="ValidacaoHora.jsp"></jsp:include>
</head>
<body style="background-color: threedface;;" >
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
</script>
<h1>Cadastro - Tipo de Ocorrência</h1>
<form action="CadastroTipoOcorrencia" method="post">
<table border="2">
<tr>
<td bordercolor="transparent">Codigo:<br><input type="text" name="codigo" id="codigo"  style="width: 80px" disabled="disabled" value="${param.codigo}"></td>
<td bordercolor="transparent">Descrição:<br><input type="text" name="desc" id="desc"  style="width: 250px" value="${param.desc}"></td>
<td bordercolor="transparent">SLA:&nbsp;&nbsp;&nbsp;<br><input type="text" name="sla" id="sla"  value="${param.sla}" style="width: 80px" maxlength="8" onkeypress="validaHoras(this)">hh:mm:ss</td>
</tr>
</table><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cadastrar">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="Button" value="Cancelar" onclick="cancelarCadastro()">
</form>

</body></html>