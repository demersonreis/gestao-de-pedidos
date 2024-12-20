package com.gestaodepedidos.gestao_de_pedidos_api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersEditDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.dto.CustomersViewDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.dto.MessageDTO;
import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;
import com.gestaodepedidos.gestao_de_pedidos_api.repository.CustomersRepository;
import com.gestaodepedidos.gestao_de_pedidos_api.request.CustomersRequest;
import com.gestaodepedidos.gestao_de_pedidos_api.request.MessageRequest;

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

	public ResponseEntity<?> customerView(String email) {
		try {
			Customers customers = customersRepository.findByEmail(email);
			if (customers == null) {
				logger.warn("Cliente com o email {} não encontrado", email);
				return new ResponseEntity<>(CustomersRequest.registrationNot(email), HttpStatus.BAD_REQUEST);
			}
			logger.info("Cliente encontrado com sucesso, convertendo para DTO");
			CustomersViewDTO customersToDTO = CustomersViewDTO.customersToDTO(customers);
			return new ResponseEntity<>(customersToDTO, HttpStatus.OK);

		} catch (Exception e) {
			logger.error("Erro inesperado ao buscar cliente com o email: {}", email, e);
			return new ResponseEntity<>(
					new MessageDTO(MessageRequest.INTERNAL_SERVER_ERROR, "Erro inesperado: " + e.getMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public ResponseEntity<?> customerEdit(CustomersEditDTO dto, String email) {
	    logger.info("Iniciando o processo de edição do cliente com o email: {}", email);
	    
	    try {
	        Customers customers = customersRepository.findByEmail(email);
	        
	        if (customers == null) {
	            logger.warn("Cliente com o email {} não encontrado", email);
	            return new ResponseEntity<>(CustomersRequest.registrationNot(email), HttpStatus.BAD_REQUEST);
	        }
	        
	        Customers customersSave = CustomersEditDTO.customersToEntity(dto, customers);
	        customersRepository.save(customersSave);
	        
	        logger.info("Cliente com o email {} editado com sucesso", email);
	        return new ResponseEntity<>(CustomersRequest.registrationEdit(email), HttpStatus.OK);
	        
	    } catch (Exception e) {
	        logger.error("Erro inesperado ao editar cliente com o email: {}", email, e);
	        return new ResponseEntity<>(
	            new MessageDTO(MessageRequest.INTERNAL_SERVER_ERROR, "Erro inesperado: " + e.getMessage()),
	            HttpStatus.INTERNAL_SERVER_ERROR
	        );
	    }
	}

}
