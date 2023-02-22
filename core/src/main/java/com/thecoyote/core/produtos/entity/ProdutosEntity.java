package com.thecoyote.core.produtos.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produtos")
public class ProdutosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	private Integer estoque;
	
	private BigDecimal preco;
	
	@CreatedDate
	private Date createDate;
	
	@LastModifiedDate
	private Date LasModifiedDate;
	
	public ProdutosEntity(String nome, Integer estoque, BigDecimal preco) {
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
	}

}
