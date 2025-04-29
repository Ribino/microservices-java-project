package com.orders.system.order_api.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orders.system.order_api.DTO.OrderDTO;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @GetMapping("{id}")
    public ResponseEntity<OrderDTO> getOrder(@PathVariable Long id) {
        var order = new OrderDTO(id, "Order description");
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<OrderDTO>> getOrders() {
        var orders = List.of(new OrderDTO(1L, "Order 1"), new OrderDTO(2L, "Order 2"));
        return ResponseEntity.ok(orders);
    }

    @PostMapping
    public ResponseEntity<String> createOrder(OrderDTO order) {
        return ResponseEntity.status(201).body("Pedido criado com sucesso");
    }
}
