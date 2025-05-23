package de.personal.taskmanager.dto.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
