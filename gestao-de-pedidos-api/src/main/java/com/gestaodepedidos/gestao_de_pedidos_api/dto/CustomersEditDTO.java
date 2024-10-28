package com.gestaodepedidos.gestao_de_pedidos_api.dto;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomersEditDTO {

	private String name;
	private String phone;

	public CustomersEditDTO(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public static Customers customersToEntity(CustomersEditDTO dto) {
		Customers customers = new Customers(dto.getName(), dto.getPhone());
		return customers;
	}

	public static CustomersEditDTO customersToDTO(Customers entity) {
		CustomersEditDTO customers = new CustomersEditDTO(entity.getName(), entity.getPhone());
		return customers;
	}

}
