package br.com.caelum.eatsapigateway.dto;

import java.math.BigDecimal;

public class DistanciaDto {

	private BigDecimal distancia;
	private Long idRestaurante;

	public BigDecimal getDistancia() {
		return distancia;
	}

	public Long getIdRestaurante() {
		return idRestaurante;
	}

	public void setDistancia(BigDecimal distancia) {
		this.distancia = distancia;
	}
}
