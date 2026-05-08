package com.frohlich.apiexemplo1.repository;

import com.frohlich.apiexemplo1.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {
    public List<Produto> produtos = new ArrayList<>();

    public ProdutoRepository() {
        produtos.add(new Produto("Coca cola", 10.99));
        produtos.add(new Produto("Fruki cola", 7.99));
        produtos.add(new Produto("Pepsi cola", 8.99));
        produtos.add(new Produto("Conti cola", 2.99));
        produtos.add(new Produto("Conti cola", 1.99));
    }

    public List<Produto> buscarTodos(){
        System.out.println("Repository -> buscando no banco os produtos...");
        return produtos;
    }
}
