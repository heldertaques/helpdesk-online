<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CadastroFunc"method="post">
<div align="center">

 <h1>CADASTRO DE FUNCIONÁRIO</h1><br><br>   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;NOME:<input type="text" name = "nome" size="60">
SEXO:<input type="radio" name="sexo" value="M" >Masculino<input type="radio" name="sexo" value="F"> Feminino <br><br>
CARGO:<select name="funcao">
<option value="1"></option>
<option value="2">analista TI</option>
<option value="3">Administrador de redes</option>
<option value="4">Tecnico em manutenção</option>
</select>
CPF:<input type="text" name = "cpf"size="40"><br><br>
EMAIL:<input type="text" name = "email"size="60"><br><br>
TELEFONE:<input type="text" name = "telefone"><br><br>
ENDEREÇO:<input type="text" name = "endereco"size="60"><br><br>
CIDADE:<input type="text" name = "cidade"size="30">
BAIRRO:<input type="text" name = "bairro"><br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Enviar Cadastro"> 
<input type="reset" value="Cancelar" >
</div>
</form>

</body>
</html>