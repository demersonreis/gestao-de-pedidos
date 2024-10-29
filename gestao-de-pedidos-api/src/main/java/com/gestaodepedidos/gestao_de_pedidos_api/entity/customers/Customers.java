package com.gestaodepedidos.gestao_de_pedidos_api.entity.customers;

import java.util.ArrayList;
import java.util.List;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@Column(name = "status", length = 1)
	private Integer status;  
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<CustomerAddress> addresses =  new ArrayList<>();
	
	@OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;
	
	public Customers(Integer id, String name, String email, String phone) {
		super();
		this.customers_id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Customers(String name, String email, String phone, Integer status) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}

	public Customers(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Customers() {
		super();
	}

	public Customers(Integer customers_id, String name, String email, String phone, Integer status) {
		super();
		this.customers_id = customers_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}

}
