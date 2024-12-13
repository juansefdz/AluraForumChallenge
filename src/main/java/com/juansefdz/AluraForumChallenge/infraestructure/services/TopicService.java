package com.juansefdz.AluraForumChallenge.infraestructure.services;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.TopicRequest;
import com.juansefdz.AluraForumChallenge.api.dto.response.TopicResponse;
import com.juansefdz.AluraForumChallenge.infraestructure.services.interfaces.ITopicService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TopicService implements ITopicService {
    @Override
    public TopicResponse create(TopicRequest topicRequest) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<TopicResponse> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<TopicResponse> getById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public TopicResponse update(Long aLong, TopicRequest topicRequest) {
        return null;
    }
}
