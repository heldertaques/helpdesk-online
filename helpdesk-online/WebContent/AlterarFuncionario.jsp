<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Funcionários</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
</head>
<body background="http://187.45.214.201/~trigueir/wp-content/uploads/2011/07/help_desk.jpg">
<jsp:include page="Menu.jsp"></jsp:include>
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
</script>

<form action="ServletAlterarFuncionarios" method="post">
<div align="left">

<h1><div align="center">Alterar Funcionários</div></h1><br><br>
<b>NOME: </b><input type="text" name = "nome" size="60" value ="${param.nome} " >
<b>SEXO:</b><input type="radio" name="sexo" value="${param.sexo}" value="masculino" ><b>M</b>
<input type="radio" name="sexo" value="feminino"><b> F</b> <br><br>
<b>CARGO:</b><select name="funcao" value="${param.cargo}">

<c:forEach items="${listaCargo}" var="cargo">
		<option value="${cargo.codigo}">${cargo.descricao}</option>
	</c:forEach>
</select>

<b>CPF:     </b><input type="text" name = "cpf"size="40" value="${param.cpf} "><br><br>
<b>EMAIL:   </b><input type="text" name = "email"size="60" value="${param.email}"><br><br>
<b>TELEFONE:</b><input type="text" name = "telefone" value="${param.telefone}"><br><br>
<b>ENDEREÇO:</b><input type="text" name = "endereco"size="60" value="${param.endereco}"><br><br>
<b>CIDADE:  </b><input type="text" name = "cidade"size="60" value="${param.cidade}"><br><br>
<b>BAIRRO:  </b><input type="text" name = "bairro" size="60" value="${param.bairro}"><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Enviar Cadastro"> 
<b><input type="reset" value="Cancelar" onclick="cancelarCadastro()"></b>
</div>
<input type="text" value="${param.matricula}" name="matricula" style="display: none;">
</form>

</body>
</html>