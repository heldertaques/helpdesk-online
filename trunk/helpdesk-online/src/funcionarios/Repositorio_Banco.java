package funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import conexao.Conexao;

public class Repositorio_Banco implements Irepositorio {

	
	public void inserir(Funcionario func) throws Exception{
		
		Connection con = Conexao.conectarBanco();
		
		
		String sql = ("insert into funcionarios(nome,telefone,endereco,cd_cargo,sexo,cpf,email,cidade,bairro) values(?,?,?,?,?,?,?,?,?)");
		PreparedStatement ps = con.prepareStatement(sql);
		
		//ps.setString(1,"nextval('seq_codigo_func')");
		
		ps.setString(1,func.getNome());
		ps.setString(2, func.getTelefone());
		ps.setString(3, func.getEndereco());
		ps.setInt(4,func.getFuncao());
		ps.setString(5, func.getSexo());
		ps.setString(6, func.getCpf());
		ps.setString(7, func.getEmail());
		ps.setString(8,func.getCidade());
		ps.setString(9, func.getBairro());
		ps.executeUpdate();
		
	}

	public Funcionario pesquisar(String nome) throws ClassNotFoundException, SQLException {

		Funcionario func = null;
		
		Connection con = Conexao.conectarBanco();
		String sql = ("select * from funcionarios where nome = ?");
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, nome);
		ResultSet rs = ps.getResultSet();
		
		while(rs.next()){
			
			func = new Funcionario();
			
			func.setMatricula(rs.getString("matricula"));
			func.setNome(rs.getString("nome"));
			func.setTelefone(rs.getString("telefone"));
			func.setEndereco(rs.getString("endereco"));
			func.setFuncao(rs.getInt("cd_cargo"));
			func.setSexo(rs.getString("sexo"));
			func.setCpf(rs.getString("cpf"));
			func.setEmail(rs.getString("email"));
			func.setCidade(rs.getString("cidade"));
			func.setBairro(rs.getString("bairro"));
			
			
		}
	return func;
	}
	
	public void excluir(String matricula) throws ClassNotFoundException, SQLException {
		
		Connection con = Conexao.conectarBanco();
		String sql = ("delete from funcionarios where matricula = ?");
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, matricula);
		ps.execute();
		
		
	}

	public Collection<Funcionario> todos() throws ClassNotFoundException, SQLException {
	
		Collection<Funcionario> lista = new LinkedList<Funcionario>();
		
		Connection con = Conexao.conectarBanco();
		
		String sql = ("select * from funcionarios");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			
			Funcionario func = new Funcionario();
			
			func.setMatricula(rs.getString("matricula"));
			func.setNome(rs.getString("nome"));
			func.setTelefone(rs.getString("telefone"));
			func.setEndereco(rs.getString("endereco"));
			func.setFuncao(rs.getInt("cd_cargo"));
			func.setSexo(rs.getString("sexo"));
			func.setCpf(rs.getString("cpf"));
			func.setEmail(rs.getString("email"));
			func.setCidade(rs.getString("cidade"));
			func.setBairro(rs.getString("bairro"));
						
			lista.add(func);
		}
		
		return lista;
	}
	public void editar(Funcionario func) throws ClassNotFoundException, SQLException {
		
		Connection con = Conexao.conectarBanco(); 
		
		String sql = "update  funcionarios set nome=?,telefone=?,endereco=?,cd_codigo=?,sexor =?,cpf =?,email=?,cidade=?,bairro=? where matricula = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, func.getNome());
			ps.setString(2, func.getTelefone());
			ps.setString(3, func.getEndereco());
			ps.setInt(4,func.getFuncao());
			ps.setString(5, func.getSexo());
			ps.setString(6, func.getCpf());
			ps.setString(7, func.getEmail());
			ps.setString(8, func.getCidade());
			ps.setString(9, func.getBairro());
			ps.setString(10, func.getMatricula());		
			ps.execute();
		}
	
	public Collection<Funcionario> UsuariosNaoCadastrado() throws ClassNotFoundException, SQLException {
		
		Collection<Funcionario> listaFunc = new LinkedList<Funcionario>();
		
		Connection con = Conexao.conectarBanco();
		
		String sql = ("select f.matricula, f.nome from funcionarios f " +
				"left join usuarios u on f.matricula = u.codigo " +
				"where matricula not in (select codigo from usuarios)");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			
			Funcionario func = new Funcionario();
			
			func.setMatricula(rs.getString("matricula"));
			func.setNome(rs.getString("nome"));
						
			listaFunc.add(func);
		}
		
		return listaFunc;
	}

public ArrayList<Funcionario> listarTodosFuncionarios() throws SQLException, ClassNotFoundException {
		
		ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
		
		Connection con = Conexao.conectarBanco();
		
		String sql = ("select * from funcionarios");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
while(rs.next()){
			
			Funcionario func = new Funcionario();
			
			func.setMatricula(rs.getString("matricula"));
			func.setNome(rs.getString("nome"));
			func.setTelefone(rs.getString("telefone"));
			func.setEndereco(rs.getString("endereco"));
			func.setFuncao(rs.getInt("cd_cargo"));
			func.setSexo(rs.getString("sexo"));
			func.setCpf(rs.getString("cpf"));
			func.setEmail(rs.getString("email"));
			func.setCidade(rs.getString("cidade"));
			func.setBairro(rs.getString("bairro"));
			    
			funcs.add(func);
		}
		return funcs;
	}
	}