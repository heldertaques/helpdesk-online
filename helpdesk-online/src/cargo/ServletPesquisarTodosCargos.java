package cargo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPesquisarTodosCargos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarTodosCargos() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCargo fachadaCargo = new FachadaCargo();
		Collection<Cargo> listaCargo = new LinkedList<Cargo>();
		try {
			listaCargo = fachadaCargo.pesquisarTodosCargos();
			/*for (Iterator<Cargo> it = listaCargo.iterator(); it.hasNext();){
				System.out.println(it.next().getCodigo());
				System.out.println(it.next().getDescricao());
			}*/
			
			request.getSession().setAttribute("listaCargo", listaCargo);
			response.sendRedirect("CadastroFuncionario.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
