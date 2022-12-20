package com.diegogouveia.springreactcatalog.resource.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoResource {

    @JsonProperty("nome_do_produto")
    private String nomeProduto;
    @JsonProperty("url_imagem")
    private String url;

    public ProdutoResource(String nomeProduto, String url) {
        this.nomeProduto = nomeProduto;
        this.url = url;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
