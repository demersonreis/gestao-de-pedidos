package com.gestaodepedidos.gestao_de_pedidos_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaodepedidos.gestao_de_pedidos_api.entity.customers.CustomerAddress;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Integer> {

}
