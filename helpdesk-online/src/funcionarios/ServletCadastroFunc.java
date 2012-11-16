package funcionarios;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exception.Matricula_vazia;
import exception.Nome_Vazio;




@WebServlet("/CadastroCliente")
public class ServletCadastroFunc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletCadastroFunc() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Fachada_Func fachada = new Fachada_Func();
		try {
			fachada.inserir( request.getParameter("matricula"),request.getParameter("nome"),request.getParameter("telefone"),
					         request.getParameter("endereco"), request.getParameter("funcao"),request.getParameter("sexo"),
					         request.getParameter("cpf"),request.getParameter("email"),request.getParameter("cidade"),
					         request.getParameter("bairro"));
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (Nome_Vazio e) {
			
			e.printStackTrace();
		} catch (Matricula_vazia e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		/* PrintWriter out = response.getWriter();        
		 out.println("<html>");
 	     out.println("<body>");
         out.println("O usuário: Obrigado por enviar Seus dados.");
 	     out.println("</body>");
 	     out.println("</html>");*/
}
	    
			     
			    
		 	 
		 	  
		 	   
		 	    
		 	    
		 	  
		 	 
		 	    

	private void setnome(String nome) {
		
	}

}
