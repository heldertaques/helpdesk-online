package cargo;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletPesquisarProximoCodCargo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarProximoCodCargo() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		FachadaCargo fachadaCargo = new FachadaCargo();
		
		try {
			int codCargo = fachadaCargo.pesquisarProximoCodCargo();
			response.sendRedirect("CadastroCargo.jsp?codCargo="+codCargo);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
