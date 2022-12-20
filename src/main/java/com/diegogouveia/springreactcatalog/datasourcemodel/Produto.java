package com.diegogouveia.springreactcatalog.datasourcemodel;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="produtos")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "Produtos")
    private String nomeDoProduto;
    private String url;
    private String preço;

    public Produto(){
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }
}
