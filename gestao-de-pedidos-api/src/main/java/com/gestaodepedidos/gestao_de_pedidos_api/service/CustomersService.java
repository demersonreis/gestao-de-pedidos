package com.gestaodepedidos.gestao_de_pedidos_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;
import com.gestaodepedidos.gestao_de_pedidos_api.repository.CustomersRepository;
import com.gestaodepedidos.gestao_de_pedidos_api.request.CustomersRequest;

@Service
public class CustomersService {

	@Autowired
	private CustomersRepository customersRepository;

	public Object customerRegistration(CustomersDTO dto) {
		
		Customers customersToEntity = CustomersDTO.customersToEntity(dto);
		customersRepository.save(customersToEntity);
		return CustomersRequest.registrationOK();
	}

}
