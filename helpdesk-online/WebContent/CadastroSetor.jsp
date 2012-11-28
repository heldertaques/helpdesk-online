<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Setor</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
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
	function pesquisarFuncionarios(){
		xmlHttp = GetXmlHttpObject();
		if (xmlHttp == null){
			alert ("Seu browser não suporta AJAX!");
			return;
		}
		var url = "PesquisarTodosFuncionarios";
		//url = url + "?nome=" + "${param.nome}";
		xmlHttp.onreadystatechange = preencherCampos;
		xmlHttp.open("GET", url, false);
		xmlHttp.send(null);

	}
//==============================================================================
	function preencherCampos(){
    if (xmlHttp.readyState == 4){
	  if (xmlHttp.status == 200){
		  var xml = xmlHttp.responseXML;
		  var i = 1;
		  var qtd = unescape(xml.getElementsByTagName('quantidade')[0].firstChild.data);
		  var sel = document.getElementById("gerente");
		  while(i != qtd){
			  sel.options[sel.options.length] = new Option(unescape(xml.getElementsByTagName('nome'+i)[0].firstChild.data),
			                             		unescape(xml.getElementsByTagName('matricula'+i)[0].firstChild.data));
			 
			  i++;
		  }
	  }else{
			alert('Erro na conexão com o servidor.');
	  }		
	}
    
}
//==============================================================================
	//function cadastraSetor(){
	//	var gerente
//}
</script>
</head>
<body style="background-color: threedface;" onload="pesquisarFuncionarios()">
<jsp:include page="Menu.jsp"></jsp:include>
<script>
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
</script>
<h1>Cadastro de Setor</h1>
<form action="CadastroSetor" method="post">
<table border="2">
<tr>
<td bordercolor="transparent">Setor:<br><input type="text" name="setor" id="setor" size="30"></td>
<td bordercolor="transparent">
	Gerente:<br>
	<select id="gerente" name="gerente"></select>
</td>
</tr>
</table><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cadastrar">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="Button" value="Cancelar" onclick="cancelarCadastro()">
</form>
</body>
</html>