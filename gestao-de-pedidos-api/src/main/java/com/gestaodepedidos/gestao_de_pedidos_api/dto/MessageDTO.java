package com.gestaodepedidos.gestao_de_pedidos_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
	private String cod;
	private String descricao;

	public MessageDTO(String cod, String descricao) {
		super();
		this.cod = cod;
		this.descricao = descricao;
	}

	public MessageDTO() {
		super();

	}

}
