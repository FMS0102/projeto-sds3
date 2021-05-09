package com.fms.dsvendas.dto;

import java.io.Serializable;

import com.fms.dsvendas.entities.Seller;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Double sum;

	public SaleSumDTO(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}
}
