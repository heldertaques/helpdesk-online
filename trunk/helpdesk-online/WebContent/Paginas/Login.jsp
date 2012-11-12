<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Desk Online - Login</title>
</head>
<script type="text/javascript">
	function ValidaLogin(){
		if (document.getElementById("user").value == ""){ 
			alert("Nome de usuário não informado");
			return false;
		}else if(document.getElementById("pass").value == ""){ 
				alert("Senha não informada");
				return false;
			}else{
				return true;
		}
	}
</script>
<body>
<center>
<table width="50%">
<tr>
<td>
<img alt="" src="imagens/help.jpg">
</td>
</tr>
</table>
</center>
<center>
<br><br><br><br><br><br><br><br><br>
<form action="ServletLogin" method="post" onsubmit="return ValidaLogin();">
Usuário:&nbsp;<input type="text" name="user" id="user"><br><br>
Senha:&nbsp;&nbsp;<input type="password" name="pass" id="pass"><br><br>
&nbsp;&nbsp;&nbsp;<input type="submit" name="logar" id="logar" value="Logar">&nbsp;&nbsp; 

</form>
</center>
</body>
</html>