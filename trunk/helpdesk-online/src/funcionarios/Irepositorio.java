package funcionarios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public interface Irepositorio {

	public void inserir(Funcionario func) throws ClassNotFoundException, SQLException, Exception;
	public Funcionario pesquisar(String matricula) throws ClassNotFoundException, SQLException;
	public void excluir(String matricula) throws ClassNotFoundException, SQLException;
	public  Collection<Funcionario> todos() throws ClassNotFoundException, SQLException;
	public void editar(Funcionario func) throws ClassNotFoundException, SQLException;
	public ArrayList<Funcionario> listarTodosFuncionarios() throws SQLException, ClassNotFoundException;
	public Collection<Funcionario> UsuariosNaoCadastrado() throws ClassNotFoundException, SQLException;
}
