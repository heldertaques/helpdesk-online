package ocorrencia.tipo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletAlterarTipoOcorrencia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletAlterarTipoOcorrencia() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaTipoOcorrencia fachadaTpOcorrencia = new FachadaTipoOcorrencia();
		try {
			fachadaTpOcorrencia.alterarTipoOcorrencia(request.getParameter("codigo"),
													  request.getParameter("desc"),
													  request.getParameter("sla"));
			response.sendRedirect("ListarTipoOcorrencia.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
