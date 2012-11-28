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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
