package com.juansefdz.AluraForumChallenge.api.dto.response;

import lombok.Data;

@Data
public class AccountResponse {
    private Long id;
    private String email;
    private UserResponse user;
    private String role;
}
