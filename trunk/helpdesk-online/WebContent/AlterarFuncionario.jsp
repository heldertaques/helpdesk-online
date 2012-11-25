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
<body background="http://187.45.214.201/~trigueir/wp-content/uploads/2011/07/help_desk.jpg" onload="pesquisarFuncionarios()" >
<jsp:include page="Menu.jsp"></jsp:include>
<script>
//=============================================================================
	var xmlHttp = null;
	function cancelarCadastro(){
		location.href = "Principal.jsp";
	}
//=============================================================================	
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
		var url = "PesquisarFuncionarioPorNome";
		url = url + "?nome=" + "${param.nome}";
		xmlHttp.onreadystatechange = preencherCampos;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);

	}
//==============================================================================
	function preencherCampos(){
		
    if (xmlHttp.readyState == 4){
	  if (xmlHttp.status == 200){
		  var xml = xmlHttp.responseXML;
          document.getElementById("nome").value = unescape(xml.getElementsByTagName('nome')[0].firstChild.data);
          document.getElementById("cpf").value = unescape(xml.getElementsByTagName('cpf')[0].firstChild.data);
          document.getElementById("email").value = unescape(xml.getElementsByTagName('email')[0].firstChild.data);
          document.getElementById("matricula").value = unescape(xml.getElementsByTagName('matricula')[0].firstChild.data);
          document.getElementById("telefone").value = unescape(xml.getElementsByTagName('telefone')[0].firstChild.data);
          document.getElementById("endereco").value = unescape(xml.getElementsByTagName('endereco')[0].firstChild.data);
          document.getElementById("bairro").value = unescape(xml.getElementsByTagName('bairro')[0].firstChild.data);
          document.getElementById("cidade").value = unescape(xml.getElementsByTagName('cidade')[0].firstChild.data);
          if(unescape(xml.getElementsByTagName('sexo')[0].firstChild.data) == 'M' || unescape(xml.getElementsByTagName('sexo')[0].firstChild.data) == 'm'){
        	  document.getElementById("m").setAttribute("checked", "checked");
         	}else{
         		if(unescape(xml.getElementsByTagName('sexo')[0].firstChild.data) == 'F' || unescape(xml.getElementsByTagName('sexo')[0].firstChild.data) == 'f'){
         			document.getElementById("f").setAttribute("checked", "checked");
         	}
         }
          document.getElementById(unescape(xml.getElementsByTagName('funcao')[0].firstChild.data)).selected = true;

          
	  }else{
			alert('Erro na conexão com o servidor.');	
	  }		
	}
}

</script>

<form action="ServletAlterarFuncionarios" method="post">
<h1>Alterar Funcionários</h1><br><br>
<b>NOME: </b><input type="text" name = "nome" id="nome" size="60">
<b>SEXO:</b><input type="radio" name="sexo" id="m">M<b></b>
<input type="radio" name="sexo" id="f">F<b></b> <br><br>
<b>CARGO:</b><select name="funcao" id="funcao">
	<option id="1" value="1">Analista de Suporte</option>
	<option id="2" value="2">Coordenador de TI</option>
	<option id="3" value="3">Tecnico de Suporte I</option>
	<option id="4" value="4">Analista de Incidentes</option>
	<option id="5" value="5">Supervisor de TI</option>
	
</select>

<b>CPF:     </b><input type="text" name="cpf" id="cpf" size="40"><br><br>
<b>EMAIL:   </b><input type="text" name="email" id="email" size="60"><br><br>
<b>TELEFONE:</b><input type="text" name="telefone" id="telefone"><br><br>
<b>ENDEREÇO:</b><input type="text" name="endereco" id="endereco" size="60"><br><br>
<b>CIDADE:  </b><input type="text" name="cidade" id="cidade" size="60"><br><br>
<b>BAIRRO:  </b><input type="text" name="bairro" id="bairro" size="60"><br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Enviar Cadastro"> 
<b><input type="reset" value="Cancelar" onclick="cancelarCadastro()"> </b>
<input type="text" name="matricula" id="matricula" style="display: none;">
</form>

</body>
</html>