<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista - Tipo de Ocorrencia</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="Menu.jsp"></jsp:include>
<h1>Lista - Tipo de Ocorrencia</h1>
Clique no item que deseja alterar.
<table border="1">
	<tr>
	<td bordercolor="transparent">Código</td>
	<td bordercolor="transparent">Descricao</td>
	</tr>
	<c:forEach items="${listaTpOcorrencia}" var="tipoOcorrencia">
	<tr>
	<td> <a href="AlterarTipoOcorrencia.jsp?codigo=${tipoOcorrencia.codigo}
			&desc=${tipoOcorrencia.descricao}&sla=${tipoOcorrencia.sla}">${tipoOcorrencia.codigo}</a></td>
	<td> <a href="AlterarTipoOcorrencia.jsp?codigo=${tipoOcorrencia.codigo}
			&desc=${tipoOcorrencia.descricao}&sla=${tipoOcorrencia.sla}">${tipoOcorrencia.descricao}</a></td>
	</tr>	
	</c:forEach>
</table><br><br>
</body>

</html>