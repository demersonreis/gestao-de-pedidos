package com.gestaodepedidos.gestao_de_pedidos_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.service.CustomersService;

@RestController
@RequestMapping(value = "/customers")
public class CustomersController {

	@Autowired
	private CustomersService customersService;
    
	@PostMapping("/registration")
	public Object customerRegistration(@RequestBody CustomersDTO dto) {
		return customersService.customerRegistration(dto);
	}

}
