<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelpDesk - Online - Chamados Abertos</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
<jsp:include page="Menu.jsp"></jsp:include>
<script>
	function pesquisarChamadosPorStatus(){
		var cd_status = document.getElementById("cd_status").value;
		alert(cd_status);
		location.href = "PesquisarPorStatus?cd_status="+cd_status;
	}
//=================================================================================================
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
	function pesquisarDados(){
		xmlHttp = GetXmlHttpObject();
		if (xmlHttp == null){
			alert ("Seu browser não suporta AJAX!");
			return;
		}
		var url = "ListarStatusOcorrencia";
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
		  var iStatus = 1;

		  var qtdStatus = unescape(xml.getElementsByTagName('qtdStatus')[0].firstChild.data);
		  
		  var selStatus = document.getElementById("cd_status");

		  while(iStatus != qtdStatus){
			  selStatus.options[selStatus.options.length] = new Option(unescape(xml.getElementsByTagName('descStatus'+iStatus)[0].firstChild.data),
               		unescape(xml.getElementsByTagName('codStatus'+iStatus)[0].firstChild.data));
			  iStatus++;
		  }
	  }else{
			alert('Erro na conexão com o servidor.');	
	  }		
	}
}
//==============================================================================

</script>

</head>
<body onload="pesquisarDados()">
<h1>Chamados</h1>
<select name="cd_status" id="cd_status" style="visibility: hidden;"></select>

<table border="1px">
	<tr>
		<td width="100px">Nro Ocorrencia</td>
		<td width="300px">Descrição</td>
		<td width="300px">Solicitante</td>
		<td width="150px">Status</td>
	</tr>
		<c:forEach items="${listaOcorrencia}" var="ocorrencia">
	<tr>
        <td><a href="AlterarOcorrencia.jsp?oc_numero=${ocorrencia.oc_numero}">${ocorrencia.oc_numero}</a></td>
        <td><a href="AlterarOcorrencia.jsp?oc_numero=${ocorrencia.oc_numero}">${ocorrencia.descricao}</a></td>
        <td><a href="PesquisarPorSolicitante?cd_solicitante=${ocorrencia.cd_solicitante}" name="">${ocorrencia.nomeSolicitante}</a></td>
        <td><a href="PesquisarPorStatus?cd_status=${ocorrencia.cd_status}">${ocorrencia.status}</a></td>
    </tr>
		</c:forEach>
		
</table><br><br>

</body>
</html>



