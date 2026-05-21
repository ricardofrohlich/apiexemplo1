package com.frohlich.apiexemplo1.repository;

import com.frohlich.apiexemplo1.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {
    public List<Produto> produtos = new ArrayList<>();

    public ProdutoRepository() {
        produtos.add(new Produto(1L, "Coca cola", 10.99));
        produtos.add(new Produto(2L, "Fruki cola", 7.99));
        produtos.add(new Produto(3L, "Pepsi cola", 8.99));
        produtos.add(new Produto(4L,"Conti cola", 2.99));
        produtos.add(new Produto(5L, "Conti cola", 1.99));
    }

    public List<Produto> buscarTodos(){
        System.out.println("Repository -> buscando no banco os produtos...");
        return produtos;
    }

    public Produto buscarPorId(Long id){
        for(Produto produto : produtos){
            if(produto.getId().equals(id)){ //select * from produtos where produto.id == id
                return produto;
            }
        }
        return null;
    }

    public Produto salvar(Produto produto){
        produtos.add(produto);
        return produto;
    }

    public Produto atualizar(Long id, Produto produtoAtualizado){
        Produto produto = buscarPorId(id);
        if(produto != null){
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            return produto;
        }
        return null;
    }

    public boolean deletar(Long id){
        Produto produto = buscarPorId(id);
        if(produto != null){
            produtos.remove(produto);
            return true;
        }
        return false;
    }

}
