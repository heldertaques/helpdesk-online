<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function alerta(){
		alert("Descrição não preenchida.");
		location.href = "CadastroStatusOcorrencia.jsp";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Erro</title>
</head>
<body onload="alerta()">
<c:if test="${msg != null} }">  

	<h1>${msg} </h1>

  </c:if>
<a href="Pincipal.jsp"></a>
</body>
</html>