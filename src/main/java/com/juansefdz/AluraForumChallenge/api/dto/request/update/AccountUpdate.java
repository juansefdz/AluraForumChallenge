package com.juansefdz.AluraForumChallenge.api.dto.request.update;

import lombok.Data;

@Data
public class AccountUpdate {
    private String email;
    private String password;
    private String role;
}
