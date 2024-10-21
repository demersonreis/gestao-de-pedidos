package com.gestaodepedidos.gestao_de_pedidos_api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.dto.MessageDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;
import com.gestaodepedidos.gestao_de_pedidos_api.repository.CustomersRepository;
import com.gestaodepedidos.gestao_de_pedidos_api.request.CustomersRequest;

@Service
public class CustomersService {

	@Autowired
	private CustomersRepository customersRepository;
	private static final Logger logger = LoggerFactory.getLogger(CustomersService.class);

	public MessageDTO customerRegistration(CustomersDTO dto) {
		try {
			Customers customersToEntity = CustomersDTO.customersToEntity(dto);
			customersRepository.save(customersToEntity);
			logger.info("Cliente registrado com sucesso: {}", dto.getEmail());
			return CustomersRequest.registrationOK();
		} catch (Exception e) {
			logger.error("Erro inesperado ao registrar cliente: {}", dto.getEmail(), e);
			return new MessageDTO("500", "Erro inesperado: " + e.getMessage());
		}
	}

}
