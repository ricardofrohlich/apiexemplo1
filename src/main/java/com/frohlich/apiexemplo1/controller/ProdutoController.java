package com.frohlich.apiexemplo1.controller;

import com.frohlich.apiexemplo1.model.Produto;
import com.frohlich.apiexemplo1.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin("*") //serve para permitir que minha api seja acessada por outro sistema
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }


    @GetMapping
    public List<Produto> listar(){
        System.out.println("Controller -> GET PRODUTOS");
        return service.listar();
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto){
        return service.cadastrar(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto){
        return service.atualizar(id, produto);
    }

    @DeleteMapping("{id}")
    public boolean deletar(@PathVariable Long id){
        return service.deletar(id);
    }
}
