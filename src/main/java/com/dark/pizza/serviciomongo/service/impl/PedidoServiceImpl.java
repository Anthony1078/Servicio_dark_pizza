package com.dark.pizza.serviciomongo.service.impl;

import com.dark.pizza.serviciomongo.commons.GenericServiceImpl;
import com.dark.pizza.serviciomongo.dao.api.PedidoRepository;
import com.dark.pizza.serviciomongo.model.Pedido;
import com.dark.pizza.serviciomongo.service.api.PedidoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends GenericServiceImpl<Pedido,   String> implements PedidoServiceApi {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public CrudRepository<Pedido, String> getDao() {
        return pedidoRepository;
    }


}
