package com.fms.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fms.dsvendas.dto.SaleDTO;
import com.fms.dsvendas.dto.SaleSuccessDTO;
import com.fms.dsvendas.dto.SaleSumDTO;
import com.fms.dsvendas.entities.Sale;
import com.fms.dsvendas.repositories.SaleRepository;
import com.fms.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageble) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageble);
		return result.map(x -> new SaleDTO(x));
	}

	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}

	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}

}
