package com.diegogouveia.springreactcatalog.services;

import com.diegogouveia.springreactcatalog.datasourcemodel.Produto;
import com.diegogouveia.springreactcatalog.repositories.ProdutoRepositories;
import org.springframework.beans.factory.annotation.Autowired;

public class CadastroProduto {
    @Autowired
    private ProdutoRepositories produtoRepositories;

    //O metódo Saveandflush faz o insert no banco de dados.

    public void cadastroProduto(Produto produto){
        produtoRepositories.saveAndFlush(produto);
    }

}
