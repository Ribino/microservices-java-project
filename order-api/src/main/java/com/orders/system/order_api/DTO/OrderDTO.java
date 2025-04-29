package com.orders.system.order_api.DTO;

import jakarta.validation.constraints.NotEmpty;

public record OrderDTO(Long id,
        @NotEmpty(message = "Description cannot be empty") String description) {
}
