/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dark.pizza.serviciomongo.dao.api;

import com.dark.pizza.serviciomongo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author user
 */
public interface ProductoRepository extends MongoRepository<Producto, String> {
    
}
