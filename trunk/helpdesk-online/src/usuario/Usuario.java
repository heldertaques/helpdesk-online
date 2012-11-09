package usuario;

public class Usuario {
	private String nome;
	private String loginName;
	private String senha;
	private int privilegio;
	private boolean status;
	
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
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
