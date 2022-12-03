package com.dark.pizza.serviciomongo.controller;

import com.dark.pizza.serviciomongo.model.Pedido;
import com.dark.pizza.serviciomongo.model.Producto;
import com.dark.pizza.serviciomongo.service.api.PedidoServiceApi;
import com.dark.pizza.serviciomongo.service.api.ProductoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido/api/v1")
@CrossOrigin("http://localhost:4200")
public class PedidosController {

    @Autowired
    private PedidoServiceApi pedidoServiceApi;


    @GetMapping(value = "/all")
    public List<Pedido> getAll() {
        return pedidoServiceApi.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Pedido find(@PathVariable String id) {
        return pedidoServiceApi.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Pedido> save(@RequestBody @Validated Pedido pedido) {
        Pedido obj = pedidoServiceApi.save(pedido);
        return new ResponseEntity<Pedido>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Pedido> delete(@PathVariable String id) {
        Pedido pedido = pedidoServiceApi.get(id);
        if (pedido != null) {
            pedidoServiceApi.delete(id);
        } else {
            return new ResponseEntity<Pedido>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
    }

}
