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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FachadaCargo fachadaCargo = new FachadaCargo();
		try {
			int codCargo = fachadaCargo.pesquisarProximoCodCargo();
			System.out.println(codCargo);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
