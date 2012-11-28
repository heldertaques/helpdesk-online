package ocorrencia.tipo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletListarTipoOcorrencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletListarTipoOcorrencia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaTipoOcorrencia fachadaTpOcorrencia = new FachadaTipoOcorrencia();
		Collection<TipoOcorrencia> listaTpOcorrencia = new LinkedList<TipoOcorrencia>();

		try {
			listaTpOcorrencia = fachadaTpOcorrencia.listarTipoOcorrencia();
			request.getSession().setAttribute("listaTpOcorrencia", listaTpOcorrencia);
			response.sendRedirect("ListaTipoOcorrencia.jsp");
			/*PrintWriter out = response.getWriter();
			String xml = "";
			int i = 1;
			xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>";
			xml = xml + "<TipoOcorrencia>\n";
			for(TipoOcorrencia tpOcorrencia: listaTpOcorrencia){
				xml = xml + "<codigo"+i+">";
				xml = xml + tpOcorrencia.getCodigo();
				xml = xml + "</codigo"+i+">\n";
				xml = xml + "<nome"+i+">";
				xml = xml + tpOcorrencia.getDescricao();
				xml = xml + "</nome"+i+">\n";
				xml = xml + "<sla"+i+">";
				xml = xml + tpOcorrencia.getSla();
				xml = xml + "</sla"+i+">\n";
				i++;
			}
			xml = xml + "<quantidade>";
			xml = xml + i;
			xml = xml + "</quantidade>";

			xml = xml + "</TipoOcorrencia>\n";

			response.setContentType("text/xml");  
			out.write(xml);
			out.close();*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
