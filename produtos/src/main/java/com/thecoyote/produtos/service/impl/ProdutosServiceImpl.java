package com.thecoyote.produtos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thecoyote.core.produtos.dto.ProdutosRequestDTO;
import com.thecoyote.core.produtos.dto.ProdutosResponseDTO;
import com.thecoyote.core.produtos.entity.ProdutosEntity;
import com.thecoyote.core.produtos.repository.ProdutosRepository;
import com.thecoyote.produtos.service.ProdutosService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProdutosServiceImpl implements ProdutosService {
	
	private ProdutosRepository produtosRepository;

	@Override
	public ProdutosResponseDTO saveNewProduto(ProdutosRequestDTO produtosRequest) {
		ProdutosEntity result = produtosRequest.saveNewProduto(produtosRequest);
		return new ProdutosResponseDTO(produtosRepository.save(result));
	}
	
	
	

}
