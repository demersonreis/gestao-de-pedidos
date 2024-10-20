package com.gestaodepedidos.gestao_de_pedidos_api.request;

import com.gestaodepedidos.gestao_de_pedidos_api.dto.MessageDTO;

public class CustomersRequest {

	public static MessageDTO registrationOK() {
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setCod(MessageRequest.OK);
		messageDTO.setDescricao(MessageRequest.CADASTRO_OK);
		return messageDTO;

	}

}
