package com.thecoyote.core.produtos.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.thecoyote.core.produtos.entity.ProdutosEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutosResponseDTO {

	private Long id;
	private String nome;
	private Integer estoque;
	private BigDecimal preco;
	private Date createDate;
	private Date LasModifiedDate;

	public ProdutosResponseDTO(ProdutosEntity result) {
		this.setId(result.getId());
		this.setNome(result.getNome());
		this.setEstoque(result.getEstoque());
		this.setPreco(result.getPreco());
		this.setCreateDate(result.getCreateDate());
		this.setLasModifiedDate(result.getLasModifiedDate());
	}
}
