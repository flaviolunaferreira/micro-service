package com.thecoyote.core.produtos.dto;

import java.math.BigDecimal;

import com.thecoyote.core.produtos.entity.ProdutosEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutosRequestDTO {

	private String nome;
	private Integer estoque;
	private BigDecimal preco;
	
	public ProdutosEntity saveNewProduto(ProdutosRequestDTO produtosRequest) {
		return new ProdutosEntity(nome, estoque, preco);
	}
	
}
