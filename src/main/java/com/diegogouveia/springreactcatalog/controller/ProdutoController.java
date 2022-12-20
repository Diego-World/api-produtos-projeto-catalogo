package com.diegogouveia.springreactcatalog.controller;

import com.diegogouveia.springreactcatalog.datasourcemodel.Produto;
import com.diegogouveia.springreactcatalog.repositories.ProdutoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/")
public class ProdutoController {
    @Autowired
    private ProdutoRepositories produtoRepositories;

    // Buscar todos os produtos
    @GetMapping(path = "/produtos/buscar")
    public List<Produto> buscarTodosProduto(){
        return produtoRepositories.findAll();
    }

    @GetMapping(path = "/produtos/buscar/id/{id}")
    public Optional<Produto> buscarProdutoPeloId(@PathVariable(name = "id", required = true)UUID id){
        return produtoRepositories.findById(id);
    }

    @PostMapping(path = "produtos/save")
    public void salvarProduto(@RequestBody Produto produto){
        produtoRepositories.save(produto);
    }
}
