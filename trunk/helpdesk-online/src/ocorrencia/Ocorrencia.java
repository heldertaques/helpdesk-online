package ocorrencia;

import java.sql.Time;
import java.util.Date;

public class Ocorrencia {
	private String oc_numero;
	private String descricao;
	private int cd_solicitante;
	private int cd_responsavel;
	private int cd_tipo;
	private int cd_equipamento;
	private int cd_status;
	private Date data_abertura;
	private Date data_fechamento;
	private Time idade;
	
	public String getOc_numero() {
		return oc_numero;
	}
	public void setOc_numero(String oc_numero) {
		this.oc_numero = oc_numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCd_solicitante() {
		return cd_solicitante;
	}
	public void setCd_solicitante(int cd_solicitante) {
		this.cd_solicitante = cd_solicitante;
	}
	public int getCd_responsavel() {
		return cd_responsavel;
	}
	public void setCd_responsavel(int cd_responsavel) {
		this.cd_responsavel = cd_responsavel;
	}
	public int getCd_tipo() {
		return cd_tipo;
	}
	public void setCd_tipo(int cd_tipo) {
		this.cd_tipo = cd_tipo;
	}
	public int getCd_equipamento() {
		return cd_equipamento;
	}
	public void setCd_equipamento(int cd_equipamento) {
		this.cd_equipamento = cd_equipamento;
	}
	public int getCd_status() {
		return cd_status;
	}
	public void setCd_status(int cd_status) {
		this.cd_status = cd_status;
	}
	public Date getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}
	public Date getData_fechamento() {
		return data_fechamento;
	}
	public void setData_fechamento(Date data_fechamento) {
		this.data_fechamento = data_fechamento;
	}
	public Time getIdade() {
		return idade;
	}
	public void setIdade(Time idade) {
		this.idade = idade;
	}
	
	
}
