package com.thecoyote.clientes.controller;

import com.thecoyote.core.clientes.dto.ClientesRequestDTO;
import com.thecoyote.core.clientes.dto.ClientesResponseDTO;
import com.thecoyote.core.exceptions.DuplicateValue;
import com.thecoyote.core.exceptions.NotFound;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thecoyote.clientes.service.ClientesService;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ClientesController {
	
	private ClientesService clientesService;

	@ApiOperation(value = "Salva um novo Cliente.", notes = "Inclue um novo registro na tabela de cliente.")
	@PostMapping("/")
	public ResponseEntity<ClientesResponseDTO> saveNewCliente(@RequestBody ClientesRequestDTO clientesRequest) throws DuplicateValue {
		return new ResponseEntity<>(clientesService.saveNewCliente(clientesRequest), HttpStatus.CREATED);
	}

	@ApiOperation(value = "Lista de Clientes.", notes = "Lista todos os clientes ordenados pelo código.")
	@GetMapping("/")
	public ResponseEntity<List<ClientesResponseDTO>> listAllClientes() throws NotFound {
		return new ResponseEntity<>(clientesService.listAllClientes(), HttpStatus.FOUND);
	}

	@ApiOperation(value = "Procura por id.", notes = "Pesquisa o cliente pelo id.")
	@GetMapping("/id/{id}")
	public ResponseEntity<ClientesResponseDTO> findById(@PathVariable Long id) throws NotFound{
		return new ResponseEntity<>(clientesService.findById(id), HttpStatus.FOUND);
	}

	@ApiOperation(value = "Procura por nome.", notes = "Procura o cliente pelo nome exato.")
	@GetMapping("/name/{name}")
	public ResponseEntity<ClientesResponseDTO> findByName(@PathVariable String name) throws NotFound {
		return new ResponseEntity<>(clientesService.findByName(name), HttpStatus.FOUND);
	}

	@ApiOperation(value = "Procura pelo nome.", notes = "Procura cliente pelo nome ou parte dele ignorando maiúsculas e minúsculas.")
	public ResponseEntity<ClientesResponseDTO> findLikeName(@PathVariable String name) {
		return ResponseEntity.ok().body(clientesService.findLikeName(name));
	}

	@ApiOperation(value = "Busca cliente pelo CPF.", notes = "Procura cliente pelo CPF informado.")
	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<ClientesResponseDTO> findByCpf(@PathVariable String cpf) {
		return ResponseEntity.ok().body(clientesService.findByCpf(cpf));
	}

}
