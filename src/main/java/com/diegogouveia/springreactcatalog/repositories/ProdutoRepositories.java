package com.diegogouveia.springreactcatalog.repositories;

import com.diegogouveia.springreactcatalog.datasourcemodel.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepositories extends JpaRepository<Produto, UUID>{

}
