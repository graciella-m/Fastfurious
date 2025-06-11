/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.graci.eti.Fastfurious.domain.repository;

import br.graci.eti.Fastfurious.domain.model.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus (String Status);
}
