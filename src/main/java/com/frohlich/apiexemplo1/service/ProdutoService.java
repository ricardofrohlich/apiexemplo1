package com.frohlich.apiexemplo1.service;

import com.frohlich.apiexemplo1.model.Produto;
import com.frohlich.apiexemplo1.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listar(){
        System.out.println("Service -> listando produtos....");
        return repository.buscarTodos();
    }

    public Produto buscarPorId(Long id){
        return repository.buscarPorId(id);
    }

    public Produto cadastrar(Produto produto){
        return repository.salvar(produto);
    }

    public Produto atualizar(Long id, Produto produto){
        return repository.atualizar(id, produto);
    }

    public boolean deletar(Long id){
        return repository.deletar(id);
    }
}
