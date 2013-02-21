<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Abertura de Chamados</title>
<link href="menu_assets/styles.css" rel="stylesheet" type="text/css">
<jsp:include page="Menu.jsp"></jsp:include>
<script type="text/javascript">
	function cancelar(){
		location.href = "Principal.jsp";
	}
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
	function pesquisarDados(){
		xmlHttp = GetXmlHttpObject();
		if (xmlHttp == null){
			alert ("Seu browser não suporta AJAX!");
			return;
		}
		var url = "PesquisarPorCodigo";
		url = url + "?oc_num=" + "${param.oc_numero}";
		xmlHttp.onreadystatechange = preencherCampos;
		xmlHttp.open("GET", url, true);
		xmlHttp.send(null);

	}
//==============================================================================
	function preencherCampos(){
		
    if (xmlHttp.readyState == 4){
	  if (xmlHttp.status == 200){
		  var xml = xmlHttp.responseXML;
		  var iTpOcor = 1;
		  var iEqpto = 1;
		  var iStatus = 1;

		  var qtdTpOcor = unescape(xml.getElementsByTagName('qtdTpOcor')[0].firstChild.data);
		  var qtdEqpto = unescape(xml.getElementsByTagName('qtdEqpto')[0].firstChild.data);
		  var qtdStatus = unescape(xml.getElementsByTagName('qtdStatus')[0].firstChild.data);
		  
		  var selTpOcor = document.getElementById("TpOcor");
		  var selEqpto = document.getElementById("Eqpto");
		  var selStatus = document.getElementById("Status");

		  document.getElementById("num_ocorrencia").value = unescape(xml.getElementsByTagName('oc_numero')[0].firstChild.data);
		  document.getElementById("descricao").value = unescape(xml.getElementsByTagName('descricao')[0].firstChild.data);
		  document.getElementById("solicitante").value = unescape(xml.getElementsByTagName('nome_solicitante')[0].firstChild.data);
		  document.getElementById("TpOcor").value = unescape(xml.getElementsByTagName('nome_solicitante')[0].firstChild.data);
		  
		  /*while(iTpOcor != qtdTpOcor){
			  selTpOcor.options[selTpOcor.options.length] = new Option(unescape(xml.getElementsByTagName('descTpOcor'+iTpOcor)[0].firstChild.data),
			                             		unescape(xml.getElementsByTagName('codTpOcor'+iTpOcor)[0].firstChild.data));
			  iTpOcor++;
		  }
		  while(iEqpto != qtdEqpto){
			  selEqpto.options[selEqpto.options.length] = new Option(unescape(xml.getElementsByTagName('descEqpto'+iEqpto)[0].firstChild.data),
               		unescape(xml.getElementsByTagName('codEqpto'+iEqpto)[0].firstChild.data));
			 
			  iEqpto++;
		  }*/
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
<h1>Abertura de Chamado</h1>
<form action="AlterarOcorrencia" method="post">
<table  border="2" bordercolor="blue" width="800">
<tr>
<td>
<table>
<tr>
<td>
Nº do Chamado: <input type="text" readonly="readonly" name="num_ocorrencia" id="num_ocorrencia">
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td>
Solicitado por: <input type="text" readonly="readonly" size="38" name="solicitante" id="solicitante">
</td>
<td>
<input type="text" style="visibility: hidden;" readonly="readonly" size="38">
</td>

</tr>
</table>
<br>
<table>
<tr>
<td>
Status: <br><select style="width: 110px;" name="Status" id="Status"></select>
</td>
<td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" style="max-width: 180px;visibility:hidden;" name="data_fechamento" id="data_fechamento">
</td>
<td>
<input type="text" style="max-width: 200px;visibility: hidden;" name="TpOcor" id="TpOcor">
</td>
</tr>
</table>
<table>
<tr>
<td><br>
Descrição do Problema:
</td>
<td><br>
Informações de Fechamento:
</td>
</tr>
<tr>
<td>
<textarea rows="10" cols="45" name="descricao" id="descricao" readonly="readonly""></textarea>
</td>
<td><textarea rows="10" cols="45" name="info_chamado" id="info_chamado"></textarea></td>
</tr>
</table>
</td>
</tr>
</table>
<br>
<table>
<tr>
<td align="center" style="width: 450px"><INPUT TYPE="submit" style="width: 180px;height: 50px;font-size: 18pt;" BORDER="0" value="Salvar"></td>
<td align="center" style="width: 180px"><INPUT TYPE="button" style="width: 180px;height: 50px;font-size: 18pt" BORDER="0" value="Cancelar" onclick="cancelar()"></td>
</tr>
</table>
<input type="hidden" name="cdsolicitante" id="cdsolicitante" value="${logado.codigo}">
<input type="hidden" name="cdresponsalvel" id="cdresponsalvel" value="${logado.codigo}">
<input type="text" style="visibility: hidden;" value="${logado.email}" name="email" id="email">
<select style="width: 110px;visibility: hidden;" name="StatusOcorr" id="StatusOcorr">
	<option value="1"></option>
</select>
</form>
</body>
</html>