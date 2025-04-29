package com.orders.system.authentication.auth_api.dto;

import jakarta.validation.constraints.NotBlank;

public record RegisterRequestDTO(
        @NotBlank(message = "Email cannot be null or blank") String email,
        @NotBlank(message = "Password cannot be null or blank") String password,
        @NotBlank(message = "Username cannot be null or blank") String userName) {
}
