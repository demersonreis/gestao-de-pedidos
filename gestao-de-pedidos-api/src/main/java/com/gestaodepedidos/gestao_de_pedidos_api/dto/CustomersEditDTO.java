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

	public static Customers customersToEntity(CustomersEditDTO dto, Customers customers2) {
		Customers customers = new Customers(customers2.getCustomers_id(),dto.getName(), customers2.getEmail(),
				dto.getPhone(), customers2.getStatus());
		return customers;
	}

	public static CustomersEditDTO customersToDTO(Customers entity) {
		CustomersEditDTO customers = new CustomersEditDTO(entity.getName(), entity.getPhone());
		return customers;
	}

}
