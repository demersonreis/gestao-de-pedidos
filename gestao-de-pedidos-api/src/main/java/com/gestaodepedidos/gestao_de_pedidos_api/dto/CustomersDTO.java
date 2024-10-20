package com.gestaodepedidos.gestao_de_pedidos_api.dto;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomersDTO {

	private String name;
	private String email;
	private String phone;

	public static Customers customersToEntity(CustomersDTO dto) {
	   Customers customers = new Customers(dto.getName(), dto.getEmail(), dto.getPhone());
	   return customers;
	}

}
