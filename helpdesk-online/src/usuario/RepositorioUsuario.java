package usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;

import conexao.Conexao;

public class RepositorioUsuario implements InterfaceUsuario{

	public void inserirUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = ("insert into usuarios (login, codigo, senha, privilegio, status) values (?,?,md5(?),?,?)");
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, usuario.getLoginName());
		pstmt.setInt(2, usuario.getCodigo());
		pstmt.setString(3, usuario.getSenha());
		pstmt.setInt(4, usuario.getPrivilegio());
		pstmt.setInt(5, usuario.getStatus());
		
		pstmt.executeUpdate();
	}

	public Usuario pesquisarPorLogin(String login, String senha) throws ClassNotFoundException, SQLException
	{
		Usuario u = new Usuario();
		Connection con = Conexao.conectarBanco();
		PreparedStatement pstmt = con.prepareStatement("select u.codigo, f.nome,u.login,u.senha,s.codigo as CodSetor," +
														" s.nome as NomeSetor, u.status,u.privilegio,p.descricao" +
														" from usuarios u" +
														" inner join funcionarios f on u.codigo = f.matricula" +
														" inner join setor s on f.setor = s.codigo" +
														" inner join privilegio p on u.privilegio = p.codigo" +
														" where u.login = ? and u.senha = md5(?)");
		pstmt.setString(1, login);
		pstmt.setString(2, senha);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			u.setCodSetor(rs.getInt("codSetor"));
			u.setNomeSetor(rs.getString("nomesetor"));
			u.setCodigo(rs.getInt("codigo"));
			u.setNome(rs.getString("nome"));
			u.setLoginName(rs.getString("login"));
			u.setSenha(rs.getString("senha"));
			u.setPrivilegio(rs.getInt("privilegio"));
			u.setPrivilegioDescricao(rs.getString("descricao"));
			u.setStatus(rs.getInt("status"));
		}
		return u;
		}

	public Collection<Usuario> pesquisarTodosUsuarios() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Collection<Usuario> listaUsuario = new LinkedList<Usuario>();
		String sql = "select  u.codigo, f.nome, u.login, u.status, p.codigo as pCodigo, p.descricao from usuarios u " +
				"inner join funcionarios f on f.matricula = u.codigo " +
				"inner join privilegio p on u.privilegio = p.codigo";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			Usuario u = new Usuario();
			u.setCodigo(rs.getInt("codigo"));
			u.setNome(rs.getString("nome"));
			u.setLoginName(rs.getString("login"));
			u.setStatus(rs.getInt("status"));
			u.setPrivilegio(rs.getInt("pCodigo"));
			u.setPrivilegioDescricao(rs.getString("descricao"));
			listaUsuario.add(u);
		}
		
		return listaUsuario;
	}

	public Usuario pesquisarPorCodigo(String codigo) throws ClassNotFoundException, SQLException {
		Usuario u = new Usuario();
		Connection con = Conexao.conectarBanco();
		PreparedStatement pstmt = con.prepareStatement("select * from usuarios where codigo = ?");
		pstmt.setString(1, codigo);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			u.setLoginName(rs.getString("login"));
			u.setSenha(rs.getString("senha"));
			u.setPrivilegio(rs.getInt("privilegio"));
			u.setStatus(rs.getInt("status"));
		}
		return u;
	}

	public void alterarUsuario(Usuario usuario) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		String sql = "update usuarios set login=?, status=?, privilegio=? where codigo = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, usuario.getLoginName());
		pstmt.setInt(2, usuario.getStatus());
		pstmt.setInt(3, usuario.getPrivilegio());
		pstmt.setInt(4, usuario.getCodigo());
		pstmt.executeUpdate();
	}
}
