package com.thecoyote.core.clientes.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.thecoyote.core.clientes.entity.ClientesEntity;

public interface ClientesRepository extends PagingAndSortingRepository<ClientesEntity, Long>{

    ClientesEntity findByName(String name);

    ClientesEntity findByNameLikeIgnoreCase(String name);
}
