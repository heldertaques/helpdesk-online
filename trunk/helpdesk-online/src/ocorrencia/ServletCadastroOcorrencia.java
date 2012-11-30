package ocorrencia;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import email.EnviarEmail;

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
												request.getParameter("cdsolicitante"),request.getParameter("TpOcor"),
												request.getParameter("Eqpto"), request.getParameter("StatusOcorr"));
			EnviarEmail enviarEmail = new EnviarEmail();
			String mensagem = "Foi aberto um chamado por " + request.getParameter("solicitante") + ", com a seguinte descrição:<br><br>" + request.getParameter("descricao");
			enviarEmail.enviarEmail(request.getParameter("email"),  "Chamado Aberto - " + request.getParameter("num_ocorrencia"), mensagem);
			response.sendRedirect("ChamadoAberto.jsp");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
