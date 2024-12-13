package com.juansefdz.AluraForumChallenge.infraestructure.mappers;

import com.juansefdz.AluraForumChallenge.api.dto.request.create.TopicRequest;
import com.juansefdz.AluraForumChallenge.api.dto.response.TopicResponse;
import com.juansefdz.AluraForumChallenge.domain.entities.TopicEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface TopicMapper {

    @Mapping(target = "user", source = "user")
    TopicEntity toEntity(TopicRequest request);
    topicResponse toResponse(TopicEntity entity);
}

