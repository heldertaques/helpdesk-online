package usuario;

public class Usuario {
	private int codigo;
	private String nome;
	private String loginName;
	private String senha;
	private int privilegio;
	private int status;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getPrivilegio() {
		return privilegio;
	}
	public void setPrivilegio(int privilegio) {
		this.privilegio = privilegio;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
