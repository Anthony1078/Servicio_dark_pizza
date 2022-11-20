/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dark.pizza.serviciomongo.service.impl;

import com.dark.pizza.serviciomongo.commons.GenericServiceImpl;
import com.dark.pizza.serviciomongo.dao.api.ProductoRepository;
import com.dark.pizza.serviciomongo.model.Producto;
import com.dark.pizza.serviciomongo.service.api.ProductoServiceApi;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,   String> implements ProductoServiceApi {

    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public CrudRepository<Producto, String> getDao() {
        return productoRepository;
    }

    
    
}
