package funcionarios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/PesquisarFuncionarioPorNome")
public class ServletPesquisarTodosFuncionarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletPesquisarTodosFuncionarios() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fachada_Func fachadaFunc = new Fachada_Func();
		try {
			Collection<Funcionario> listaF = new LinkedList<Funcionario>();
			listaF = fachadaFunc.todos();
			PrintWriter out = response.getWriter();
			String xml = "";
			int i = 1;
			xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>";
			xml = xml + "<funcionario>\n";
			for(Funcionario f: listaF){
				xml = xml + "<nome"+i+">";
				xml = xml + f.getNome();
				xml = xml + "</nome"+i+">\n";
				xml = xml + "<matricula"+i+">";
				xml = xml + f.getMatricula();
				xml = xml + "</matricula"+i+">\n";
				i++;
			}
			xml = xml + "<quantidade>";
			xml = xml + i;
			xml = xml + "</quantidade>";

			xml = xml + "</funcionario>\n";

			response.setContentType("text/xml");  
			out.write(xml);
			out.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
