package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conexao {
	public static Connection conectarBanco() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/helpdesk";
		return DriverManager.getConnection(url, "postgres", "postgres");
	}

}
