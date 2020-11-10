package br.com.caelum.eatsapigateway.dto;

import java.math.BigDecimal;

public class RestauranteComDistanciaDto {

	public RestauranteComDistanciaDto(BigDecimal distancia, Long idRestaurante, String cep, Boolean aprovado,
			Long tipoDeCozinhaId) {
		super();
		this.distancia = distancia;
		this.idRestaurante = idRestaurante;
		this.cep = cep;
		this.aprovado = aprovado;
		this.tipoDeCozinhaId = tipoDeCozinhaId;
	}

	private BigDecimal distancia;
	private Long idRestaurante;
	private String cep;
	private Boolean aprovado;
	private Long tipoDeCozinhaId;

	public BigDecimal getDistancia() {
		return distancia;
	}

	public Long getIdRestaurante() {
		return idRestaurante;
	}

	public String getCep() {
		return cep;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public Long getTipoDeCozinhaId() {
		return tipoDeCozinhaId;
	}

}
