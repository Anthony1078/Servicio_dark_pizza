/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dark.pizza.serviciomongo.controller;

import com.dark.pizza.serviciomongo.model.Producto;
import com.dark.pizza.serviciomongo.service.api.ProductoServiceApi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */

@RestController
@RequestMapping(value = "/producto/api/v1")
@CrossOrigin("*")
public class ProductoController {
    
    @Autowired
    private ProductoServiceApi productoServiceApi;
    
    
    @GetMapping(value = "/all")
    public List<Producto> getAll() {
            return productoServiceApi.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Producto find(@PathVariable String id) {
            return productoServiceApi.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Producto> save(@RequestBody @Validated Producto producto) {
            Producto obj = productoServiceApi.save(producto);
            return new ResponseEntity<Producto>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<Producto> delete(@PathVariable String id) {
            Producto producto = productoServiceApi.get(id);
            if (producto != null) {
                    productoServiceApi.delete(id);
            } else {
                    return new ResponseEntity<Producto>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<Producto>(producto, HttpStatus.OK);
    }
     
}
