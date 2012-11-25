package ocorrencia;

import java.sql.Time;

public class TipoOcorrencia {
	private int codigo;
	private String descricao;
	private Time sla;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Time getSla() {
		return sla;
	}
	public void setSla(Time sla) {
		this.sla = sla;
	}

}
