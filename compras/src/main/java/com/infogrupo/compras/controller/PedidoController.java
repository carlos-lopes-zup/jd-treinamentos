package com.infogrupo.compras.controller;

import com.infogrupo.compras.model.Pedido;
import com.infogrupo.compras.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoController {

    @Autowired
    private  PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> salvar( @RequestBody @Valid Pedido pedido){
        return ResponseEntity.ok(pedidoService.salvar(pedido));
    }
}
