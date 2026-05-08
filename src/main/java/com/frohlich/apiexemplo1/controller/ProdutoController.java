package com.frohlich.apiexemplo1.controller;

import com.frohlich.apiexemplo1.model.Produto;
import com.frohlich.apiexemplo1.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
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
}
