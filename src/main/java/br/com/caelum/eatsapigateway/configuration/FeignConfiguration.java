package br.com.caelum.eatsapigateway.configuration;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;

import feign.Logger;
import feign.codec.Decoder;

public class FeignConfiguration {

	@Bean
	Logger.Level feingLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	public Decoder feignDecoder() {

		ObjectFactory<HttpMessageConverters> messageConverters = () -> {
			HttpMessageConverters converters = new HttpMessageConverters();
			return converters;
		};
		return new SpringDecoder(messageConverters);
	}

}
