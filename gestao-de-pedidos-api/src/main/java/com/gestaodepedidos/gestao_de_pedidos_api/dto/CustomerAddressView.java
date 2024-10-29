package com.gestaodepedidos.gestao_de_pedidos_api.dto;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.CustomerAddress;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddressView {

	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;

	public CustomerAddressView(String address, String city, String state, String postalCode, String country) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	public static CustomerAddressView customerAddressViewToDTO(CustomerAddress endereco) {
		return new CustomerAddressView(endereco.getAddress(), endereco.getCity(), endereco.getState(),
				endereco.getPostalCode(), endereco.getCountry());
	}

}
