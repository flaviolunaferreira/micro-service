package com.thecoyote.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thecoyote.core.produtos.dto.ProdutosRequestDTO;
import com.thecoyote.core.produtos.dto.ProdutosResponseDTO;
import com.thecoyote.produtos.service.ProdutosService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/produtos")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProdutosController {
	
	private ProdutosService produtosService;
	
	@PostMapping("/")
	public ResponseEntity<ProdutosResponseDTO> saveNewProduto(@RequestBody ProdutosRequestDTO produtosRequest ) {
		return ResponseEntity.ok().body(produtosService.saveNewProduto(produtosRequest));
	}

}
