package com.orange.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name= "vehicles", url = "https://parallelum.com.br/fipe/api/v1")
public interface FIPEService {

	@GetMapping(value = "carros/marcas/59/modelos/5940/anos/2014-3")
	Object getValue();
	

}
