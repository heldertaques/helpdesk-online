package ocorrencia.status;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ocorrencia.status.exception.DescricaoStatusOcorrenciaVaziaException;

public class ServletCadastroStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroStatus() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws NullPointerException, ServletException, IOException {
		FachadaStatusOcorrencia fachadaStatusOcorrencia = new FachadaStatusOcorrencia();
		try {
			fachadaStatusOcorrencia.inserirStatusOcorrencia(request.getParameter("desc"));
			response.sendRedirect("CadastroStatusOcorrencia.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			response.sendRedirect("erro.jsp");
		} catch (DescricaoStatusOcorrenciaVaziaException e) {
			e.printStackTrace();
			response.sendRedirect("erro.jsp");
		} catch (NullPointerException e) {
			response.sendRedirect("erro.jsp");
		}
		
	}

}
