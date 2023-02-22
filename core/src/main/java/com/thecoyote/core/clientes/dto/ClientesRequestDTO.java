package com.thecoyote.core.clientes.dto;

import com.thecoyote.core.clientes.entity.ClientesEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientesRequestDTO {

	private String nome;
	private String cpf;
	public ClientesEntity saveNewCliente() {
		return new ClientesEntity(nome, cpf);
	}
	
}
