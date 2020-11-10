package br.com.caelum.eatsapigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.eatsapigateway.dto.DistanciaDto;
import br.com.caelum.eatsapigateway.dto.RestauranteComDistanciaDto;
import br.com.caelum.eatsapigateway.dto.RestauranteDto;
import br.com.caelum.eatsapigateway.service.DistanciaService;
import br.com.caelum.eatsapigateway.service.RestauranteService;

@RestController
@RequestMapping("/restaurantes-e-distancia")
public class RestauranteEDistanciaController {

	private DistanciaService distanciaService;
	private RestauranteService restauranteService;

	public RestauranteEDistanciaController(DistanciaService distanciaService, RestauranteService restauranteService) {
		this.distanciaService = distanciaService;
		this.restauranteService = restauranteService;
	}

	@GetMapping("/{cep}/restaurante/{id}")
	public RestauranteComDistanciaDto buscarPorCEPEIdComDistancia(@PathVariable("cep") String cep,
			@PathVariable("id") Long restauranteId) {
		RestauranteDto restauranteDto = restauranteService.buscar(restauranteId);
		DistanciaDto distanciaDto = distanciaService.buscarComDistanciaPorId(cep, restauranteId);
		return new RestauranteComDistanciaDto(distanciaDto.getDistancia(), restauranteDto.getIdRestaurante(),
				restauranteDto.getCep(), restauranteDto.getAprovado(), restauranteDto.getTipoDeCozinhaId());
	}
}
