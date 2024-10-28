package com.gestaodepedidos.gestao_de_pedidos_api.enums;

import java.util.Arrays;

public enum StatusCustumers {
	
	ATIVO(1, "Ativo"), 
	INATIVO(2, "Inativo"),
	BLOQUEADO(3, "Bloqueado") ;

	private Integer codigo;
	private String descricao;

	private StatusCustumers(final int codigo, final String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static String statusCustumersDescription(Integer id) {
		return Arrays.stream(values())
			.filter( status -> status.codigo.equals(id))
			.findFirst()
			.map(StatusCustumers::getDescricao)
			.orElse("Status não consta!");
	}
	

}
