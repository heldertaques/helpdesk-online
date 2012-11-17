package funcionarios;

import java.sql.SQLException;
import java.util.Collection;

public interface Irepositorio {

	public void inserir(Funcionario func) throws ClassNotFoundException, SQLException;
	public Funcionario pesquisar(String matricula) throws ClassNotFoundException, SQLException;
	public void excluir(String matricula) throws ClassNotFoundException, SQLException;
	public  Collection<Funcionario> todos() throws ClassNotFoundException, SQLException;
	public void editar(Funcionario func) throws ClassNotFoundException, SQLException;
	public Collection<Funcionario> UsuariosNaoCadastrado() throws ClassNotFoundException, SQLException;
}
