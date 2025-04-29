package com.orders.system.authentication.auth_api.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginRequestDTO(
        @NotBlank(message = "Username cannot be null or blank") String userName,
        @NotBlank(message = "Password cannot be null or blank") String password) {
}
