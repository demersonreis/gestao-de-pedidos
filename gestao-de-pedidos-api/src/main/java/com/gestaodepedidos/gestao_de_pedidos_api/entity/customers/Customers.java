package com.gestaodepedidos.gestao_de_pedidos_api.entity.customers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
	@SequenceGenerator(name = "customer_seq", sequenceName = "customers_id_seq", allocationSize = 1)
	private Integer customers_id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "email", nullable = false, length = 100, unique = true)
	private String email;

	@Column(name = "phone", length = 15)
	private String phone;

	public Customers(Integer id, String name, String email, String phone) {
		super();
		this.customers_id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Customers(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Customers(String name, String phone) {
		this.name = name;

		this.phone = phone;
	}

	public Customers() {
		super();
	}

}
