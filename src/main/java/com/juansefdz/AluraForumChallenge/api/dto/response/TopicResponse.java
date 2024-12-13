package com.juansefdz.AluraForumChallenge.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TopicResponse {
    private long id;
    private String title;
    private String message;
    private UserResponse user;
    private String creationDate;

}
