package funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;

import conexao.Conexao;

public class Repositorio_Banco implements Irepositorio {

	
	public void inserir(Funcionario func) throws ClassNotFoundException, SQLException{
		
		Connection con = Conexao.conectarBanco();
		
		String sql = ("insert into funcionarios(matricula,nome,telefone,endereco,funcao,sexo,cpf,email,cidade,bairro) values(?,?,?,?,?,?,?,?,?,?");
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,func.getMatricula());
		ps.setString(2,func.getNome());
		ps.setString(3, func.getTelefone());
		ps.setString(4, func.getEndereco());
		ps.setString(5, func.getFuncao());
		ps.setString(6, func.getSexo());
		ps.setString(7, func.getCpf());
		ps.setString(8, func.getEmail());
		ps.setString(9,func.getCidade());
		ps.setString(10, func.getBairro());
		
	}

	public Funcionario pesquisar(String matricula) throws ClassNotFoundException, SQLException {

		Funcionario func = new Funcionario();
		
		Connection con = Conexao.conectarBanco();
		String sql = ("select * from funcionarios where matricula = ?");
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			
			func.setMatricula(rs.getString("matricula"));
			func.setNome(rs.getString("nome"));
			func.setTelefone(rs.getString("telefone"));
			func.setEndereco(rs.getString("endereco"));
			func.setFuncao(rs.getString("funcao"));
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
		ps.executeQuery();
		
		
	}

	public Collection<Funcionario> todos() throws ClassNotFoundException, SQLException {
	
		Collection<Funcionario>lista = new LinkedList<Funcionario>();
		
		Connection con = Conexao.conectarBanco();
		
		String sql = ("select * from funcionarios");
		Statement st = Conexao.conectarBanco().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			
			Funcionario func = new Funcionario();
			
			func.setMatricula(rs.getString("matricula"));
			func.setNome(rs.getString("nome"));
			func.setTelefone(rs.getString("telefone"));
			func.setEndereco(rs.getString("endereco"));
			func.setFuncao(rs.getString("funcao"));
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
		
		String sql = "update  funcionarios set nome=?,telefone=?,endereco=?,funcao =?,sexor =?,cpf =?,email=?,cidade=?,bairro=? where matricula = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, func.getNome());
			ps.setString(2, func.getTelefone());
			ps.setString(3, func.getEndereco());
			ps.setString(4, func.getFuncao());
			ps.setString(5, func.getSexo());
			ps.setString(6, func.getCpf());
			ps.setString(7, func.getEmail());
			ps.setString(8, func.getCidade());
			ps.setString(9, func.getBairro());
			ps.setString(10, func.getMatricula());		
			ps.executeQuery(); 
		}

		
	}