package com.fms.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fms.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
