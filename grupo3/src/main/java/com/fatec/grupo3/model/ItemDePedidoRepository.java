package com.fatec.grupo3.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fatec.grupo3.model.ItemDePedido;

@Repository
public interface ItemDePedidoRepository extends JpaRepository<ItemDePedido, Long> {
}