package ocorrencia;

import java.sql.Time;
import java.util.Date;

public class Ocorrencia {
	private String oc_numero;
	private String descricao;
	private String info_fechamento;
	private int cd_solicitante;
	private String nomeSolicitante;
	private int cd_responsavel;
	private String nomeResponsavel;
	private int cd_tipo;
	private int cd_equipamento;
	private int cd_status;
	private String status;
	private Date data_abertura;
	private String data_fechamento;
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
	public String getInfo_fechamento() {
		return info_fechamento;
	}
	public void setInfo_fechamento(String info_fechamento) {
		this.info_fechamento = info_fechamento;
	}
	public int getCd_solicitante() {
		return cd_solicitante;
	}
	public void setCd_solicitante(int cd_solicitante) {
		this.cd_solicitante = cd_solicitante;
	}
	public String getNomeSolicitante() {
		return nomeSolicitante;
	}
	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}
	public int getCd_responsavel() {
		return cd_responsavel;
	}
	public void setCd_responsavel(int cd_responsavel) {
		this.cd_responsavel = cd_responsavel;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}
	public String getData_fechamento() {
		return data_fechamento;
	}
	public void setData_fechamento(String data_fechamento) {
		this.data_fechamento = data_fechamento;
	}
	public Time getIdade() {
		return idade;
	}
	public void setIdade(Time idade) {
		this.idade = idade;
	}
	
	
}
