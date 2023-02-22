package com.thecoyote.core.clientes.dto;

import java.util.Date;

import com.thecoyote.core.clientes.entity.ClientesEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientesResponseDTO {

	private Long id;
	private String nome;
	private String cpf;
	private Date createdDate;
	private Date lastModifielDate;
	

	public ClientesResponseDTO(ClientesEntity result) {
		this.setId(result.getId());
		this.setNome(result.getNome());
		this.setCpf(result.getCpf());
		this.setCreatedDate(result.getCreatedDate());
		this.setLastModifielDate(result.getLastModifielDate());
	}
}
