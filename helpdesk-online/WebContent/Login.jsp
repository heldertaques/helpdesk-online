<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Desk Online - Login</title>
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
//=============================================================================
	var xmlHttp = null;
	function GetXmlHttpObject(){
		var xmlHttp = null;
		try{
			// Firefox, Opera 8.0+, Safari
			xmlHttp = new XMLHttpRequest();
	  	} catch (e) {
			// Internet Explorer
			try{
	    		xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		    } catch (e) {
			    xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		    }
	  	}
		return xmlHttp;
	}
//=============================================================================
	function ExibirMensagem(){
		xmlHttp = GetXmlHttpObject();
		if (xmlHttp == null){
			alert ("Seu browser não suporta AJAX!");
			return;
		}
		var url = "ServletLogin";
//		url = url + "?nome=" + "${param.nome}";
		xmlHttp.onreadystatechange = MostrarOAlert;
		xmlHttp.open("GET", url, false);
		xmlHttp.send(null);

	}
//==============================================================================
	function MostrarOAlert(){
		
    if (xmlHttp.readyState == 4){
	  if (xmlHttp.status == 200){
		  var xml = xmlHttp.responseXML;
		  alert(xml.getElementsByTagName('msg')[0].firstChild.data);
	  }else{
			alert('Erro na conexão com o servidor.');	
	  }		
	}
}
//==============================================================================

</script>

</head>
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
&nbsp;&nbsp;&nbsp;<input type="submit" name="logar" id="logar" value="Logar">&nbsp;&nbsp;<br>
<!-- <input type="text" name="msg" id="msg">  --> 
</form>
</center>
</body>
</html>