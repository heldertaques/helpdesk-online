package ocorrencia.tipo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCadastroTipoOcorrencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroTipoOcorrencia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaTipoOcorrencia fachadaTpOcorrencia = new FachadaTipoOcorrencia();
		try {
			fachadaTpOcorrencia.inserirTipoOcorrencia(request.getParameter("desc"), request.getParameter("sla"));
			response.sendRedirect("CadastroTipoOcorrencia.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
