package com.gestaodepedidos.gestao_de_pedidos_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.dto.MessageDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.service.CustomersService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Customers", description = "APIs relacionadas a clientes")
@RequestMapping(value = "/customers")
public class CustomersController {


	@Autowired
	private CustomersService customersService;
    @Operation(summary = "Registrar um novo cliente", description = "Cria um novo cliente e salva no banco de dados.")
	@PostMapping("/registration")
	public ResponseEntity<MessageDTO> customerRegistration(@RequestBody CustomersDTO dto) {
		MessageDTO response = customersService.customerRegistration(dto);
		if ("200".equals(response.getCod())) {
			return new ResponseEntity<>(response, HttpStatus.CREATED);
		} else if ("400".equals(response.getCod())) {
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}
	
	@GetMapping("/view")
	public ResponseEntity<?> customerView(){
		return null;
		}
 
}
