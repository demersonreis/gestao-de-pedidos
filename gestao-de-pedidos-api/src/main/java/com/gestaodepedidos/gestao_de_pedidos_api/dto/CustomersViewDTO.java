package com.gestaodepedidos.gestao_de_pedidos_api.dto;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;
import com.gestaodepedidos.gestao_de_pedidos_api.enums.StatusCustumers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomersViewDTO {
	private Integer customersId;
	private String name;
	private String email;
	private String phone;
	private String status;	
	
	public CustomersViewDTO(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	public CustomersViewDTO(Integer customersId, String name, String email, String phone,String status) {
		this.customersId = customersId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}


	public static Customers customersToEntity(CustomersViewDTO dto) {
		Customers customers = new Customers(dto.getName(), dto.getEmail(), dto.getPhone(), 1);
		return customers;
	}

	public static CustomersViewDTO customersToDTO(Customers entity) {
		CustomersViewDTO customers = new CustomersViewDTO(
				entity.getCustomers_id(),
				entity.getName(),
				entity.getEmail(),
				entity.getPhone(),
				StatusCustumers.statusCustumersDescription(entity.getStatus()));
		return customers;
	}

}
