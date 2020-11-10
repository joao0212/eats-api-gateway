package br.com.caelum.eatsapigateway.dto;

public class RestauranteDto {

	private Long idRestaurante;
	private String cep;
	private Boolean aprovado;
	private Long tipoDeCozinhaId;

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

	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}

	public void setTipoDeCozinhaId(Long tipoDeCozinhaId) {
		this.tipoDeCozinhaId = tipoDeCozinhaId;
	}
}
