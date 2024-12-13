package com.juansefdz.AluraForumChallenge.api.dto.request.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicRequest {

    private String title;
    private String message;
    private Long userId;
    private LocalDateTime creationDate;

}
