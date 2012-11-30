package ocorrencia.status;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletListarStatusOcorrencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletListarStatusOcorrencia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaStatusOcorrencia fachadaStOcorrencia = new FachadaStatusOcorrencia();
		Collection<StatusOcorrencia> listaStatusOcorrencia = new LinkedList<StatusOcorrencia>();
		try {
			listaStatusOcorrencia = fachadaStOcorrencia.listarStatusOcorrencia();
			PrintWriter out = response.getWriter();
			String xml = "";
			int iStatus = 1;
			xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>";
			xml = xml + "<dados>\n";
			for(StatusOcorrencia statusOcorrencia: listaStatusOcorrencia){
				xml = xml + "<codStatus"+iStatus+">";
				xml = xml + statusOcorrencia.getCodigo();
				xml = xml + "</codStatus"+iStatus+">\n";
				xml = xml + "<descStatus"+iStatus+">";
				xml = xml + statusOcorrencia.getStatus();
				xml = xml + "</descStatus"+iStatus+">\n";
				iStatus++;
			}
			xml = xml + "<qtdStatus>";
			xml = xml + iStatus;
			xml = xml + "</qtdStatus>";
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
