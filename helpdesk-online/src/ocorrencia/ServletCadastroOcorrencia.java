package ocorrencia;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCadastroOcorrencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroOcorrencia() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaOcorrencia fachadaOcorrencia = new FachadaOcorrencia();
		try {
			fachadaOcorrencia.inserirOcorrencia(request.getParameter("num_ocorrencia"), request.getParameter("descricao"),
												request.getParameter("solicitante"),request.getParameter("TpOcor"),
												request.getParameter("Eqpto"), request.getParameter("StatusOcorr"));
			response.sendRedirect("ChamadoAberto.jsp");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
