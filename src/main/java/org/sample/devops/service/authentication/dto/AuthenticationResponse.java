package org.sample.devops.service.authentication.dto;

public record AuthenticationResponse(String mail, String password, String lastname) {
}
