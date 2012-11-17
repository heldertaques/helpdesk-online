<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function cadastrado(){
		var ConfirmVar = confirm("Cadastrado com Sucesso!\nCadastrar Novo?","Sim");
		
		if (ConfirmVar == true){
			location.href = "Cadastro.jsp";
		}else{
			location.href = "Index.jsp";
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body onload="cadastrado()">
</body>
</html>