package com.diegogouveia.springreactcatalog.controller;

import com.diegogouveia.springreactcatalog.datasourcemodel.Produto;
import com.diegogouveia.springreactcatalog.repositories.ProdutoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/")
public class ProdutoController {

    @Autowired
    private ProdutoRepositories produtoRepositories;

    @GetMapping(path = "produto")
    public List<Produto> buscarProdutoPorId(@PathVariable(name = "id", required = true)UUID id){
        return produtoRepositories.findAll();
    }

    @PostMapping(path = "produtos/save")
    public void salvarProduto(@RequestBody Produto produto){
        produtoRepositories.save(produto);
    }
}
