package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numeroContrato;
	private Date dataContrato;
	private Double valorContrato;
	
	private List<Prestacao> prestacoes = new ArrayList<>();
	
	public Contrato(Integer numeroContrato, Date dataContrato, Double valorContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}

	public void addPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}

	public void removePrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}
}
