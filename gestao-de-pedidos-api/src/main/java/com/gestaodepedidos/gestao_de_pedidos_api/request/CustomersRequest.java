package com.gestaodepedidos.gestao_de_pedidos_api.request;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.MessageDTO;

public class CustomersRequest {

	public static MessageDTO registrationOK() {
		return new MessageDTO(MessageRequest.OK, MessageRequest.CADASTRO_OK);

	}

	public static MessageDTO registrationNot(String email) {
		return new MessageDTO(MessageRequest.BAD_REQUEST, MessageRequest.ESTABELECIMENTO_NAO_CADASTRADO + email);

	}
	
	public static MessageDTO registrationEdit(String email) {
		return new MessageDTO(MessageRequest.OK, MessageRequest.ESTABELECIMENTO_ALTERADO + email);

	}

}
