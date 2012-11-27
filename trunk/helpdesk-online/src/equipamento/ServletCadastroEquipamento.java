package equipamento;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCadastroEquipamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletCadastroEquipamento() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaEquipamento fachadaEquipamento = new FachadaEquipamento();
		try {
			fachadaEquipamento.inserirEquipamento(request.getParameter("desc"));
			response.sendRedirect("Principal.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
