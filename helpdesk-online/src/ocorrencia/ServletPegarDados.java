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

import equipamento.Equipamento;
import equipamento.FachadaEquipamento;
import ocorrencia.status.FachadaStatusOcorrencia;
import ocorrencia.status.StatusOcorrencia;
import ocorrencia.tipo.FachadaTipoOcorrencia;
import ocorrencia.tipo.TipoOcorrencia;

public class ServletPegarDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPegarDados() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaTipoOcorrencia fachadaTpOcorrencia = new FachadaTipoOcorrencia();
		FachadaEquipamento fachadaEquipamento = new FachadaEquipamento();
		FachadaStatusOcorrencia fachadaStatusOcorrencia = new FachadaStatusOcorrencia();
		Collection<TipoOcorrencia> listaTipoOcorrencia = new LinkedList<TipoOcorrencia>();
		Collection<Equipamento> listaEquipamento = new LinkedList<Equipamento>();
		Collection<StatusOcorrencia> listaStatusOcorrencia = new LinkedList<StatusOcorrencia>();
		FachadaOcorrencia fachadaOcorrencia = new FachadaOcorrencia();
		
		try {
			listaTipoOcorrencia = fachadaTpOcorrencia.listarTipoOcorrencia();
			listaEquipamento = fachadaEquipamento.listarEquipamentos();
			listaStatusOcorrencia = fachadaStatusOcorrencia.listarStatusOcorrencia();
			String num_ocorr = "OC-" + fachadaOcorrencia.pegarNumeroOcorrencia();
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
			
			xml = xml + "<OcNum>";
			xml = xml + num_ocorr;
			xml = xml + "</OcNum>";

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
