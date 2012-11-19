package funcionarios;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.Funcionario_nao_cadastrado;
import exception.Matricula_nao_encontrada;

public class ServletPesquisarFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarFuncionario() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Fachada_Func f = new Fachada_Func();
		
		
		try {
			f.pesquisar(request.getParameter("matricula"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Matricula_nao_encontrada e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Funcionario_nao_cadastrado e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
