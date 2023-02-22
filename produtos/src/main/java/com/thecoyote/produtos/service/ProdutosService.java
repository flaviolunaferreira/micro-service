package com.thecoyote.produtos.service;

import org.springframework.stereotype.Service;

import com.thecoyote.core.produtos.dto.ProdutosRequestDTO;
import com.thecoyote.core.produtos.dto.ProdutosResponseDTO;

@Service
public interface ProdutosService {

	ProdutosResponseDTO saveNewProduto(ProdutosRequestDTO produtosRequest);

}
