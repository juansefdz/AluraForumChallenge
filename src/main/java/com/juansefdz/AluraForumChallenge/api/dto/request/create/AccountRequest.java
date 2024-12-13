package com.juansefdz.AluraForumChallenge.api.dto.request.create;

import lombok.Data;

@Data
public class AccountRequest {
    private String email;
    private String password;
    private Long userId;
    private String role;
}
