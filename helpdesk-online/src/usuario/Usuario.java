package usuario;

import setor.Setor;

public class Usuario extends Setor{
	private int codigo;
	private String nome;
	private String loginName;
	private String senha;
	private int privilegio;
	private String privilegioDescricao;
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
	public String getPrivilegioDescricao() {
		return privilegioDescricao;
	}
	public void setPrivilegioDescricao(String privilegioDescricao) {
		this.privilegioDescricao = privilegioDescricao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
