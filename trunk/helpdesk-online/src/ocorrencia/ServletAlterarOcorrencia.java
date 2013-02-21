package ocorrencia;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import email.EnviarEmail;

public class ServletAlterarOcorrencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAlterarOcorrencia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaOcorrencia fachadaOcorrencia = new FachadaOcorrencia();
		try {
			fachadaOcorrencia.alterarOcorrencia(request.getParameter("num_ocorrencia"), request.getParameter("cdresponsalvel"),
					request.getParameter("Status"), request.getParameter("info_chamado"),request.getParameter("data_fechamento"));
			response.sendRedirect("ChamadoAlterado.jsp");
			EnviarEmail enviarEmail = new EnviarEmail();
			String mensagem = "O chamado de numero " + request.getParameter("num_ocorrencia") + ", com a seguinte descrição:" 
							+ request.getParameter("descricao") + " foi tratado.";
			enviarEmail.enviarEmail(request.getParameter("email"),  "Chamado Aberto - " + request.getParameter("num_ocorrencia"), mensagem);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
