package ocorrencia;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		try {
			ocorrencia = fachadaOcorrencia.pesquisarOcorrenciaPorCodigo(request.getParameter("oc_numero"));
			request.getSession().setAttribute("ocorrencia", ocorrencia);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
