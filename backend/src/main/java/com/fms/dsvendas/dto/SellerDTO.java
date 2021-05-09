package com.fms.dsvendas.dto;

import java.io.Serializable;

import com.fms.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class SellerDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}
}
