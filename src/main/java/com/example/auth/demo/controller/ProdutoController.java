package com.example.auth.demo.controller;

import com.example.auth.demo.domain.entity.Produto;
import com.example.auth.demo.domain.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {
    private final ProdutoService produtoService;
    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos() {
        return ResponseEntity.ok(produtoService.findAll());
    }

    @PostMapping
    public ResponseEntity<ResponseEntity.BodyBuilder> setProduto(
            @RequestBody Produto body
    ) {
        produtoService.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}