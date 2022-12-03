package com.dark.pizza.serviciomongo.dao.api;

import com.dark.pizza.serviciomongo.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
