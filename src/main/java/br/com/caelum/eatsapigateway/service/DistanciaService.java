package br.com.caelum.eatsapigateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.caelum.eatsapigateway.configuration.FeignConfiguration;
import br.com.caelum.eatsapigateway.dto.DistanciaDto;

@FeignClient(name = "distancia", configuration = FeignConfiguration.class)
public interface DistanciaService {

	@GetMapping("distancias/restaurantes/{cep}/restaurante/{restauranteId}")
	public DistanciaDto buscarComDistanciaPorId(@PathVariable("cep") String cep,
			@PathVariable("restauranteId") Long restauranteId);
}
