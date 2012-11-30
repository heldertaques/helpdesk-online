package ocorrencia;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ocorrencia.status.FachadaStatusOcorrencia;
import ocorrencia.status.StatusOcorrencia;
import ocorrencia.tipo.FachadaTipoOcorrencia;
import ocorrencia.tipo.TipoOcorrencia;
import equipamento.Equipamento;
import equipamento.FachadaEquipamento;

public class ServletPesquisarPorCodigo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarPorCodigo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaOcorrencia fachadaOcorrencia = new FachadaOcorrencia();
		Ocorrencia ocorrencia = new Ocorrencia();
		
		FachadaTipoOcorrencia fachadaTpOcorrencia = new FachadaTipoOcorrencia();
		FachadaEquipamento fachadaEquipamento = new FachadaEquipamento();
		FachadaStatusOcorrencia fachadaStatusOcorrencia = new FachadaStatusOcorrencia();
		Collection<TipoOcorrencia> listaTipoOcorrencia = new LinkedList<TipoOcorrencia>();
		Collection<Equipamento> listaEquipamento = new LinkedList<Equipamento>();
		Collection<StatusOcorrencia> listaStatusOcorrencia = new LinkedList<StatusOcorrencia>();

		
		try {
			listaTipoOcorrencia = fachadaTpOcorrencia.listarTipoOcorrencia();
			listaEquipamento = fachadaEquipamento.listarEquipamentos();
			listaStatusOcorrencia = fachadaStatusOcorrencia.listarStatusOcorrencia();
			ocorrencia = fachadaOcorrencia.pesquisarOcorrenciaPorCodigo(request.getParameter("oc_num"));
			PrintWriter out = response.getWriter();
			String xml = "";
			int iTpOcor = 1;
			int iEqpto = 1;
			int iStatus = 1;
			xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>";
			xml = xml + "<dados>\n";
			for(TipoOcorrencia tpOcorrencia: listaTipoOcorrencia){
				xml = xml + "<codTpOcor"+iTpOcor+">";
				xml = xml + tpOcorrencia.getCodigo();
				xml = xml + "</codTpOcor"+iTpOcor+">\n";
				xml = xml + "<descTpOcor"+iTpOcor+">";
				xml = xml + tpOcorrencia.getDescricao();
				xml = xml + "</descTpOcor"+iTpOcor+">\n";
				iTpOcor++;
			}
			for(Equipamento equipamento: listaEquipamento){
				xml = xml + "<codEqpto"+iEqpto+">";
				xml = xml + equipamento.getCodigo();
				xml = xml + "</codEqpto"+iEqpto+">\n";
				xml = xml + "<descEqpto"+iEqpto+">";
				xml = xml + equipamento.getDescricao();
				xml = xml + "</descEqpto"+iEqpto+">\n";
				iEqpto++;
			}
			for(StatusOcorrencia statusOcorrencia: listaStatusOcorrencia){
				xml = xml + "<codStatus"+iStatus+">";
				xml = xml + statusOcorrencia.getCodigo();
				xml = xml + "</codStatus"+iStatus+">\n";
				xml = xml + "<descStatus"+iStatus+">";
				xml = xml + statusOcorrencia.getStatus();
				xml = xml + "</descStatus"+iStatus+">\n";
				iStatus++;
			}
			
			xml = xml + "<qtdTpOcor>";
			xml = xml + iTpOcor;
			xml = xml + "</qtdTpOcor>\n";

			xml = xml + "<qtdEqpto>";
			xml = xml + iEqpto;
			xml = xml + "</qtdEqpto>\n";

			xml = xml + "<qtdStatus>";
			xml = xml + iStatus;
			xml = xml + "</qtdStatus>\n";
			
			xml = xml + "<oc_numero>";
			xml = xml + ocorrencia.getOc_numero();
			xml = xml + "</oc_numero>\n";
			xml = xml + "<descricao>";
			xml = xml + ocorrencia.getDescricao();
			xml = xml + "</descricao>\n";
			xml = xml + "<cd_solicitante>";
			xml = xml + ocorrencia.getCd_solicitante();
			xml = xml + "</cd_solicitante>\n";
			xml = xml + "<cd_tipo>";
			xml = xml + ocorrencia.getCd_tipo();
			xml = xml + "</cd_tipo>\n";
			xml = xml + "<cd_equipamento>";
			xml = xml + ocorrencia.getCd_equipamento();
			xml = xml + "</cd_equipamento>\n";
			xml = xml + "<cd_status>";
			xml = xml + ocorrencia.getCd_status();
			xml = xml + "</cd_status>\n";
			xml = xml + "<data_abertura>";
			xml = xml + ocorrencia.getData_abertura();
			xml = xml + "</data_abertura>\n";
			xml = xml + "<idade>";
			xml = xml + ocorrencia.getIdade();
			xml = xml + "</idade>\n";
			xml = xml + "<nome_solicitante>";
			xml = xml + ocorrencia.getNomeSolicitante();
			xml = xml + "</nome_solicitante>\n";
			xml = xml + "<status>";
			xml = xml + ocorrencia.getStatus();
			xml = xml + "</status>";
			xml = xml + "</dados>\n";
			response.setContentType("text/xml");  
			out.write(xml);
			out.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
