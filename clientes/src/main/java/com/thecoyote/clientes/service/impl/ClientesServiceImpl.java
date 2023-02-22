package com.thecoyote.clientes.service.impl;

import com.thecoyote.core.clientes.dto.ClientesRequestDTO;
import com.thecoyote.core.clientes.dto.ClientesResponseDTO;
import com.thecoyote.core.clientes.entity.ClientesEntity;
import com.thecoyote.core.clientes.repository.ClientesRepository;
import com.thecoyote.core.exceptions.DuplicateValue;
import com.thecoyote.core.exceptions.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thecoyote.clientes.service.ClientesService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClientesServiceImpl implements ClientesService {

	private ClientesRepository clientesRepository;

	@Override
	public ClientesResponseDTO saveNewCliente(ClientesRequestDTO clientesRequest) throws DuplicateValue {
		return null;
	}

	@Override
	public List<ClientesResponseDTO> listAllClientes() throws NotFound {
		return null;
	}


	/*******************************************************************************************************************
	 * Pesquisa cliente pelo id informado
	 * @param {Long} id
	 * @return ClientesResponseDTO
	 * @throws NotFound
	 ******************************************************************************************************************/
	@Override
	public ClientesResponseDTO findById(Long id) throws NotFound {
		return new ClientesResponseDTO(clientesRepository.findById(id)
				.orElseThrow(() -> new NotFound("Desculpa mas não encontrei o cliente com o id " + id)));
	}


	/*******************************************************************************************************************
	 * Pesquisa o cliente pelo nome exato fornecido por parametro.
	 * @param name
	 * @return ClientesResponseDTO
	 * @throws NotFound
	 ******************************************************************************************************************/
	@Override
	public ClientesResponseDTO findByName(String name) throws NotFound {
		ClientesEntity result = clientesRepository.findByName(name);
		if (result != null) return new ClientesResponseDTO(result);
		throw new NotFound("Sinto muito!!!, Não encontrei o cliente com o nome " + name);
	}


	/*******************************************************************************************************************
	 * Pequisa o nome do cliente que contenha a string fornecido como parametro.
	 * @param name
	 * @return ClientesResponseDTO
	 * @throws NotFound
	 ******************************************************************************************************************/
	@Override
	public ClientesResponseDTO findLikeName(String name) throws NotFound {
		ClientesEntity result = clientesRepository.findByNameLikeIgnoreCase(name);
		if (result != null ) return new ClientesResponseDTO(result);
		throw new NotFound("Sinto muito!!! Não encontrei o cliente que o nome contenha " + name);
	}

	@Override
	public ClientesResponseDTO findByCpf(String cpf) throws NotFound {
		return null;
	}
}
