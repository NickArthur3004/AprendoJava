package br.com.devmedia.AprendendoJava.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Colecionador {
    private String name;
    private List<Item> colecao = new ArrayList<>();

    public Colecionador(){
    }

    public Colecionador(String name) {
        this.name = name;
    }

    public Colecionador(String name, List<Item> colecao) {
        this.name = name;
        this.colecao = colecao;
    }

    public String getName() {
        return name;
    }

    public List<Item> getColecao() {
        return colecao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColecao(List<Item> colecao) {
        this.colecao = colecao;
    }
}
