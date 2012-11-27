<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Status de Ocorrência</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body style="background-color: threedface;;" >
<jsp:include page="Menu.jsp"></jsp:include>
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
</script>
<h1>Cadastro - Status de Ocorrência</h1>
<form action="CadastroStatus" method="post">
<table border="2">
<tr>
<td bordercolor="transparent">Descrição:<br><input type="text" name="desc" id="desc"  style="width: 250px"></td>
</tr>
</table><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cadastrar">
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="Button" value="Cancelar" onclick="cancelarCadastro()">
</form>

</body>
</html>