package funcionarios;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.Funcionario_nao_cadastrado;
import exception.Matricula_nao_encontrada;

@WebServlet("/PesquisarFuncionarioPorNome")
public class PesquisarFuncionarioPorNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PesquisarFuncionarioPorNome() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Fachada_Func fachadaFunc = new Fachada_Func();
		try {
			Funcionario f = fachadaFunc.pesquisar(request.getParameter("nome"));
			PrintWriter out = response.getWriter();
			String xml = "";

			xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>";
			xml = xml + "<funcionario>\n";

			xml = xml + "<nome>";
			xml = xml + f.getNome();
			xml = xml + "</nome>\n";
			xml = xml + "<matricula>";
			xml = xml + f.getMatricula();
			xml = xml + "</matricula\n>";
			xml = xml + "<cpf>";
			xml = xml + f.getCpf();
			xml = xml + "</cpf\n>";
			xml = xml + "<email>";
			xml = xml + f.getEmail();
			xml = xml + "</email\n>";
			xml = xml + "<funcao>";
			xml = xml + f.getFuncao();
			xml = xml + "</funcao\n>";
			xml = xml + "<sexo>";
			xml = xml + f.getSexo();
			xml = xml + "</sexo\n>";
			xml = xml + "<telefone>";
			xml = xml + f.getTelefone();
			xml = xml + "</telefone\n>";
			xml = xml + "<endereco>";
			xml = xml + f.getEndereco();
			xml = xml + "</endereco\n>";
			xml = xml + "<bairro>";
			xml = xml + f.getBairro();
			xml = xml + "</bairro\n>";
			xml = xml + "<cidade>";
			xml = xml + f.getCidade();
			xml = xml + "</cidade\n>";
			xml = xml + "</funcionario>\n";

			response.setContentType("text/xml");  
			out.write(xml);
			out.close();
		} catch (Matricula_nao_encontrada e) {
			e.printStackTrace();
		} catch (Funcionario_nao_cadastrado e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
