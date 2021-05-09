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
public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
}
