package ocorrencia;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPesquisarPorSolicitante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarPorSolicitante() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaOcorrencia fachadaOcorrencia = new FachadaOcorrencia();
		Collection<Ocorrencia> listaOcorrencias = new LinkedList<Ocorrencia>();
		try {
			listaOcorrencias = fachadaOcorrencia.pesquisarOcorrenciaPorSolicitante(request.getParameter("cd_solicitante"));
			request.getSession().setAttribute("listaOcorrencia", listaOcorrencias);
			response.sendRedirect("ChamadosAbertos.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
