package br.com.caelum.eatsapigateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.caelum.eatsapigateway.configuration.FeignConfiguration;
import br.com.caelum.eatsapigateway.dto.RestauranteDto;

@FeignClient(url = "${restaurante.url}", name = "restaurante", configuration = FeignConfiguration.class)
public interface RestauranteService {

	@GetMapping("/restaurantes/{id}/")
	public RestauranteDto buscar(@PathVariable("id") Long id);

}
