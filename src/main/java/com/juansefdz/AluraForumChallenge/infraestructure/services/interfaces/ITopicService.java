package com.juansefdz.AluraForumChallenge.infraestructure.services.interfaces;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.TopicRequest;
import com.juansefdz.AluraForumChallenge.api.dto.response.TopicResponse;
import com.juansefdz.AluraForumChallenge.infraestructure.services.abstract_services.*;

public interface ITopicService extends
        CreateService <TopicRequest, TopicResponse>,
        DeleteService<Long>,
        UpdateService<TopicRequest,TopicResponse, Long>,
        GetAllService<TopicResponse>,
        GetByIdService<TopicResponse,Long> {
}
