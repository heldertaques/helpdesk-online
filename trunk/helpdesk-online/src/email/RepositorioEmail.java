package email;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexao.Conexao;

public class RepositorioEmail implements InterfaceEmail{

	public void configurarEmail(Email email) throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		PreparedStatement pstmt = con.prepareStatement("insert into emailConfig (host,port,protocol,starttls,authent,mailuser,password)" +
													   " values(?,?,?,?,?,?,?");
		pstmt.setString(1, email.getHost());
		pstmt.setString(2, email.getPort());
		pstmt.setString(3, email.getProtocol());
		pstmt.setString(4, email.getStarttls());
		pstmt.setString(5, email.getAuthent());
		pstmt.setString(6, email.getMailUser());
		pstmt.setString(7, email.getPasswd());
		pstmt.executeUpdate();
	}

	public Email pegarConfigEmail() throws ClassNotFoundException, SQLException {
		Connection con = Conexao.conectarBanco();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emailConfig limit 1");
		Email emailConfig = new Email();
		while(rs.next()){
			emailConfig.setHost(rs.getString("host"));
			emailConfig.setPort(rs.getString("port"));
			emailConfig.setMailUser(rs.getString("mailuser"));
			emailConfig.setPasswd(rs.getString("password"));
			emailConfig.setProtocol(rs.getString("protocol"));
			emailConfig.setAuthent(rs.getString("authent"));
			emailConfig.setStarttls(rs.getString("starttls"));
		}
		return emailConfig;
	}

}
