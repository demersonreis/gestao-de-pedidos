package com.gestaodepedidos.gestao_de_pedidos_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {

}
