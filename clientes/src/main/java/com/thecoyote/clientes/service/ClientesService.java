package com.thecoyote.clientes.service;

import com.thecoyote.core.clientes.dto.ClientesRequestDTO;
import com.thecoyote.core.clientes.dto.ClientesResponseDTO;
import com.thecoyote.core.exceptions.DuplicateValue;
import com.thecoyote.core.exceptions.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClientesService {

    ClientesResponseDTO saveNewCliente(ClientesRequestDTO clientesRequest) throws DuplicateValue;

    List<ClientesResponseDTO> listAllClientes() throws NotFound;

    ClientesResponseDTO findById(Long id) throws NotFound;

    ClientesResponseDTO findByName(String name) throws NotFound;

    ClientesResponseDTO findLikeName(String name) throws NotFound;

    ClientesResponseDTO findByCpf(String cpf) throws NotFound;
}
