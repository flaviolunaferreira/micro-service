package com.thecoyote.core.produtos.repository;

import com.thecoyote.core.produtos.entity.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<ProdutosEntity, Long>{

}
